package test;

import java.util.HashMap;
import java.util.function.Function;

public class ComputeCacheTest {

    public static void main(String[] args) {
        Function<String, String> computer = s -> s;
        ComputeCache<String, String> computeCache = new ComputeCache<>();

        System.out.println("Expected: ?????");
        System.out.println(computeCache.compute("?????", computer));
        // the actual code is the JUnit Assert equals

        Function<String, Integer> computer2 =  s->{
           int val = Integer.parseInt(s);
           return  val*val;
        } ;
        ComputeCache<String, Integer> computeCache2 = new ComputeCache<>();
        System.out.println("Expected: ?????");
        System.out.println(computeCache2.compute("2", computer2));

        System.out.println(computeCache2.compute("2", computer2));
        // the actual code is the JUnit Assert equals
    }

    public void test() {

    }

    public static class ComputeCache<K, V> {

        HashMap<K, V> CACHE = new HashMap<>();

        /**
         * If value already in cache then simply return cached value.
         * Otherwise, computer value and save in cache
         */
        public V compute(K k, Function<K, V> computer) {
            // Implement here
            V value = CACHE.get(k);

            if (value != null) return value;

//            if(value == null) return null;

            V apply = computer.apply(k);
            CACHE.put(k, apply);
            return apply;


        }
    }
}


