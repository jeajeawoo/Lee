#include <stdio.h>
#include <string.h>

//파일제어
//FIEL(파일구조체)
//fopen("파일명","모드")
//fclose()
//fgetc(파일구조체 변수)

/* int main(void) {
	FILE *fp;
	int ch;
	fp = fopen("../lee17.txt", "r");
	//파일에 대한 정보(날짜,위치경로 ...)를 가져와서 구조체를 생성 
	if(fp == NULL)
	{	// 오류 발생시
		printf(" 파일이 열리지 않습니다.\n");
		return 1;
	}
	printf(" 파일이 열렸습니다.\n");
	while(1){
		ch = fgetc(fp);
		if(ch == EOF) {
		// 더 이상 읽을 데이터가 없을때
			break;
			//강제로 벗어남. 반복문			
		}
		//putchar(ch);
		printf("%c", ch);
	}
	fclose(fp);
	// 메모리 부하 방지로 파일닫기
	return 0;
} */

//fputc(파일에 내용쓰기)
//배열의 내용을 파일에 쓰기

/* int main(void) {
	FILE *fp;
	char str[10]="apple";
	int i = 0;

	fp = fopen("aaa.txt", "w");
	//a 모드 : 내용추가 , w 모드 : 덮어쓰기 
	if(fp == NULL)
	{	// 오류 발생시
		printf(" 파일이 열리지 않습니다.\n");
		return 1;
	}
	printf(" 파일이 열렸습니다.\n");
	while(str[i] != '\0'){
		fputc(str[i], fp);
		i++;		
	}
	fputc('\n', fp);
	fclose(fp);
	// 메모리 부하 방지로 파일닫기
	return 0;
} */

//한줄씩 읽어서 배열에 저장
/* int main(void){

	FILE *ifp;
	char str[80];
	char *res;

	ifp = fopen("../lee17.txt", "r");
	if(ifp == NULL)
	{	// 오류 발생시
		printf(" 파일이 열리지 않습니다.\n");
		return 1;
	}
	while(1){
		res = fgets(str, sizeof(str), ifp);
		if(res == NULL) break;
		printf(str);
	}
	fclose(ifp);
	//fclose();
	return 0;
} */

/* int main(void) {
	FILE *ifp , *ofp;
	char name[20];
	int res;
	int kor, eng, math;
	int total;
	double avg;

	ifp = fopen("aaa.txt", "r");
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
	while(1){
		res = fscanf(ifp, "%s%d%d%d", name , &kor, &eng, &math);
		if (res == EOF){
			break;
		}
		total = kor+eng+math;
		avg = total/3;
		fprintf(ofp, "%s%5d%7.1lf\n", name , total , avg);
	}
	fclose(ifp);
	fclose(ofp);
	return 0;
} */
