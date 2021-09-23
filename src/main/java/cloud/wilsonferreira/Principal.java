package cloud.wilsonferreira;

import java.lang.ProcessHandle.Info;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
		float nota;
		int freq;
		String st;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira a nota de início");
		nota = ler.nextFloat();
		System.out.println("Insira a frequência de início");
		freq = ler.nextInt();
		System.out.println("Insira o status de início");
		st = ler.next();
		
		Boletim B1 = new Boletim(nota,freq,st);
		Boletim B2 = new Boletim();
		Boletim B3 = new Boletim("APROVADO");
		
		System.out.println("Uso do construtor com 3 parâmetros: ");
		B1.imprimir();
		System.out.println("Uso do construtor com nenhum parâmetro: ");
		B2.imprimir();
		System.out.println("Uso do construtor com 2 parâmetros: ");
		B3.imprimir();


        Pessoa P = new Pessoa();

        P.setNome("Wilson");
        P.setCPF(123123123);
        P.setEmail("junior@wilsonferreira.cloud");

        System.out.println("O CPF inserido foi: " + P.getCPF());
        System.out.println("O nome inserido foi: " + P.getNome());
        System.out.println("O email inserido foi: " + P.getEmail());

        JOptionPane.showMessageDialog(null, "O CPF inserido foi: " + P.getCPF() + "\n O nome inserido foi: " + P.getNome());
        JOptionPane.showMessageDialog(null, "O CPF inserido foi: ", "Titulo", JOptionPane.ERROR_MESSAGE);
    }
}
