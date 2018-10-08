
package exercicio;


public class Dicionario{
    
    private String[][] dic;
    private int o;
     

    public Dicionario(String[][] dic) {
        this.dic = dic;
        this.o = 0;
    }
 
    public String getDic(int r, int c) {
        return this.dic[r][c];
    }

    public void setDic(int r, int c, String valor) {
        this.dic[r][c] = valor;
        
    }
       
    
   public void ordemPt(){

       o = 1;
       String aux1;
       String aux2;
       for (int i = 0; i < this.dic.length; i++) {
           for (int j = 1; j < (this.dic.length - i); j++) {
                if (this.dic[j-1][0].compareTo(this.dic[j][0]) > 0) {
                    aux1 = this.dic[j-1][0];
                    aux2 = this.dic[j-1][1];
                    this.dic[j-1][0] = this.dic[j][0];
                    this.dic[j-1][1] = this.dic[j][1];
                    this.dic[j][0] = aux1;
                    this.dic[j][1] = aux2;
                }
            }
        }
 
    }
   
    public void ordemEn(){
       o = 2;
       String aux1;
       String aux2;
       for (int i = 0; i < this.dic.length; i++) {
           for (int j = 1; j < (this.dic.length - i); j++) {
                if (this.dic[j-1][1].compareTo(this.dic[j][1]) > 0) {
                    aux1 = this.dic[j-1][0];
                    aux2 = this.dic[j-1][1];
                    this.dic[j-1][0] = this.dic[j][0];
                    this.dic[j-1][1] = this.dic[j][1];
                    this.dic[j][0] = aux1;
                    this.dic[j][1] = aux2;
                }
            }
        }
 
    }
    

    @Override
    public String toString(){
        String name = "";
        
        if(o == 0 || o == 1){
        
        for(String[ ] valor: dic){
            name += valor[0]+" = "+valor[1]+"\n";
        }

        }else{
            for(String[ ] valor: dic){
                name += valor[1]+" = "+valor[0]+"\n";
            }           
        } 
        return name;              
          
    }
    
}
