
public class arrlargest {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,64,87,2};

    int first = arr[0] ;
    int second= arr[0] ;
    int third= arr[0] ;

      for(int i = 0 ; i < arr.length ; i++){
        if(arr[i] > first){
            second = first;

            first = arr[i];
        }else if(arr[i] > second && arr[i] != first){
            third = second;
            second = arr[i];
        }
        // }else if(arr[i] > third && arr[i] != second){
        //     third = arr[i];
        // }
       }
       System.out.println("first largest  : " + first);
       System.out.println("second largest : " + second);
       //System.out.println("third largest : " + third); // now not working --> thinks
    }
}
