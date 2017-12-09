package MyLinkedList;

public class LinkedList<E> {

    public LinkedList(){
        first = null;
        last = null;
        numElem = 0;
    }

    public void addFirst(E element) {

        LinkedNode<E> n = new LinkedNode<E>(element);

        n.next = this.first;
        if (numElem == 0) {
            this.last = n;
        }
        this.first = n;
        numElem++;
    }

    public void addLast(E element) {
        LinkedNode<E> n = new LinkedNode<E>(element);

        n.prev = this.last;
        if (numElem == 0) {
            this.first = n;
        }
        this.last = n;
        numElem++;
    }

    public LinkedNode<E> getFirst() {
        return this.first;
    }

    public LinkedNode<E> getLast() {
        return this.last;
    }

    //public LinkedNode<E> RemoveFirst() {
    //}

    private int numElem;
    private LinkedNode<E> first;
    private LinkedNode<E> last;
}
