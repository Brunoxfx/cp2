/** Classe base para os veículos de entrega (Caminhao, Moto). */
public abstract class Veiculo {

    private final String placa;
    private final double capacidadeKg;

    /**
     * @param placa        Placa do veículo
     * @param capacidadeKg Capacidade máxima em kg (deve ser positiva)
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
