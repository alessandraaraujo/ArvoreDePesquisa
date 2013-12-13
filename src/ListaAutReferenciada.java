
public class ListaAutReferenciada  extends Lista implements Imprimivel {
	
	private static class Celula{ 
		Object item; Celula prox ; 
	}	
	private Celula primeiro , ultimo , pos;	
	
	public ListaAutReferenciada(){ // Cria uma Lista vazia
		
		this.primeiro = new Celula() ; 
		this.pos = this.primeiro;
		this.primeiro.prox = null ;
	}
	
	public void imprime(){//implementação da interface Imprimivel
		Celula aux = this.primeiro.prox;
		while (aux != null){
			System.out.println (aux.item.toString()) ;
			aux = aux.prox ; 
		}
		
	}
	@Override
	public void inserir(Object x) {
		this.ultimo.prox = new Celula () ;
		this.ultimo = this.ultimo.prox;
		this.ultimo.item = x ; 
		this.ultimo.prox = null ;
	}
	@Override
	public Object remover(Object chave) {
		if (this.vazia() || (chave == null ) )
			return null;
		Celula aux = this . primeiro;
		while(aux.prox!=null && !aux.prox.item.equals(chave))
			aux = aux.prox;
		if (aux.prox == null )
			return null ; // não encontrada
		
		Celula q = aux.prox;
		
		Object item = q. item; aux.prox = q.prox;
		
		if (aux.prox == null) 
			this.ultimo = aux; 
		return item;
	}
	public boolean vazia() {
		return (this.primeiro == this.ultimo); 
	}
	@Override
	public Object pesquisar(Object chave) {
		if ( this.vazia() || chave == null ) return null ;
		Celula aux = this . primeiro;
		while (aux.prox != null ) {
			if (aux.prox.item.equals(chave)) return aux.prox. item;
				aux = aux.prox;
		} 
		return null ;
	}
	public Object retiraPrimeiro(){
		if (this.vazia()) 
			return null;
		Celula aux = this.primeiro ; Celula q = aux.prox;
		Object item = q. item; aux.prox = q.prox;
		if (aux.prox == null )
			this.ultimo = aux; 
		return item;
	}
	public Object primeiro ( ) {
		this.pos = primeiro ; 
		return proximo() ; 
	}
	public Object proximo () {
		this.pos = this.pos.prox;
		if (this.pos == null) 
			return null ;
		else 
			return this.pos.item;
	}

}
