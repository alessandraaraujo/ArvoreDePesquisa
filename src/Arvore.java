

public abstract class Arvore extends EstruturaDeDados {
	protected static String msg = "Valores armazenados na arvore: \n"; 	
	
	public void central(No p){		
		if(p != null){
			central(p.esq);
			msg += "*" + p.reg.toString() + "\n";
			central(p.dir);
		}		
	}
	protected abstract No antecessor(No q, No r);
}
