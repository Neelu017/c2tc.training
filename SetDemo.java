import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class SetDemo {
    public static void main(String args[]) {
        Set<Integer> ll=new HashSet<Integer> ();
        ll.add(10);
        ll.add(10);
        ll.add(34);
        ll.add(23);
        for (int i:ll) {
            System.out.println("The elements in Set interface "  +i);
        }
        System.out.println("Execution using LinkedHashSet");
        Set<Integer> l=new LinkedHashSet<Integer> ();
        l.add(10);
        l.add(10);
        l.add(34);
        l.add(23);
        for (int i:l) {
            System.out.println(i);
        }



                                                     


    }
    
}
