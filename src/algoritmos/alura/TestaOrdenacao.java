package algoritmos.alura;

import java.sql.SQLOutput;

public class TestaOrdenacao {
    // aqui vamos listar e trocar a ordenação começando com o menor produto;
    public static void main(String[] args){
        Produtos produtos[] = {
                new Produtos("Lamborghini", 1000000),
                new Produtos("Jipe", 46000),
                new Produtos("Brasilia", 16000),
                new Produtos("Smart", 46000),
                new Produtos("Fusca", 17000)
        };

        novoSort(produtos,produtos.length -1);
        /*for(int atual = 0; atual < produtos.length - 1; atual++){
            int menor = buscaMenor(produtos,atual,produtos.length -1);
            Produtos produtoAtual = produtos[atual];
            Produtos produtoMenor = produtos[menor];
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }*/
        for(Produtos produto : produtos){
            System.out.println("O carro " +produto.getNome() + " custa "+produto.getPreco());
        }
    }

    private static void ordenar(Produtos[] produtos){
        //É comum não sabermos o limite ou quantos elementos temos dentro do array então é comum as funções de ordenação receber o tamanho (.length)
        for(int atual = 0; atual < produtos.length - 1; atual++){
            System.out.println("Estou na casinha " + atual);
            int menor = buscaMenor(produtos,atual,produtos.length -1);
            System.out.println("Trocando " + atual + " com o " + menor);
            Produtos produtoAtual = produtos[atual];
            Produtos produtoMenor = produtos[menor];
            System.out.println("Trocando "+ produtoAtual.getNome() + " " + produtoMenor.getNome());
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
    }

    private static void novoSort(Produtos[] produtos, int quantidadeDeElementos) {
        for(int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            int analise = atual;
            while(analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                Produtos produtoAnalise = produtos[analise];
                Produtos produtoAnaliseMenos1 = produtos[analise -1];
                produtos[analise] = produtoAnaliseMenos1;
                produtos[analise -1] = produtoAnalise;
                analise--;
            }
        }
    }
    private static int buscaMenor(Produtos[] produtos, int inicio, int termino){

        int maisBarato = inicio;
        for(var atual = inicio; atual <= termino; atual ++){
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
}
