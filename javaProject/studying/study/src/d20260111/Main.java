package d20260111;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        for(int num : arr){
            arr.remove(1);
        }
    }
}
