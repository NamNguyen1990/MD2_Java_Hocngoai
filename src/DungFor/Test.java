package DungFor;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String[] abc = {"abc", "cbd", "1", "2"};
        for(int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        };
        System.out.println("----------------");
        ArrayList<Double> abc1 = new ArrayList<>();
        for(Double i : abc1) {
            System.out.println(i);
        }
    }
}
