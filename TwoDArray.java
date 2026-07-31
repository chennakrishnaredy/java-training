public class TwoDArray{
    public static void main(String[]  args){
        int [][] num = {{1,2},{3,4},{5,6},{7,8}};
        // accessing 2d array
        System.out.println(num[1][1]);
        System.out.println(num[2][0]);
        // updating values
        num[0][0]= 1000;
        System.out.println(num[0][0]);
      
    }
}