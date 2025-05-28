import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args){

        //HashMAP
        Map<String,Integer> m=new HashMap<String,Integer>();
        m.put("AIML",98);
        m.put("IOT",100);
        m.put("ECE",89);
        System.out.println("Subject Marks");
        for(Map.Entry<String,Integer> entry:m.entrySet()) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        //LinkedHashMap
        Map<String,Integer> a=new LinkedHashMap<String,Integer>();
        a.put("AIML",98);
        a.put("IOT",100);
        a.put("ECE",89);
        System.out.println("LinkedHashMap output");
        for(Map.Entry<String,Integer> entry:m.entrySet()) {
            System.out.println(entry.getKey()+","+entry.getValue());
        

            
        }
        //TreeMap
        Map<String,Integer> at=new TreeMap<String,Integer>();
        at.put("AIML",98);
        at.put("IOT",100);
        at.put("ECE",89);
        System.out.println("TreeMap output");
        for(Map.Entry<String,Integer> entry:at.entrySet()) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        





        
        
    }
    
}
