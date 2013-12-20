import javax.swing.JOptionPane;


public class ListaArranjo extends Lista{
	
	private Object item[];
	private int primeiro, ultimo, pos;
	
	public ListaArranjo (int maxTam){ //cria auma listaVazia; (construtor)
		this.item = new Object[maxTam];
		this.pos = -1;
		this.primeiro = 0;
		this.ultimo = this.primeiro;
	}
	@Override
	public boolean vazia(){		
		return (this.primeiro == this.ultimo);
	}
	@Override
	public void inserir(Object chave) {
		if(this.ultimo >= this.item.length)
			System.out.println("Erro: a Lista esta cheia.");
		else{
			this.item[this.ultimo] = chave;
			this.ultimo += 1;
		}

	}
	@Override
	public Object remover(Object chave) {
		if(this.vazia() || chave == null)
		{
			System.out.println("Erro: Lista vazia.");
			return null;
		}
		int p = 0;
		while(p < this.ultimo && !this.item[p].equals(chave))
			++p;
		if(p >= this.ultimo)
			return null;
		
		Object item = this.item[p];
		this.ultimo -= 1;
		for(int aux = p; aux < this.ultimo; aux++)
			this.item[aux] = this.item[aux + 1];
		return item;
	}
	@Override
	public Object pesquisar(Object chave) {
		if(this.vazia() || chave == null)
			return null;
		for(int p = 0; p < this.ultimo; p++)
			if(this.item[p].equals(chave))
				return this.item[p];
		return null;
	}
	@Override
	public Object primeiro()
	{
		this.pos = -1; 
		return this.proximo();
	}
	@Override
	public Object proximo()
	{
		this.pos++;
		if(this.pos >= this.ultimo)
			return null;
		else
			return this.item[this.pos];
	}
	@Override
	public Object retiraPrimeiro()
	{
		if (this.vazia()) 
			return null;
		Object item = this.item[0];
		this.ultimo -= 1;
		for (int aux = 0; aux < this.ultimo; aux++)
			this.item[aux] = this . item[aux + 1] ;
		return item;
	}
	public void imprime()
	{
		String str = "Valores armazenados na lista: \n{";
		
		for(int i = this.primeiro; i < this.ultimo; i++)
		{
			str += this.item[i].toString();
			
			if(i != this.ultimo - 1)
				str += ", ";
		}	
		JOptionPane.showMessageDialog(null, str + "}");	
	}
}
