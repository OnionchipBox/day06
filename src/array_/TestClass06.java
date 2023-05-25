package array_;

import java.util.Scanner;

public class TestClass06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int arr[] = new int[] {10,54,13,17,25,30};
		String odd_even = null;
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next();
		
		for(int num : arr) {
			if(odd_even.equals("짝수")) {
				if(num % 2 == 0) {
					System.out.println("짝수 : "+num);
				}
			else
				if(num % 2 != 0)
					System.out.println("홀수 : "+num);
			}
	}
//		if(odd_even == "짝수")
		
}
}
