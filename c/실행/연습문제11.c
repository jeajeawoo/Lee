#include <stdio.h>

void input_fn(void);

double avg_fn(void);

void pnt_avg(void);

double kavg,eavg,mavg;

static double avg = 0.0;

int a,b,c;

int main(void) {


	input_fn();

	avg = avg_fn();
	
	pnt_avg();
	
	return 0;
}

void pnt_avg(){
	

	printf("국어평균:%.1lf 영어평균:%.1lf 수학평균:%.1lf 전체평균:%.1lf\n", kavg , eavg , mavg , avg);	
}
