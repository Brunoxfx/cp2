/**
 * Representa um pacote a ser entregue no sistema FiapDelivery.
 *
 * <p>Cada pacote possui um código identificador único, um peso em quilogramas
 * e um status que reflete o estágio atual da entrega (por exemplo, "Pendente",
 * "Em trânsito" ou "Entregue"). O pacote é associado a uma {@link Rota} para
 * que possa ser transportado por um {@link Veiculo}.</p>
 *
 * <p>Validações são aplicadas no construtor para garantir que o código não seja
 * nulo ou vazio e que o peso seja um valor positivo.</p>
 *
 * @see Rota
 * @see Veiculo
 */
public class Pacote {

    /** Código identificador único do pacote (por exemplo, "BR999"). */
    private String codigo;

    /** Peso do pacote em quilogramas. Deve ser um valor estritamente positivo. */
    private double pesoKg;

    /** Status atual da entrega do pacote (por exemplo, "Pendente", "Em trânsito", "Entregue"). */
    private String status;

    /**
     * Cria uma nova instância de {@code Pacote} com o código, peso e status informados.
     *
     * <p>O construtor valida os parâmetros de entrada para assegurar a integridade
     * dos dados: o código não pode ser nulo nem vazio, e o peso deve ser maior que zero.</p>
     *
     * @param codigo código identificador único do pacote; não pode ser {@code null}
     *               nem uma string vazia ou composta apenas por espaços em branco
     * @param pesoKg peso do pacote em quilogramas; deve ser um valor estritamente
     *               positivo (maior que zero)
     * @param status status inicial do pacote (por exemplo, {@code "Pendente"})
     * @throws IllegalArgumentException se {@code codigo} for {@code null} ou vazio,
     *                                  ou se {@code pesoKg} for menor ou igual a zero
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
     * Atualiza o status do pacote para o novo valor informado.
     *
     * <p>Este método permite acompanhar o ciclo de vida da entrega, alterando
     * o status conforme o pacote avança nas etapas (por exemplo, de "Pendente"
     * para "Em trânsito" e, em seguida, para "Entregue").</p>
     *
     * @param novoStatus novo status a ser atribuído ao pacote; não pode ser
     *                   {@code null} nem uma string vazia ou composta apenas
     *                   por espaços em branco
     * @throws IllegalArgumentException se {@code novoStatus} for {@code null} ou vazio
     */
    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isBlank()) {
            throw new IllegalArgumentException("O status não pode ser vazio.");
        }
        this.status = novoStatus;
    }

    /**
     * Retorna o código identificador único do pacote.
     *
     * @return código do pacote (por exemplo, {@code "BR999"})
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Retorna o peso do pacote em quilogramas.
     *
     * @return peso do pacote em kg (valor sempre positivo)
     */
    public double getPesoKg() {
        return pesoKg;
    }

    /**
     * Retorna o status atual da entrega do pacote.
     *
     * @return status atual (por exemplo, {@code "Pendente"}, {@code "Em trânsito"}
     *         ou {@code "Entregue"})
     */
    public String getStatus() {
        return status;
    }
}
