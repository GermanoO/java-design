package chain;

import strategy.Orcamento;

public interface Desconto {

    double desconto(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
