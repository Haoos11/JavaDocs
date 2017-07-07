package exercise4;

import java.util.*;

/**
 * Exercise 3. Implement a HashMap from scratch. In order to pass all the tests
 * you need to implement all the methods defined below. The key-value pair will
 * be encapsulated in the MyHashMap.MyEntry object defined below.
 *
 * The buckets list in which each MyEntry object will be stored is stored in "buckets" object.
 * The hash function that you will use in order to store a pair in a specific bucket will be
 * the one presented earlier: (hashcode value) modulo (bucket array size)
 */
public class MyHashMap {

    private ArrayList<LinkedList<MyEntry>> buckets;

    private final int BUCKET_ARRAY_SIZE = 16;

    public MyHashMap() {
        // TODO Initialize buckets list
        buckets = new ArrayList<LinkedList<MyEntry>>();
        for (int i=0; i<16; i++){
            LinkedList<MyEntry> lista = new LinkedList<MyEntry>();
            buckets.add(lista);
        }
    }

    public String get(String key) {
        // TODO

        if (key == null)
        {
            for (MyEntry e: buckets.get(0)) {
                if (e.getKey() == null)
                    return e.getValue();
            }
            return null;
        }

        int idx = Math.abs(key.hashCode())%BUCKET_ARRAY_SIZE;
        for (MyEntry e: buckets.get(idx)) {
            if (e.getKey().equals(key))
                return e.getValue();
        }

        return null;
    }

    public void put(String key, String value) {
        // TODO
//        if( key == null)
//           for (int i=0; i<buckets.size(); i++)
//               for (int j=0; j<buckets.get(i).size(); j++)
//
//
//        int idx = Math.abs(key.hashCode())%BUCKET_ARRAY_SIZE;
//
//        for (MyEntry e: buckets.get(idx)) {
//            if (e.getKey().equals(key))
//                e.getValue() = value;
//
//        }


    }

    public Set<String> keySet() {
        // TODO
        return null;
    }

    public Collection<String> values() {
        // TODO
        return null;
    }

    public String remove(String key) {
        // TODO Returns the value associated with the key removed from the map or null if the key wasn't found
        return null;
    }

    public boolean containsKey(String key) {
        // TODO
        return false;
    }

    public boolean containsValue(String value) {
        // TODO
        return false;
    }

    public int size() {
        // TODO Return the number of the Entry objects stored in all the buckets
        return 0;
    }

    public void clear() {
        // TODO Remove all the Entry objects from the bucket list
    }

    public Set<MyEntry> entrySet() {
        // TODO Return a Set containing all the Entry objects
        return null;
    }

    public boolean isEmpty() {
        // TODO
        return false;
    }

    public static class MyEntry {
        private String key;
        private String value;

        public MyEntry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
