package lessons.lesson15.hashmap;

public class MyHashMap implements MyMap{

    private int size = 0;

    private static final int INITIAL_CAPACITY = 4;

    private static final double LOAD_FACTOR = 0.75;

    private static class Pair {
        String key;
        String value;
        Pair next;

        public Pair(String key, String value, Pair next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "{" +
                    key + ":" + value +
                    '}';
        }
    }

    private Pair [] source = new Pair[INITIAL_CAPACITY];

    private int findBucket(String key){
        return key.hashCode() % source.length;
    }

    private Pair findPair(String key) {
        int bucket = findBucket(key);
        Pair currentPair = source[bucket];
        while (currentPair != null) {
            if (currentPair.key.equals(key))
                return currentPair;
            currentPair = currentPair.next;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(String key) {
        return false;
    }

    @Override
    public void put(String key, String value) {
        if (size > LOAD_FACTOR * source.length)
            resize();
        Pair pair = findPair(key);
        if (pair == null) {
            int bucket = findBucket(key);
            pair = new Pair(key, value, source[bucket]);
            source[bucket] = pair;
            size++;
        }
        else {
            pair.value = value;
        }
    }


    private void resize() {
        Pair[] newSource = new Pair[source.length * 2];
        for (Pair p : source) {
            Pair c = p;
            while (c != null) {
                Pair n = c.next;
                int bucket = c.key.hashCode() % newSource.length;
                c.next = newSource[bucket];
                newSource[bucket] = c;
            }
        }
        source = newSource;
    }

    @Override
    public String get(String key) {
        Pair pair = findPair(key);
        if (pair == null)
            return null;
        return pair.value;
    }

    @Override
    public String remove(String key) {
        int bucket = findBucket(key);
         Pair c = source[bucket];
        if (c == null)
            return null;
        if (c.key.equals(key)) {
            source[bucket] = c.next;
            size--;
            return c.value;
        }
        while (c.next != null) {
            if (c.next.key.equals(key)) {
                Pair toDelete = c.next;
                c.next = toDelete.next;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        int s = size - 1;
        String r = "[";
        for (Pair p : source) {
            Pair c = p;
            while (c != null) {
                r = r + c;
                if (--s >= 0)
                    r += ", ";

            }
        }
        r += "]";
        return r;
    }
}
