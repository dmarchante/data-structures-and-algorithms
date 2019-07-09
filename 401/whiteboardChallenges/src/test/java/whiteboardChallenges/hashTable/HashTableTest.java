package whiteboardChallenges.hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void testHashTableSet() {
        HashTable ht = new HashTable(5);

        ht.add("David", "Father");
        ht.add("Tiziana", "Mother");
        ht.add("Sarah", "Daughter");
        ht.add("Yaelle", "Daughter");
        ht.add("Frosty", "Pet");

        String htActual = ht.get("David");

        assertEquals("Father", htActual);
    }

    @Test
    public void testHashTableCollision() {
        HashTable ht = new HashTable(1);

        ht.add("David", "Father");
        ht.add("Tiziana", "Mother");

        String htActual = ht.get("David");

        assertEquals("Father", htActual);
    }

    @Test
    public void testHashTableNull() {
        HashTable ht = new HashTable(1);

        ht.add("David", "Father");
        ht.add("Tiziana", "Mother");

        String htActual = ht.get("Sam");

        assertEquals(null, htActual);
    }

    @Test
    public void testHashTableContainsTrue() {
        HashTable ht = new HashTable(1);

        ht.add("David", "Father");
        ht.add("Tiziana", "Mother");

        boolean htActual = ht.contains("Tiziana");

        assertTrue(htActual);
    }

    @Test
    public void testHashTableContainsFalse() {
        HashTable ht = new HashTable(1);

        ht.add("David", "Father");
        ht.add("Tiziana", "Mother");

        boolean htActual = ht.contains("Sam");

        assertFalse(htActual);
    }
}