import java.util.*;

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imag + b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imag - b.imag));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }

    public static void main(String[] args) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);

        Complex sum = Complex.add(a, b);
        Complex difference = Complex.diff(a, b);
        Complex product = Complex.product(a, b);

        System.out.print("Sum: ");
        sum.printComplex();

        System.out.print("Difference: ");
        difference.printComplex();

        System.out.print("Product: ");
        product.printComplex();
    }
} 