package ImpKeywords.FinalKeyword;

// create a final class
final class FinalClass1 {
    public void display() {
        System.out.println("This is a final method.");
    }
}
//iot will give an error - can not be inherits final class
/* class  Main extends FinalClass1{

}*/
public class FinalClass {
    public static void main(String[] args) {
        FinalClass1 obj = new FinalClass1();
        obj.display();
    }
}
