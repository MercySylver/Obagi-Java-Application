import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = scan.nextInt();
			
		System.out.println("Multiplication table of " + num);	
		for(int i = 1; i <= 12; i++){
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}
}