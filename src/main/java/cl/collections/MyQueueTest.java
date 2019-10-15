package cl.collections;

public class MyQueueTest {


    public static void main(String[] args) {
        testElementWithElements();
        testElementWithoutElements();
        testPollWithElements();
        testPollWithOutElements();
    }

    public static void testElementWithElements() {
        MyQueue myQueue = new MyQueue();

        myQueue.add(2);
        myQueue.add(7);

        System.out.println("7 == " + myQueue.peek());
    }

    public static void testElementWithoutElements() {
        MyQueue myQueue = new MyQueue();

        System.out.println("null == " + myQueue.peek());

        System.out.println("_______________________");
    }



    public static void testPollWithElements(){
        MyQueue myQueue = new MyQueue();

        myQueue.add(5);
        myQueue.add(9);
        System.out.println("9 == " + myQueue.pool());
    }

    public static void testPollWithOutElements(){

        MyQueue myQueue = new MyQueue();

        System.out.println("Null == " + myQueue.pool());
    }
}
