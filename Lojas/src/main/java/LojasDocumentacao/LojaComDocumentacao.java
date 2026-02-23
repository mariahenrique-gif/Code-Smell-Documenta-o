package LojasDocumentacao;

import java.util.List;
import java.util.Map;

// ESTA CLASSE REPRESENTA UMA LOJA ONLINE SIMPLES

public class LojaComDocumentacao {

        private List<String> produtos;
        private Map<String, Double> precos;

        public LojaComDocumentacao(List<String> produtos, Map<String, Double> precos) {
            this.produtos = produtos;
            this.precos = precos;
        }
        //Metodo para calcular o valor total dos produtos e aplicando descontos
        public double calcularTotal() {
            double total = 0;
            for (String produto : produtos) {
                if (precos.containsKey(produto)) {
                    total += precos.get(produto) * 0.85; //15 Desconto
                } else {
                    total += 1.99; // Valor do produto
                }
            }
            return total;
        }
        //
        public void imprimirCatalogo() {
            for (String produto : produtos) {
                System.out.println(produto + " -> " + precos.getOrDefault(produto, 0.0));
            }
        }
}