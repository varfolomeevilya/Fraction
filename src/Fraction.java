public class Fraction {
    private int numerator;
    private int denumenator;

    public Fraction() {
        this.numerator = 1;
        this.denumenator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denumenator = denominator;
    }

    public Fraction plus(Fraction fraction) {
        this.commonDenumenator(fraction);
        Fraction result = new Fraction(this.numerator + fraction.numerator, this.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;

    }

    public Fraction minus(Fraction fraction) {
        this.commonDenumenator(fraction);
        Fraction result = new Fraction(this.numerator - fraction.numerator, this.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }
    public Fraction multiplication(Fraction fraction){
        this.commonDenumenator(fraction);
        Fraction result=new Fraction(this.numerator * fraction.numerator, this.denumenator * fraction.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }
    public Fraction division(Fraction fraction){
        this.commonDenumenator(fraction);
        Fraction result=new Fraction(this.numerator * fraction.denumenator, this.numerator * fraction.denumenator);
        result.reduction();
        this.reduction();
        fraction.reduction();
        return result;
    }
    public void commonDenumenator(Fraction fraction) {
        int commonDenuminator = this.denumenator * fraction.denumenator;
        this.numerator = fraction.denumenator;
        fraction.numerator = this.denumenator;
        this.denumenator = commonDenuminator;
        fraction.denumenator = commonDenuminator;
    }

    public void reduction() {
        int div=0;
        if (this.numerator < this.denumenator) {
          div=this.numerator;
        } else {
          div=this.denumenator;
        }
        for(int i=div; i>1; i--){
            if(this.numerator %i ==0 && this.denumenator%i==0){
                this.denumenator/=i;
                this.numerator/=i;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denumenator;
    }
}
