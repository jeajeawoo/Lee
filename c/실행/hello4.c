#include <stdio.h>
#include <string.h>

/* int main(void) {
	printf("%d", 'a'-'A');
	//소문자와 대문자 차이 32
	return 0;
} */

// scanf(); 버퍼를 이용한 입력함수
// 엔터키(\n)하면 입력이 종료
// 버퍼 : 임시저장공간

/* int main(void) {
	char ch1, ch2;
	printf("문자 2개를 입력하세요\n");
	scanf("%c %c", &ch1, &ch2);
	// 변환문자를 공백으로 구분하면 공백제외하고 입력받음	
	printf("[%c%c]", ch1, ch2);
	
	return 0;
} */

/* int main(void){
	char ch1;
	int i;

	// 문자를 하나씩 입력받아서 출력
	// 3번 반복
	for(i=0; i<5; i++){
		scanf("%c", &ch1);
		//apple 입력하면 버퍼에 a p p l e \n 저장
		printf("%c", ch1);
		//app 출력 l e \n 남음
	}
	scanf("%c", &ch1);
	//버퍼에 내용이 남아있으면 키보드로 부터 입력을 받지않고 
	//버퍼에 있는 문자를 메모리에 저장한다
	printf("%c", ch1);

	return 0;
}  */

/* int main(void){
	int hakbun;
	char ch;

	scanf("%d", &hakbun);
	//숫자형 일 경우는 구분문자 앞까지 읽어옴 (\n,\t,\0 ...)	
	
	getchar();
	//문자 하나를 입력받는 함수
	//임시방편으로 남은 구분문자를 입력받고 버림	
	//리턴 : 문자의 아스키 코드값(int) 정상적인 값이 아니면 -1을 리턴함

	scanf("%c", &ch);
	//문자형 일 경우 구분문자도 읽어옴

	printf("[%d%c]", hakbun , ch);

	return 0;
} */

/* int main(void){
	int res;
	int hakbun;
	res = scanf("%d", &hakbun);
	//입력받은 자료의 갯수
	//ctrl+z(윈도우) ctrl+d(리눅스)
	//EOF(end of file : -1)	

	printf("%5d",res);
	return 0;
} */

//문자열 상수 = 문자열의 시작주소


/* int main(void){

	printf("%s\n", "apple");

	for(int i=0; i<5; i++){

		printf("%c", *("apple"+i));

	}
	printf("%u\n", "apple");
	// %p : 시작주소값 16진수
	// %u : 시작주소값 양수

	printf("%c\n", *("apple"));
	//a 
	printf("%s\n", *("apple"+1));
	//p


	return 0;
} */

/* int main(void){
	char *str = "apple";
	// int *p = &a;

	printf("%s\n", str);

	str = "banana";

	printf("%s\n", str);

	return 0;
}  */

//문자열 입력 gets() ==> 약점은 배열의 크기를 벗어남

/* int main(void) {

	char str[5];

	printf("문자열 입력");
	
	gets(str);	
		
	scanf("%s\n", str);

	return 0;
} */

//fgets(배열명, 배열크기, stdin(키보드입력))
//버퍼에서 문자열을 메모리로 저장할 때 \n\0 붙여줌

/* int main(void) {

	char str[10];

	printf("문자열 입력\n");

	fgets(str, sizeof(str), stdin);

	printf("%s", str);
	//apple\n\0
	//\n를 활용하지 않을 경우 strlen(str)-1 자리에 \0를 재할당
	
	printf("%d\n", str[5]);
	//아스키코드값 10
	printf("%d\n", str[6]);
	// 0
	printf("%d", strlen(str));
	//apple\n

	return 0;
}  */

//scanf의 반환값 활용
//문자열을 반복적으로 입력
//종료조건 : ctrl+z or d

/* int main(void) {

	char name[10];
	int res;

	printf("문자열을 입력하세요\n");

	res = scanf("%s", name);

	while(res != -1) {

		printf("%s", name);

		printf("문자열을 입력하세요\n");

		res = scanf("%s", name);

	}

	return 0;

} */

//strcpy(복사문자열, 원본문자열);

/* int main(void){

	char str1[20] = "apple";
	char str2[20] = "banana";

	char *sp1 = "mango";
	char *sp2 = str2;

	printf("%s\n",str1);
	
	strcpy(str1, str2);

	printf("%s\n", str1);

	strcpy(str2,sp1);

	printf("%s\n", str2);

	return 0;
} */

//strncpy(복사받는문자열, "복사할문자열", 복사할 수)

/* int main(void) {

	char str[20] = "apple";

	strncpy(str, "banana", 3);

	printf("%s\n", str);
	//banle

	return 0;
} */

//strcat (받을문자열, "붙일문자열")
//strncat (받을문자열, "붙일문자열", 붙일숫자)

/* int main(void) {

	char str[20] = "apple";

	strcat(str, "tree");
	printf("%s\n", str);
	
	strncat(str, str, 4);
	printf("%s\n", str);

	return 0;
} */






