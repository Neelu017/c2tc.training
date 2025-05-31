import java.util.Scanner;

    

public class TypingSpeedTest1 {
    public static void main(String[] args) {
        String sentence="Neelu is a cutie." ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type the following sentence as fast as you can");

        System.out.println("\"" + sentence + "\"\n");
        TimerThread timer=new TimerThread(30);
        
        timer.start();
        long startTime=System.currentTimeMillis();
        int wordsTyped=0;
        while(!timer.timeUp) {
            String input=scanner.nextLine();
            if(input.equals(sentence)) {
                long endTime =System.currentTimeMillis();
                double timeTakenInSeconds = (endTime - startTime) / 1000.0;
                wordsTyped = sentence.split(" ").length;
                double wpm=(wordsTyped / timeTakenInSeconds) * 60;
                System.out.println(" You typed it in %.2f seconds ! Your speed: % .2f WPM\n , timeTakenInSeconds,wpm");
                timer.timeUp = true;
                break;

            }else {
                System.out.println("X Typo! Prledu malli inkosari try cheyachule");
            }
        }
        scanner.close();
    }
    
}
