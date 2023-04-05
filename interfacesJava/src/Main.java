import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = e -> "Hello "+e;
        System.out.println(unaryOperator.apply("World!"));

        BinaryOperator<Integer> binaryOperator = (x, y) -> x+y;
        System.out.println(binaryOperator.apply(5,20));
    }
}
