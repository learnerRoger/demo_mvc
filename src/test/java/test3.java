import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class test3 {

    @Test
    public void test1(){
        assertEquals("总销售额为：3450.0 佣金：550.0",cal(10,50,60));
    }
    @Test
    public void test2(){
        assertEquals("数据输入错误",cal(0,0,0));
    }
    @Test
    public void test3(){
        assertEquals("总销售额为：1000.0 佣金：100.0",cal(10,10,10));
    }
    @Test
    public void test4(){
        assertEquals("总销售额为：1100.0 佣金：115.0",cal(11,11,11));
    }
    @Test
    public void test5(){
        assertEquals("总销售额为：2000.0 佣金：260.0",cal(20,20,20));
    }

    @Test
    public void test6(){
        assertEquals("数据输入错误",cal(70,80,100));
    }

    public String cal(double lock,double stock,double barrel) {
        String str = "";
        Scanner sc = new Scanner(System.in);

        //枪机模块
            if (lock < 1 || lock > 70 || stock < 1 || stock > 80 || barrel < 1 || barrel > 90) {
                str = "数据输入错误";
            }else{
                double sum = lock * 45 + stock * 30 + barrel * 25;

                double x = sum,m = 0;
                if (x <= 1000) {
                    m = x * 0.1;
                } else if (x <= 1800 && x > 1000) {
                    m = (x - 1000) * 0.15 + 100;
                } else {
                    m = (x - 1800) * 0.2 + 220;
                }
                str = "总销售额为：" + sum + " "+ "佣金：" + m;
            }
        return str;
    }
}

