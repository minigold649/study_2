package a;

import java.util.Scanner;
import java.util.Arrays;

public class a {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("판별할 문장을 입력 해주세요 ==> ");
		String input = s.next();
		char palindrom[] = new char[input.length()];
		
		for (int i = 0 ; i < (input.length()) ; i++) {
			 palindrom[i] = input.charAt(i);
		}
		
		System.out.println(Arrays.toString(palindrom));
		
		boolean isPalindrom = true;
		
		for (int i = 0 ; i < (input.length()/2) ; i++) {
			if (palindrom[i] == palindrom[(input.length()) - 1 - i]) {
				isPalindrom = true;
			} else {
				isPalindrom = false;
			}
		}
		
		System.out.println("isPalindrom : " + isPalindrom);
		s.close();
	}

}
