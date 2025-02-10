#include <wiringPi.h>
#include <stdio.h>
#include <stdlib.h>

int ledControl(int gpio) {

	int res;

	pinMode(gpio, OUTPUT);

	while(res != -1){
		digitalWrite(gpio, HIGH);
		getchar();
		digitalWrite(gpio, LOW);
		getchar();
	}

	
	return 0;
}

int main(int argc, char **argv){

	int gno;

	if(argc < 2) {
		printf("Usage : %s GPIO_NO\n", argv[0]);
		return -1;
	}
	gno = atoi(argv[1]);
	wiringPiSetup();
	ledControl(gno);
	
	return 0;
}


