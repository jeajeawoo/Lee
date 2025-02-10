#include <wiringPi.h>
#include <stdio.h>
#include <stdlib.h>



int fndControl(int num)
{
    int i;
    int gpiopins[7] = {4, 2, 1, 16, 15,  3, 6}; 	/* a, b, c, d, e, f,g  */
	//23, 27, 18, 15, 14, 4, 3
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


    for (i = 0; i < 7; i++) {

		printf("%5d", number[num][i]);
		
        digitalWrite(gpiopins[i], number[num][i]?HIGH:LOW); 	
		//wiringPiSetup();

    }

    getchar( ); 			

    for(int i = 0; i < 7; i++) { 	
        digitalWrite(gpiopins[i], LOW);
	
    }

    return 0;
}

int main(int argc, char **argv)
{
    int no;
    if(argc < 2) {
        printf("Usage : %s NO\n", argv[0]);
        return -1;
    }

    no = atoi(argv[1]);
    wiringPiSetup( ); 			
	for(int i = 0; i<9; i++){    
		fndControl(no);
	}
    return 0;
}
