package cr.ac.ucr.ecci.ci1310.cache.algorithm

import cr.ac.ucr.ecci.ci1310.cache.CacheMemory

class LastInFirstOutTest extends GroovyTestCase {

    /*
    def cash as LastInFirstOut<Integer,String>

    void setUp() {
        super.setUp()

    }

    void tearDown() {
    }
    */

    void testLookup() {
        def cash = new LastInFirstOut<Integer, String>()
        assert cash.Lookup(15) == null
    }

    void testInsert() {
        def cash = new LastInFirstOut<Integer, String>()

        def testVals = [716: "Daniel Diaz Molina", 770776: "Nissan Tida", 22245: "Carnet B"]

        assert cash.Lookup(716)  == null
        testVals.each { k , v ->
            println "${k} , ${v}"
            assert cash.Lookup(k) == null
            cash.Insert(k, v)
        }

        testVals.each { k, v ->
            assert cash.Lookup(k).getElement().value == v
            assert cash.Lookup(k).getElement().key == k
        }

    }

    void testSet() {
    }

    void testSelectVictim() {
    }

    void testDelete() {
    }
}
