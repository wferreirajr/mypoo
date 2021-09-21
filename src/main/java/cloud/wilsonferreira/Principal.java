package cloud.wilsonferreira;

public class Principal {
    public static void main(String[] args) {
        Pessoa P = new Pessoa();

        P.setNome("Wilson");
        P.setCPF(123123123);
        P.setEmail("junior@wilsonferreira.cloud");

        System.out.println("O CPF inserido foi: " + P.getCPF());
        System.out.println("O nome inserido foi: " + P.getNome());
        System.out.println("O email inserido foi: " + P.getEmail());
    }
}
