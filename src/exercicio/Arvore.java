package exercicio;

public class Arvore {

 
	public static No insert (No p, String port,String ingl){
            if(p == null){
                p = new No();
                p.por = port;
                 p.ing = ingl;
                p.L = null;
                p.R = null;
                return p;
            }else{
                if(ingl.compareTo(p.ing) > 0) {
                    p.R = insert(p.R,port,ingl);
                }else{
                    p.L = insert(p.L,port,ingl);
                }
                return p;
            }
	}

	public static void Ler_LDR (No p){
		if (p != null){
                    Ler_LDR(p.L);
                    System.out.print("["+p.por+ ", "+p.ing+"]");
                    Ler_LDR(p.R);
		}
	}

	public static void Ler_DLR (No p){
		if (p != null){
			System.out.print("["+p.por+ ", "+p.ing+"]");
			Ler_DLR(p.L);
			Ler_DLR(p.R);
		}
	}

	public static void Ler_LRD (No p){
		if (p != null){
			Ler_LRD(p.L);
			Ler_LRD(p.R);
			System.out.print("["+p.por+ ", "+p.ing+"]");
		}
	}
	

	public static void printNo (No p, int chave){
		if (p != null){
			printNo(p.L, chave);
			printNo(p.R, chave);
			if (p.ing.equals(chave)) {
                            System.out.println("["+p.por+ ", "+p.ing+"]");
                        }
		}
	}
	
	public static No search (No p, String i){
            if (p == null){
                return p;
            } 
            else{
		if (i.equals(p.ing)){
                    return p;
                }else{
                    if (i.compareTo(p.ing) > 0){
                        return search(p.R, i);
                    }else{
                        return search(p.L, i);
                    }
		}
            }
	}
}