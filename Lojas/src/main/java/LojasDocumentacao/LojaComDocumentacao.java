package LojasDocumentacao;

import java.util.List;
import java.util.Map;


public class Loja {

        private List<String> produtos;
        private Map<String, Double> precos;

     
        public Loja(List<String> produtos, Map<String, Double> precos) {
            this.produtos = produtos;
            this.precos = precos;
        }
        
        public double calcular() {
            double total = 0;
            for (String produto : produtos) {
                if (precos.containsKey(produto)) {
                    total += precos.get(produto) * 0.85; 
                } else {
                    total += 1.99; 
                }
            }
            return total;
        }
        public void imprimir() {
            for (String produto : produtos) {
                System.out.println(produto + " -> " + precos.getOrDefault(produto, 0.0));
            }
        }
}
