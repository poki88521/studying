
public class Question1 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        for(int i = 0;i < 10; i++){
            sum1 += getTrape(i / 10.0,(i + 1) / 10.0);
        }
        
        for(int i = 0; i < 9; i += 2){
            sum2 += getPara(i / 10.0, (i + 1) / 10.0, (i + 2) / 10.0);
        }
        System.out.printf("梯形法计算：%.5f%n",sum1);
        System.out.printf("抛物线法计算：%.5f%n",sum2);
    }

    static double getY(double x){
        return 4.0 / (1 + Math.pow(x,2));
    }

    static double getPara(double left, double mid, double right){
        return (1 / 30.0) * (getY(left) + 4 * getY(mid) + getY(right));
    }

    static double getTrape(double left, double right){
        return (getY(left) + getY(right)) * (0.1) * (0.5);
    }
}
