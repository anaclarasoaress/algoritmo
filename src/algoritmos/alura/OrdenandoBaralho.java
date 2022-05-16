package algoritmos.alura;

public class OrdenandoBaralho {
    public static void main(String[] args) {
        int cartas[] = new int[5];
        cartas[0] = 7;
        cartas[1] = 4;
        cartas[2] = 10;
        cartas[3] = 2;
        cartas[4] = 8;

       /* executar do 0 ao 4 inclusive{
            se carta do atual < carta do menorCarta {
                menorCarta = atual
            }
            atual = atual + 1;
        }*/

        // selecionando o menor:
        int menorCarta = 0;
        for(int atual = 0; atual <= 4; atual++){
            if (cartas[atual] < cartas[menorCarta]) {
                menorCarta = atual;
            }
        }
        System.out.println("A menor carta é  " + cartas[menorCarta]);


    }
}


