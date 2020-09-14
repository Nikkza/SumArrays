public class Main {

      public static void main(String[] args) {
        Logic logic = new Logic();
        var test = logic.CreateLIst("10,2");
        test.getValue0().forEach(System.out::println);
    }
}
