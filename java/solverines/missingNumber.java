import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7,8};
        Arrays.sort(arr);

        int j = 0 ;

        for(int i = 0 ; i < arr.length ; i++ , j++){
            if(j!=arr[i]){
                System.out.println(j);
                i--;

            }
        }

    }
}
