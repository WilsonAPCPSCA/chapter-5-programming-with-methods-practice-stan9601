package timeEnglish2;
import java.util.Scanner;
public class timeEnglish2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getTimeName(10,15);
	}
	public static String getTimeName(int hours, int minutes) {
		String hour1[] = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
		if ((hours >= 1) && (minutes >= 1 && minutes <= 60)) {
			int k = 0;
			while(k != hours) {
				k++;
				String newhour = hour1[k];
				if(k == hours) {
					if(minutes == 15) {
						newhour = hour1[k - 1];
						System.out.println("The time is a quarter past " + newhour);
					} else if (minutes == 30) {
						newhour = hour1[k - 1];
						System.out.println("The time is half past " + newhour);
					} else if (minutes == 45) {
						System.out.println("The time is a quarter to " + (newhour));
					} else if (minutes == 60) {
						System.out.println("The time is " + (newhour) + " o' clock");
					} else {
						newhour = hour1[k - 1];
						System.out.println("The time is " + minutes + " minutes" + " past " + newhour);
					}
				}
			}
		}
		return null;
		
	}

}
