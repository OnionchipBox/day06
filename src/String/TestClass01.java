package String;

public class TestClass01 {
	public static void main(String[] args) {
		String str = "Java is 그리고 pro 할만하다";
		
		System.out.println("기본 str : "+str);
		String upperStr = str.toUpperCase();
		
		System.out.println("대문자 : "+str.toUpperCase()); //대문자
		System.out.println("str 확인 : "+str);
		
		String lowerStr = str.toLowerCase();
		System.out.println("소문자 : "+lowerStr);
		
		System.out.println("============================");
		
		str = "abcd";
		System.out.println("기본 str : "+str);
		System.out.println(str.charAt(1)); //b
		
		char ch = str.charAt(1);
		System.out.println("ch : "+ch);
		System.out.println(ch == 'a');
		System.out.println(ch == 'b');
		
		System.out.println("ch-32 : "+(ch-32));
		System.out.println("ch-32 : "+(char)(ch-32));
		
		System.out.println("============================");
		char ch2 = str.charAt(0);
		String ss = (char)(ch2-32)+"";
		System.out.println(ss);
		
		ch2 = str.charAt(1);
		ss += (char)(ch2-32)+"";
		System.out.println(ss);
		
		ch2 = ' ';
		System.out.println(' ' == ch2);
		
		
	}

}
