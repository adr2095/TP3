package cr.ac.ucr.ecci.ci1310.util.MyLinkedList

class LinkedListTest extends GroovyTestCase {

    void testAddFirst() {
        def list = new LinkedList<Integer>()

        assert list.getFirst() == null
        assert list.getLast() == null
        assert list.NumElem() == 0

        list.addFirst(10)
        assert list.getFirst().getElement() == 10
        assert list.getLast().getElement() == 10
        assert list.getLast() == list.getFirst()
        assert list.NumElem() == 1

        list.addFirst(15)
        assert list.getFirst().getElement() == 15
        assert list.getLast().getElement() == 10
        assert list.NumElem() == 2
    }

    void testAddLast() {
    }

    void testGetFirst() {
    }

    void testGetLast() {
    }

    void testRemoveFirst() {
    }

    void testRemoveLast() {
    }

    void testRemove() {
    }
}
