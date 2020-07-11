import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(18));
    }


    static public boolean isHappy(int n) {
        return isHappyHelper(n, new HashSet<>());
    }

    static public boolean isHappyHelper(int n, Set<Integer> cache) {
        if (cache.contains(n)) {
            return false;
        }
        if (n == 1) return true;
        cache.add(n);
        int next = 0;
        while (n > 0) {
            int r = n % 10;
            next += r * r;
            n = n / 10;
        }
        return isHappyHelper(next, cache);
    }
}
