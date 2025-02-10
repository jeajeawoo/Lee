#include <stdio.h>

extern int cnt;
//메인에 선언된 전역 변수 사용하기 위해

int tot = 0;
//메인과는 다른 전역 변수, 공유 가능
//extern으로 하면 링크할때 오류발생


int set_data(void) {
//정수값을 반복적으로 입력받아서 합계를 반환하는 함수

	int res;
	while(1) {

		printf("정수 입력\n");
		scanf("%d", &res);
		if(res < 0) break;

		cnt++;

		tot += res;
	}

	return tot;

}
