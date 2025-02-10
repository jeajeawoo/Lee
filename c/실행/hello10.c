#include <wiringPi.h>
#include <stdio.h>

#define SW 	5 	/* GPIO24 */
#define CDS 	0 	/* GPIO17 */
#define LED 	1 	/* GPIO18 */
#define KILLSW  27

int cdsControl( )
{
    int i;

    pinMode(KILLSW, INPUT);
    pinMode(SW, INPUT); 	
    pinMode(CDS, INPUT); 	
    pinMode(LED, OUTPUT); 	

  for (;;) { 			
        if(digitalRead(CDS) == HIGH) { 	

            digitalWrite(LED, HIGH); 	
            delay(1000);
	}
	if(digitalRead(SW) == LOW){
	    digitalWrite(LED, LOW);
	    delay(1000);
	    break;
	}	
	 
      	
        if(digitalRead(KILLSW) == LOW) {
		return 0;
	}
   } 

    return 0;
}

int main( )
{
    wiringPiSetup( );
    cdsControl( ); 		
    return 0;
}
