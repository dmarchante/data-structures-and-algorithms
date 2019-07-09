package whiteboardChallenges.hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void testHashTableSet() {
        HashTable ht = new HashTable(5);

        ht.set("David", "Father");
        ht.set("Tiziana", "Mother");
        ht.set("Sarah", "Daughter");
        ht.set("Yaelle", "Daughter");
        ht.set("Frosty", "Pet");

        String htActual = ht.get("David");

        assertEquals("Father", htActual);
    }

    @Test
    public void testHashTableCollision() {
        HashTable ht = new HashTable(1);

        ht.set("David", "Father");
        ht.set("Tiziana", "Mother");

        String htActual = ht.get("David");

        assertEquals("Father", htActual);
    }

    @Test
    public void testHashTableNull() {
        HashTable ht = new HashTable(1);

        ht.set("David", "Father");
        ht.set("Tiziana", "Mother");

        String htActual = ht.get("Sam");

        assertEquals(null, htActual);
    }
}