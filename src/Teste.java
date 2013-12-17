import javax.swing.JOptionPane;




public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		ListaArranjo list = new ListaArranjo(45);
		list.inserir(122);
		list.inserir(234);
		list.imprime();
		
		ListaAutReferenciada list1 = new ListaAutReferenciada();
		
		list1.inserir(123);
		list1.inserir(342);
		list1.imprime();
		
		ArvoreBinaria bst = new ArvoreBinaria();
		
		bst.inserir(1903);
		bst.inserir(22);
		bst.inserir(512);
		
		bst.imprime();
		
		JOptionPane.showMessageDialog(null,bst.remover(22));
		
		bst.imprime();
		
		Object aux = bst.pesquisar(512);
		
		if(aux != null)
			JOptionPane.showMessageDialog(null, "Pesquisa realizada com sucesso.\n" + "Valor pesquisado: " + aux);
		else
			JOptionPane.showMessageDialog(null, "Pesquisa nao teve exito.\n");
	}

}
