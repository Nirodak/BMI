public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weight = 74;
        double hight = 1.72;

        double BmiCalculate = service.calculate(weight,hight);
        System.out.println(BmiCalculate);
     }
}
