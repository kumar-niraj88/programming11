
public class repated {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,4,5,5}; // oupout --> [1,2,2,4,4,5,5]

        
        
        for(int i = 0 ; i < arr.length ; i++){
            int count = 1;
            for(int j = i ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;;
                }
            }
            if(count <=2){
                System.out.print(arr[i]);
            }
        }

    }
}
