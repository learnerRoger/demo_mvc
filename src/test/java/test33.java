
import java.util.Scanner;

public class test33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //判断主控模块
        System.out.println("输入枪机的销售量：");
        if (sc.hasNextDouble()){
            int lock = sc.nextInt();
            if (lock < 1 || lock > 70) {
                System.out.println("枪机输入错误");
                System.exit(0);
            }
            //判断通信模块
            System.out.println("输入枪托的销售量：");
            double stock = sc.nextInt();
            if (stock < 1 || stock > 80) {
                System.out.println("枪托输入错误");
                System.exit(0);
            }
            //判断执行模块
            System.out.println("输入枪管的销售量：");
            double barrel = sc.nextInt();
            if (barrel < 1 || barrel > 90) {
                System.out.println("枪管输入错误");
                System.exit(0);
            }

            double sum = lock * 45 + stock * 30 + barrel * 25;
            System.out.println("总销售额为：" + sum);
            double x = sum,m = 0;
            if (x <= 1000) {
                m = x * 0.1;
            } else if (x <= 1800 && x > 1000) {
                m = (x - 1000) * 0.15 + 100;
            } else {
                m = (x - 1800) * 0.2 + 310;
            }
            System.out.println("佣金：" + m);
        }else{
            System.out.println("worng fromat");
        }



    }
}

