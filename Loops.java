public class Loops{
    public static void main(String []args){
        for(int i=1;i<= 5;i++){
            System.out.println(i);
        }
        //backward direction
        for(int  i=5;i>=1;i--){
            System.out.println(i);
            
        }
         for(int i=1;i<= 10;i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
        int sum = 0;
        for(int i = 1;i<=10;i++){
            // assignment operator
            sum += i;

        }
        System.out.println("SUm of 10 numbers: "+sum);
    }
}