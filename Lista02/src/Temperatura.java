public class Temperatura {
    double valor;
    String escala;
    boolean valida = true;

    public Temperatura(double valorInformado, String escalaInformada) {
        this.valor = valorInformado;
        this.escala = escalaInformada;

        char letra = escalaInformada.charAt(0);


        if (letra != 'C' && letra != 'F' && letra != 'K') {
            System.out.println("Escala inválida");
            this.valida = false;
        }


        if (letra == 'K' && valorInformado < 0) {
            System.out.println("Erro: Kelvin não pode ser negativo");
            this.valida = false;
        }
    }

    public Temperatura toCelsius() {
        if (!valida) return this;

        double resultado = 0;
        char letra = escala.charAt(0);

        if (letra == 'K') {
            resultado = valor - 273.15;
        } else if (letra == 'F') {
            resultado = (valor - 32) / 1.8;
        } else {
            resultado = valor;
        }
        return new Temperatura(resultado, "C");
    }

    public Temperatura toFahrenheit() {
        if (!valida) return this;

        double f = valor;
        char letra = escala.charAt(0);

        if (letra == 'C') {
            f = (valor * 1.8) + 32;
        } else if (letra == 'K') {
            f = (valor - 273.15) * 1.8 + 32;
        }
        return new Temperatura(f, "F");
    }

    public Temperatura toKelvin() {
        if (!valida) return this;

        double k = valor;
        char letra = escala.charAt(0);

        if (letra == 'C') {
            k = valor + 273.15;
        } else if (letra == 'F') {
            k = (valor - 32) / 1.8 + 273.15;
        }
        return new Temperatura(k, "K");
    }

    public void imprimeComEscala() {
        if (valida) {
            System.out.println("Temperatura: " + valor + " " + escala);
        } else {
            System.out.println("Não é possível imprimir: Dados inválidos.");
        }
    }
}