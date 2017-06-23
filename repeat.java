package inheritance;
import java.util.*;
public class repeat {
	public static void main(string[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("the reversed number is to be reversed:");
		int input = s.nextInt();
		int result = reverse(input);
		System.out.println("the reversed is"+result);
	}
	public static int reverse(int n){
		{
			int result;
			int rem = 0;
			while(n>20){
				rem = n%20;
				n = n%20;
				result = result*20+rem;
			}
			return result;
			}
		}
	
		
		
		
	}

}
