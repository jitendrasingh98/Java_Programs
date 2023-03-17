package MethodsORFunctions;

public class Addition {
    public static void main(String[] args) {
        //sum();
       // sum1(25,56);
       // sum3();

        int ans=sum4(85,25);
        System.out.println(ans);
    }

    // 1.No Arguments With No Return Type

   /* static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Addition : " + sum);
    }*/

    // 2.Argument With No Return Type

  /*  static void sum1(int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }*/

    // 3.No Argument with Return Type
    /*static int sum3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Addition : " + sum);
        return sum;
    }*/

    // 4.Argument with Return Type
    static int sum4(int a,int b){
        int sum =a+b;
        return sum;

    }
}
