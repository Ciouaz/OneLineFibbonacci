public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(fibSeq(i));
        }
    }

    public static long fibSeq(int n) {
        return n == 1 ? 0 : n == 2 ? 1 : fibSeq(n - 1) + fibSeq(n - 2);
    }
}