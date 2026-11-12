package main.enums.dominio;

public enum TipoPagamento {
    PIX{
        @Override
        public double calcularDesconto(double valorTotal) {
            return valorTotal * 0.15;
        }
    },
    CREDITO{
        @Override
        public double calcularDesconto(double valorTotal) {
            return valorTotal;
        }
    },
    DEBITO{
        @Override
        public double calcularDesconto(double valorTotal) {
            return valorTotal * 0.1;
        }
    },
    BOLETO{
        @Override
        public double calcularDesconto(double valorTotal) {
            return valorTotal * 0.05;
        }
    };


    public abstract double calcularDesconto(double valorTotal);
}
