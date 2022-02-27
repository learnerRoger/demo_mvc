
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class test2 {


//    public static void main(String[] args) throws IOException {
//        // TODO Auto-generated method stub
//        int year, month, day;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("输入年：");
//        if (sc.hasNextInt()){
//            year = sc.nextInt();
//            System.out.println("输入月：");
//            month = sc.nextInt();
//            System.out.println("输入日：");
//            day = sc.nextInt();
//            String nextday = test2.nextDate(year, month, day);
//            System.out.println("下一天为");
//            System.out.println(nextday);
//        }else{
//            System.out.println("Wrong Format");
//        }
//
//    }

    /*
    普通日期测试
     */
    @Test
    public void test1(){
        assertEquals("2021-12-08",nextDate(2021,12,7));
    }

    /*
    跨月份测试
     */
    @Test
    public void test2(){
        assertEquals("2015-05-01",nextDate(2015,4,30));
    }

    /*
    跨年测试
     */
    @Test
    public void test3(){
        assertEquals("2015-01-01",nextDate(2014,12,31));
    }

    /*
    闰年二月测试
     */
    @Test
    public void test4(){
        assertEquals("2000-03-01",nextDate(2000,02,29));
    }

    /*
    非闰年测试
     */
    @Test
    public void test5(){
        assertEquals("2001-03-01",nextDate(2001,02,28));
    }

    /*
    无效输入测试（年份）
     */
    @Test
    public void test6(){
        assertEquals("年的值不在指定范围内",nextDate(20000,02,29));
    }

    /*
   无效输入测试（日期）
    */
    @Test
    public void test7(){
        assertEquals("日的值不在指定范围内",nextDate(2000,11,80));
    }
    /*
  无效输入测试（月份）
   */
    @Test
    public void test8(){
        assertEquals("月的值不在指定范围内",nextDate(2000,15,80));
    }

    public static String nextDate(int y, int m, int d) {
        int year, month, day;
        year = y;
        month = m;
        day = d;
        String result = new String();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month = month + 1;
                } else
                    day = day + 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month = month + 1;
                } else if (day == 31) {
                    System.out.println("无效输入日期！");
                    //continue;
                } else
                    day = day + 1;
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year = year + 1;
                } else if (day < 31) {
                    day = day + 1;
                }
                break;
            case 2: {
                if (day == 28)
                    if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                        day = 29;
                    } else {
                        day = 1;
                        month = 3;
                    }
                else if (day == 29) {
                    day = 1;
                    month = 3;
                } else if (day < 28) {
                    day = day + 1;
                } else {
                    //System.out.println("无效输入日期！");
                    result = "无效输入日期！";
                    //continue;
                }
            }
            break;
            default:
        }

        if (year >= 1600 && year <= 2100 && month <= 12 && month >= 1
                && day <= 31 && day >= 1) {
            //System.out.println("下一天是" + year + "年" + month + "月" + day	+ "日!");
            StringBuilder months = new StringBuilder();
            StringBuilder days = new StringBuilder();
            if (month < 10)
                months = months.append(0).append(month);
            else
                months = months.append(month);
            if (day < 10)
                days = days.append(0).append(day);
            else
                days = days.append(day);
            StringBuilder resultB = new StringBuilder().append(year).append("-").append(months).append("-").append(days);
            result = resultB.toString();
        } else if (year < 1600 || year > 2100) {
            //System.out.println("年的值不在指定范围内");
            result = "年的值不在指定范围内";
        } else if (month > 12 || month < 1) {
            //System.out.println("月的值不在指定范围内");
            result = "月的值不在指定范围内";
        } else if (day > 31 || day < 1) {
            //System.out.println("日的值不在指定范围内");
            result = "日的值不在指定范围内";
        } else result = null;
        return result;
    }
}


