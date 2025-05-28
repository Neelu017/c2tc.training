import java.util.PriorityQueue;



public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> q=new PriorityQueue<>();
        q.add("Allen");
        q.add("Boss");
        q.add("Cat");
        for (String names :q) {
            System.out.println(names);


        }
        PriorityQueue<Integer> f=new PriorityQueue<>();
        f.add(46);
        f.add(246);
        f.add(666);
        for (int num:f) {
            System.out.println(num);



        }


    }
    
}
