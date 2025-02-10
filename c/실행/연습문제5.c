#include <stdio.h>

int main(void) {
	int a;
	printf(" 숫자를 입력하세요\n");
	scanf("%d" , &a);
	for (int i=1; i<=a; i++){
		for(int j=1; j<=9; j++){
			printf("%d * %d = %d\n" , i , j , i*j);

		}
	}
	return 0;
}
