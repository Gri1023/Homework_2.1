public class Main {
    public static void main(String[] args) {
        int result = 2;
        int B = 1;
        int C = 3;

        if (B > result)
            result = B;
        else if (C > result)
            result = C;

        System.out.println(result);
    }
}