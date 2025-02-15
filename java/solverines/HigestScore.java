import java.util.Arrays;

public class HigestScore {
    public static void main(String[] args) {
        int arr [] = {2,20,5,8,10}; // 2 20 5  8 10 

        Arrays.sort(arr);
        int n = 2;
        int sum = 0 ;

        for(int i = arr.length - n ; i <arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
