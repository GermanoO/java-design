package template;

import chain.Item;
import strategy.Imposto;
import strategy.Orcamento;

public class IKCV implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if(orcamento.getValor() > 500.0 && temItemMaiorQue100Reais(orcamento)) {
            return orcamento.getValor() * 0.1;
        } else {
            return orcamento.getValor() * 0.06;
        }
    }

    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        for(Item item: orcamento.getItens()) {
            if(item.getValor() > 100.0) return true;
        }
        return false;
    }

}
