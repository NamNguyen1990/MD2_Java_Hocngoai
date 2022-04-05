public class Them_PT_Vaogiuamang {
//    Them20vaovtri3
    public static void main(String[] args) {
        int[] a = {5,7,8,9,10};
        int[] b =new int[6];
        for (int i = 0; i < b.length; i++) {
            if(i<3){
                b[i]=a[i];
            }
            b[3]=20;
            if(i>3){
                b[i]=a[i-1];
            }
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