package OOP_HW.Lesson_7.Core.Model;

public class ComplexCalc implements ComplexCalcActions {

    @Override
    public Complex sum(Complex number1, Complex number2) {
        return new Complex(number1.getmRe() + number2.getmRe(), number1.getmIm() + number2.getmIm());
    }

    @Override
    public Complex diff(Complex number1, Complex number2) {
        return new Complex(number1.getmRe() - number2.getmRe(), number1.getmIm() - number2.getmIm());
    }

    @Override
    public Complex multiply(Complex number1, Complex number2) {
        return new Complex(
                number1.getmRe() * number2.getmRe() - number1.getmIm() * number2.getmIm(),
                number1.getmRe() * number2.getmIm() + number1.getmIm() * number2.getmRe());
    }

    @Override
    public Complex devide(Complex number1, Complex number2) {
        return new Complex(
                (number1.getmRe() * number2.getmRe() + number1.getmIm() * number2.getmIm()) /
                        (Math.pow(number2.getmRe(), 2) + Math.pow(number2.getmIm(), 2)),
                (number2.getmRe() * number1.getmIm() - number1.getmRe() * number2.getmIm()) /
                        (Math.pow(number2.getmRe(), 2) + Math.pow(number2.getmIm(), 2)));
    }
}

