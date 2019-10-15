package cl.math;



public class MathHelperTest {


    //
    public static void main (String[] args){
        testSumArea();
        testAreaCircle();
        //create an instance/object of class/type MathHelper
        //MathHelper myObject = new MathHelper();
        //reference
        //myObject.myMethod("Jorge");
    }

    public static void testSumArea(){
        System.out.println("Result of the sum of area is: " + MathHelper.sumArea(4d,5d));
    }

    public static void testAreaCircle() {
        System.out.println("Result of circle is : " + MathHelper.circleArea(5d));
    }


}
