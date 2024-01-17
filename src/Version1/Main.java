package Version1;


	
	import java.util.Scanner;

	
	public class Main {		
		public static void main(String[] args) {
			 
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the No:");
			int No= input.nextInt();
			if(No%2==0) {
				System.out.println(+No+" "+"No is Even");
				
			}
			else {
				System.out.println(+No+" "+"No is Not Even");
			}
			
		}

	}


