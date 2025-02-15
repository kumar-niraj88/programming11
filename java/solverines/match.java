public class match {

    public static void main(String[] args) {
        int arr[] = {0,1,1,4,2,0,1,2,4,0};
        int othermatchscore[] = {40,56,11,1};

        int bound = 0;
        int single = 0;
        int dot = 0 ;
        int current  = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
         if(arr[i] == 0 ){
            dot++;
         }else if(arr[i] == 6 || arr[i] ==4){ bound++;
        }else{
            single++;
        }
        current = current + arr[i];

        }

        int othertotalscore = 0 ;

        for(int i : othermatchscore){
            othertotalscore += i;
        }
        int total = current + othertotalscore;

        System.out.println(total/othermatchscore.length);

    }
    
}
