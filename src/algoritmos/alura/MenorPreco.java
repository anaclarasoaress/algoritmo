package algoritmos.alura;

public class MenorPreco {
    public static void main(String[] args) {
        /*Produtos produtos[] = new Produtos[5];
        produtos[0] = new Produtos("Lamborghini", 1000000);
        produtos[1] = new Produtos("Jipe", 46000);
        produtos[2] = new Produtos("Brasília", 16000);
        produtos[3] = new Produtos("Smart", 46000);
        produtos[4] = new Produtos("Fusca", 17000);*/

        Produtos produtos[] = {
                new Produtos("Lamborghini", 1000000),
                new Produtos("Jipe", 46000),
                new Produtos("Brasília", 16000),
                new Produtos("Smart", 46000),
                new Produtos("Fusca", 17000)
        };

        int maisBarato = buscaMenor(produtos,0,4);
        System.out.println(maisBarato);
        System.out.println("O" + produtos[maisBarato].getNome() + " é o carro mais barato e custa " + produtos[maisBarato].getPreco());
    }
    private static int buscaMenor(Produtos[] produtos, int inicio, int termino){
        int maisBarato = inicio;
        for(var atual = 0; atual <= termino; atual ++){
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
    /*private static int buscaMenor(Produtos[] produtos){
        int maisBarato = 0;
        *//*for(var atual = 0; atual <= 4; atual ++){
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }*//*
        //se eu remover um item da lista da erro, tratando:
        var termino = produtos.length -1;
        for(var atual = 0; atual <= termino; atual ++){
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }*/
}
