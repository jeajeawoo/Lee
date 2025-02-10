#include <stdio.h>

int main(void) {
	int a;
	int b;
	printf("숫자를 입력하세요\n");
	scanf("%d%d", &a , &b);
	printf("%d + %d = %d" , a , b , a+b );
	printf("\n");
	printf("%d - %d = %d" , a , b , a-b );
	printf("\n");
	printf("%d * %d = %lld" , a , b , (long long)a*b );
	printf("\n");
	printf("%d / %d = %.2lf" , a , b , (float)a/b );
	printf("\n");
	
	return 0;
}


