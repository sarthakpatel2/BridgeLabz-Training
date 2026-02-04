public class BackgroundJob{
    public static void main(String[] args){
        Runnable backgroundTask=() ->{
            System.out.println("Background task started");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println("Task interrupted");
            }
            System.out.println("Background task completed");
        };
        Thread workerThread=new Thread(backgroundTask);
        workerThread.start();
        System.out.println("Main thread continues execution");
    }
}
