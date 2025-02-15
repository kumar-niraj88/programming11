
public class StringPrg {
    public static void main(String[] args) {
        String s = "a2b11";
       char arr[] = s.toCharArray();


        for(int i = 0 ; i < arr.length; i++){
            int num = 0 ;
            if(arr[i]>='0' && arr[i]<='9'){

                 char temp = arr[i-1] ;

                 for(int j = i ;j <arr.length; j++ ){

                    if(arr[i]>='0' && arr[i]<='9'){
                        num = (num*10) +arr[i] - 48;
                    }else{
                        break;
                    }
                    i++;
                 }
                 for(int k = 0 ; k <num ; k++){
                    System.out.print(temp);
                }
            }
            
        }

    }

}
