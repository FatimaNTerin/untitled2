package DataStructure;

/**
 * Created by zayan on 3/15/14.
 */import java.util.Stack;
   import java.util.Iterator;

public class UseStack {

    public static void main(String []args){

        Stack <String> stack=new Stack();
        stack.push("NY");
        stack.push("NJ");
        stack.push("VA");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack <String> stack1=new Stack();
        stack1.push("CO");
        stack1.push("CA");
        stack1.push("MD");
        stack1.push("WA");
        System.out.println("\n"+stack1.peek());

        System.out.println(stack.push("\n"+"I live in NJ"+"\n"));


        Stack <String> stack2=new Stack();
        stack2.push("iPhone");
        stack2.push("iPad");
        stack2.push("Mac");
        stack2.push("iPod");
        stack2.push("Apple Software");
        stack2.push("Apple Accessories");


        Iterator appleProduct = stack2.iterator();
        while(appleProduct.hasNext()){
		System.out.println(appleProduct.next());
        }

    }
}
