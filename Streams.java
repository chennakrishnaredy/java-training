import java.util.*;

// import java.util.Arrays;
public class Streams {
    public static void main(String[] args) {
        // Stream Api is used to process collection of data 
        // A stream can be used once 
        // How to create stream 
        Stream<String> a = Stream.of("luffy","zoro");
        System.out.println(a);
        a.forEach(ele -> System.out.println(ele));
        // a.collect(Collectors.toList());
        // streaam for List 
        // map is used to iterate values of collection and apply some condition and it returns new collections. 
        List<String> firstName = Arrays.asList("Monkey D","Rockes D");
        List<String> streamFirstName = firstName.stream()
        .map(e -> e.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(streamFirstName);

        // filter
        List<Integer> num = Arrays.asList(10,-2,-5,20,5);
        System.out.println(num);
        List<Integer> result = num.stream()
        .filter(n -> n>0 )
        .collect(Collectors.toList());
        System.out.println(result);
        List<Integer> accounts = Arrays.asList(10,20,10,20);
        int sum = accounts.stream()
        .reduce(0,(x,y) -> x +y);
        System.out.println(sum);
    }
}
