public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro(2001,
                " verde",
                " scort",
                122);
        carro1.criarPartes();

        Carro carro2 = new Carro(2004,
                " branco",
                " palio",
                111);
        carro2.criarPartes();

        Carro carro3 = new Carro(2003,
                " preto",
                " gol",
                113);
        carro3.criarPartes();

        System.out.println("\nInformação do carro1:");
        carro1.exibirInformacao();

        System.out.println("\nInformação do carro2:");
        carro2.exibirInformacao();

        System.out.println("\nInformaação do carro3:");
        carro3.exibirInformacao();

        System.out.println("\nOperações dos carros: ");
        carro1.Ligar();
        carro1.Acelerar();
        carro1.Desligar();

        carro2.Ligar();
        carro2.cambio.mudarTipo(" manual");
        carro2.Acelerar();
        carro2.Desligar();
        carro2.Frea();

        carro3.Ligar();
        carro3.cambio.mudarTipo(" Automático");
        carro3.chassis.trocarMaterial(" Alumínio");
        carro3.banco.ajustarReclinacao(true);
        carro3.Acelerar();
        carro3.Desligar();
    }
}
