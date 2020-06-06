
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        int convert;
//        String value;
//        
//        value = JOptionPane.showInputDialog("Digite um valor");
//        convert = Integer.parseInt(value);
//        
//        JOptionPane.showMessageDialog(null, "Valor digitado: "+convert);
//        
       
    double convertPeso, convertAltura;
    double result, ajustaAltura;
    String peso, altura;
    
    DecimalFormat f = new DecimalFormat("#.##");
    
    peso =  JOptionPane.showInputDialog("Digite seu Peso");
    altura = JOptionPane.showInputDialog("Digite sua altura (cm)");
    
    convertPeso = Double.parseDouble(peso);
    convertAltura = Double.parseDouble(altura) / 100;
    
    result = convertPeso / (convertAltura * convertAltura);
      
    if(result < 17) JOptionPane.showMessageDialog(null, "IMC: " + f.format(result) + " Situação: Muito abaixo do peso");
    else if(result >= 17 && result <= 18.49) JOptionPane.showMessageDialog(null, "IMC: " + f.format(result) + " Situação: Abaixo do peso");
    else if(result >= 18.50 && result <= 24.99) JOptionPane.showMessageDialog(null, "IMC: " + f.format(result) + " Situação: Peso normal");
    else if(result >= 25 && result <= 29.99) JOptionPane.showMessageDialog(null, "IMC: " + f.format(result) + " Situação: Acima do peso"); 
    else if(result >= 30.00 && result <= 34.99) JOptionPane.showMessageDialog(null, "IMC: " + f.format(result) + " Situação: Obesidade I");
    else if(result >= 35.00 && result <= 39.99) JOptionPane.showMessageDialog(null, "IMC: " + f.format(result) + " Situação: Obesidade II");
    else if(result >= 40.00) JOptionPane.showMessageDialog(null, "IMC: " + f.format(result) + " Situação: Obesidade III");
    else JOptionPane.showMessageDialog(null,"Digite um valor VÁLIDO !!!");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    /*  QUADRO DE REFERENCIA - RESULTADOS IMC
//-----------------------------------------------
//[   Resultado  ] 	    [    Situação   ]	
//-----------------------------------------------			
// Abaixo de 17			Muito abaixo do peso
// Entre 17 e 18,49		Abaixo do peso
// Entre 18,50 e 24,99		Peso normal
// Entre 25 e 29,99		Acima do peso
// Entre 30 e 34,99		Obesidade I
// Entre 35 e 39,99		Obesidade II (severa)
// Acima de 40			Obesidade III (mórbida) 
//        
//        
//    
    }
    
}
