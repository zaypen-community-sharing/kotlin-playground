package painpoints;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex complex) {
        return new Complex(
                real + complex.real,
                imaginary + complex.imaginary
        );
    }

    public static void main(String[] args) {
        Complex a = new Complex(1, 2),
                b = new Complex(3,4);
        System.out.println(a.add(b));
    }
}
