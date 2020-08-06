package Lab1;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(
                "****** ******\n" + "*      *\n" + "*      ******\n" + "*      *\n" + "****** ******\n"
        );

        String a = "";
        int b = 0;
        Double c = 0.0;
        test(a);
        test(b);
        test(c);



    }
    public static   <T> void test(T t) {
        System.out.println(t.getClass());
    }
}
