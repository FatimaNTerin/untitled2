package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zayan on 3/15/14.
 */
public class UseQueue {
    public static void main (String[]args){
        Queue queue=new LinkedList();
        queue.add("Name");
        queue.add("Address");

        Iterator StudentInfo=queue.iterator();
        while(StudentInfo.hasNext()){
	    System.out.println(StudentInfo.next());

        Queue queue1=new LinkedList();
        queue1.add("Name");
        queue1.add("Address");
        queue1.add("Phone");

        System.out.println("\n"+queue.peek());
        queue.remove();
        System.out.println(queue.peek()+"\n");

        Queue queue2=new LinkedList();
        queue2.add("Vtech");
        queue2.add("MIT");
        queue2.add("Columbia");
        queue2.add("Yale");

        System.out.println(queue2.remove());
        System.out.println(queue2.peek());





        }
}
}
