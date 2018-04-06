package outzero;
import java.util.Scanner;

public class OutZeroMain {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("몇개의 숫자를 입력받으시겠습니까?");
		
		int size = input.nextInt();
		
		int[] stack = new int[size];
		
		int top = -1;
		int temp;
		int count=0;
		
		for (int i=0; i<size ; i++) {
			
			temp=input.nextInt();
			
			if (temp!=0) {
				top++;
				stack[top]=temp;
			}
			else {
				if (top!=-1) 
					stack[top]=0;
					top--;
				}
			}
		
		for (int i=0; i<=top;i++) {
			
			count = count + stack[i];
		
		}
		
		System.out.println("숫자의 합은" + count);
		input.close();
	}
}
