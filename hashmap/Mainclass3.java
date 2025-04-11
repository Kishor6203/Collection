package com.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Mainclass3 {
    public static void main(String[] args) {
        System.out.println("main method started");

        HashMap<Object, Object> hm1 = new HashMap<>();  // create an empty HashMap
        System.out.println("Is empty? " + hm1.isEmpty());
        System.out.println("Total elements: " + hm1.size());

        // Adding elements to the HashMap
        hm1.put(10, "test");
        hm1.put(2.5, 100);
        hm1.put("demo", true);
        hm1.put('a', 5.6);
        hm1.put(false, 't');
        hm1.put(10, 265.35);  // This will overwrite the earlier value for key 10

        // Very important: iterate over the keys and print key-value pairs
        Set<Object> s1 = hm1.keySet();  // returns a set containing all keys
        System.out.println(s1);
        for (Object key : s1) {
            Object val = hm1.get(key);
            System.out.println(key + " --> " + val);
        }

        System.out.println("main method ended");
    }
}

