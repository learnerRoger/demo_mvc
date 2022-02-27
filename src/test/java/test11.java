import java.util.Scanner;
public class test11 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double a = sca.nextDouble();
        double b = sca.nextDouble();
        double c = sca.nextDouble();

        if((a >= 1 && a <= 200) && (b >= 1 && b <= 200) && (c >= 1 && c <= 200)) {
            if(a + b > c && a + c > b && b + c > a) {
                if(a == b && b == c) {
                    System.out.println("Equilateral triangle");
                }
                else if((a == b || b == c || a == c) && (Math.abs(a*a + b*b - c*c) <= 0.001 || Math.abs(c*c + b*b - a*a) <= 0.001 || Math.abs(a*a + c*c - b*b) <= 0.001) ) {
                    System.out.println("Isosceles right-angled triangle");
                }
                else if(Math.abs(a*a + b*b - c*c) <= 0.001 || Math.abs(c*c + b*b - a*a) <= 0.001 || Math.abs(a*a + c*c - b*b) <= 0.001 ) {
                    /*1,1，根号2是直角三角形，但是根号2是无理数
                     * 电脑无法精确到那么多位，所以我假设精度小于0.001
                     * 就是直角三角形
                     */
                    System.out.println("Right-angled triangle");
                }
                else if(a == b || b == c || a == c ) {
                    System.out.println("Isosceles triangle");
                }
                else {
                    System.out.println("General triangle");
                }

            }
            else {
                System.out.println("Not a triangle");
            }
        }
        else{
            System.out.println("Wrong Format");
        }

    }
}

