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
public class Hash {
        public static int hash(String k){
        int hash_2 =(k.hashCode()% 197)%20;
        if(hash_2<0){
            hash_2*=-1;
        }
        return hash_2;    
    }
    
}
