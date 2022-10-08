package academy.learnprogramming;

public class Main {

    public static void main (String[] args){

        //single precision = 32 bits
        //double precision = 64 bits

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3; //no remainder
        float myFloatValue = 5f / 3f; //double is default decimal, use casting
        double myDoubleValue = 5d / 3d; //double is preferred, takes up more space
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //covert pounds to kg

        double myNumberPounds = 180d;
        double myNumberKilos = myNumberPounds * 0.45359237; //1lb = 0.45359237kg
        System.out.println("My number of pounds converted to kilos = " + myNumberKilos + " kg");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d; //underscores are acceptable
        System.out.println(pi);
        System.out.println(anotherNumber);

        //float and double may not be yield precise enough calculations IRL... therefore use BigDecimal when needed

    }
}
