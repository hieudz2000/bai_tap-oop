package lab2;

public class l32 {
    public int  l32(String a){
        if(a.length() <= 2){
            int x = Integer.parseInt(a);
            if(x < 1 || x > 12){
                return  0;
            }
            else {
                return x;
            }

        }
        else{
            switch(a){
                case "January":
                    return 1;
                case "February":
                    return 2;
                case "March":
                    return 3;
                case "April":
                    return  4;
                case "May":
                    return 5;
                case "June":
                    return 6;
                case "July":
                    return 7;
                case"August":
                    return 8;
                case"September":
                    return 9;
                case"October":
                    return 10;
                case"November":
                    return 11;
                case"December":
                    return 12;
                case "Jan":
                    return 1;
                case "Feb":
                    return 2;
                case "Mar":
                    return 3;
                case "Apr":
                    return  4;

                case "Jun":
                    return 6;
                case "Jul":
                    return 7;
                case"Aug":
                    return 8;
                case"Sep":
                    return 9;
                case"Oct":
                    return 10;
                case"Nov":
                    return 11;
                case"Dec":
                    return 12;


                default:
                    return 0;


            }
        }
    }
    public l32(){

    }
}
//January
//
//        Tháng 2: February
//
//        Tháng 3: March
//
//        Tháng 4: April
//
//        Tháng 5: May
//
//        Tháng 6: June
//
//        Tháng 7: July
//
//        Tháng 8: August
//
//        Tháng 9: September
//
//        Tháng 10: October
//
//        Tháng 11: November
//
 //       Tháng 12: December