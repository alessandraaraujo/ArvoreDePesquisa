import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;



public class CarregaRaca implements ActionListener { 
	
    JComboBox cargaracaanimal = new JComboBox();  
  
    public void actionPerformed(ActionEvent e) { 
    	
        JComboBox itemselecionado =(JComboBox)e.getSource();  
        String selecionado = (String)itemselecionado.getSelectedItem().toString();  
        System.out.println(selecionado);  
        if (selecionado.equalsIgnoreCase("C�es")){  
            String racas[]={"Beagle","Basset","Pastor Alem�o"};  
      } else {  
            String racas[]={"Siam�s","Persa","Angora"};  
  
        }  
          
     }  
  
    public void setcargaracaanimal(JComboBox cargaracaanimal){  
         this.cargaracaanimal = cargaracaanimal;  
    }

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}  
  
}  

