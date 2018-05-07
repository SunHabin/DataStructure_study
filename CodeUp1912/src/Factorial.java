import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, result=1;
		
		System.out.print("정수를 입력하세요 : ");
		num = input.nextInt();
		
		
		factorial(num,result);
	}
	
	public static void factorial(int n, int result) {
	
		if(n<1) {
			System.out.println(result);
			return;
		}	
		else {
			result = result * n;
			n--;
			factorial(n,result);
		}
	}
}
