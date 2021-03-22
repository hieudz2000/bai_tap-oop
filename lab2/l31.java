package lab2;

import java.util.Scanner;

public class l31 {
    Scanner key = new Scanner(System.in);
    private int month;

    private int year;//aaa
    public l31(int month,  int year){
        this.month = month;

        this.year = year;

    }
    public int  getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }
    public l31(){

    }
    public void setMonth(){
        String a;
        l32 b3 = new l32();
        do {
            System.out.println("nhap thang: ");
            a = key.nextLine();

            if (b3.l32(a) == 0) {
                System.out.println("nhap sai r");
            }
        }while( b3.l32(a)== 0);
         month= b3.l32(a);

    }
    public void setYear(){

        do {
            System.out.println("nhap nam: ");
            year = key.nextInt();
            if(year > 2025 || year < 1990){
                System.out.println("nhap nam sai r");
            }

        }while(year > 2025 || year < 1990);


    }
    public String reslove(){
        if(month == 4|| month == 6||month == 9|| month == 11){
            return "thang co : 30 ngay";
        }
        else if(month == 2){
            setYear();
            if(year%4 == 0){
                return "thang co 29 ngay";
            }
            return "thang co 28 ngay";
        }
        else{
            return "thang co 31 ngay";
        }
    }
}
