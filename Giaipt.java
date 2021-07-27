import java.util.Scanner;
public class Giaipt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cho phuong trinh ax^2 + bx + c = 0");

        // NHAP A, B, C
        System.out.println("Nhap vao a:");
        float a = sc.nextFloat();
        System.out.println("Nhap vao b:");
        float b = sc.nextFloat();
        System.out.println("Nhap vao c:");
        float c = sc.nextFloat();
        //KHAI BAO DELTA VA CAC NGHIEM
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // GIAI PHUONG TRINH
        if(a == 0)
        {
            if(b == 0)
                System.out.println("Phuong trinh vo nghiem");
            else
                System.out.println("Phuong trinh co mot nghiem la: x = "  + (-b)/c);
            return;
        }
        if(delta > 0)
        {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co hai nghiem la: x1 =" + x1 + "x2 = " + x2);
        }
        else if(delta == 0)
        {
            System.out.println("Phuong trinh co hai nghiem kep la: x1 = x2 = " + (-b / (2 * a)));
        }
        else
        {
            System.out.println("Phuong trinh vo nghiem");
        }


    }
}
