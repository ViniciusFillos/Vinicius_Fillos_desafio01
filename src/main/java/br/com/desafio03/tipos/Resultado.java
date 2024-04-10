package br.com.desafio03.tipos;

public class Resultado {
    Integer resultado;

    public Resultado(Multiplicador multiplicador, Multiplicando multiplicando) {
        this.resultado = multiplicador.getMultiplicador()*multiplicando.getMultiplicando();
    }

    public Resultado(Multiplicando multiplicando, Multiplicador multiplicador) {
        this.resultado = multiplicador.getMultiplicador()*multiplicando.getMultiplicando();
    }
}
