/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author caraujo
 */
public class Search {
    public static String binarySearch(String mat[][], int col, int i_low, int i_high, String key) { 
        String nome;
        nome = "Elemento "+key+" não encontrado";
        while (i_low <= i_high){ 
            int i_mid = (i_low + i_high) / 2; 

            if ((mat[i_mid][col]).equalsIgnoreCase(key)) { 
                
                if(col == 0)
                    nome = mat[i_mid][col]+" = "+mat[i_mid][col+1];
                else
                    nome = mat[i_mid][col]+" = "+mat[i_mid][col-1];
                
                break; 
            } else if ((mat[i_mid][col]).compareToIgnoreCase(key) > 0) 
                i_high = i_mid - 1;      
            else
                i_low = i_mid + 1; 
            } 
        return nome;
    }
}
