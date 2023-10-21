/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivosentrada;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class TiposPrimitivosEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o nome do aluno");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = scanner.nextFloat();
        System.out.format("A nota de %s é %.2f \n", nome, nota);
    }
    
}
