import javax.swing.JOptionPane;


public class ListaAutReferenciada  extends Lista{
	
	private CelulaNo primeiro, ultimo, pos;	
	
	public ListaAutReferenciada(){ //Cria uma Lista vazia
		
		this.primeiro = new CelulaNo(); 
		this.pos = this.primeiro;
		this.ultimo = this.primeiro;
		this.primeiro.prox = null ;
	}
	
	public void imprime(){ //implementação da interface Imprimivel
		CelulaNo aux = this.primeiro.prox;
		String str = "Valores armazenados na lista: \n{";
		
		while (aux != null){
			str += aux.item.toString();
			aux = aux.prox;			
			if(aux != null) str += ", ";
		}
		
		JOptionPane.showMessageDialog(null, str + "}");	
	}
	@Override
	public void inserir(Object x) {
		this.ultimo.prox = new CelulaNo () ;
		this.ultimo = this.ultimo.prox;
		this.ultimo.item = x ; 
		this.ultimo.prox = null ;
	}
	@Override
	public Object remover(Object chave) {
		if (this.vazia() || (chave == null))
			return null;
		CelulaNo aux = this . primeiro;
		
		while(aux.prox!=null && !aux.prox.item.equals(chave))
			aux = aux.prox;
		if (aux.prox == null )
			return null ; //não encontrada
		
		CelulaNo q = aux.prox;
		
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
		CelulaNo aux = this . primeiro;
		while (aux.prox != null ) {
			if (aux.prox.item.equals(chave)) return aux.prox. item;
				aux = aux.prox;
		} 
		return null ;
	}
	public Object retiraPrimeiro(){
		if (this.vazia()) 
			return null;
		
		CelulaNo aux = this.primeiro ; CelulaNo q = aux.prox;
		Object item = q. item; aux.prox = q.prox;
		
		if (aux.prox == null)
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
