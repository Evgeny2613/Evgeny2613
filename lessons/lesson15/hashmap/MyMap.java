package lessons.lesson15.hashmap;

public interface MyMap {
    int size(); // amount of pairs
    boolean contains(String key); // if there is the pair with such key
    void put(String key, String value);
    String get(String key);
    String remove(String key);
}
