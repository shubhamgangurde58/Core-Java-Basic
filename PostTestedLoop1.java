
import java.util.Scanner;
class PostTestedLoop1 {

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n=sc.nextInt();
		int i=0;

		do{	
			System.out.println("Dennis ritchie");
			i++;
		}while(i<n);
	}	
}