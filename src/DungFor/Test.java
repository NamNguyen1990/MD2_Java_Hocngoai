package DungFor;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        int[] mang = new int[5];
        try {
            mang[6] = 12;
        }
        catch (IndexOutOfBoundsException a) {
            System.out.println(a.getMessage());
        }
        catch (Exception b) {
            System.out.println("Loi vuot qua chi so cho phep: " + b.getMessage());
        }


//        String[] abc = {"abc", "cbd", "1", "2"};
//        for(int i = 0; i < abc.length; i++) {
//            System.out.println(abc[i]);
//        };
//        System.out.println("----------------");
//        ArrayList<Double> abc1 = new ArrayList<>();
//        for(Double i : abc1) {
//            System.out.println(i);
//        }
    }
}

