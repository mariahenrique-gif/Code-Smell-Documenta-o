package LojasDocumentacao;

import java.util.List;
import java.util.Map;

public class LojaSemDocumentacao {

        private List<String> produtos;
        private Map<String, Double> precos;

        public LojaSemDocumentacao(List<String> produtos, Map<String, Double> precos) {
            this.produtos = produtos;
            this.precos = precos;
        }

        public double calcular() {
            double total = 0;
            final double TAXA_DESCONTO = 0.85;
            final double PRECO_PADRAO = 1.99;

            for (String produto : produtos) {
                if (precos.containsKey(produto)) {
                    total += precos.get(produto) * TAXA_DESCONTO;
                } else {
                    total += PRECO_PADRAO;
                }
            }
            return total;
        }
        //Metodo para imprimir
        public void imprimir() {
            for (String produto : produtos) {
                System.out.println(produto + " -> " + precos.getOrDefault(produto, 0.0));
            }
        }
    }