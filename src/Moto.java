/**
 * Representa uma moto de entrega.
 * Herda os atributos comuns de {@link Veiculo} e indica se possui baú.
 */
public class Moto extends Veiculo {

    private boolean possuiBau;

    /**
     * Construtor da classe Moto.
     *
     * @param placa        Placa da moto
     * @param capacidadeKg Capacidade máxima de carga em kg
     * @param possuiBau    Indica se a moto possui baú de entrega
     */
    public Moto(String placa, double capacidadeKg, boolean possuiBau) {
        super(placa, capacidadeKg);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }
}