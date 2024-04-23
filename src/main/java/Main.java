public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String sum = bins.sum("111", "1011");
        System.out.println("Результат сложения бинарных чисел: " + sum);

        String result = bins.mult("101", "100");
        System.out.println("Результат умножения бинарных чисел: " + result);
    }
}