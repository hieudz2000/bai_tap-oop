import java.util.Scanner;

public class ptbac2 {

    private double a;
    private double b;
    private double c;

    public ptbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public void setA() {

        System.out.println("nhap a: ");
        a = new Scanner(System.in).nextDouble();
    }

    public ptbac2() {
    }

    public void setB() {
        System.out.println("nhap b: ");
        b = new Scanner(System.in).nextDouble();
    }
    public void setC() {
        System.out.println("nhap c: ");
        c = new Scanner(System.in).nextDouble();
    }
    public String reslove() {
        double denta;
        double denta1;
        denta = b*b - 4*a*c;


            denta1 = Math.sqrt(denta);

        if (a == 0 && b == 0 && c == 0) {
            return "pt vo so nghiem";
        } else if (a == 0 && b == 0) {
            return "pt vo ngiem";
        } else if(a == 0){
            return "pt co nghiem la" + -b / a;
        } else if( denta == 0 ){
            return "pt co nghiem kep" + (-b + denta1)/(2*a);
        }
        else if(denta > 0){

            return "pt co 2 nghiem " + (-b + denta1)/(2*a)  +" va "+ (-b - denta1)/(2*a);
        }
        else{
            return "pt vo nghiem";
        }
    }
}
