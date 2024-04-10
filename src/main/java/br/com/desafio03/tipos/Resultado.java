package br.com.desafio03.tipos;

public class Resultado {
    Integer resultado;

    public Resultado(Multiplicador multiplicador, Multiplicando multiplicando) {
        this.resultado = multiplicador.getMultiplicador()*multiplicando.getMultiplicando();
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
}
