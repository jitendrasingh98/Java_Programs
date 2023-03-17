package Basic_Program;
public class MathFunction {
    public static void main(String[] args) {
        System.out.println("-::   JAVA MATH FUNCTION   ::-");

        //Math.max(x,y)->find highest value of x and y
        System.out.println("highest value :"+Math.max(10,25));

        //Math.min(x,y)->find minimum value
        System.out.println("lowest value :"+Math.min(10,25));

        //Find Square Root -> Math.sqrt(x)
        System.out.println("Square Root :"+Math.sqrt(25));

        //Find Cube Root -> Mayh.cbrt(x)
        System.out.println("Cube Root :"+Math.cbrt(125));

        //Power -> Math.pow(x,y) -> return the value of x to the power y
        System.out.println("Power :"+Math.pow(5,2));

        //Round -> Math.round(x) -> Return the value of x rounded to its nearest integer
        System.out.println("Round Value :"+Math.round(22.8966));

        //Floor Value -> Math.floor(x) ->Return the value of x rounded down to its nearest integer
        System.out.println("Floor value :"+Math.floor(22.8966));

        //Find Absolute (Positive) Value -> Math.abs(x)
        System.out.println("Absolute  value :"+Math.abs(-10.25));

        //Random Numbers -> Math.random()->return a random number between 0.0(inclusive) and 1.0(exclusive)
        System.out.println("Random value between 0.0 and 1.0 :"+Math.random());

        //Random Number between 0 and 100 ->Math.random()*101
        System.out.println("Random Value between  0 and 100 :"+Math.random()*101);

    }

}
