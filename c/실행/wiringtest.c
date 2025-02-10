#include <wiringPi.h>
#include <stdio.h>
#include <softTone.h>

#define SW 	5 		/* GPIO24 */
#define SWF  27 		/* GPIO12 */
#define LED 	1 		/* GPIO18 */

#define SPKR 	29 	/* GPIO25 */
#define TOTAL 	32 	

int notes[] = { 	
	391, 391, 440, 440, 391, 391, 329.63, 329.63, \
	391, 391, 329.63, 329.63, 293.66, 293.66, 293.66, 0, \
	391, 391, 440, 440, 391, 391, 329.63, 329.63, \
	391, 329.63, 293.66, 329.63, 261.63, 261.63, 261.63, 0
};

int switchControl( )
{

	int i;
    pinMode(SW, INPUT); 	
	pinMode(SWF, INPUT);
    pinMode(LED, OUTPUT);

	for (;;) { 			
		if(digitalRead(SW) == LOW) { 	
			digitalWrite(LED, HIGH); 	
           		 delay(1000);
            		digitalWrite(LED, LOW); 	

			softToneCreate(SPKR); 	
			for (i = 0; i < TOTAL; ++i) {
				softToneWrite(SPKR, notes[i]); 
					if(digitalRead(SWF) == LOW) { 	
						break;
					}
				delay(280); 		
			}
			return 0;

		}

	}
    delay(10); 		

    return 0;
}

int main()
{
    wiringPiSetup( );
    switchControl( ); 		
    return 0;
}
