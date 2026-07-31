class sl{
    public  static void main(String[] args){
        String lang = "javascript";
        // General for loop
        for (int i =0;i < lang.length();i++){
            System.out.println(i);
            System.out.println(lang.charAt(i));
        }

        // 3. way StringBuilder
        StringBuilder s = new StringBuilder("java");
        s.append("is worst");
        System.out.println(s);
        s.insert(2,"JS");
        System.out.println(s);
    }
}