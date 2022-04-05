public class Them_PT {
    // Thêm 15 vào cuối mảng
    public static void main(String[] args) {
        int[] a = {5,7,8,9,10};
        int[] b =new int[6];
        for (int i = 0; i < b.length -1; i++) {
            if(i<5){
                b[i]=a[i];
            }
            b[5]=15;
        }
        System.out.println("Array before adding element is: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] +" ");
        }

        System.out.println("\nArray after adding element is: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(b[i] +" ");
        }
    }
}