#include <stdio.h>

int main(void) {
	int b = 0;
	for(int a=1; a<=100; a++){
		if (a % 3 == 0){
			b+=a;
			printf("%d:%d\n" , a , b);
		}	
	} printf("%d\n" , b );
	
	return 0;

} 


