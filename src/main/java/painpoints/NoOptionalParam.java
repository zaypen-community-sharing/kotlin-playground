package painpoints;

public class NoOptionalParam {

    public static Integer increase(Integer n, Integer i) {
        return n + i;
    }

    public static Integer increase(Integer n) {
        return increase(n, 1);
    }

    public static void main(String[] args) {
        System.out.println(increase(1));
    }
}
