import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyHashMap {
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private List<Bucket> table;
    private int keySpace;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        this.table = new ArrayList<>();
        this.keySpace = 9999;
        for (int i = 0; i < this.keySpace; i++) {
            table.add(new Bucket());
        }
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 2);
        hashMap.put(2, 3);

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        Lock writeLock = readWriteLock.writeLock();
        writeLock.lock();

        try {

            int hash = key % this.keySpace;
            this.table.get(hash).addOrUpdate(key, value);

        } finally {
            writeLock.unlock();
        }

    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {

        Lock readLock = readWriteLock.readLock();
        readLock.lock();

        try {
            int hash = key % this.keySpace;
            return this.table.get(hash).get(key);
        } finally {
            readLock.unlock();
        }

    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int hash = key % this.keySpace;
        this.table.get(hash).remove(key);
    }

    class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    class Bucket {
        private List<Node<Integer, Integer>> bucket;

        Bucket() {
            bucket = new ArrayList<>();
        }

        public Integer get(Integer key) {
            for (Node<Integer, Integer> node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }
            return -1;
        }

        public void addOrUpdate(Integer key, Integer value) {
            boolean found = false;
            for (Node<Integer, Integer> node : bucket) {
                if (node.key.equals(key)) {
                    node.value = value;
                    found = true;
                }
            }
            if (!found) {
                bucket.add(new Node<Integer, Integer>(key, value));
            }
        }

        public void remove(Integer key) {
            for (Node<Integer, Integer> node : bucket) {
                if (node.key.equals(key)) {
                    bucket.remove(node);
                    break;
                }
            }
        }
    }

}



