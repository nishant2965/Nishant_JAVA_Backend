public class FirstThread extends Thread{
    
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("The number is : " + i);
        }
    }

    public static void main(String[] args){
        FirstThread f = new FirstThread();

        f.start();
       
        try {
            f.join();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
