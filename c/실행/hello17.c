#include <stdio.h>
#include "abc.h" // <> : 설치경로의 include 폴더 "" : 현재 폴더 

#define SUM(a,b) ((a)+(b))
#define MUL(a,b) ((a)*(b))
//되도록이면 연산식에서는 ()를 다 해주는게 좋다


/* int main(void){

	Student a = {315, "홍길동"};
	printf("학번 : %d, 이름 : %s\n", a.num, a.name);

	return 0;

} */


/* int main(void) {

	printf("%d\n",x+y);

	aaa(3);	

	return 0;
}  */

/* int main(void) {

	int a=10, b=20;
	int x=30, y=40;
	int res;

	printf("%d", SUM(a,b));
	L_C;
	printf("%d", SUM(x,y));
	L_C;
	res = 30/MUL(2,2+3);
	//  30/(2)*(2+3)
	//  30/2*2+3
	printf("%d",res);
	L_C;

	return 0;
} */


void input_data(int *,int *);
double average(int x,int y);

int main(void) {

	int a,b;
	double avg;

	input_data(&a,&b);
	avg = average(a,b);
	printf("%.1lf", avg);
	L_C;	

	return 0;

}




