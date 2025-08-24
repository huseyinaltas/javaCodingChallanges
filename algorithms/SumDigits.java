package algorithms;

public class SumDigits {
    public static int sumDigits(int num) {
        while (num > 9) {
            int total = 0;
            while (num != 0) {
                total = total + num % 10;
                num = num / 10;
            }
            num = total;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 123456;
        int total = sumDigits(num);
        System.out.println("Sum of digits of number " + num + ": " + total);
        // output: Sum of digits of number 123456: 3
    }
}