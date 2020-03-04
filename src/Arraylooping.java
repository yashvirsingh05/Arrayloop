import java.util.Scanner;

class Arraylooping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int prod = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {


            if (i == 0) {
                prod = arr[0] * arr[1];
            } else if (i == (n - 1)) {
                prod = arr[n - 1] * arr[n - 2];
            } else {
                prod = arr[i - 1] * arr[i + 1];
            }

            System.out.print(prod + " ");
        }
    }
}

