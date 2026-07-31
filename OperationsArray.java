import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class OperationsArray {
    public static void main(String[] args) {
        // first way to create array
        int [] ar = {10,20}; 
        // list in java;
        List<String> name=Arrays.asList("siva","sai","akhil");
        // ArrayList with values and without values
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Empty arrayList:" +arr);
        // ArrayList with values and with values
        ArrayList<Integer> arrValue=new ArrayList<>(Arrays.asList(500,100,300,400,200));
        System.out.println("With values ArrayList: "+arrValue);
        // both arrays and list are fixed size
        // arrayList is dynamic in java
        // sort,removeif
        arrValue.sort((x,y) -> x -y);
        System.out.println(arrValue);
        arrValue.sort((x,y) -> y - x);
        System.out.println(arrValue);
        // removeif 
        arrValue.removeIf(n -> n > 300);
        System.out.println(arrValue);
        arrValue.replaceAll(n -> n*n);
        System.out.println(arrValue);

    }
}
