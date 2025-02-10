#include <stdio.h>

extern double kavg, eavg, mavg;

extern int cnt;

double avg_fn(void){
	
	return (kavg+eavg+mavg)/cnt;
}
