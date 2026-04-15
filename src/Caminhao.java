/** Veículo de entrega do tipo caminhão. */
public class Caminhao extends Veiculo {

    private final int numeroDeEixos;

    /**
     * @param placa         Placa do caminhão
     * @param capacidadeKg  Capacidade máxima em kg
     * @param numeroDeEixos Número de eixos
     */
    public Caminhao(String placa, double capacidadeKg, int numeroDeEixos) {
        super(placa, capacidadeKg);
        if (numeroDeEixos <= 0) {
            throw new IllegalArgumentException("O número de eixos deve ser positivo.");
        }
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getNumeroDeEixos() {
        return numeroDeEixos;
    }
}
