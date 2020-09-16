import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic logic = new Logic();
        System.out.print("Write number: ");
        String value = sc.next();
        var test = logic.CreateLIst(value);
        int[] array = test.getValue0().stream().mapToInt((Integer i) -> i.intValue()).toArray();
        var results = logic.SumValueFromLists(array, test.getValue1());
        Arrays.stream(results).forEach(System.out::println);
    }
}

