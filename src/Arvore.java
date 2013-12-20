

public abstract class Arvore extends EstruturaDeDados {
	protected static String msg = "Valores armazenados na arvore: \n"; 	
	
	public void central(CelulaNo p){		
		if(p != null){
			central(p.esq);
			msg += "*" + p.item.toString() + "\n";
			central(p.dir);
		}		
	}
	protected abstract CelulaNo antecessor(CelulaNo q, CelulaNo r);
}
