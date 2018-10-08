package exercicio;

import java.util.Random;
import java.util.Scanner;
import static exercicio.Arvore.Ler_DLR;
import static exercicio.Arvore.Ler_LDR;
import static exercicio.Arvore.Ler_LRD;
import static exercicio.Arvore.insert;
import static exercicio.Arvore.printNo;
import static exercicio.Arvore.search;
import static exercicio.Hash.hash;
import static exercicio.Search.binarySearch;


public class Main {
    
    
    
    
    public static void main(String[] args) {

        String[][] d = {{"cachorro","dog"},
                        {"gato", "cat"},
                        {"teclado", "keyboard"},
                        {"rato", "mouse"},
                        {"abacaxi","pineapple"},
                        {"faca", "knife"},
                        {"mar", "sea"},
                        {"sabonete", "soap"},
                        {"verde","green"},
                        {"azul","blue"},
                        {"vermelho","red"},
                        {"branco","white"},
                        {"livro","book"},
                        {"caneta","pen"},
                        {"bicicleta","bike"},
                        {"jogo","game"},
                        {"caixa","box"},
                        {"telefone","phone"},
                        {"carro","car"},
                        {"cadeira","chair"},
                        {"ilha","island"},
                        {"manual","manual"},
                        {"osso","bone"},
                        {"outono","fall"},
                        {"inverno","winter"},
                        {"porta","door"},
                        {"veleiro","yacht"},
                        {"zebra","zebra"},
                        {"zero","zero"},
                        {"preto", "black"}};
        
        Dicionario dic = new Dicionario(d);
        Dicionario dic_des = new Dicionario(d);
            
            
            
    
        boolean loop = true;

        while(loop) {
            System.out.println("=============================================================================");
            System.out.println("Você gostaria de ver as palavras do dicionário em português ou em inglês?");
            System.out.println(" Digite 1 para Dicionário em Português\n Digite 2 para Dicionário em inglês\n Digite 3 para FILA\n Digite 4 para HASH\n Digite 5 para BUSCA\n Digite 6 para BUSCA EM ÁRVORE \n Digite 0 para sair:");
            System.out.println("=============================================================================");

            Scanner p = new Scanner(System.in);
            int ans = p.nextInt();

            switch (ans) {
                case 1:
                    System.out.println("DICIONÁRIO DESORDENADO:\n");
                    System.out.println(dic_des.toString());
                    System.out.println("");
                    
                    System.out.println("DICIONÁRIO ORDENADO EM PORTUGUÊS:");
                    dic.ordemPt();      
                    System.out.println(dic.toString());
                    break;
                case 2:    
                    
                    System.out.println("DICIONÁRIO DESORDENADO:\n");
                    System.out.println(dic_des.toString());
                    System.out.println("");
                    
                    System.out.println("DICIONÁRIO ORDENADO EM INGLÊS:\n");
                    dic.ordemEn();       
                    System.out.println(dic.toString());
                    System.out.println("");
                    break;
         
                case 3:
                    System.out.println("============== OPERAÇÃO FILA =================");
                    Fila fila = new Fila();
        
                    System.out.println("A fila está vazia? "+fila.underflow());
                    System.out.println("A fila está cheia? "+fila.overflow());
                    fila.entraFila(12);        
                    fila.entraFila(34);
                    fila.entraFila(22);
                    fila.entraFila(42);
                    fila.entraFila(0);
        
                    System.out.println(fila.toString());
        
                    System.out.println("A fila está vazia? "+fila.underflow());
                    System.out.println("A fila está cheia? "+fila.overflow());
        
                    System.out.println(fila.saiFila());
        
                    System.out.println(fila.toString());
        
                    System.out.println(fila.primeiroFila());
                break;
                    
                case 4:
                    System.out.println("============== OPERAÇÃO HASH =================");
                    Random aleatorio = new Random();
                    int r = (Integer) aleatorio.nextInt(30);
        
                    System.out.println(dic.getDic(r, 0)+" = "+hash(dic.getDic(r, 0))+"(Hash)");
                    System.out.println(dic.getDic(r, 1)+" = "+hash(dic.getDic(r, 1))+"(Hash)");
                    break;
                
                case 5: 
                    System.out.println("============== OPERAÇÃO BUSCA BINÁRIA =================");
                    
                    String[][] pt = {{"abacaxi","pineapple"},
                                    {"azul","blue"},
                                    {"bicicleta","bike"},
                                    {"branco","white"},
                                    {"cachorro","dog"},
                                    {"cadeira","chair"},
                                    {"caixa","box"},
                                    {"caneta","pen"},
                                    {"carro","car"},
                                    {"faca","knife"},
                                    {"gato","cat"},
                                    {"ilha","island"},
                                    {"inverno","winter"},
                                    {"jogo","game"},
                                    {"livro","book"},
                                    {"manual","manual"},
                                    {"mar","sea"},
                                    {"osso","bone"},
                                    {"outono","fall"},
                                    {"porta","door"},
                                    {"preto","black"},
                                    {"rato","mouse"},
                                    {"sabonete","soap"},
                                    {"teclado","keyboard"},
                                    {"telefone","phone"},
                                    {"veleiro","yacht"},
                                    {"verde","green"},
                                    {"vermelho","red"},
                                    {"zebra","zebra"},
                                    {"zero","zero"}};
                    
                    String[][] en = {{"bike","bicicleta"},
                                    {"black","preto"},
                                    {"blue","azul"},
                                    {"bone","osso"},
                                    {"book","livro"},
                                    {"box","caixa"},
                                    {"car","carro"},
                                    {"cat","gato"},
                                    {"chair","cadeira"},
                                    {"dog","cachorro"},
                                    {"door","porta"},
                                    {"fall","outono"},
                                    {"game","jogo"},
                                    {"green","verde"},
                                    {"island","ilha"},
                                    {"keyboard","teclado"},
                                    {"knife","faca"},
                                    {"manual","manual"},
                                    {"mouse","rato"},
                                    {"pen","caneta"},
                                    {"phone","telefone"},
                                    {"pineapple","abacaxi"},
                                    {"red","vermelho"},
                                    {"sea","mar"},
                                    {"soap","sabonete"},
                                    {"white","branco"},
                                    {"winter","inverno"},
                                    {"yacht","veleiro"},
                                    {"zebra","zebra"},
                                    {"zero","zero"}};
                    
                    boolean lp = true;
        
                    while(lp){
                        System.out.println("");
                        System.out.println("======================="
                          +" Questão 4 "
                          +"=======================");
                        System.out.println("");
 
                        System.out.println("Deseja buscar uma palavra em português (1) ou em inglês (2)? Para sair pressione 0");
                            Scanner s = new Scanner(System.in);
                            int choice = s.nextInt();
            
                        switch (choice) {
                            case 1:
                                System.out.println("Digite a palavra EM PORTUGUÊS que deseja buscar: ");
                                Scanner n = new Scanner(System.in);
                                String valor = n.nextLine();
                                    int fim = pt.length;
                                    System.out.println("Dicionário Portugês: "+binarySearch(pt, 0, 0, fim, valor));
                                break;
                
                            case 2:
                                System.out.println("Digite a palavra EM INGLÊS que deseja buscar: ");
                                n = new Scanner(System.in);
                                valor = n.nextLine();
                                    fim  = en.length;
                                    System.out.println("Dicionário Inglês: "+binarySearch(en, 0, 0, fim, valor));
                                break;
                
                            default:
                                lp = false;
                                break;
                        }
                    }
                    
                case 6: 
                    
                    System.out.println("Digite a palavra");
                    Scanner k = new Scanner(System.in);
                    String word = k.nextLine();
                    
                    No a, b, resp;
                    a = null;
                    b = null;
	
		for (int i = 0; i < d.length; i++){
                    a = insert(a, d[i][0], d[i][1]);
		}
                
                    System.out.print("Árvore PT (DLR): [ ");
                    Ler_DLR(a);
                    System.out.println(" ]");
                    System.out.print("Árvore EN (DLR): [ ");
                    Ler_DLR(b);
                    System.out.println(" ]\n");
                    
                    System.out.print("Árvore PT (LDR): [ ");
                    Ler_LDR(a);
                    System.out.println(" ]");
                    System.out.print("Árvore EN (LDR): [ ");
                    Ler_LDR(b);
                    System.out.println(" ]\n");
                    
                    System.out.print("Árvore PT (LRD): [ ");
                    Ler_LRD(a);
                    System.out.println(" ]");
                    System.out.print("Árvore EN (LRD): [ ");
                    Ler_LRD(b);
                    System.out.println(" ]\n");
		
                    System.out.println("--- printNo ---");
                    printNo(a, 16);
                    printNo(b, 16);


                    System.out.println("--- search ---");
           
               
                resp = search(a, word);
            
                    if (resp!= null){
                        System.out.println( "A resposta encontrada foi = " + resp.ing +" = "+resp.por );
                    }else{
                        System.out.println("Não encontrou!");
                    }
                
                default:
                    
                    System.out.println("A Aplicação será finalizada!");
                    loop = false;   
                    break;                    
            }
        }
    }

    }


