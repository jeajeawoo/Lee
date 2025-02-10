#include <stdio.h>

/* int main(void) {
	
	printf("%5d", 100);
	printf("\n");
	printf("%.2lf", 3.14);
	
	return 0;
	//종료 
} */

/*int main(void) {
	
	//변수선언
	int a = 100;
	float b = 3.14;
	char c = 'A';
	char d = 65;
	// " " = 문자열이므로 오류발생
	printf("%d", a);
	printf("\n");	
	printf("%.2lf", b);
	printf("\n");
	printf("%c" , c);
	
	
	return 0;
	//종료
} */

/* int main(void) {
	
	//변수선언
	int a = 100;
	float b = 3.14;
	char c = 'A';
	char d = 65;
	// " " = 문자열이므로 오류발생
	printf("%d", c);  // 값은 문자인데 정수변환 출력 아스키 코드값 출력
	printf("\n");
	printf("%c", d);
	printf("\n");
	
	return 0;
	//종료
} */

/* int main(void) {
	
	//변수선언
	int a = 100;
	float b = 3.14;
	char c = 'A';
	char d = 65;
	//문자열
	char str[10] = "apple";
	//배열에서 배열명은 배열의 시작주소
	printf("%s", str);
	printf("\n");
	printf("%x", str);
	//주소값은 16 진수로
	return 0;
	//종료
} */

/* int main(void) {
	
	//변수선언
	int a = 1000000000;
	int b = 1000000000;
	long long c =(long long)a*b;
	//강제 형 변환
	printf("%lld", c);
	//범위를 벗어날 경우 오류 출력
	printf("\n");
	return 0;
	//종료
} */
/* int main(void) {
	
	//변수선언
	int a = 10;
	int b = 3;
	float c =(float)a/b;
	//정수/정수의 결과는 정수 
	printf("%.2lf", c);
	//범위를 벗어날 경우 오류 출력
	printf("\n");
	return 0;
	//종료
} */

/* int main(void) {
	
	//변수선언
	int a;
	printf("정수를 입력하세요\n");
	scanf("%d", &a);
	printf("%d\n", a);
	return 0;
	//종료
} */

/* int main(void) {
	
	//변수선언
	char a;
	printf("문자를 입력하세요\n");
	scanf("%c", &a);
	printf("%c\n", a);
	return 0;
	//종료
} */

/* int main(void) {
	
	char str[10];
	printf("문자열를 입력하세요\n");
	scanf("%s", str);
	printf("%s\n", str);
	return 0;
	//종료
} */

/* int main(void) {

	// 문자열 입력
	char name[20];
	int stdnum;
	printf("이름을 입력하세요\n");
	scanf("%s", name);
	printf("학번을 입력하세요\n");
	scanf("%d", &stdnum);
	// 학번 1234는 이름이 홍길동입니다
	printf("학번 %d 는 이름이 %s 입니다.", stdnum, name);
	printf("\n");

	return 0;
	//프로그램 종료
} */

/* int main(void) {

	// 문자열 입력
	char name[20];
	int stdnum;
	printf("이름과 학번을 입력하세요\n");
	scanf("%s%d", name, &stdnum);
	// 값을 공백으로 구분
	// 홍길동 12345
	// 학번 1234는 이름이 홍길동입니다
	printf("학번 %d 는 이름이 %s 입니다.", stdnum, name);
	printf("\n");
	return 0;
	//프로그램 종료

} */

/* int main(void) {

	int a = 100;
	int b = 50;
	printf("%d", a>b);
	//1(true), 0 반환
	printf("\n");

	return 0;

} */

/* int main(void) {
	int a = 10;
	if(a % 2 ==0){
		printf("짝수");
	}else{
		printf("홀수");
	}
	return 0;
} */

/* int main(void) {
	for (int j =1; j <= 9; j++){
		for (int i=1; i<=9; i++){
			printf("%d * %d = %d\n", i , j, i*j);
		}
	}
	return 0;
} */
