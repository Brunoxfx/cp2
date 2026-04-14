/** Demonstração do sistema FiapDelivery refatorado. */
public class Principal {

    public static void main(String[] args) {

        // Entrega via caminhão
        Caminhao caminhao = new Caminhao("ABC1D23", 5000.0, 6);
        Pacote pacotePesado = new Pacote("BR999", 10.5, "Pendente");

        Rota rotaCaminhao = new Rota(pacotePesado, caminhao);
        rotaCaminhao.iniciarEntrega();

        pacotePesado.atualizarStatus("Em trânsito");
        System.out.println("Status atualizado: " + pacotePesado.getStatus());

        // Entrega via moto — demonstra o polimorfismo da associação
        Moto moto = new Moto("XYZ5E67", 30.0, true);
        Pacote pacoteLeve = new Pacote("BR001", 1.2, "Pendente");

        Rota rotaMoto = new Rota(pacoteLeve, moto);
        rotaMoto.iniciarEntrega();
    }
}