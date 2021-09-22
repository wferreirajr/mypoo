package cloud.wilsonferreira;
import javax.swing.JOptionPane;

public class Faculdade 
{
    public static void main( String[] args )
    {
        Boletim B1 = new Boletim();
        Boletim B2 = new Boletim();

        B1.inserir_nota(10);
        B1.inserir_frequencia(true);
        B1.alterar_status();

        double m_grad = B1.calcular_media(9.5, 4.7, 6.9);
        double m_pos = B2.calcular_media(7.4, 9.2);

        System.out.println( "Hello World!" + B1.getNota());

        JOptionPane.showMessageDialog(null, "A média do aluno de graduação é " + m_grad + "\nA média do aluno de pós-graduação é " + m_pos, "BOLETIM", JOptionPane.PLAIN_MESSAGE);
    }
}
