class Arraytopic{
    public static void main(String[] args){
        // 1 way Arrays
        int [] n = {10,20,30};
        //  2 way to create arrays with default
        String [] l = new String[3];
        System.out.println(l);
        // by using index we adding values 
        l[0] = "JavaScript";
        l[1] = "Python";
        l[2] = "bash";  
        // forEach
        for(String i: l){
            System.out.println(i);
        }    
        // updating value of array
        l[l.length -1] = "c lang"  ;
        System.out.println(l[2]);
    }
}