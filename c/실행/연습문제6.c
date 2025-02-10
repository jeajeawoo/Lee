#include <stdio.h>
#include <string.h>


//1번문제


 /*void gkq(int x, int y){
	printf("합은 %d",x+y);	

}
void vudrbs(int x, int y){
	printf("평균은 %d" , (x+y)/2);	
	
}
int main(void){
	int a;
	int b;
	
	printf("정수를 입력하세요\n");

	int *pa;
	int *pb;

	pa=&a;
	pb=&b;	

	scanf("%d%d", pa, pb);
	gkq(*pa,*pb);
	vudrbs(*pa, *pb);
	return 0;
} */


//2번문제




 void print_ary(int *pary,int anum){
	int b = 0;	
	for(int cnt=0; cnt<anum; cnt++){
	
	//printf("%d\n", ary[cnt]);
	//printf("%d\n", pa[cnt]);
	printf("%d\n", *pary);
	b+=*pary;
	pary++;
	}
	printf("합은:%d 평균은:%.1lf\n", b , (double)b/anum);
}

int main(void) {
	int ary[5]={10,20,30,40,50};
	int ary2[7]={10,20,30,40,50,60,70};
	
	print_ary(ary, sizeof(ary)/sizeof(ary[0]));
	print_ary(ary2, sizeof(ary2)/sizeof(ary2[0]));
	return 0;

}  


//3번문제

/*void last_month(int *y , int anum) {
	for (int i=0; i<anum; i++){		
		printf("%d월의 마지막 날은 %d입니다\n" , i+1 , *y);
		y++;	
	}

}
int main(void){
	int month[12] = {31, 28, 31, 30, 31, 30, 31,31, 30, 31, 30, 31};
	last_month(month , sizeof(month)/sizeof(month[0]));
	return 0;
} */

