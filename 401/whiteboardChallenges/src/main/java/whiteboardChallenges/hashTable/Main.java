package whiteboardChallenges.hashTable;

public class Main {
    public static void  main (String[] args) {
        HashTable ht = new HashTable(16);

        ht.set("David", "Father");
        ht.set("Tiziana", "Mother");
        ht.set("Sarah", "Daughter");
        ht.set("Yaelle", "Daughter");
        ht.set("Frosty", "Pet");

        System.out.println(ht.get("David"));
        System.out.println(ht.contains("David"));

    }
}
