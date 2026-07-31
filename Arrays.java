
public class Arrays{
    public static void main(String[] args){
        // Arrays are used to store a group of same type of values in single variable
        /*
        int [] n = {10,20,30,40,50};
        // accessing values of arraay
        System.out.println(n[3]);
        System.out.println(n[1]);
        System.out.println(n[n.length -1]);
        // updating values using index position
        n[0] =  500;
        // n[2] = "d";
        System.out.println(n[0]);
        // loops
        String [] languages = {"Javscript","python","c++"};
        for(int i=0;i < languages.length;i++){
            System.out.println(languages[i].toUpperCase());
        }
        System.out.println("Reverse order");
        for(int i=languages.length -1;i >= 0;i--){
            System.out.println(languages[i]);
        }
        */
    //    empty arrayss
    int [] num = new int[5];
    /*for(int i: num){
        System.out.println(i);
    }*/
   num[0] = 10;
   num[1] = 20;
   num[2] = 30;
   num[3] = 40;
   num[4] = 50;
   int sum = 0;
   for (int i: num){
    sum += i; 
   }
   System.out.println(sum);
    }
}