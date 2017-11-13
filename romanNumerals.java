package romanNumerals;
import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number and I'll convert it into roman numerals: ");
		int n = in.nextInt();
		int place = 0;
		String romanOnes = romanDigit(n%10,"I","V","X");
		place = n;
		n = n/10;
		String romansTen = romanDigit(n%10,"X","L","C");
		n = n/10;
		String romansHundreds = romanDigit(n%10,"C","D","M");
		System.out.println(romansHundreds + romansTen + romanOnes);
	}
	public static String romanDigit(int n, String one, String five, String ten) {
		String space = "";
		if(n == 1) {
			space += one;
		}else if(n == 2){
			space += one + one;
		}else if(n == 3) {
			space += one + one + one;
		} else if(n == 4) {
			space += one + five;
		} else if(n == 5) {
			space += five;
		} else if(n == 6) {
			space += five + one;
		} else if (n == 7) {
			space += five + one + one;
		} else if (n == 8) {
			space += five + one + one + one;
		} else if (n == 9) {
			space += one + ten;
		} else if (n == 10) {
			space += ten;
		}
		return space;
	}
}




