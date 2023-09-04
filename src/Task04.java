public class Task04 {
    public static void main(String[] args){

        Fraction f1 = new Fraction();
        Fraction f2= new Fraction(5, 7);
        System.out.println(f1);
        System.out.println(f2);
        f1.commonDenumenator(f2);
        System.out.println(f1);
        System.out.println(f2);
        Fraction f3 =f1.plus(f2);
        System.out.println(f3);
        Fraction f4= f1.minus(f2);
        System.out.println(f4);
        f4.reduction();
        System.out.println(f4);
        Fraction f5=f1.multiplication(f2);
        System.out.println(f5);
        f5.reduction();
        Fraction f6=f1.division(f2);
        System.out.println(f6);
        f6.reduction();
    }
}
