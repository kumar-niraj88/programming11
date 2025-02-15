package Thread;

public class Main {
    public static void main(String[] args) {
        // myclass my = new myclass();
        Runnable r = () -> {
            for(int i = 0  ;  i < 10 ; i++ ){
                System.out.println("hello" + i);
            }
        };
        Thread childthread = new Thread(r);
        childthread.run();
        // for(int i = 0 ; i < 10 ; i++){
        //     System.out.println("bye"+i);
        // }


    }
}
