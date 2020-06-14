public class Main {

    public static void main(String[] args) {
	BmiService myBmiService = new BmiService();
	float myBMI = myBmiService.calculate(1.71f, 60);
        System.out.printf("%.2f", myBMI);
    }
}
