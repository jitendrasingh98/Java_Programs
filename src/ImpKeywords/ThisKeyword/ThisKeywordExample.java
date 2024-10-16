package ImpKeywords.ThisKeyword;

public class ThisKeywordExample {
   int num;
    void show(int num){
        this.num=num;
    }

    public static void main(String[] args) {
        ThisKeywordExample obj = new ThisKeywordExample();
        obj.show(25);
        System.out.println(obj.num);
    }
}
