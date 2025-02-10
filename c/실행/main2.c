#include <stdio.h>

int set_data(void);
//정수값을 반복적으로 입력받아서 합계를 반환하는 함수

double get_avg(void);
//누적값 이용 평균을 반환하는 함수


void prn_data(double avg);
//평균을 출력하는 함수

int cnt = 0;
//전체 코드에 사용가능

static int tot = 0;
//int tot = 0;
// main에서 사용할 누적값 리턴 받은 전역변수
// 해당 파일에서만 사용가능
int main(void) {

	double avg;

	tot = set_data();

	avg = get_avg();

	prn_data(avg);

	return 0;
}

void prn_data(double avg){
	
	printf(" 정수의 개수%d\n", cnt);
	printf("합 %d 평균 %lf\n", tot, avg);

}
