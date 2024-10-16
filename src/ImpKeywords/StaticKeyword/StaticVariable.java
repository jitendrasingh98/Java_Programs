package ImpKeywords.StaticKeyword;
class Demo{
    //static variable
    static  int num=25;

    //non static variable
    int num1=30;
}
public class StaticVariable {
    static int num3=65;//global / class level
    public static void main(String[] args) {
      //  static int num2=35;//static variable can't be local
        Demo d = new Demo();
        System.out.println(num3);
        System.out.println("Non-Static Variable : "+d.num1);
        System.out.println("Static Variable : "+Demo.num);//static variables directly accessible with class name
    }
}
