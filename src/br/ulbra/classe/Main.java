package br.ulbra.classe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double ma, mp, mh, d, s, a, ep, x1, x2, delta, division;
        double n1, n2, n3, n4, p1, p2, y1, y2;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your operation: "
                + "\n(1)Average"
                + "\n(2)Weighted average"
                + "\n(3)Harmonic Mean"
                + "\n(4)Distance between two points"
                + "\n(5)Sum"
                + "\n(6)Area of ​​a triangle"
                + "\n(7)Potencial Energy"
                + "\n(8)Bháskara");

        int answer = Integer.parseInt(input.nextLine());
        switch (answer) {
            case (1):
                //average
                System.out.println("Input your value 1:");
                n1 = input.nextDouble();
                System.out.println("Input your value 2:");
                n2 = input.nextDouble();
                System.out.println("Input your value 3:");
                n3 = input.nextDouble();

                ma = (n1 + n2 + n3) / 3;
                System.out.println("The result is: " + ma);
                break;
            case (2):
                //Weighted average
                System.out.println("Input your value 1:");
                n1 = input.nextDouble();
                System.out.println("Input your value 2:");
                n2 = input.nextDouble();
                System.out.println("Input your value 3:");
                n3 = input.nextDouble();

                mp = (n1 * 2 + n2 * 3 + n3 * 4) / 10;
                System.out.println("The result is: " + mp);
                break;

            case (3):
                //Harmonic mean
                System.out.println("Input your value 1:");
                n1 = input.nextDouble();
                System.out.println("Input your value 2:");
                n2 = input.nextDouble();

                mh = 2 / (1 / n1 + 1 / n2);
                System.out.println("The result is: " + mh);
                break;

            case (4):
                //Distance between two points
                System.out.println("Input x1's value:");
                p1 = input.nextDouble();
                System.out.println("Input x2's value::");
                p2 = input.nextDouble();
                System.out.println("IInput y1's value::");
                y1 = input.nextDouble();
                System.out.println("Input y2's value:");
                y2 = input.nextDouble();

                d = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(y2 - y1, 2));
                System.out.println("The result is: " + d);
                break;

            case (5):
                //Sum
                System.out.println("Input your value 1:");
                n1 = input.nextDouble();
                System.out.println("Input your value 2:");
                n2 = input.nextDouble();
                System.out.println("Input your value 3:");
                n3 = input.nextDouble();

                s = (n1 + n2 + n3) / 2;
                System.out.println("The result is: " + s);
                break;

            case (6):
                //Triangule area
                System.out.println("Input S's value:");
                n1 = input.nextDouble();
                System.out.println("Input a's value:");
                n2 = input.nextDouble();
                System.out.println("Input b's value:");
                n3 = input.nextDouble();
                System.out.println("Input c's value:");
                n4 = input.nextDouble();

                a = Math.sqrt(n1 * (n1 - n2) * (n1 - n3) * (n1 - n4));
                System.out.println("The result is: " + a);
                break;

            case (7):
                System.out.println("IInput k's value:");
                n1 = input.nextDouble();
                System.out.println("Input x's value:");
                n2 = input.nextDouble();

                ep = (n1 * n2 * n2) / 2;
                System.out.println("The result is: " + ep);
                break;

            case (8):
                System.out.println("Input a's value:");
                n1 = input.nextDouble();
                System.out.println("Input b's value:");
                n2 = input.nextDouble();
                System.out.println("Input c's value:");
                n3 = input.nextDouble();

                delta = Math.sqrt(n1 * n1 - 4 * n2 * n3);
                division = (2 * n2);

                if (delta >= 0) {
                    if (division != 0) {
                        x1 = (-n1 - delta) / (2 * n2);
                        x2 = (-n1 + delta) / (2 * n2);
                        System.out.println("The result is: " + "\nx1 = " + x1 + "\nx2 = " + x2);
                    } else {
                        System.out.println("Division per zero");
                    }
                } else {
                    System.out.println("Negative delta");
                }
        }
    }
}
