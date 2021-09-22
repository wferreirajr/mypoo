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

    public double calcular_media(double AM, double AC, double AS) {
        double media = AM * 0.3 + AC * 0.2 + AS * 0.5;
        return media;
    }

    public double calcular_media(double PM, double AS) {
        double media = PM * 0.4 + AS * 0.6;
        return media;
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
    
}
