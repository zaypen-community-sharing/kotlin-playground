package painpoints;

public class NoStringInterpolation {

    public static void versionA() {
        Integer a = 1, b = 2;
        Integer c = a + b;
        System.out.println(a + " + " + b + " = " + c); // 1 + 2 = 3
    }

    public static void versionB() {
        Integer a = 1, b = 2;
        Integer c = a + b;
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" + ").append(b).append(" = ").append(c);
        System.out.println(sb.toString()); // 1 + 2 = 3
    }

    public static void main(String[] args) {
        versionA();
        versionB();
    }
}
