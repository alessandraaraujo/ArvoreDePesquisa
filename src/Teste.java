import javax.swing.JOptionPane;




public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Object pes;
		int dado = 1;
		
		ListaArranjo list = new ListaArranjo(45);
		
		while(true)
		{
			dado = Integer.parseInt(JOptionPane.showInputDialog("Informe uma valor a ser inserido na lista (digite 0 p/ sair): "));
			if(dado == 0)
				break;
			list.inserir(dado);
		}
		
		list.imprime();
		
		ListaAutReferenciada list1 = new ListaAutReferenciada();
		
		list1.inserir(123);
		list1.inserir(342);
		list1.inserir(45);
		list1.inserir(346);
		list1.imprime();
		
		ArvoreBinaria bst = new ArvoreBinaria();
		
		bst.inserir(1903);
		bst.inserir(22);
		bst.inserir(512);
		bst.inserir(345);
		bst.inserir(1235);
		
		bst.imprime();
		
		pes = Integer.parseInt(JOptionPane.showInputDialog("Informe uma valor a ser removido da arvore binaria: "));
		

		JOptionPane.showMessageDialog(null,"Remvovendo " + bst.remover(pes));
		
		
		bst.imprime();
		
		pes = Integer.parseInt(JOptionPane.showInputDialog("Informe uma valor a ser pesquisado na arvore binaria: "));
		
		Object aux = bst.pesquisar(pes);
		
		if(aux != null)
			JOptionPane.showMessageDialog(null, "Pesquisa realizada com sucesso.\n" + "Valor pesquisado: " + aux);
		else
			JOptionPane.showMessageDialog(null, "Pesquisa nao teve exito.\n");
	}

}
