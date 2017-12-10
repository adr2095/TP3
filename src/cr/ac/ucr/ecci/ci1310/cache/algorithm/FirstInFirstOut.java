package cr.ac.ucr.ecci.ci1310.cache.algorithm;
import cr.ac.ucr.ecci.ci1310.util.MyLinkedList.LinkedNode;
import cr.ac.ucr.ecci.ci1310.cache.CacheMemory;

public class FirstInFirstOut <K,V> extends CacheMemory <K,V> {
    protected LinkedNode Lookup(K key) {
        return null;
    }

    protected LinkedNode Insert(K key, V value) {
        return null;
    }

    protected LinkedNode Set(LinkedNode n, V value) {
        return null;
    }


    protected LinkedNode SelectVictim()
    {
        return elementList.RemoveFirst();
    }

    protected void Delete(K key) {

    }

    public void clear() {

    }
}
