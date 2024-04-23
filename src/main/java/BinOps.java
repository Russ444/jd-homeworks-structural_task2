public class BinOps {
    public String sum(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(num1 + num2);
    }

    public String mult(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);

        return Integer.toBinaryString(num1 * num2);
    }
}