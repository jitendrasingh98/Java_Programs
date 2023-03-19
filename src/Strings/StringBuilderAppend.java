package Strings;

public class StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        str.append(10.2f);
        System.out.println(str);
        str.append('H');
        System.out.println(str);
        str.append(10);
        System.out.println(str);
        str.append("java");
        System.out.println(str);
        str.append(10.023456);
        System.out.println(str);
    }
}
