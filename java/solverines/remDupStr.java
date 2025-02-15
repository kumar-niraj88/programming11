public class remDupStr {
    public static void main(String[] args) {
        String  res = removeDuplicate("apple");
        System.out.println(res);

    }

    static String removeDuplicate(String s){
        String s1 = "";

        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            if(s1.indexOf(c) == -1){
                s1 += c;
            }

        }
        
        return s1;
    }
}
