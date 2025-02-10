#include <stdio.h>

int main(void) {

	char na[10];
	int rnr;
	int dud;
	int tn;
	
	printf("이름과 국어, 영어, 수학점수를 입력하세요\n");
	scanf("%s%d%d%d", na , &rnr, &dud, &tn);
	printf("이름은 %s 점수는 국어%d 영어%d 수학%d\n" , na , rnr, dud, tn);
	printf("합계점수는 %d 평균은 %d" , rnr+dud+tn , (rnr+dud+tn)/3);
	if((rnr+dud+tn)/3 >= 90) {
		printf(" A학점");
	}else if((rnr+dud+tn)/3 >= 80){
		printf(" b학점");
	}else if((rnr+dud+tn)/3 >=70){
		printf(" c학점");
	}else {
		printf(" F학점");
	}

	return 0;
}

