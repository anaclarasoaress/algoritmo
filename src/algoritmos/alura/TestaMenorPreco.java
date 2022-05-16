package algoritmos.alura;

public class TestaMenorPreco {
    //Inicio do código, primeiro algoritmo para dar ideia!
    public static void main(String[] args){
        double precos[] = new double[5];
        precos[0] = 1000000;
        precos[1] = 46000;
        precos[2] = 16000;
        precos[3] = 46000;
        precos[4] = 17000;

        int maisBarato = 0;


        for(var atual = 0; atual <= 4; atual ++){
            if(precos[atual] < precos[maisBarato]){
                maisBarato = atual;
            }
        }

    // transformando em WHILE:
        /*var atual = 0;
        while(atual <=4){
            if(precos[atual] < precos[maisBarato]){
                maisBarato = atual;
            }
            atual++;
        }*/

        System.out.println(maisBarato);
        System.out.println("O carro mais barato custa " + precos[maisBarato]);

    }
}
