package String;

import java.util.Scanner;

//배열 5개를 만들고 로그인 프로그램을 만드시오
//String[] id = new String[5];
//String[] pwd = new String[5];
//
//1.로그인시 
//- 아이디가 없으면 존재하지 않는 아이디 입니다
//- 비밀번호가 틀리면 비밀번호가 틀렸습니다
//- 아이디와 비밀번호가 일치하면 인증통과
//2.회원가입시
//- 동일한 아이디가 있으면 동일한 아이디가 존재합니다
//- 5개의 배열 모두 사용됐으면 더 이상 저장할 공간이 없습니다
//- 회원가입 성공시 가입을 축하드립니다
//3.모든 회원보기

public class test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] id = new String[5];
		String[] pwd = new String[5];
		String logId , logPwd , creId, crePwd, str;
		boolean login = true;
		int age, mem = 0;
		
		
		
		while(login) {
			System.out.println("=======================================");
			System.out.println("1.로그인 2.회원가입 3.모든 회원보기 4.프로그램 종료");
			System.out.println("=======================================");
			System.out.print("입력 : ");
			age = input.nextInt();
			switch(age) {
				case(1):
					System.out.print("ID를 입력하세요 : ");
					logId = input.next();
					System.out.print("비밀번호를 입력하세요 : ");
					logPwd = input.next();
					for(mem=0; mem < id.length ; mem++) {
						if(logId.equals(id[mem])) {
							if(logPwd.equals(pwd[mem])) 
								System.out.println("인증통과");
							else 
								System.out.println("비밀번호 틀렸습니다");
							
							break;
							}
						}
					if(mem == id.length) 
						System.out.println("존재하지 않는 아이디 입니다");
					
//					if(id.equals(logId) == true && pwd.equals(logPwd) == true)						
//						System.out.println("인증통과");
//					else if(id.equals(logId) == false) {
//						System.out.println("존재하지 않는 아이디 입니다");
//							if(pwd.equals(logPwd) == false)
//								System.out.println("비밀번호가 틀렸습니다");}
					break;
					
				case(2):
					System.out.print("가입할 ID 만들기 : ");
					creId = input.next();
					id[mem] = creId;
					System.out.print("가입할 PWD 입력 : ");
					crePwd = input.next();
					pwd[mem] = crePwd;
					System.out.println("가입을 축하드립니다");
						if(mem > 5)
							System.out.println("더 이상 저장할 공간이 없습니다");
					break;
					
				case(3):
					System.out.println("가입된 회원목록 : "+id[mem]);
					break;
				
				case(4):
					System.out.println("프로그램을 종료합니다");
					return;
					
				
				
					
			
			
			
			
			
			}// switch
		}// while
		
		
	}
}
