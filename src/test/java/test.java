import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void test1() {
        assertEquals("直角三角形",judgeTriangle(3,4,5));
    }

    @Test
    public void test2() {
        assertEquals("等腰三角形",judgeTriangle(3,3,5));
    }

    @Test
    public void test3() {
        assertEquals("等边三角形",judgeTriangle(3,3,3));
    }

    @Test
    public void test4() {
        assertEquals("Wrong Format",judgeTriangle(1,1,0));
    }

    @Test
    public void test5() {
        assertEquals("一般三角形",judgeTriangle(3,6,5));
    }

    @Test
    public void test6() {
        assertEquals("不是三角形",judgeTriangle(31,4,5));
    }

    public static String judgeTriangle(double a, double b, double c){
        String str = "";
            double temp;
                if (a > b) {
                    temp = a;
                    a = b;
                    b = temp;
                }
                if (a > c) {
                    temp = a;
                    a = c;
                    c = temp;
                }
                if (b > c) {
                    temp = b;
                    b = c;
                    c = temp;
                }
                if (a >= 1 && a <= 200 && b >= 1 && b <= 200 && c >= 1 && c <= 200) {
                    if (a + b > c) {
                        if (a == b && b == c)
                            str = "等边三角形";
                        else if (a * a + b * b - c * c == 0 && a == b)
                            str = "等腰直角三角形";
                        else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a))
                            str = "等腰三角形";
                        else if (a * a + b * b - c * c == 0)
                            str = "直角三角形";
                        else
                            str = "一般三角形";
                    } else
                        str = "不是三角形";
                } else
                    str = "Wrong Format";
                return str;
            }
}

