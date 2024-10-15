package ImpKeywords.FinalKeyword;


class FinalDemo {
    // create a final method
    public final void display() {
        System.out.println("This is a final method.");
    }
}

public class FinalMethod extends FinalDemo{

    //it will give an error - can not override final method
    /*public final void display() {
        System.out.println("The final method is overridden.");
    }*/
    public static void main(String[] args) {
           FinalMethod obj = new FinalMethod();
           obj.display();
    }
}
