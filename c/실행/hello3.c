#include <stdio.h>
#include <string.h>

/* int main(void) {
	//변수선언
	int a = 10;
	//주소연산자 : & ==>해당 변수의 시작주소
	printf("%u\n", &a);
	printf("%p", &a);
	//16진수 대문자로만
	return 0;
} */

/* // 포인터를 이용해서 a 에 10을 할당하고 출력 
int main(void) {
	//일반변수 선언
	int a;
	int b;
	//포인터 선언(선언시에 * ==> 해당 변수를 포인터로 사용할 예정)
	int *p;
	//포인터 선언시 자료형은 참조할 변수의 자료형 동일
	
	//p 라는 변수는 주소값(시작주소)을 할당
	p= &a;

	// 10을 할당
	*p = 10;
	//포인터 연산자(간접 참조연산자)
	//==> p 변수에 할당 된 주소값의 변수에 10을 할당

	printf("%d\n" , a);
	printf("%d\n" , *p);	

	p=&b;	
	printf("%d\n , *p);
	return 0;
} */

//포인터의 크기
/* int main(void) {
	int a = 10;
	char c = 'a';
	double d = 3.14;

	int *pa = &a;
	char *pc = &c;
	double *pd = &d;

	printf("%5d%5d%5d", sizeof(*pa), sizeof(*pc), sizeof(*pd));
	printf("%3d%3d%3.1lf", *pa, *pc , *pd);

	return 0;
} */

//포인터를 사용하여 두개의 변수값을 바꾸는 함수
//a, b, tmp

//함수정의
/* void swap(int *x, int *y) {
	int tmp;

	tmp = *x;
	*x=*y;
	*y=tmp;

}

int main(void){
	int a = 10, b = 20;
	//원래 값 출력
	printf("%5d%5d\n", a,b);
	
	//함수호출
	swap(&a,&b);
	//int *x =&a;
	//int *y =&b;


	// 바꾼 후 출력
	printf("%5d%5d", a , b);

	return 0;

} */

//배열

/* int main(void) {
	int ary[5] = {10,20,30,40,50};
	//ary==시작주소	
	int *pa;

	pa = ary;

	for(int cnt=0; cnt<5; cnt++){
	
	//printf("%d\n", ary[cnt]);
	//printf("%d\n", pa[cnt]);
	printf("%d\n", *pa);
	pa++; 
	}
	
	return 0;


} */

/* void print_ary(int *pary,int anum){
	for(int cnt=0; cnt<anum; cnt++){
	
	//printf("%d\n", ary[cnt]);
	//printf("%d\n", pa[cnt]);
	printf("%d\n", *pary);
	pary++; 
	}
}

int main(void) {
	int ary[5]={10,20,30,40,50};
	int ary2[7]={10,20,30,40,50,60,70};
	
	print_ary(ary, sizeof(ary)/sizeof(ary[0]));
	print_ary(ary2, sizeof(ary2)/sizeof(ary2[0]));
	return 0;

} */
