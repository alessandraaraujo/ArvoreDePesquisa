import javax.swing.JOptionPane;


public class ArvoreBinaria extends Arvore{
	
	private CelulaNo raiz;
	
	public ArvoreBinaria () {
		this.raiz = null ;
	}
	@Override
	public void inserir(Object dado) {
		this.raiz = this.inserir (dado, this.raiz ) ;
	}
	@Override
	public Object remover(Object dado) {
		 this.raiz = this.remover (dado, this.raiz);
		 return dado;		 
	}
	@Override
	public Object pesquisar(Object dado) {
		// TODO Auto-generated method stub
		return this.pesquisar(dado, this.raiz );
	}	
	private Object pesquisar(Object reg, CelulaNo p) {
		if (p == null ) 
			return null; // Registro não encontrado
		
		int aux1 = Integer.parseInt(reg.toString());
		int aux2 = Integer.parseInt(p.item.toString());
		
		if(aux1 < aux2)
			return pesquisar (reg , p.esq) ;
		else if (aux1 > aux2)
			return pesquisar ( reg , p.dir ) ;
		else 
			return p.item;
	}
	private CelulaNo inserir (Object reg, CelulaNo p) {
		
		if (p == null ) {
			p = new CelulaNo (); 
			p.item = reg;
			p.esq = null ; 
			p.dir = null ;
		}		
		else{
			
			int aux1 = Integer.parseInt(reg.toString());
			int aux2 = Integer.parseInt(p.item.toString());
			
			if (aux1 < aux2)
				p.esq = inserir (reg , p.esq);
			else if(aux1 > aux2)
				p. dir = inserir (reg , p. dir );
			else
				System.out.println ( "Erro : Registro ja existente");
		}		
		return p;		
	}
	@Override
	protected CelulaNo antecessor (CelulaNo q, CelulaNo r ) {
	if ( r.dir != null ) 
		r.dir = antecessor (q, r.dir );
		else { 
			q.item = r.item;
			r = r.esq; 
		}
		return r ;
	}
	private CelulaNo remover (Object reg , CelulaNo p) {
		if (p == null )
			System.out . println ( "Erro : Registro nao encontrado" ) ;		
		else{
			
			int aux1 = Integer.parseInt(reg.toString());
			int aux2 = Integer.parseInt(p.item.toString());
			
			if (aux1 < aux2)
				p.esq = remover(reg, p.esq) ;
			else if (aux1 > aux2)
				p.dir = remover(reg , p. dir ) ;
			else {
				if (p.dir == null) p = p.esq;
				else if (p.esq == null ) p = p.dir ;
				else p.esq = antecessor (p, p.esq) ;
			}			
		}
		return p;
	}
	public void imprime(){
		this.central(this.raiz);	
		JOptionPane.showMessageDialog(null, msg);
		msg = "Valores armazenados na arvore: \n";
	}	
}

