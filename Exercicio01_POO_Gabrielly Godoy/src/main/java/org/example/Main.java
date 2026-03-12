package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cinema cinema = new Cinema();

        System.out.print("Digite a quantidade de ingressos inteiros: ");
        cinema.qtdInteira = sc.nextInt();

        System.out.print("Digite a quantidade de ingressos meia: ");
        cinema.qtdMeia = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o valor do ingresso inteiro: ");
        String vi = sc.nextLine().replace(",", ".");
        double valorInteira = Double.parseDouble(vi);

        System.out.print("Digite o valor do ingresso meia: ");
        String vm = sc.nextLine().replace(",", ".");
        double valorMeia = Double.parseDouble(vm);

        cinema.calcular(valorInteira, valorMeia);

        sc.close();
    }
}