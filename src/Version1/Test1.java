package Version1;
import java.util.Scanner;
public class Test1 {
			
		public static void main(String[] args) {
			 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the No:");
			int No= input.nextInt();
			if(No%2==0) {
				System.out.println(+No+" "+"No is Even");
				System.out.println("******************");
			}
			else {
				System.out.println(+No+" "+"No is Not Even");
				System.out.println("******************");
			}
			
		}

	}




