

public abstract class Arvore extends EstruturaDeDados {
	protected static String msg = "Valores armazenados na arvore: \n"; 	
	protected static class No {
		Object reg;
		No esq, dir;
	}	
	public void central(No p){		
		if(p != null){
			central(p.esq);
			msg += p.reg.toString() + "\n";
			central(p.dir);
		}		
	}
	protected abstract No antecessor(No q, No r);
}
