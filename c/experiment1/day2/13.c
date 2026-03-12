#include<stdio.h>
#include<math.h>



int getDay(int m,int d){
    switch(m){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            return 31;
        case 4:
        case 6:
        case 9:
        case 11:
            return 30;
        case 2:
            return d;
        default: 
            return 0;
    }
}

int main(){
    int y=0,m=0,d=0,res=0;
    int dayFeb=0;
    scanf("%d%d%d",&y,&m,&d);
    if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0){
        dayFeb = 29;
    }else{
        dayFeb = 28;
    }

    for(int i = 1; i < m; i++){
        res += getDay(i,dayFeb);
    }
    
    printf("%d",res + d);
    
    return 0;
}