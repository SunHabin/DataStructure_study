

import java.util.Scanner;

public class test{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int n = input.nextInt();
		
		for (int i=1; i<=n;i++) {
			recursion(i);
		}
	}
	public static void recursion(int i) {
		System.out.println(i);
	}
	

}
