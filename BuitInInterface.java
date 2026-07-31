import java.util.function.*;
import java.util.*;
// 
@FunctionalInterface
 interface  Cube {
    public int cube(int n);
}
public class BuitInInterface {
 public static void main(String[] args) {
       Cube res =(n) -> n*n*n;
       System.out.println(res.cube(5));
       //    buit-in methods
       Function<Integer,Integer> cubeOfNum  = (n) -> n*n*n;
       System.out.println(cubeOfNum.apply(5));
    //    for conditional check buit-in
    Predicate<Integer> result= (n) -> n%2 ==0;
    System.out.println(result.test(5));
    System.out.println(result.test(10));
    Consumer<String> r = name -> System.out.println("Welcome : " + name);
    r.accept("Zoro");
 }
}
