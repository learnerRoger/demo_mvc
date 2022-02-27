import java.util.Scanner;
public class test22 {
    static int [] montharr = {0,31,29,31,30,31,30,31,31,30,31,30,31};
    //月份用数组下标一一对应，假设是闰年

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        nextDate(y,m,d);
    }

    public static boolean isLeapYear(int year)
    //判断闰年
    {
        if( (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {
            return true;
        }
        else {
            return false;
        }

    };

    public static boolean checkInputValidity(int year,int month,int day){

        if( year < 1820 || year > 2020 || month < 1 || month > 12 || day < 1 ||
                day > 31 ) {
            return false;
        }
        else if( month != 2 && (day > montharr[month] ) ) {
            return false;
        }
        else if( isLeapYear(year) && month == 2 && day > montharr[month] ){
            return false;
        }
        else if( (!isLeapYear(year)) && month == 2 && day >= montharr[month] ){
            return false;
        }
        else {
            return true;
        }
    };

    public static void nextDate(int year,int month,int day) {

        if(checkInputValidity(year,month,day)) {

            if( (month == 12) && ( day + 1 > montharr[month])  ) {
                System.out.println("Next date is:" + (year + 1) + "-1-1" );
            }
            else if( (month != 2) && ( day + 1 > montharr[month]) ){
                System.out.println("Next date is:" + year + "-" + (month + 1) + "-1" );
            }
            else if( isLeapYear(year) && (month == 2) && ( day + 1 > montharr[month])) {
                System.out.println("Next date is:" + year + "-" + (month + 1) + "-1" );
            }
            else if( !isLeapYear(year) && (month == 2) && ( day + 1 >= montharr[month])) {
                System.out.println("Next date is:" + year + "-" + (month + 1) + "-1" );
            }
            else {
                System.out.println("Next date is:" + year + "-" + month + "-" + (day + 1) );
            }
        }
        else {
            System.out.println("Wrong Format");
        }
    };
}
