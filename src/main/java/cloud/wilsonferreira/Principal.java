package cloud.wilsonferreira;

import java.lang.ProcessHandle.Info;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
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
