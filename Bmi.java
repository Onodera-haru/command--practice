import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		double tall,weight,bmi;
		for(int i = 0;i <= 1;i++){
		tall =  scanner.nextDouble();
		weight = scanner.nextInt();
		bmi = (weight/tall)/tall;
		bmi = ((double)Math.round(bmi * 10))/10;
		System.out.println(bmi);
		}
		
	}
}

