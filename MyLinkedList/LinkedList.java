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
        } else {
            this.first.prev = n;
        }
        this.first = n;
        numElem++;
    }

    public void addLast(E element) {
        LinkedNode<E> n = new LinkedNode<E>(element);

        n.prev = this.last;
        if (numElem == 0) {
            this.first = n;
        } else {
            this.last.next = n;
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

    public LinkedNode<E> RemoveFirst() {
        if (numElem == 0) {
            return null;
        }

        LinkedNode<E> tmp = this.first;
        this.first = tmp.next;
        this.first.prev = null;
        if (numElem == 1) {
            this.last = null;
        }
        numElem--;
        return tmp;
    }

    public LinkedNode<E> RemoveLast() {
        if (numElem == 0) {
            return null;
        }

        LinkedNode<E> tmp = this.last;
        this.last = tmp.prev;
        this.last.next = null;
        if (numElem == 1) {
            this.first = null;
        }
        numElem--;
        return tmp;
    }


    private int numElem;
    private LinkedNode<E> first;
    private LinkedNode<E> last;
}
