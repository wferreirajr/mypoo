package cloud.wilsonferreira;

public class Boletim {
    private float nota;
    private int frequencia;
    private String status;

    public void inserir_nota(float nota) {
        
    }

    public void excluir_nota() {
        
    }

    public void alterar_nota(float nova_nota) {

    }

    public void inserir_frequencia(boolean freq) {
        
    }

    public void alterar_status() {
        
    }

    /**
        The Desciption of the method to explain what the method does
        @param the parameters used by the method
        @return the value returned by the method
        @throws what kind of exception does this method throw
    */
    public double calcular_media(double AM, double AC, double AS) {
        double media = AM * 0.3 + AC * 0.2 + AS * 0.5;
        return media;
    }

    public double calcular_media(double PM, double AS) {
        double media = PM * 0.4 + AS * 0.6;
        return media;
    }

    public Boletim(float n, int f, String s) {
        setBoletim(n, f, s);
    }

    public Boletim(String st) {
        this(10, 100, st);
    }

    public Boletim() {
        this(0, 0, null);
    }

    public void setBoletim(float n, int f, String s) {
        setNota(n);
        setFrequencia(f);
        setStatus(s);
    }

    public float getNota() {
        return nota;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public String getStatus() {
        return status;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void imprimir() {
        System.out.println(getNota() + "\n" + getFrequencia() + "\n" + getStatus() + "\n");
    }
    
}
