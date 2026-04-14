/**
 * Representa um caminhão de entrega.
 * Herda os atributos comuns de {@link Veiculo} e adiciona o número de eixos.
 */
public class Caminhao extends Veiculo {

    private int numeroDeEixos;

    /**
     * Construtor da classe Caminhao.
     *
     * @param placa          Placa do caminhão
     * @param capacidadeKg   Capacidade máxima de carga em kg
     * @param numeroDeEixos  Número de eixos do caminhão
     */
    public Caminhao(String placa, double capacidadeKg, int numeroDeEixos) {
        super(placa, capacidadeKg);
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }
}