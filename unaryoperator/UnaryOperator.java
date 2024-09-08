package unaryoperator;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = -5;
        boolean isTrue = true;

        //Decrement
        System.out.println("x awal:" + x);
        System.out.println("++x: " + ++x);//Pre - Decrement
        System.out.println("x++ " + x++);//Post - Decrement
        System.out.println("x akhir :" + x);

        //Unary plus and minus
        System.out.println("+x : " +x);
        System.out.println("-y : ");


        //Logical not
        System.out.println("!isTrue : " + isTrue);
    }
}

