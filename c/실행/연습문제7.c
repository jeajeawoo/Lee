#include <stdio.h>
#include <string.h>

/*int main(void) {
	char *pa = "apple";

	for(int i=0; i<strlen(pa); i++){
		printf("%s\n",pa+i);		
	
	}
	
	return 0;
} */

int main(void) {

	char *pa = "apple";
	// apple의 시작 주소를 할당

	while(*pa != '\0') {
		printf("%s\n", pa);
		pa++;
	}

	return 0;
} 



/* int main(void) {

	char str1[50];
	char str2[50];
	char *ps = "***************";

	printf("단어입력");
	scanf("%s" ,str1);
	strcpy(str2, str1);
	printf("입력한단어%s\n", str1);
	strncpy(str2, str1 , 5);
	strcat(str2, ps);
	strncpy(str1, str2 , strlen(str1));
	printf("생략한단어%s\n", str1);
	return 0;
} */


/* int main(void) {

	char a[5];
	int b;
	int c;
	int d;
	int res;
	int sum=0;	
	int sum1=0;
	int cnt=0;

	printf("이름과 성적을 입력하세요\n");
	res = scanf("%s%d%d%d",&a ,&b , &c, &d);
	while(res != -1) {
		sum=b+c+d;
		printf("%s : 국어 %d 영어 %d 수학 %d 합계 %d\n", a,b,c,d,sum);
		printf("이름과 성적을 입력하세요\n");
		res = scanf("%s%d%d%d",&a ,&b , &c, &d);				
		sum1 += sum;
		cnt++;

	}
	printf("전체 합계는 %d 이고 전체 평균은 %.1lf 입니다\n", sum1 ,(float)sum1/cnt/3);

	return 0;
 }  */

