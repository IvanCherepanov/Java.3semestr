package laba10.ComplexFactory;

/**
 * Комплексное число из двух частей: действительная и мнимая части
 */
public class Complex {
    private int real;
    private int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex add(Complex c) {
        int r = this.real+c.getReal();
        int i = this.image+c.getImage();
        return new Complex(r, i);
    }

    public Complex multiple(Complex c) {
        int r = this.real*c.getReal() - (this.image*c.getImage());
        int i = this.real*c.getImage() + this.image*c.getReal();
        return new Complex(r,i);
    }

    public Complex division(Complex c) throws Exception{
        if ((c.getImage()*c.getImage()+c.getReal()*c.getReal())==0) {
            throw new MyException();
        }
        else{
            int r = (this.real*c.getReal()+this.getImage()*c.getImage())/((c.getImage()*c.getImage()+c.getReal()*c.getReal()));
            //System.out.println(r);
            int i = (this.image*c.getReal()-this.getReal()*c.getImage())/((c.getImage()*c.getImage()+c.getReal()*c.getReal()));
            //System.out.println(i);
            return new Complex(r,i);
        }
    }
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    @Override
    public String toString() {
        if (this.image == 0) return real+""; //проверка для наличия мнимой части
        if (this.real ==0 && this.image!=0){
            return  image+"i";
        }
        String sign = (this.image > 0)? "+" : ""; //проверяем наличие для знака мнимой части
        return real + sign + image+"i";
    }
}
