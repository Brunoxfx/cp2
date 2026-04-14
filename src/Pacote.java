/**
 * Representa um pacote a ser entregue pelo sistema FiapDelivery.
 */
public class Pacote {

    private String codigo;
    private double pesoKg;
    private String status;

    /**
     * Construtor da classe Pacote.
     *
     * @param codigo  Código identificador único do pacote
     * @param pesoKg  Peso do pacote em quilogramas (deve ser positivo)
     * @param status  Status inicial do pacote (ex: "Pendente")
     */
    public Pacote(String codigo, double pesoKg, String status) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O código do pacote não pode ser vazio.");
        }
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("O peso do pacote deve ser positivo.");
        }
        this.codigo = codigo;
        this.pesoKg = pesoKg;
        this.status = status;
    }

    /**
     * Atualiza o status do pacote.
     *
     * @param novoStatus Novo status a ser definido (ex: "Em trânsito", "Entregue")
     */
    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isBlank()) {
            throw new IllegalArgumentException("O status não pode ser vazio.");
        }
        this.status = novoStatus;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String getStatus() {
        return status;
    }
}