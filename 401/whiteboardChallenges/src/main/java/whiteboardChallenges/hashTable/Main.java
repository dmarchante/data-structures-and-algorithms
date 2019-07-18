package whiteboardChallenges.hashTable;

public class Main {
    public static void  main (String[] args) {
        HashTable ht = new HashTable(16);

        ht.add("David", "Father");
        ht.add("Tiziana", "Mother");
        ht.add("Sarah", "Daughter");
        ht.add("Yaelle", "Daughter");
        ht.add("Frosty", "Pet");

        System.out.println(ht.get("David"));
        System.out.println(ht.contains("David"));

    }
}
