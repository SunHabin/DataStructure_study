import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		int result[] = new int[20];
		result[0]=1;
		
		System.out.print("20이하의 정수를 입력해주세요 : ");
		
		num = input.nextInt();
		
		if(num>20) {
			System.out.println("error");
			return;
		}
		else {
		
			fibonacci(num, num, result);
		}
				
		
	}
	
	public static void fibonacci(int n, int count, int[] result) {
		
		if(count<2) {
			System.out.println(result);
			return;
		}
		else {
			count--;
			fibonacci(n,count,result);

		}
	}
}
