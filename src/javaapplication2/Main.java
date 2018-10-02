
package javaapplication2;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        String[][] dicionario = {
                {"Cachorro", "Dog"},
                {"Gato", "Cat"},
                {"Água", "Water"},
                {"Amigo", "Friend"},
                {"Livro", "Book"},
                {"Mesa", "Table"}
        };
        Scanner s = new Scanner(System.in);
        int seletor = 0;

        while (seletor != 6) {
            System.out.println("===============================================");
            System.out.println("Qual operação você deseja fazer?");
            System.out.println("1 - Mostrar o Dicionario");
            System.out.println("2 - Adicionar ou Remover palavras do dicionario");
            System.out.println("3 - Calcular o Hash");
            System.out.println("4 - Sair da aplicação");
            System.out.println("===============================================");
            seletor = s.nextInt();

            switch (seletor){
                case 1:
                    System.out.println("Mostrar o dicionario em 1 - português ou 2 - inglês");
                    System.out.println("===============================================");
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
                	System.out.println("Digite o que você calcular o Hash:");
                	String hash = s.nextLine();
                	hash = s.nextLine();
                	System.out.println("===============================================");
                	System.out.println("O hash de: " + hash + ". É: " + hash(hash));
                	
                    break;
                case 4:
                    seletor = 6;
                    break;
            }
        }
    }
    
    public static int hash(String k) {
    	
    	int hash = (k.hashCode() % 197 ) % 20;
    	
    	if(hash < 0) {
    		hash *= -1;
    	}
    	
    	return hash;
    }
}


