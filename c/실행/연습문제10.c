#include <stdio.h>

#define PRINT_D printf("정수 2개를 입력(종료 Ctrl+Z)")
#define SUM(a,b) ((a)+(b))
#define MUL(a,b) ((long long)(a)*(b))
#define SKSNT(a,b) ((double)(a)/(b))
#define QORL(a,b) ((a)-(b))
#define L_C  printf("\n")




int main(void){

	int a,b;
	
	while(1){
	PRINT_D;
	scanf("%d%d",&a,&b);
	printf("%d+%d=%d" ,a,b, SUM(a,b));
	L_C;
	printf("%d-%d=%d" ,a,b, QORL(a,b));
	L_C;
	printf("%d*%d=%lld" ,a,b, MUL(a,b));
	L_C;
	printf("%d/%d=%.1lf" ,a,b, SKSNT(a,b));
	L_C;
	}

	return 0;
}
