#include <stdio.h>

void input_data(int *pa, int *pb) {

	printf("정수 2개 입력\n");
	scanf("%d%d", pa,pb);

}

double average(int x, int y){

	int tot;
	double avg;

	tot = x+y;
	avg= tot/2.0;
	
	return avg;

}
