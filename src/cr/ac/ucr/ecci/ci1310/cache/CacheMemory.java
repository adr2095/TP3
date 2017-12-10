package cr.ac.ucr.ecci.ci1310.cache;
import cr.ac.ucr.ecci.ci1310.util.MyLinkedList.LinkedNode;
import cr.ac.ucr.ecci.ci1310.util.MyLinkedList.LinkedList;
import java.util.HashMap;

public abstract class CacheMemory <K,V> implements Cache <K,V>{

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
        return ((V) n.getElement());
    }
    public void put(K var1, V var2) {
        LinkedNode n = this.Lookup(var1);
        if (n == null) {
            n = this.Insert(var1, var2);
        } else {
            n.setElement(var2);
        }
    }

    public void evict(K var1) {
        LinkedNode n = this.Lookup(var1);
        if (n != null) {
            this.Delete((K) n);
        }
    }

    public V Query(K var1) {
        return null;
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
