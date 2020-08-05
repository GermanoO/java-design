package strategy;

class CalculadorDeImpostoTest {

    public static void main(String[] args) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();

        Orcamento orcamento = new Orcamento(500.0);
        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

        calculadorDeImposto.realizaCalculo(orcamento, icms);
        calculadorDeImposto.realizaCalculo(orcamento, iss);

    }

}