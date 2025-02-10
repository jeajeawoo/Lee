#include <stdio.h>

extern int cnt;
// 메인에 선언된 전역 변수

extern int tot;
// 셋2에 선언된 전역 변수


double get_avg(void){

		return tot/(double)cnt;

}
