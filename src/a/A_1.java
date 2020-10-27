package a;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class A_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//JOptionPane j = new JOptionPane();
		
		System.out.print("숫자 : ");
		int NintendoSwitch = s.nextInt();
		
		switch (NintendoSwitch) {
		case 1:
			System.out.println("11111");
			break;
		case 2:
			System.out.println("2222222");
			break;
		case 3:
			System.out.println("333333");
			break;
		case 4:
			System.out.println("444444");
			break;
		case 5:
			System.out.println("5555555");
			break;
		case 6:
			System.out.println("6666666");
			break;
		default :
			System.out.println("????????");
		}
		
		int tet;
		tet = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력해주세요 : "));
		
		System.out.println("번호는 " + tet);
		
		s.close();
	}
	
}
