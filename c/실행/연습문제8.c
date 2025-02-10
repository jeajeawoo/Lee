#include <stdio.h>
#include <string.h>

/* int main(void) {

	char a[10];
	int b,c,d;
	int res;
	int sum=0;	
	int cnt=0;
	FILE *fp;

	fp = fopen("aaa.txt","w");
	if(fp == NULL){
		printf(" 출력파일이 열리지 않습니다.\n");
		return 1;
	}

	fprintf(fp, "이름  국어  영어  수학  합계   평균\n");
	printf("이름과 성적을 입력하세요\n");
	res = scanf("%s%d%d%d",&a ,&b , &c, &d);

	while(res != -1) {
		sum=b+c+d;
		printf("%s : 국어 %d 영어 %d 수학 %d 합계 %d 평균 %.1lf\n", a,b,c,d,sum,(float)sum/3);
		printf("이름과 성적을 입력하세요\n");
		res = scanf("%s%d%d%d",&a ,&b , &c, &d);
		cnt++;
		fprintf(fp, "%s%6d%5d%5d%5d%7.1lf\n", a ,b,c,d, sum , (float)sum/3);
	}
	fclose(fp);

	return 0;
 }  */

 int main(void) {
	FILE *ifp , *ofp;
	char name[20];
	int res;
	int kor, eng, math;
	int total;
	double avg;

	ifp = fopen("abc.txt", "r");
	if(ifp == NULL)
	{	// 오류 발생시
		printf(" 입력파일이 열리지 않습니다.\n");
		return 1;
	}
	ofp = fopen("bbb.txt", "w");
	if(ofp == NULL){
		printf(" 출력파일이 열리지 않습니다.\n");
		return 1;
	}
	fprintf(ofp, " 이름  국어  영어  수학  합계  평균\n");
	while(1){
		res = fscanf(ifp, "%s%d%d%d", name , &kor, &eng, &math);
		if (res == EOF){
			break;
		}
		total = kor+eng+math;
		avg = total/3;
		fprintf(ofp, "%5s%5d%5d%5d%5d%7.1lf\n", name, kor,eng,math , total , avg);
	}
	fclose(ifp);
	fclose(ofp);
	return 0;
} 


