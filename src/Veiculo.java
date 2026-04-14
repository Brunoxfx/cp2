/**
 * Classe abstrata que representa um veículo de entrega.
 * Serve como base para os tipos específicos de veículo (Caminhao, Moto).
 */
public abstract class Veiculo {

    private String placa;
    private double capacidadeKg;

    /**
     * Construtor da classe Veiculo.
     *
     * @param placa        Placa do veículo (ex: "ABC1D23")
     * @param capacidadeKg Capacidade máxima de carga em quilogramas (deve ser positiva)
     */
    public Veiculo(String placa, double capacidadeKg) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa não pode ser vazia.");
        }
        if (capacidadeKg <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser um valor positivo.");
        }
        this.placa = placa;
        this.capacidadeKg = capacidadeKg;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [placa=" + placa + ", capacidade=" + capacidadeKg + "kg]";
    }
}