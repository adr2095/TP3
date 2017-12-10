package cr.ac.ucr.ecci.ci1310.cache;
import cr.ac.ucr.ecci.ci1310.util.MyLinkedList.LinkedNode;
import java.util.*;

public class CacheMemory <K,V> implements Cache <K,V>{

    public CacheMemory() {
        this.size = 10;
    }

    public CacheMemory(int size) {
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public V get(K var1) {
        LinkedNode n = this.Lookup(var1);
        if (n == null) {
            // Buscar en la base de datos;
            V value = this.Query(var1);
            n = this.Insert(var1, value);
        }
        return n.value();
    }
    public void put(K var1, V var2) {
        LinkedNode n = this.Lookup(var1);
        if (n == null) {
            n = this.Insert(var1, value);
        } else {
            n.setValue(var2);
        }
    }

    public void evict(K var1) {
        LinkedNode n = this.Lookup(var1);
        if (n != null) {
            this.Delete(n);
        }
    }

    protected abstract LinkedNode Lookup(K key);
    protected abstract LinkedNode Insert(K key, V value);
    protected abstract LinkedNode Set(LinkedNode n, V value);
    protected abstract LinkedNode SelectVictim();
    protected abstract void Delete(K key);

    protected int size;
    protected String name;
    protected HashMap<K,V> elementTable;
    protected LinkedList<V> elementList;

}
