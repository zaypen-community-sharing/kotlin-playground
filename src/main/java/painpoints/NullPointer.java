package painpoints;

public class NullPointer {
    public static void log(String message) {
        if (message == null) {
            System.out.println(message.length());
        }
    }

    public static void main(String[] args) {
        log("a");
        log(null);
    }
}


