package Module3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {

    public static void main(String[] args) {

        Map<String , String> mapping = new HashMap<>();
        //maps ke khud ke methods hote hai
        //1. Insertion -- put(); method
        mapping.put("in" , "INDIA");
     //   mapping.put("in" , "INDIA2"); //ab jara entry number 2 ko dekhte hai , isme "in" unique values key values to same hai lekin under ki detailed value change hai aur agar issi same scenario main run karta hu to ---> mujhe INDIA ni milegi INDIA2 updated value mil jayegi..
        mapping.put("En" , "England");
        mapping.put("US" , "United State");
        System.out.println(mapping);


        Map<String , String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("before:" + table);
        table.putAll(mapping);//putAll ki madad se ek colleciton ki sari entries ko dusre collection mein insert karva sakte hai ..
        System.out.println("After: " + table);

        //Deletion
        table.remove("En");
        System.out.println(table);

        //to print the SIZE of the map
        System.out.println(table.size());

        // to clear the map entries
      //---------  table.clear();
        //System.out.println(table.size());

       //----------different type of init-------------------//
        //table.putIfAbsent("is", "INDIA3");// agar same key  dalu to wo change access nahi karega lekin jaise hi mein key  change karunga jaise ki is case mein hai (in) ki jagah (is) kara to humne dekha ek alag se key pair or value init ho jayegi
        //System.out.println(table);

       //key ke corresponding value print karna
        System.out.println(table.get("br"));

        //mostly used in development---getOrDefault(k,defaultValue)------
        System.out.println(table.getOrDefault("US","None"));
        System.out.println(table.getOrDefault("us","None"));



        //contains key() check karta hai mep ke under koi key hai ki nahi
        System.out.println(table.containsKey("in"));
        System.out.println(table.containsKey("im"));

        System.out.println(table.containsValue("United State"));
        System.out.println(table.containsValue("United States of America"));

        System.out.println(table);

        table.replace("in", "Indonesia");// used to modify the key corresponding values
        System.out.println(table);


        // #Keyset() -- returns a collection of all the keys present in a map
        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        //#Values() -- returns a values present in a  map
        Collection<String> valueSet = table.values();
        System.out.println(valueSet);


        // get all the entries from a map -> method contains entrySet()
         Set<Map.Entry<String,String>> entrySet  = table.entrySet();
         //set of map of entry of String,String
        System.out.println("Printing entries: " + entrySet);



        //Iterator
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"Two");

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



    }



}
