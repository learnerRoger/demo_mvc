import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pow = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (y < 0 && x > 0){
            pow = -y;
        }else{
            pow = y;
        }
        z = pow - x;

        System.out.println(pow);
        if (pow != 0){
            z = z * x;
            pow -= 1;

        }
        System.out.println(z);
        System.out.println(x*y);
        if (z < x * y && z > 0){
            z = 1 / z;
        }
        System.out.println(z);
    }
}
