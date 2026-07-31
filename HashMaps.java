import java.util.*;
public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> student = new HashMap<>();
        student.put(101,"java");
        student.put(102,"javascript");
        student.put(103,"python");
        System.out.println(student.get(102));
        student.remove(101);
        student.replace(103, "c");
        System.out.println(student);
        System.out.println(student.containsKey(101));
        System.out.println(student.containsKey(103));
        System.out.println(student.containsValue("java"));
        System.out.println("for loop for hashmap");
        for (Map.Entry<Integer,String> entry:student.entrySet()){
            System.out.println("Key is: " +entry.getKey() +"\t" + "Values: are "+ entry.getValue());
        }
        student.forEach((k,v) -> {
            System.out.println("Key :"+k+"\t"+"Values: "+v );
        });
    }
}
