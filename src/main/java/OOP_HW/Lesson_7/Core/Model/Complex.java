package OOP_HW.Lesson_7.Core.Model;

import java.util.List;

public class Complex {
    private double mRe;
    private double mIm;

    public Complex(double mRe, double mIm) {
        this.mRe = mRe;
        this.mIm = mIm;
    }

    public double getmRe() {
        return mRe;
    }

    public double getmIm() {
        return mIm;
    }

    @Override
    public String toString() {
        if (mIm < 0) {
            return "(" + mRe + mIm + "i" + ")";
        } else {
            return "(" + mRe + "+" + mIm + "i" + ")";
        }
    }
}
