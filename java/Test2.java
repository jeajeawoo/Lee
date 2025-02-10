

/* public class Test2 {
	public static void main(String[] args) { 
	
		int[] ary = {1,5,3,8,2};
		int max = ary[0];
		for(int aa : ary) {
			if(aa > max) {
				max=aa;
			}
		}
		System.out.println(max);
	}
} */

/* public class Test2 {
	public static void main(String[] args) { 
		int sum = 0;
		double avg = 0;
		int total = 0;
		int[][] ary1 = {
				{95, 86},
				{83,92,96},
				{78,83,93,87,88}
		};
		for(int[] cnt : ary1) {
			for(int aa : cnt) {
				sum += aa;		
			}
		total += cnt.length;		
		}
		avg = (double)sum/total;
		System.out.println(avg);
		System.out.println(sum);
	}
} */
 
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		boolean run = true;
		int stdnum = 0;
		int[] scores = null;

		while(run) {	
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scan.nextLine());

			if(selectNo == 1) {
				System.out.print("학생수> ");
				stdnum = Integer.parseInt(scan.nextLine());		
				scores = new int[stdnum];
	
			}else if(selectNo == 2) {			
				for(int i=0; i<stdnum; i++){
					System.out.print("scores["+i+"]>");
					scores[i] =Integer.parseInt(scan.nextLine());					
				}

			}else if(selectNo == 3) {	
				for(int i=0; i<stdnum; i++){
					System.out.println("scores["+i+"]:"+scores[i]);
				}
					
			}else if(selectNo == 4) {
				int max = 0;
				double avg = 0;
				int sum = 0;
				for(int mm : scores){
					if(mm > max){
						max = mm;
					}
				sum+=mm;
				}
				avg=(double)sum/stdnum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);

			}else {
				run = false;
			}
		}
	}
}

/* public class Test2 {
		public static void main(String[] args) { 
			int sum=0;
			double avg=0;
			
			
			//java hello2_1 값 값 값
			for(int i=0; i<args.length; i++) {		
				sum += Integer.parseInt(args[i]);
				
			}
			avg = (double)sum/args.length;
			System.out.println("합계" + sum);
			System.out.println("평균" + avg);
		}
	} */
