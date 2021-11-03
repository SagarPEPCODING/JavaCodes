package calculations.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = src.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(src.nextInt());
        }
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            int val = list.get(i);
            if(val % 2 == 0) {
                System.out.println(val);
            }
        }
    }
}
