import java.util.ArrayList;

public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        // general for loop
        for(int i=0;i< num.size();i++){
            System.out.println(num.get(i));
        }
        System.out.println("for each using (:)");
        for (int n:num){
            System.out.println(n);
        }
         System.out.println("forEach (:)");
        num.forEach(n -> {
            System.out.println(n);
        });
    }
}
