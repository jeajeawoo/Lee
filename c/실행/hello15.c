#include <stdio.h>

/* void assign(void);

int main(void){

	auto int a = 0;
	//지역변수
	assign();

	printf("main 함수 a : %d\n", a);

	return 0;
}

void assign(void) {

	int a;

	a = 10;

	printf("assign 함수 a : %d\n", a);

} */

/* int main(void){

	int a = 10, b =20;

	printf("%d%5d\n", a , b);

	{
	int temp = a;
	// 블럭 내의 지역변수
	a = b;

	b = temp;
	}
	//블럭 끝 int temp가 메모리 상에 사라짐

	printf("%d%5d\n", a , b);

	return 0;
} */

//전역변수 자동으로 0으로 초기화

/* int a;
int b;

void abc(void);

int main(void) {

	printf("%d%5d\n",a,b);	

	abc();

	printf("%d%5d\n",a,b);
	return 0;
}

void abc(void){

	a=10;
	//전역변수 활용

	int b=10;
	//지역변수
} */

/* int a;
int b;

void abc(void);

int main(void) {

	abc();
	abc();

	return 0;
}

void abc(void){

	int a=10;
	a+=1;
	printf("%d\n",a);

	static int b=20;
	//지역변수지만 정적 지역변수라 전역변수처럼 활용됨
	b += 1;
	printf("%d\n",b);	
} */


/* int abc(int a);

int main(void){

	int a = 10;

	int b = abc(a);

	printf("%d\n",b);	

	return 0;
}

int abc(int a){

	int tmp = a+10;
} */

//두개의 정수를 이용해서 합을 구한 후 합을 리턴하는 함수 
/* int abc(int a, int b);

int main(void){

	int a = 10;
	int b = 20;
	int s = abc(a,b);

	printf("%d\n",s);	

	return 0;
}

int abc(int a,int b){

	int tmp = a+b;

	return tmp;

}  */ 

/* int sum(int *pa);

int main(void) {

	int a = 10;

	sum(&a);
	//int *pa= &a

	printf("%d\n",a);

	return 0;
}

int sum(int *pa) {

	*pa = *pa+10;

} */


int *sum(int a,int b);

int main(void) {

	int *resp;

	resp = sum(10,20);
	
	printf("%d\n",*resp);

	return 0;
}

int *sum(int a, int b) {

	static int c;
	c = a+b;
	
	return &c;
} 




