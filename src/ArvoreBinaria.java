/*
public class ArvoreBinaria extends Arvore implements Imprimivel{
	
	private static class No {
		Object reg;//Item reg
		No esq, dir ;
	}
	private No raiz ;
	
	public ArvoreBinaria () {
		this.raiz = null ;
	}
	@Override
	public void inserir(Object dado) {
		this . raiz = this . insere ( dado, this . raiz ) ;
	}

	@Override
	public Object remover(Object dado) {
		
		 this.raiz = this.retira (dado, this.raiz );
		 return raiz;
	}

	@Override
	public Object pesquisar(Object dado) {
		// TODO Auto-generated method stub
		return this.pesquisa(dado, this.raiz ) ;
	}
	
	private Object pesquisa (Object reg, No p) {
		if (p == null ) 
			return null ; // Registro não encontrado
		else if(reg < p.reg)
			return pesquisa (reg , p.esq) ;
		else if (reg > p. reg)
			return pesquisa ( reg , p. dir ) ;
		else 
			return p. reg;
	}
	private No insere (Object reg , No p) {
		if (p == null ) {
			p = new No ( ) ; 
			p. reg = reg;
			p.esq = null ; p. dir = null ;
		}
		else if (reg < p. reg)
			p.esq = insere ( reg , p.esq) ;
		else if ( reg < p. reg)
			p. dir = insere ( reg , p. dir ) ;
		else 
			System.out.println ( "Erro : Registro ja existente" ) ;
		return p;
	}
	private No antecessor (No q, No r ) {
	if ( r . dir != null ) r . dir = antecessor (q, r . dir ) ;
		else { q. reg = r . reg ; r = r .esq; }
		return r ;
	}
	private No retira ( Object reg , No p) {
		if (p == null )
			System.out . println ( "Erro : Registro nao encontrado" ) ;
		else if ( reg.compara (p. reg) < 0)
			p.esq = retira ( reg , p.esq) ;
		else if ( reg.compara (p. reg) > 0)
			p. dir = retira ( reg , p. dir ) ;
		else {
			if (p. dir == null ) p = p.esq;
			else if (p.esq == null ) p = p. dir ;
			else p.esq = antecessor (p, p.esq) ;
		}
		return p;
	}
	public void imprime(){
		
	}
	
}
*/
