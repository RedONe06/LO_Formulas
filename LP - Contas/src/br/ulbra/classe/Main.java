package br.ulbra.classe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double ma, mp, mh, d, s, a, ep, x1, x2, delta;
        double n1, n2, n3, n4, p1, p2, y1, y2;

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha a sua operação: "
                + "\n(1)Média"
                + "\n(2)Média Harmonica"
                + "\n(3)Distância entre dois pontos"
                + "\n(4)Soma"
                + "\n(5)A"
                + "\n(6)Energia Potencial"
                + "\n(7)Bháskara");

        int resposta = Integer.parseInt(input.nextLine());
        switch (resposta) {
            case (1):
                //media
                System.out.println("Insira o valor 1:");
                n1 = input.nextDouble();
                System.out.println("Insira o valor 2:");
                n2 = input.nextDouble();
                System.out.println("Insira o valor 3:");
                n3 = input.nextDouble();

                ma = (n1 + n2 + n3) / 3;
                System.out.println("O resultado é: " + ma);
                break;

            case (2):
                //media harmonica
                System.out.println("Insira o valor 1:");
                n1 = input.nextDouble();
                System.out.println("Insira o valor 2:");
                n2 = input.nextDouble();

                mh = 2 / ((1 / n1) + (1 / n2));
                System.out.println("O resultado é: " + mh);
                break;

            case (3):
                //distncia entre dois pontos
                System.out.println("Insira o valor x1:");
                p1 = input.nextDouble();
                System.out.println("Insira o valor x2:");
                p2 = input.nextDouble();
                System.out.println("Insira o valor y1:");
                y1 = input.nextDouble();
                System.out.println("Insira o valor y2:");
                y2 = input.nextDouble();

                d = Math.sqrt(Math.pow((p1 - p2), 2) + Math.pow((y1 - y2), 2));
                System.out.println("O resultado é: " + d);
                break;
                
            case (4):
                //soma
                System.out.println("Insira o valor 1:");
                n1 = input.nextDouble();
                System.out.println("Insira o valor 2:");
                n2 = input.nextDouble();
                System.out.println("Insira o valor 31:");
                n3 = input.nextDouble();

                s = (n1 + n2 + n3) / 2;
                System.out.println("O resultado é: " + s);
                break;
                
            case (5):
                //a
                System.out.println("Insira o valor S:");
                n1 = input.nextDouble();
                System.out.println("Insira o valor a:");
                n2 = input.nextDouble();
                System.out.println("Insira o valor b:");
                n3 = input.nextDouble();
                System.out.println("Insira o valor c:");
                n4 = input.nextDouble();

                a = Math.sqrt(n1 * (n1 - n2) * (n1 - n3) * (n1 - n4));
                System.out.println("O resultado é: " + a);
                break;
                
            case (6):
                System.out.println("Insira o valor k:");
                n1 = input.nextDouble();
                System.out.println("Insira o valor x:");
                n2 = input.nextDouble();

                ep = n1 * (n2 * n2) / 2;
                System.out.println("O resultado é: " + ep);
                break;
                
            case (7):
                System.out.println("Insira o valor a:");
                n1 = input.nextDouble();
                System.out.println("Insira o valor b:");
                n2 = input.nextDouble();
                System.out.println("Insira o valor c:");
                n3 = input.nextDouble();

                delta = Math.sqrt((n1 * n1) - (4 * n2 * n3));
                x1 = (-n1 - delta) / (2 * n2);
                x2 = (-n1 + delta) / (2 * n2);

                System.out.println("O x1 é: " + x1);
                System.out.println("O x1 é: " + x2);
                break;
        }
    }

}
