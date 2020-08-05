package template;

import strategy.Imposto;
import strategy.Orcamento;

public class ICPP implements Imposto {

    public double calcula(Orcamento orcamento) {
        if(orcamento.getValor() > 500.0) {
            return orcamento.getValor() * 0.07;
        } else {
            return orcamento.getValor() * 0.05;
        }
    }

}
