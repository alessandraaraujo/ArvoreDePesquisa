import javax.swing.JOptionPane;

public class Teste {
	    
	public static void main(String[] args) {		
		
		EstruturaDeDados estrutura[] = new EstruturaDeDados[3];
		
		Object pes;
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione a estrutura a ser criada:\n1- Avore binária\n2- Lista por arranjo\n2- Lista autoreferenciada"));
		
		switch (opcao) {
		case 1:
			estrutura[0] = new ArvoreBinaria();
			JOptionPane.showConfirmDialog(null, "Deseja inserir itens na estrurura?");
			while(true){
				pes = Integer.parseInt(JOptionPane.showInputDialog("Forneca o item a ser inserido. Digite 0 para sair"));
				if((int)pes == 0)
					break;
				else
					estrutura[0].inserir(pes);
			}
			JOptionPane.showConfirmDialog(null, "Deseja exibir os dados inseridos");
			estrutura[0].imprime();
			break;
		case 2:
			estrutura[0] = new ListaArranjo(5);
			JOptionPane.showConfirmDialog(null, "Deseja inserir itens na estrurura?");
			while(true){
				pes = Integer.parseInt(JOptionPane.showInputDialog("Forneca o item a ser inserido. Digite 0 para sair"));
				if((int)pes == 0)
					break;
				else
					estrutura[0].inserir(pes);
			}
			JOptionPane.showConfirmDialog(null, "Deseja exibir os dados inseridos");
			estrutura[0].imprime();
			break;
		case 3:
			estrutura[0] = new ListaAutReferenciada();
			JOptionPane.showConfirmDialog(null, "Deseja inserir itens na estrurura?");
			while(true){
				pes = Integer.parseInt(JOptionPane.showInputDialog("Forneca o item a ser inserido. Digite 0 para sair"));
				if((int)pes == 0)
					break;
				else
					estrutura[0].inserir(pes);
			}
			JOptionPane.showConfirmDialog(null, "Deseja exibir os dados inseridos");
			estrutura[0].imprime();
			break;
		default:
			break;
		}
	}
}
