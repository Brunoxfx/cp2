/** Associa um Pacote a um Veiculo para realizar uma entrega. */
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo;

     /**
     * @param pacote  Pacote a ser transportado
     * @param veiculo Veículo responsável pela entrega
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null) {
            throw new IllegalArgumentException("O pacote não pode ser nulo.");
        }
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        }
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
