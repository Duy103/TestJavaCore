package cau2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tọa độ điểm A : ");
        double xA = sc.nextDouble();
        double yA = sc.nextDouble();
        double zA = sc.nextDouble();

        KG3chieu tdA = new KG3chieu(xA, yA, zA);

        System.out.println("Nhập tọa độ điểm B : ");
        double xB = sc.nextDouble();
        double yB = sc.nextDouble();
        double zB = sc.nextDouble();

        KG3chieu tdB = new KG3chieu(xB, yB, zB);

        double kc = tdA.khoangCach(tdB);

        System.out.println("Khoảng cách giữa hai điểm A , B là: " + kc);
    }
}
