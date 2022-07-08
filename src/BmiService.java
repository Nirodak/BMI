public class BmiService {


    public double calculate (double weight, double hight) {

        return Math.round(weight/(hight*hight)*100)/100;

    }
}
