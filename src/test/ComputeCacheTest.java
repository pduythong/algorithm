package test;

import java.util.function.Function;

public class ComputeCacheTest {

    public static class ComputeCache<K,V> {

        /**
         * If value already in cache then simply return cached value.
         * Otherwise, computer value and save in cache
         */
        public V compute(K k, Function<K,V> computer) {
            // Implement here
            return null;
        }
    }


    public void test() {
        Function<String,String> computer = null;
        ComputeCache<String, String> computeCache = new ComputeCache<>();

        System.out.println("Expected: ?????");
        System.out.println(computeCache.compute("?????", computer));
        // the actual code is the JUnit Assert equals

        Function<String,Integer> computer2 = null;
        ComputeCache<String, Integer> computeCache2 = new ComputeCache<>();
        System.out.println("Expected: ?????");
        System.out.println(computeCache2.compute("????", computer2));
        // the actual code is the JUnit Assert equals
    }
}


