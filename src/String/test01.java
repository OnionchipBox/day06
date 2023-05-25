package String;

// "Have a nice day Have a nice day Have a nice day" 문자열에서 a의 위치를 저장 하여 출력 하시오.

public class test01 {
	public static void main(String[] args) {
		
		String str = new String("Have a nice day Have a nice day Have a nice day");
		
		 int i=0;
		 
	      while(i < str.length()) {
	         if(str.charAt(i) == 'a')
	            System.out.printf("[%d], ",i);
	         i++;
	      }
		
		
		
	}

}
