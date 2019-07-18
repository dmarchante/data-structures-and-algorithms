package whiteboardChallenges.hashTable;


public class HashNode<K, V> {
    private String key;
    private String value;
    private HashNode<K, V> next;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HashNode<K , V> getNext() {
        return next;
    }

    public void setNext(HashNode<K , V> next) {
        this.next = next;
    }

    public HashNode(String key, String value) {
        setKey(key);
        setValue(value);
    }
}
