package org.example;

public class Cinema {

    int qtdInteira;
    int qtdMeia;

    double valorInteira;
    double valorMeia;

    double totalInteira;
    double totalMeia;
    double totalSessao;
    double media;

    public void calcular(double valorInteira, double valorMeia) {

        this.valorInteira = valorInteira;
        this.valorMeia = valorMeia;

        totalInteira = qtdInteira * valorInteira;
        totalMeia = qtdMeia * valorMeia;

        totalSessao = totalInteira + totalMeia;

        int totalIngressos = qtdInteira + qtdMeia;
        media = totalSessao / totalIngressos;

        System.out.println("Total inteiro: R$ " + totalInteira);
        System.out.println("Total meia: R$ " + totalMeia);
        System.out.println("Total arrecadado: R$ " + totalSessao);
        System.out.println("Valor médio por ingresso: R$ " + media);
    }
}
