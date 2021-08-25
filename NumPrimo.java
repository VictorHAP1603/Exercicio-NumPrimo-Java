public class NumPrimo {
    public static void main(String[] args) {
        boolean isPrimo;

        for (int num = 2; num <= 10; num++) {
            isPrimo = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(num);
            }

        }
    }
}



