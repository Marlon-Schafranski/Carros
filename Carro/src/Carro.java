public class Carro {
    private int anoFabricacao;
    private String cor;
    private String marca;
    private int velocidadeMaxima;
    private boolean ligado;

    Carro(int anoFabricacao,
            String cor,
            String marca,
            int velocidadeMaxima) {
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean isLigar() {
        return ligado;
    }

    public void setLigar(boolean ligar) {
        this.ligado = ligar;
    }

    public void Ligar() {
        if (!ligado) {
            System.out.println("O carro está ligado: ");
            ligado = true;
        } else {
            System.out.println("O carro esta ligado: ");
        }
    }

    public void Desligar() {
        if (ligado) {
            System.out.println("O carro está desligado: ");
            ligado = false;
        } else {
            System.out.println("O carro esta desligado: ");
        }
    }

    public void Acelerar() {
        if (ligado) {
            System.out.println("O carro esta acelerando: ");
            ligado = true;
        } else {
            System.out.println("o carro esta acelerando: ");
        }
    }

    public void Frea() {
        if (ligado) {
            System.out.println("o carro esta freando: ");
            ligado = false;
        } else {
            System.out.println("o carro esta freado: ");
        }
    }

    private Motor motor;
    Cambio cambio;
    Chassis chassis;
    Banco banco;

    public void criarPartes() {
        motor = new Motor();
        cambio = new Cambio();
        chassis = new Chassis();
        banco = new Banco();
    }

    public class Motor {
        private boolean ligado;

        public Motor() {
            this.ligado = false;
        }

        public void ligar() {
            if (!ligado) {
                System.out.println("Motor ligado.");
                ligado = true;
            } else {
                System.out.println("O motor já está ligado.");
            }
        }

        public void desligar() {
            if (ligado) {
                System.out.println("Motor desligado.");
                ligado = false;
            } else {
                System.out.println("O motor já está desligado.");
            }
        }
    }

    public class Cambio {
        private String tipo;

        public Cambio() {
            this.tipo = "Automático";
        }

        public void mudarTipo(String novoTipo) {
            System.out.println("Câmbio alterado para " + novoTipo);
            this.tipo = novoTipo;
        }
    }

    public class Chassis {
        private String material;

        public Chassis() {
            this.material = "Aço";
        }

        public void trocarMaterial(String novoMaterial) {
            System.out.println("Chassis trocado para material: " + novoMaterial);
            this.material = novoMaterial;
        }
    }

    public class Banco {
        private boolean reclinável;

        public Banco() {
            this.reclinável = true;
        }

        public void ajustarReclinacao(boolean reclinado) {
            if (reclinado) {
                System.out.println("Banco reclinado.");
            } else {
                System.out.println("Banco em posição vertical.");
            }
            this.reclinável = reclinado;
        }
    }

    void exibirInformacao() {
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade Máxima" + velocidadeMaxima + " Km/h");
    }
}