package map;
import java.util.*;
public class Map {
    // every company asks for implementation of hashmap
    public static void main(String[] args){
        // random order
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("alice",10);
        mp.put("bob",20);
        mp.put("john",10);
        mp.put("doe",30);
        mp.put(null, 0);
        mp.put("mike",-10);
        mp.put("alice", 11);
        mp.put(null, 3); // will give runtime error-> null pointer exteption during insertion
        // System.out.println(mp);
        // preserve lexicographically sorted order
        TreeMap<String, Integer> mp1 = new TreeMap<>();
        mp1.put("alice",10);
        mp1.put("bob",20);
        mp1.put("john",10);
        mp1.put("doe",30);
        mp1.put("mike",-10);
        mp1.put("alice", 11);
        //mp1.put(null, 0); 
        // System.out.println(mp1);
        // preserve insertion order
        LinkedHashMap<String, Integer> mp3 = new LinkedHashMap<>();
        mp3.put("alice",10);
        mp3.put("bob",20);
        mp3.put("john",10);
        mp3.put("doe",30);
        mp3.put("mike",-10);
        mp3.put("alice", 11);
        //mp.put(null, 9);// this will also give runtime error of null pointer exception
        System.out.println(mp3);
    }
}
