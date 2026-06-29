class MyHashSet {
    private final LinkedList<Integer>[] buckets;
    private final int capacity = 769; // prime number -> better key distribution

    public MyHashSet() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void add(int key) {
        int idx = hash(key);
        if (!buckets[idx].contains(key)) {
            buckets[idx].add(key);
        }
    }

    public void remove(int key) {
        int idx = hash(key);
        buckets[idx].remove((Integer) key); // cast needed, else it removes by index
    }

    public boolean contains(int key) {
        int idx = hash(key);
        return buckets[idx].contains(key);
    }
}