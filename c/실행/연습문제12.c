#include <stdio.h>
static int ksum,esum,msum;
extern int a,b,c;
static double avg;
int cnt;
extern double kavg,eavg,mavg;
void input_fn(void) {
	int sum;

	for(int i=1; i<4; i++){
		scanf("%d%d%d", &a,&b,&c);
		ksum += a;
		esum += b;
		msum += c;
		cnt++;
		sum = a+b+c;
		avg = sum/3;
		printf("국어:%d,영어:%d,수학:%d 평균:%.1lf\n",a,b,c,avg);
		
	}
	kavg = ksum/cnt;
	eavg = esum/cnt;
	mavg = msum/cnt;
}
