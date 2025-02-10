#include <stdio.h>
#include <wiringPi.h>

//GPIO핀 정의
#define LEDE	26  	
#define LEDD	6  	
#define LEDDP	29  	
#define LEDC	5  
#define LEDG	28  
#define LEDF	27 
#define LEDA	1  
#define LEDB	4  
#define SFT1	7	
#define SFT2	0  
#define SFT3	2	
#define SFT4	3	

//7세그먼트 디스플레이에 숫자와 알파벳을 표시하기 위한 패턴 정의
int pattern[][8] = {
    {1, 1, 1, 1, 1, 1, 0, 0}, // 0
    {0, 1, 1, 0, 0, 0, 0, 0}, // 1
    {1, 1, 0, 1, 1, 0, 1, 0}, // 2
    {1, 1, 1, 1, 0, 0, 1, 0}, // 3
    {0, 1, 1, 0, 0, 1, 1, 0}, // 4
    {1, 0, 1, 1, 0, 1, 1, 0}, // 5
    {1, 0, 1, 1, 1, 1, 1, 0}, // 6
    {1, 1, 1, 0, 0, 1, 0, 0}, // 7
    {1, 1, 1, 1, 1, 1, 1, 0}, // 8
    {1, 1, 1, 0, 0, 1, 1, 0}, // 9
    {1, 1, 1, 0, 1, 1, 1, 0}, // A
    {1, 1, 1, 1, 1, 1, 1, 1}, // B
    {1, 0, 0, 1, 1, 1, 0, 0}, // C
    {1, 1, 1, 1, 1, 1, 0, 1}, // D
    {1, 0, 0, 1, 1, 1, 1, 0}, // E
    {1, 0, 0, 0, 1, 1, 1, 0}  // F
};

int main()
{
   wiringPiSetupGpio();
	static int k = 0;
	int ledPin[] = {LEDA, LEDB, LEDC, LEDD, LEDE, LEDF, LEDG, LEDDP};
	int sft[] = {SFT1, SFT2, SFT3, SFT4};

    //각 핀을 출력으로 설정
	for(int i = 0; i < 8; i++){
		pinMode(ledPin[i], OUTPUT);
	}
	for(int j = 0; j < 4; j++){
		pinMode(sft[j], OUTPUT);
	}

	while(1){
        //4개의 시프트 레지스터를 순차적으로 활성화
		for(int j = 0; j < 4; j++){
			digitalWrite(sft[j], 1);
		}
		digitalWrite(sft[0], 0); //첫 번째 세그먼트에 해당하는 LED 상태 설정
		for(int i = 0; i < 8; i++){
			digitalWrite(ledPin[i], pattern[0][i]);
		}
		delay(5);
		for(int j = 0; j < 4; j++){ //시프트 레지스터를 비활성화
			digitalWrite(sft[j], 1);
		}

		digitalWrite(sft[1], 0);
		for(int i = 0; i < 8; i++){
			digitalWrite(ledPin[i], pattern[1][i]);
		}
		delay(5);
		for(int j = 0; j < 4; j++){
			digitalWrite(sft[j], 1);
		}

		digitalWrite(sft[2], 0);
		for(int i =0; i < 8; i++){
			digitalWrite(ledPin[i], pattern[2][i]);
		}
		delay(5);
		for(int j = 0; j < 4; j++){
			digitalWrite(sft[j], 1);
		}

		digitalWrite(sft[3], 0);
		for(int i = 0; i < 8; i++){
			digitalWrite(ledPin[i], pattern[3][i]);
		}
		delay(5);
		for(int j = 0; j < 4; j++){
			digitalWrite(sft[j], 1);
		}
	}
	return 0;
}

