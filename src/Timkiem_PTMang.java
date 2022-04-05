public class Timkiem_PTMang {
    public static void main(String[] args) {
        int[] arr = {1,7,5,6,2,9,8,-1};
        int x = 5;
        int pos = searchElement(arr, x);
        if (pos == -1){
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Tim thay tai vi tri: " + pos);
        }
    }
    /**
     * @Param array[n] va X
     * return index[0, n - 1] neu tim thay
     * return -1 neu khong tim thay
     */
    static int searchElement(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}