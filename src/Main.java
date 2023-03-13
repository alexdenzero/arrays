import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        double[] weight = new double[3];
        weight[0] = 1.57;
        weight[1] = 7.654;
        weight[2] = 9.986;
        double a = weight[0];
        double b = weight[1];
        double c = weight[2];
        System.out.println(a + " a " + b + " b " + c + " c");

        int[] weightT = new int[3];
        weightT[0] = 1;
        weightT[1] = 2;
        weightT[2] = 3;
        int d = weightT[0];
        int f = weightT[1];
        int h = weightT[2];
        System.out.println(d + " d " + f + " f " + h + " h");

        int[] weightS = {1, 2, 3, 4, 8, 0, 5, 444};
        weightS[1] = 55;
        int g = weightS[1];
        System.out.println(weightS[7]);

    }

    public static void task2() {
        System.out.println("Задача 2");
        double[] weightT = {1.57,7.654,9.986};
        for (int i = 0; i < weightT.length; i++) {
            System.out.print(weightT[i]);
            if (i != weightT.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] weight = {1,2,3};
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        int[] weightS = {5,6,1};
        for (int i = 0; i < weightS.length; i++) {
            System.out.print(weightS[i]);
            if (i != weightS.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");

        double[] weightT = {1.57,7.654,9.986};
        for (int i = weightT.length - 1; i >= 0; i--) {
            System.out.print(weightT[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] weight = {1,2,3};
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        int[] weightS = {5,6,1};
        for (int i = weightS.length - 1; i >= 0; i--) {
            System.out.print(weightS[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weight = {1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}