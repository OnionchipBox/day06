package String;

public class TestClass02 {
	public static void main(String[] args) {
		
		String str = new String("test");
		String str2 = "test";
		System.out.println(str);
		System.out.println(str2);
		
		String id = "  aaa	";
		String inputId = "aaa";
		System.out.println(id.equals(inputId));
		System.out.println(id +"!!!");
		System.out.println(inputId+"!!!");
		System.out.println(id.trim()+"!!!"); //양쪽에 있는 공백을 지워주는 기능
		
		System.out.println("=============================");
		
		String addr = "05402/서울특별시 종로구/101-914";
		String[] addrs = addr.split("/"); //문자열 구분 기능
		for(String s : addrs) {
			System.out.println(s);
		}
		
		String repl = addr.replace("/", "==>"); //구분기능 모습 변경
		System.out.println(repl);
		
		
	}
}
