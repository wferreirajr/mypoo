package cloud.wilsonferreira;

public class Faculdade 
{
    public static void main( String[] args )
    {
        Boletim B1 = new Boletim();
        Boletim B2 = new Boletim();

        B1.inserir_nota(10);
        B1.inserir_frequencia(true);
        B1.alterar_status();

        B2.setNota(10);

        System.out.println( "Hello World!" + B1.getNota());
    }
}
