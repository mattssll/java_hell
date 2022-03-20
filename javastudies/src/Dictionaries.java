import java.util.*;
import java.util.HashMap;
import java.util.Collections;

public class Dictionaries {
    public static String hashTableWork () {
        // creating a My HashTable Dictionary
        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        my_dict.put("1", "Apple");
        my_dict.put("2", "Banana");
        my_dict.put("3", "Kiwi");
        my_dict.put("4", "Grapes");
        my_dict.put("5", "Pineapple");
        System.out.println("\nValue at key = 1 : " + my_dict.get("1"));
        System.out.println("Value at key = 2 : " + my_dict.get("2"));
        System.out.println("\nIs my dictionary empty? : " + my_dict.isEmpty() + "\n");
        my_dict.remove("2");
        System.out.println("Checking if the removed value exists: " + my_dict.get("2"));
        System.out.println("\nSize of my_dict : " + my_dict.size());
        System.out.println("\nprinting my_dict" + my_dict);
        //System.out.println("\nprinting keys():" + my_dict.keys());  returns an strange object
        System.out.println("\nprinting keySet():" + my_dict.keySet());
        System.out.println("\nprinting values():" + my_dict.values());
        return "log: it worked";
    }
    public static String hashMapWork() {
        HashMap<String, String> myhashMap = new HashMap<String, String>();
        myhashMap.put("England", "London");
        myhashMap.put("Germany", "Berlin");
        System.out.println(myhashMap);
        System.out.println("printing keySet():" + myhashMap.keySet());
        System.out.println("printing values():" + myhashMap.values());
        HashMap<Integer, Integer> myhashmapint = new HashMap();
        myhashmapint.put(1, 90000);
        myhashmapint.put(2, 80000);
        myhashmapint.put(3, 70000);
        System.out.println("printing hashmap with integer values: "+myhashmapint);
        System.out.println("printing keySet():" + myhashmapint.keySet());
        System.out.println("printing values():" + myhashmapint.values());
        return "log: it worked";
    }
    // try building a map structure next
    public static void main (String [] args){
        String resultsHashTable = hashTableWork();
        String resultsHashMap = hashMapWork();
    }
}
