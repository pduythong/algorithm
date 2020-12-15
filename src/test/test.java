package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> cust = new ArrayList<>();

        cust.add("Alpha");
        cust.add("Beta");
        cust.add("Zeta");
        cust.add("Beta");
        cust.add("Zeta");
        cust.add("Zeta");
        cust.add("Epsilon");
        cust.add("Beta");
        cust.add("Zeta");
        cust.add("Beta");
        cust.add("Zeta");
        cust.add("Beta");
        cust.add("Delta");
        cust.add("Zeta");
        cust.add("Beta");
        cust.add("Zeta");
        cust.add("Beta");
        cust.add("Zeta");
        cust.add("Beta");
        cust.add("Zeta");
        cust.add("Beta");



        mostActive(cust);


    }

    public static List<String> mostActive(List<String> customers) {
        Hashtable<String, Integer> activeCustomers = new Hashtable<>();
        List<String> ans = new ArrayList<>();

        for (String cus : customers) {
            activeCustomers.put(cus, activeCustomers.getOrDefault(cus, 0) + 1);
        }

        for (String cus : activeCustomers.keySet()) {
           double percent = (double) activeCustomers.get(cus) / customers.size();
           if(percent >= 0.05) ans.add(cus);


        }

        Collections.sort(ans);
        return ans;


    }


}
