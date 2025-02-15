public class test {
    public static void main(String[] args) {
       
        int arr[] = {-8, 2, 3, -6, 10};
        int windowSize = 1; // Define the window size
        int sum = 0;
        
        //for(int p=k ; p <= arr.length - k ; p++){
        for (int i = 0; i <= arr.length - windowSize; i++) {
            // i is the starting index of the window
            for (int j = i; j < i + windowSize; j++) {
                // j iterates through the current window
                if (arr[j] < 0) {
                    sum += arr[j];
                }
            }
        }
  //  }
       
        System.out.println(sum);
       

    }
}