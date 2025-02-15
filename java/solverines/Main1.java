public class Main1{

    public static void main(String[] args) {
     
        String s = solve("xyzwyyxyzw");
        System.out.println(s);
        
    }
    public static String solve(String s){
    int n = s.length();

    String  longestSubString =" ";
    int longestLength=0;
    int lastOccurIndex=0;


    for(int len = n/2;len>=1;len--){
        for(int i=0; i<=n-2*len; i++){
            String substr=s.substring(i,i+len);
            for(int j=i+len; j<=n-len;j++){
                if(s.substring(j,j+len).equals(substr)){
                    if(len>longestLength || (len==longestLength && j>lastOccurIndex)){
                        longestLength =len;
                        longestSubString=substr;
                        lastOccurIndex=j;
                    }
                }
            }
        }
    }
    return longestSubString;

}

    
}
