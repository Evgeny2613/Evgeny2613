package lessons.lesson34;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MapTest {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new ConcurrentHashMap<>();
        Map<String, Integer> map4 = Collections.synchronizedMap(new HashMap<>());

        multiThreadedMapAddition("HashMap", map1, 1_000_000, 100);
        multiThreadedMapAddition("HashTable", map2, 1_000_000, 100);
        multiThreadedMapAddition("ConcurrentHashMap", map3, 1_000_000, 100);
        multiThreadedMapAddition("synchronizedMap", map4, 1_000_000, 100);

        List<Integer> list = new Vector<>();
        List<Integer> list1 = Collections.synchronizedList(new ArrayList<>());

        Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
    }

    public static int multiThreadedMapAddition(String tag, Map<String, Integer> map, int numberOfAdditions, int numberOfThreads) throws InterruptedException {
        long before = System.currentTimeMillis();

        ExecutorService service = Executors.newFixedThreadPool(numberOfThreads);
        map.put("test", 0);

        for (int i = 0; i < numberOfAdditions; i++) {
            service.submit(
                    new Runnable() {
                        @Override
                        public void run() {
                            for (int j = 0; j < 10; j++) {
                                map.computeIfPresent("test", (k, v) -> v + 1);
                            }
                        }
                    }
            );
        }

        service.shutdown();
        service.awaitTermination(5, TimeUnit.SECONDS);
        long after = System.currentTimeMillis();

        int result = map.get("test");
        System.out.println(tag + " result is: " + result + " time: " + (after - before));
        return result;
    }
}
