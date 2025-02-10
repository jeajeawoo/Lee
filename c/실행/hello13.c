#include <wiringPi.h>
#include <softTone.h>

#define SPKR  29
#define TOTAL 32

int notes[] = {
	659.26, 587.33, 523.25, 587.33, 659.26, 659.26 , 659.26, \
	587.33, 587.33, 587.33, 659.26, 659.26, 659.26, 659.26, \
	659.26, 587.33, 659.26, 587.33, 659.26, 659.26, 659.26, \
	587.33, 587.33, 659.26, 586.33, 0, 523.25, 0
	};
	
int musicPlay() {

	int i;

	softToneCreate(SPKR);

	for (i = 0; i<TOTAL; i++){
		softToneWrite(SPKR, notes[i]);
		delay(350);	
	}

	return 0;
}

int main() {

	wiringPiSetup();
	musicPlay();

	return 0;
}
