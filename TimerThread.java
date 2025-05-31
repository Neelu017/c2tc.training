
public class TimerThread extends Thread {
    private int timeLimit;
    public volatile boolean timeUp = false;

    public TimerThread(int seconds) {
        this.timeLimit = seconds;
    }

    public void run() {
        try {
            for(int i= timeLimit; i>0;i--) {
                System.out.println("Time left:" + i + "sec");
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            System.out.println("Timer interuupted");
        }
        timeUp=true;
        System.out.println("\nTime's up!");
        
    }

    
}
