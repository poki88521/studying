public class Question2 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 0; i < 9; i += 2){
            sum += getPara(i / 10.0, (i + 1) / 10.0, (i + 2) / 10.0);
        }
        System.out.printf("ln2 = %.4f%n", sum);
    }

    static double getY(double x){
        return 1.0 / (1 + x);
    }

    static double getPara(double left, double mid, double right){
        return (1 / 30.0) * (getY(left) + 4 * getY(mid) + getY(right));
    }
}
