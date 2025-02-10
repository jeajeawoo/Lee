#include <stdio.h>

/*//1. 함수 정의

void myFunction(void) {

printf("hello");

}

int main(void) {

//2. 함수호출
myFunction();

return 0;
//프로그램 종료

} */

/* //1. 함수선언 : 컴파일러에 필요한 준비를 지시
// 리턴자료형 함수명(매개변수자료형);

void myFunction(void);


int main(void) {

//2. 함수호출
myFunction();

return 0;
//프로그램 종료

}


//3. 함수 정의

void myFunction(void) {

printf("hello");

} */

// 정수 2개의 합을 출력하는 함수

/* void mySum(int a, int b);


int main(void) {

//2. 함수호출
mySum(10, 5);

return 0;
//프로그램 종료

}


//3. 함수 정의

void mySum(int a, int b) {

printf("두수의 합계는 %d", a+b);

} */

// 정수 2개의 합을 출력하는 함수

/* void mySum(int a, int b);


int main(void) {

//2. 함수호출
mySum(10, 'A');
// 문자 A를 아스키코드값으로 변환해서 연산

printf("%d", 'a'-'A'); // 32차이

return 0;
//프로그램 종료

} 


//3. 함수 정의

 void mySum(int a, int b) {

printf("두수의 합계는 %d", a+b);

}  */

/* // 정수 2개의 합을 리턴하는 함수

int mySum(int a, int b);


int main(void) {

int res;
//2. 함수호출
res = mySum(10, 5);

printf("%d", res);

return 0;
//프로그램 종료

}


//3. 함수 정의

int mySum(int a, int b) {

return a+b;

} */

// 배열 선언 :  자료형 배열명[요소갯수] = {값1, 값2,,,,,,,,};


/* int main(void) {

int ary[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90 };

printf("%d", ary[0]);


return 0;
//프로그램 종료

} */

// 배열 선언과 초기화 :  자료형 배열명[요소갯수] = {값1, 값2,,,,,,,,};
// 배열요소가 갯수보다 적을경우 각 자료형에 맞게 자동 0 셋팅


/* int main(void) {

int ary[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90 };

printf("%d", ary[9]);


return 0;
//프로그램 종료

}  */

// 배열 선언과 초기화 :  자료형 배열명[요소갯수] = {값1, 값2,,,,,,,,};
// 배열요소가 갯수보다 적을경우 각 자료형에 맞게 자동 0 셋팅


/* int main(void) {

int ary[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90 };

double ary2[5] = { 10.1, 20.2 };

printf("%d", ary[9]);

printf("\n");

printf("%.1lf", ary2[4]);

return 0;
//프로그램 종료

} */

// 선언만 하고 초기화 하지 않을경우
// 할당 시 남은 값은 엉뚱한 값으로 할당됨


/* int main(void) {

int ary[10];

ary[0] = 10;
ary[1] = 20;
ary[2] = 30;


printf("%d", ary[3]);
printf("%d", ary[4]);
printf("%d", ary[5]);
printf("%d", ary[6]);
printf("%d", ary[7]);
printf("%d", ary[8]);
printf("%d", ary[9]);
printf("\n");


return 0;
//프로그램 종료

} */


/* int main(void) {

int ary[5] = {10, 20, 30, 40, 50};

//sizeof연산자 : 자료형의 byte 크기 반환
//sizeof(배열전체)/sizeof(배열요소한개)
int anum = sizeof(ary)/sizeof(ary[0]);

for(int cnt=0; cnt<anum; cnt++) {

printf("%d", ary[cnt]);
printf("\n");
}

printf("\n");


return 0;
//프로그램 종료

} */


/* int main(void) {

int ary[5];


int anum = sizeof(ary)/sizeof(ary[0]);

for(int cnt=0; cnt<anum; cnt++) {

scanf("%d", &ary[cnt]);
printf("%d", ary[cnt]);
printf("\n");
}

printf("\n");


return 0;
//프로그램 종료

} */

// char 배열 : 초기화 시 남은 공간은 \0(널)값으로 채움

/* int main(void) {

char name[20] = "apple";

printf("%s", name);
printf("\n");

printf("%c", name[4]);
printf("\n");

printf("%c", name[5]);
printf("\n");

return 0;
//프로그램 종료

} */

// 널은 아스키 코드값드로 0 !=백공백

/* int main(void) {

char name[20] = "apple ";

printf("%s", name);
printf("\n");

printf("%c", name[4]);
printf("\n");

printf("%d", name[5]);
printf("\n");

return 0;
//프로그램 종료

} */

// 초기화 하지 않고 할당 할 경우 \0를 수동으로 할당


/* int main(void) {

char name[20];

name[0] = 'a';
name[1] = 'p';
name[2] = '\0';

printf("%s", name);
printf("\n");

return 0;
//프로그램 종료

} */

/* #include <string.h>

int main(void) {

char name[20] = "apple";
char str[20] = "banana";

printf("%s", name);
printf("\n");

//strcpy(원본배열, 복사할 값);
strcpy(name, str);

printf("%s", name);
printf("\n");

return 0;
//프로그램 종료

} */

/* #include <string.h>

int main(void) {

char name[20];


printf("문자열을 입력하세요");
printf("\n");

scanf("%s", name);
// 공백 앞까지만 입력

gets(name);
// 문자열 입력 전용함수 공백 포함

printf("%s", name);
printf("\n");

return 0;
//프로그램 종료

} */

/* #include <string.h>

int main(void) {

char name[20];

printf("문자열을 입력하세요");
printf("\n");

//scanf("%s", name);
// 공백 앞까지만 입력

gets(name);
// 문자열 입력 전용함수 공백 포함

puts(name);
// 문자열 전용 출력함수
// 자동 줄바꿈

return 0;
//프로그램 종료

} */

/* int main(void) {

	int ary[5];
	int i;
	int total= 0;
	double avg;
	int count;
	count = sizeof(ary) / sizeof(ary[0]);

	for (i=0; i<count; i++){
		scanf("%d", &ary[i]);
	}
	for (i=0; i<count; i++){
		total+=ary[i];
	}
	avg=total/(double)count;
	for (i=0; i<count; i++){
		printf("%d", ary[i]);
	}
	printf("\n");
	printf("%.1lf\n", avg);
	printf("%d\n", total);
} */

/* int main(void) {
	int i;
	int a;
	scanf("%d" , &a);
	for (i=1; i<=a; i++){
		if(i%3==0){
			printf("%3d", i);
		}
	}
	

} */ 



