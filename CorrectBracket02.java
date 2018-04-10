package correctbracket02;

import java.util.Scanner;

public class CorrectBracket02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("��ȣ�� �Է��ϼ���(10������) : ");
		
		int [] stack = new int[10];
		int top=-1;
		
		int i;
		boolean done=false;
		
		String bracket;
		
		bracket = input.nextLine();
		
		
			char temp;
			
			for ( i =0; i<bracket.length(); i++ )
			{
				temp = bracket.charAt(i);
				if (temp == '(')
				{
					if (top<10)
					{
						top++;
						stack[i] = temp;
					}
					else
					{
						System.out.println("error");
					}
				}
				else if (temp == ')')
				{
						top--;
				
				}
			}
			
			if (top==-1)
			{
				System.out.println("�ùٸ� ��ȣ�Դϴ�");
			}
			else
			{
				System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�");
			}
			
		
		
	}
}
