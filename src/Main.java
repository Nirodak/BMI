public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weight = 95;
        double hight = 1.90;

        double bmiCalculate = service.calculate(weight, hight);
        System.out.println(bmiCalculate);
    }
}
