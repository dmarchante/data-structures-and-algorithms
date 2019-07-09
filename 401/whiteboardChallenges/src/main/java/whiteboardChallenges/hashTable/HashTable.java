package whiteboardChallenges.hashTable;

import java.lang.String;

public class HashTable<K, V> {
    private HashNode<K, V>[] bucket;
    private int size;

    public HashTable(int size) {
        bucket = new HashNode[size];
    }

    public int size() { return this.size; }

    public boolean isEmpty() { return size() == 0; }

    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();

        for(int i = 0; i < letters.length; i++){
            hashValue += letters[i];
        }

        hashValue = (hashValue * 599) % bucket.length;
        return  hashValue;
    }

    public boolean contains(String key) {
        int hashKey = hash(key);

        if (bucket[hashKey] == null) {
            return false;
        }

        if (bucket[hashKey] != null) {
            HashNode<K, V> walker = bucket[hashKey];
            while (walker != null) {
                if (walker.getKey().equals(key)) {
                    return true;
                }

                walker = walker.getNext();
            }
        }

        return false;
    }

    public String get(String key) {
        int hashKey = hash(key);

        if (bucket[hashKey] == null) {
            return null;
        }

        if (bucket[hashKey] != null) {
            HashNode<K, V> walker = bucket[hashKey];
            while (walker != null) {
                if (walker.getKey().equals(key)) {
                    return walker.getValue();
                }

                walker = walker.getNext();
            }
        }

        return null;
    }

    public void set(String key, String value) {
        int hashKey = hash(key);

        if (bucket[hashKey] == null) {
            bucket[hashKey] = new HashNode<>(key, value);
        } else {
            HashNode<K , V> temp = bucket[hashKey];
            bucket[hashKey] = new HashNode<>(key, value);
            bucket[hashKey].setNext(temp);
        }
    }
}
