/**
 * Representa uma rota de entrega, associando um {@link Pacote} a um {@link Veiculo}.
 * A associação com Veiculo é polimórfica: aceita Caminhao, Moto ou qualquer
 * outro veículo que venha a ser criado no futuro.
 */
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

    /**
     * Construtor da classe Rota.
     *
     * @param pacote  Pacote a ser transportado
     * @param veiculo Veículo responsável pela entrega
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    /**
     * Inicia a entrega, exibindo as informações da rota.
     */
    public void iniciarEntrega() {
        System.out.println("Entregando pacote [" + pacote.getCodigo() + "] "
                + "via " + veiculo.toString()
                + " | Status: " + pacote.getStatus());
    }

    public Pacote getPacote() {
        return pacote;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}