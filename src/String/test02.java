package String;

// It is a fun java programming 문자열에서 'a'의 개수와 'g'개수와 총 개수를 출력하시오.
// 총개수: 28
// a 개수 : 4
// g 개수 : 2

public class test02 {
	public static void main(String[] args) {
		
		String str = new String("It is a fun java programming");
		
		int i=0;
		
		int cnt_a=0,cnt_g=0,cnt_m=0,cnt_j=0;
		
//		while(i < str.length()) {
//			if(str.charAt(i) == 'a')
//				cnt_a++;
//			else if(str.charAt(i) == 'g')
//				cnt_g++;
//			i++;
//		}
//		System.out.println("총 개수 : "+str.length());
//		System.out.println("a 개수 : "+cnt_a);
//		System.out.println("g 개수 : "+cnt_g);
	  
		while(i < str.length()) {
			if(str.charAt(i) == 'm')
				cnt_m++;
			else if(str.charAt(i) == 'j')
				cnt_j++;
			i++;
		}
		System.out.println("s 개수 : "+cnt_m);
		System.out.println("j 개수 : "+cnt_j);
		
		
		
		
	}

}
