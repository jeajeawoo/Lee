

/* class A{

	public static void main(String[] args){
		//변수 사용
		//자료형 변수명 = 값;
		int a = 100;
		char c = 'A';
		//문자 1개
		long aa = 1000000000000L;
		//연산할때 int로 간주해서 구분하기위해서 뒤에 L을 적어줘야함
		float bbb = 3.14F;
		//double로 간주해서 F
		
		//문자열
		String str = "hello";

		System.out.println("hello java");
		System.out.println(a);
		//첫글짜가 대문자면 클래스 String=문자열 클래스 System=운영체제
		//out. 필드 , 표준출력
		//( ) < 메소드
		//println, 자동줄바꿈 출력

	}

}  */

/* class A{
//강제형변환(명시적 변환)
//(작은것 자료형)큰 -->작은
	public static void main(String[] args){
		int a = 100;
		byte b = (byte)a;
		//byte는 -127~127 범위를 넘어가면 오류는 안나지만 이상한 값이 나옴
		//char c = a;
		//양수만 가능
		System.out.println(a);
	}
} */

/* class A{
//문자열 --> 기본 자료형
	public static void main(String[] args){
		String a = 100;
		int b = Integer.parseInt(a);
		//int만 Integer 다른건 앞에만 대문자
		System.out.println(b);
	}
} */

//제어문 (if,SWitch,for,while)
/* class A{
	public static void main(String[] args){
		//1부터 100까지 짝수 합계
		int sum = 0;
		for(int i=1; i<=100; i++){
			if(i %2 == 0){
				sum += i;
			}
		}
		System.out.println(b);
	}

} */


/* class A{
	public static void main(String[] args){
		
		for(int i=1; i<=100; i++){
			if(i == 10)break;
		
			System.out.println(i);
		}	
	}

} */


/* class A{
	public static void main(String[] args){
		
		for(int i=1; i<=15; i++){
			if(i == 10)continue;
		
			System.out.println(i);
		}
	}

} */


/* class A{
	public static void main(String[] args){
		
		for(int i=1; i<=15; i++){
			if(i != 10){
				System.out.println(i);
			}
		}
	}

} */


import java.util.Scanner;

/* class A{
	public static void main(String[] args){
	
		Scanner scn = new Scanner(System.in);
		//System.in = 표준입력
		System.out.println("입력하세요");
		String str = scn.nextLine();
		//엔터키 칠때까지 입력받음
		int aa = Integer.parseInt(str);
		System.out.println(aa);
		
	}
} */

class A{
	public static void main(String[] args){
		
		int dd= 64;
		double aa = (double)dd/5; 
		System.out.println(aa);
		
	}
} 
