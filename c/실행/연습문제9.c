#include <stdio.h>
#include <string.h>

/* int a,b;

int input_data(int *a, int *b);
int swap_data(void);
int print_data(int a, int b);

int main(void){

     input_data(&a, &b); // 2개의 정수를 입력받는 함수

     swap_data(); // 2개의 변수 값을 바꾸는 함수

     print_data(a, b); // 2개의 변수를 출력하는 함수

     return 0;

}

int input_data(int *a, int *b){

	scanf("%d%d", a, b);
	printf("두 정수 입력 : %d%4d\n", *a, *b);

}

int swap_data(void) {

	int s = a;	
	a = b;
	b = s;
	
}

int print_data(int a, int b) {

	printf("두 정수 출력 : %d%4d\n", a , b);

} */ 


 

char *abc(char *strp);

int main(void){
	char *str = "apple";
	
	printf("바꾸기전 %s\n" , str);

	char *rstr = abc(str);

	printf("바꾼 후 %s\n" , rstr);

	return 0;
}

char *abc(char *strp){

//	static char aa[10];
//	aa[strlen(strp)] = '\0';
//	int j = strlen(strp)-1;
	
/*	for(int i=0; i<5; i++){
	aa[j]=*strp;
	printf("%c\n", aa[j]); 
	*strp++;
	j--;
	} */

/*	while(*strp != '\0') {
		aa[j]=*strp;
		printf("%c\n", aa[j]);
		strp++;
		j--;
	}
	return aa; */
	int input_cnt;
	input_cnt = strlen(str);
	for (i = input_cnt; i >= 0; i--) {
		printf("%c", input[i]);

}  




