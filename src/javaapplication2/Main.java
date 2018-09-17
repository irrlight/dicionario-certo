
package javaapplication2;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        String[][] dicionario = {
                {"Cachorro", "Dog"},
                {"Gato", "Cat"},
                {"Casa", "Home"},
                {"Água", "Water"},
                {"Preto", "Black"},
                {"Branco", "White"},
                {"Capacidade", "Ability"},
                {"Obter", "Acquire"},
                {"Acordo", "Agreement"},
                {"Pasto", "Pasture"},
                {"Penalidade", "Penalty"},
                {"Realizar", "Perform"},
                {"Brincadeira", "Play"},
                {"Estado", "State"},
                {"Registro", "Record"},
        };
        Scanner s = new Scanner(System.in);
        int seletor = 0;

        while (seletor != 15) {
            System.out.println("1 - Mostrar Dicionario\n 2 - Fazer tradução\n 3 - Adicionar ou Remover palavra\n 4 - Sair");
            seletor = s.nextInt();

            switch (seletor){
                case 1:
                    System.out.println("Selecione o dicionario:\n 1 - Portugues\n 2 - ingles");
                    int seletor1 = s.nextInt();

                    switch (seletor1){
                        case 1:
                            for(int i = 0; i < dicionario.length; i++){
                                System.out.println(dicionario[i][seletor1 - 1]);
                            }
                            System.out.println();
                            break;
                        case 2:
                            for(int i = 0; i < dicionario.length; i++){
                                System.out.println(dicionario[i][seletor1 - 1]);
                            }
                            System.out.println();
                            break;
                    }
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    seletor = 15;
                    break;
            }
        }
    }
}



