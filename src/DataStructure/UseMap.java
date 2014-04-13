package DataStructure;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 * Created by zayan on 3/15/14.
 */
public class UseMap {
    public static void main (String[]args){
        Map<String,String> map=new HashMap <String,String>();
        map.put("Zaha Hadid", "Architect");
        map.put("steven Holl", "Architect+ Urban Designer");
        map.put("Peter Park", "Urban Planner");
        map.put("Rem Koolhaas", "Landscape Architect");
        map.put("Bjark Ingles", "Urban Designer");



        Iterator Designer = map.entrySet().iterator();
        while(Designer.hasNext()){
            Map.Entry entry= (Map.Entry)Designer.next();
            System.out.println(entry.getKey() +" - "+ entry.getValue());
    }
}
}
