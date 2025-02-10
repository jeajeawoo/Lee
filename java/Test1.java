
import java.util.Scanner;


class Test1{
	public static void main(String[] args){
	
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자 입력");
		int aa = scn.nextInt();
		for(int i=1; i<=aa; i++){
			System.out.println("----"+i+"단----");
			for(int b=1; b<=9; b++){
				System.out.println(i + " X " + b + " = " + i*b);
			}
		}		
		
	}
} 



/* class Test1{
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
	
		System.out.println("이름");
		String name = scn.nextLine();

		System.out.println("국어 점수");
		int aa = scn.nextInt();

		System.out.println("영어 점수");
		int bb = scn.nextInt();
		
		System.out.println("수학 점수");
		int cc = scn.nextInt();
		
		int dd = aa+bb+cc;
		double ee = (double)(aa+bb+cc)/3;
		System.out.println(name + "의 성적 합계는 " + dd + " 이고 평균은 " + ee + "입나디" );

	}
} */




/* class Test1{
	public static void main(String[] args){
		
		int sum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자");
		int aa = scn.nextInt();
		for(int i=1; i<=aa; i++){
			if(i %3 == 0){
				sum += i;
				
			}
		}
		System.out.println(sum);
	}
} */



