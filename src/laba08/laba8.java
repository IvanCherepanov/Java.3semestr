package laba08;

import java.util.ArrayList;

public class laba8 {
    public static void main(String[] args) {
        WaitList<String> ex1 = new WaitList();
        System.out.println(ex1.isEmpty());
        ex1.add("first");
        ex1.add("second");
        ex1.add("third");
        System.out.println(ex1.isEmpty());
        System.out.println(ex1.toString());
        System.out.println("first in ex1:"+ ex1.contains("first"));
        ex1.remove();
        System.out.println("first in ex1:"+ ex1.contains("first"));
        System.out.println(ex1.toString());
        ex1.remove();
        ex1.remove();
        System.out.println(ex1.isEmpty());
        System.out.println(ex1.toString());
        ex1.remove();
        ex1.add("first");
        ex1.add("second");
        ex1.add("third");

        System.out.println("______2_part______");
        WaitList<String> ex2 = new WaitList<String>();
        ex2.add("first");
        ex2.add("second");
        ex2.add("third");
        System.out.println(ex2.toString());
        ArrayList<String> strings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println(strings);
        System.out.println("ArrayList and Waitlist are same: " + ex2.containsAll(strings));
        strings.add("fourth");
        strings.add("fifth");
        System.out.println("ArrayList and Waitlist are same: " + ex2.containsAll(strings));

        System.out.println("______3_part______");
        BoundedWaitList<String> ex3=new BoundedWaitList<String>(3);
        System.out.println(ex3.isEmpty());
        ex3.add("first");
        ex3.add("second");
        ex3.add("third");
        System.out.println(ex3.toString());
        ex3.add("end");

        System.out.println("______3_part______");
        UnfairWaitList<String> ex4=new UnfairWaitList<String>();
        System.out.println(ex4.isEmpty());
        ex4.add("first");
        ex4.add("second");
        ex4.add("third");
        System.out.println(ex4.toString());
        ex4.remove("second");
        System.out.println(ex4.toString());
        ex4.add("end");
        ex4.add("begin");
        System.out.println(ex4.toString());
        ex4.moveToBack("third");
        System.out.println(ex4.toString());
    }
}
