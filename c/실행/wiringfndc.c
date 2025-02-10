#include <wiringPi.h>
#include <stdio.h>
#include <stdlib.h>

int fndControl()
{
    int i;
    int cnt;
    int gpiopins[7] = {4, 2, 1, 16, 15,  7, 3}; 	/* a, b, c, d, e, f,g  */
	//23, 27, 18, 15, 14, 4, 22
    int number[10][7] = { {1,1,1,1,1,1,0}, 	/* 0 */
     		  	  {0,1,1,0,0,0,0}, 	/* 1 */
			  {1,1,0,1,1,0,1}, 	/* 2 */
   			  {1,1,1,1,0,0,1}, 	/* 3 */
			  {0,1,1,0,0,1,1}, 	/* 4 */
			  {1,0,1,1,0,1,1}, 	/* 5 */
			  {1,0,1,1,1,1,1}, 	/* 6 */
			  {1,1,1,0,0,0,0}, 	/* 7 */
			  {1,1,1,1,1,1,1}, 	/* 8 */
			  {1,1,1,0,0,1,1}}; 	/* 9 */
			 
    for (i = 0; i < 7; i++) {
        pinMode(gpiopins[i], OUTPUT); 	
    }


	for (cnt=0; cnt<=9; cnt++){
	
		for (i = 0; i < 7; i++) {

			printf("%3d", number[cnt][i]);
			
			digitalWrite(gpiopins[i], number[cnt][i]?HIGH:LOW); 	


		}
		printf("\n");
		delay(3000);
		for(int i = 0; i < 7; i++) { 	
			digitalWrite(gpiopins[i], LOW);
		}
    
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
