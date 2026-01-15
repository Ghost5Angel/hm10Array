public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] d = {1.57, 7.654, 9.986};
        int[] b = {3244, 325, 405};

        System.out.println("Задача 2");
        System.out.println("Массив а");
        System.out.print(a[0]);
        for(int i=1; i<3; i++){
            System.out.print(",");
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("массив d");
        System.out.print(d[0]);
        for(int i=1; i<3; i++){
            System.out.print(",");
            System.out.print(d[i]);
        }
        System.out.println();
        System.out.println("массив b");
        System.out.print(b[0]);
        for(int i=1; i<3; i++){
            System.out.print(",");
            System.out.print(b[i]);
        }
        System.out.println();
        System.out.println("Задача 3");
        System.out.println("Массив а в обратном порядке");
        System.out.print(a[2]);
        for(int i=1; i>=0; i--){
            System.out.print(",");
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("массив d в обратном порядке");
        System.out.print(d[2]);
        for(int i=1; i>=0; i--){
            System.out.print(",");
            System.out.print(d[i]);
        }
        System.out.println();
        System.out.println("массив b в обратном порядке");
        System.out.print(b[2]);
        for(int i=1; i>=0; i--){
            System.out.print(",");
            System.out.print(b[i]);
        }
    }
}