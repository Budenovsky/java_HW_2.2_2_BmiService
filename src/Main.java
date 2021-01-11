public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();

        float bodyMassIndex_test_me = service.calculate(67.4f, 1.87f);
        System.out.println(bodyMassIndex_test_me);

        float bodyMassIndex_test_plump = service.calculate(110f, 1.75f);
        System.out.println(bodyMassIndex_test_plump);
    }
}
