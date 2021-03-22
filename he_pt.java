import java.util.Scanner;

public class he_pt {
    private double a1, b1, c1;
    private  double a2, b2, c2;

    public he_pt(double a1, double b1, double c1, double a2, double b2, double c2){
        this.a1 = a1;
        this.b1 = b1;
        this.b2 = b2;
        this.a2 = a2;
        this.c1 = c1;
        this.c2 = c2;
    }
    public double getA1(){
        return a1;
    }
    public  double getB1(){
        return b1;
    }
    public  double getB2(){
        return b2;
    }
    public  double getA2(){
        return a2;
    }
    public  double getC2(){
        return c2;
    }
    public  double getC1(){
        return c1;
    }
    public void setA1(){

        System.out.println("nhap he so pt thu nhat ( a1, b1, c1) : ");
        System.out.println("nhap a1:  ");
        a1 = new Scanner(System.in).nextDouble();
    }
    public void setB1(){
        System.out.println("nhap b1:  ");
        b1 = new Scanner(System.in).nextDouble();
    }
    public void setC1(){
        System.out.println("nhap c1:  ");
        c1= new Scanner(System.in).nextDouble();
    }
    public he_pt() {
    }

    public void setA2(){
        System.out.println("nhap he so pt thu hai (a2, b2, c2)  ");
        System.out.println("nhap a2:  ");
        a2 = new Scanner(System.in).nextDouble();
    }
    public void setB2(){
        System.out.println("nhap b2:  ");
        b2 = new Scanner(System.in).nextDouble();
    }
    public void setC2(){
        System.out.println("nhap c2:  ");
        c2 = new Scanner(System.in).nextDouble();
    }
    public  String reslove(){
        double x, y, z;
        x = a1/a2;
        y = b1/b2;
        z = c1/c2;
        if(x == y && x == z){
            return "pt vo so nghiem";
        }
        else if(x == y && x != z){
            return "pt vo nghiem";
        }
        else{
            double x1, x2;
            x2 = (c1*a2 - c2)/(b1*a2- b2);
            x1 = (c1 - x2*b1)/a1;
            return "pt co nghiem duy nhat la: " + x1 +" va " + x2;
        }
    }
}
//a1 b1 c1
//a2 b2 c2
