#include <wiringPi.h>
#include <stdio.h>
#include <stdlib.h>

int fndControl()
{
    int i;
    int cnt;
    int gpiopins[7] = {4, 2, 1, 16, 15,  3, 6}; 	/* a, b, c, d, e, f,g  */
	//23, 27, 18, 15, 14, 4, 22
    int number[5][7] = { {0,1,1,0,1,1,1}, 	/* H */
     		  	  {1,0,0,1,1,1,1}, 	/* E */
			  {0,0,0,1,1,1,0}, 	/* L */
   			  {0,0,0,1,1,1,0}, 	/* L */
			  {1,1,1,1,1,1,0}}; 	/* O */
			 
    for (i = 0; i < 7; i++) {
        pinMode(gpiopins[i], OUTPUT); 	
    }


	for (cnt=0; cnt<=4; cnt++){
	
		for (i = 0; i < 7; i++) {

			printf("%3d", number[cnt][i]);
			
			digitalWrite(gpiopins[i], number[cnt][i]?HIGH:LOW); 	
			
			
		}
		printf("\n");

		delay(2000);

		for(int i = 0; i < 7; i++) { 	

			digitalWrite(gpiopins[i], LOW);

		}
    		delay(500);
        }	

    //getchar( ); 			

    //for(int i = 0; i < 7; i++) { 	
        //digitalWrite(gpiopins[i], HIGH);
    //}


    return 0;
}

int main()
{

    wiringPiSetup( ); 			
    fndControl();

    return 0;
}
