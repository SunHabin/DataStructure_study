
package substitution;

import java.util.Scanner;

public class Substitution {

	public static void main(String[] args) {

		String cipher;
		String content ="";

		Scanner input = new Scanner(System.in);

		System.out.print("시저의 암호를 입력하세요 : ");
		cipher = input.nextLine();

		char[] temp = cipher.toCharArray();
		
		for (int i = 0; i < cipher.length(); i++) {

			if (temp[i] != 32) {
				temp[i] -= 3;
				if (temp[i] <= 96)
					temp[i] += 26;
			}
			content += Character.toString(temp[i]);
		}
		
		System.out.println(content);
	}
}
