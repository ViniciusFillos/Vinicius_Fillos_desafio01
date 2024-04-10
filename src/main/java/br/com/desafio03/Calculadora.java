package br.com.desafio03;

import br.com.desafio03.tipos.Multiplicador;
import br.com.desafio03.tipos.Multiplicando;
import br.com.desafio03.tipos.Resultado;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public void soma(Integer parametro1, Integer parametro2){

    }

    public void subtracao(String parametro1, Integer parametro2) {

    }

    public Resultado multiplicacao(Multiplicador multiplicador, Multiplicando multiplicando) {
        return new Resultado(multiplicador, multiplicando);
    }

    public List<Resultado> multiplicacao(Multiplicando multiplicando, Multiplicador multiplicador) {
        List<Resultado> list = new ArrayList<>();
        list.add(new Resultado(multiplicando, multiplicador));
        return list;
    }
}
