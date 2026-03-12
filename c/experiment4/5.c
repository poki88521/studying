#include<stdio.h>
#include<stdlib.h>
#include<math.h>


typedef struct Point{
    float x;
    float y;
    int qua;
    float dis;
}Point;

void point(Point *p){
    float x = (*p).x;
    float y = (*p).y;
    (*p).dis = sqrt(pow(x, 2) + pow(y, 2));
    if(x == 0 || y == 0){
        (*p).qua = 0;
    }else if(y > 0){
        if(x > 0) (*p).qua = 1;
        if(x < 0) (*p).qua = 2;
    }else if(y < 0){
        if(x > 0) (*p).qua = 4;
        if(x < 0) (*p).qua = 3;
    }
}
int main(){
    Point *p = malloc(sizeof(Point));
    scanf("%f%f", &((*p).x), &((*p).y));
    point(p);
    printf("x: %.2f\n",(*p).x);
    printf("y: %.2f\n",(*p).y);
    printf("quadrant: %d\n",(*p).qua);
    printf("distance: %.2f\n",(*p).dis);
    return 0;
}