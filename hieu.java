import java.util.Scanner;

public class hieu {
    private double a;
    private  double b;
    public hieu(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getA(){
        return a;
    }
    public  double getB(){
        return b;
    }
    public void setA(){

        System.out.println("nhap a: ");
        a = new Scanner(System.in).nextDouble();
    }

    public hieu() {
    }

    public void setB(){
        System.out.println("nhap b: ");
        b = new Scanner(System.in).nextDouble();
    }
    public  String reslove(){
        if(a == 0 && b == 0){
            return "pt vo so nghiem";
        }
        else if(a == 0){
            return "pt vo ngiem";
        }
        else{
            return "pt co nghiem la" + -b/a;
        }
    }

//    public static void main(String args[]) {
//    }
}


