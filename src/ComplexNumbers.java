public class ComplexNumbers {

    int real;
    int image;

    private ComplexNumbers() {}

    public void add(ComplexNumbers num) {
        this.real = this.real + num.real;
        this.image = this.image + num.image;
    }

    public void subtract(ComplexNumbers num) {
        this.real = this.real - num.real;
        this.image = this.image - num.image;
    }

    public static void main(String[] args) {

        ComplexNumbers number = new ComplexNumbers();
        number.real = 10;
        number.image = 4;

        ComplexNumbers anotherNumber = new ComplexNumbers();
        anotherNumber.real = 6;
        anotherNumber.image = 6;

        number.add(anotherNumber);

        System.out.println(number.real);
    }
}