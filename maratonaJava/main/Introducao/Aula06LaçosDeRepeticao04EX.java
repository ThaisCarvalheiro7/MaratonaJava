package maratonaJava.main.Introducao;

public class Aula06LaçosDeRepeticao04EX {
    public static void main(String[] args) {

        int valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela: " + parcela + "x" + " R$" + valorParcela);
            } else {
                break;
            }

            int valorViagem = 12000;
            for (int quantidadeParcela = 1; quantidadeParcela <= valorViagem; quantidadeParcela++) {
                double valueParcela = valorViagem / quantidadeParcela;
                if (valorParcela < 500) {
                    break;
                }
                System.out.println(quantidadeParcela + "x de R$" + valueParcela);
            }
        }
    }
}






