#include <wiringPi.h>
#include <stdio.h>
#include <softTone.h>

#define KILLSW  27
#define SW      5
#define LED     1
#define SPKR    29
#define TOTAL   32


int switchControl(){

	int i;

	int notes[] = {
	391,391,440,440,391,391,329.63,329.63, \
	391,391,329.63,329.63,293.66,293.66,293.66,0, \
	391,391,440,440,391,391,329.63,329.63, \
	391,329.63,293.66,329.63,261.63,261.63,261.63, 0
	};
	
	softToneCreate(SPKR);
	pinMode(SW, INPUT);
	pinMode(LED, OUTPUT);
	pinMode(KILLSW, INPUT);

	
	for(;;) {
		if(digitalRead(SW) == LOW) {
			digitalWrite(LED, HIGH);
			delay(1000);
			digitalWrite(LED, LOW);
			for (i = 0; i<TOTAL; i++){
				softToneWrite(SPKR, notes[i]);
					if(digitalRead(KILLSW) == LOW) {
						break;
					}
				delay(280);
			}
			return 0;
		}
		delay(10);
	}

	return 0;
}

	


	

int main() {

	wiringPiSetup();
	switchControl();	
	return 0;
}
