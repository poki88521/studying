#include<stdio.h>
#include<stdlib.h>
#include<time.h>

typedef struct Place{
    char name;
    int score;
}pl;

int main(){
    srand(time(NULL));

    pl A = {'A',0};
    pl B = {'B',0};
    pl C = {'C',0};
    pl D = {'D',0};

    for(int i = 0; i < 80; i++){
        int a = rand() % 4;
        switch(a){
            case 0:
                A.score += 1;
                break;
            case 1:
                B.score += 1;
                break;
            case 2:
                C.score += 1;
                break;
            case 3:
                D.score += 1;
                break;
            default:
            break;
        }
    }

    printf("the score of A:%d\n",A.score);
    printf("the score of B:%d\n",B.score);
    printf("the score of C:%d\n",C.score);
    printf("the score of D:%d\n",D.score);

    pl pls[4] = {A,B,C,D};
    pl temp = pls[0];
    for(int i = 0; i < 4; i++){
        if(pls[i].score > temp.score){
            temp = pls[i];
        }else if(pls[i].score = temp.score){
            if((int)(pls[i].name) < (int)(temp.name)){
                temp = pls[i];
            }
        }
    }

    printf("final choice:%c",temp.name);
    
    return 0;
}