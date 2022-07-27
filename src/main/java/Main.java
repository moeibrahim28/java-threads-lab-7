import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer num = getCallableInteger().call();
        System.out.println(num);
    }
    public static Callable<Integer> getCallableInteger() {
        // your code here

        Callable<Integer> integerCallable = () -> {
            Scanner scanner = new Scanner(System.in);
            Integer num = scanner.nextInt();
            return num;
        };
        return integerCallable;
    }
}