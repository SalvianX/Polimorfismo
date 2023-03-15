package Operacao;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Principal {
	public static void main(String[]args) {
		Operacao op = null;
		String opcao = "";
		Scanner scan = null;
		while(!opcao.equalsIgnoreCase("0")) {
		System.out.println("Digite A para realizar a adição;\r\n"
				+ "Digite S para realizar a subtração;\r\n"
				+ "Digite M para realizar a multiplicação;\r\n"
				+ "Digite D para realizar a divisão;\r\n"
				+ "Digite 0 (zero) para SAIR;");
		
	        Scanner scan = new Scanner(System.in);
		opcao = scan.next();
		
		
		if(opcao.equalsIgnoreCase("A"))
			op = new Adicao();
		if(opcao.equalsIgnoreCase("S"))
			op = new Subtracao();
		if(opcao.equalsIgnoreCase("M"))
			op = new Multiplicacao();
		if(opcao.equalsIgnoreCase("D"))
			op = new Divisao();
		
		
		String num = "";
		List<Float> numeros = new ArrayList<Float>();
		while(!num.equals("0")) {
			//num = scan.next ();
			num = jOptionPane.showIputDialog("Digite o primeiro:");
			if(!num.equals("0")){
				numeros.add(Float.parsefloat(num));

			}
			if(numeros.size()==2) {
				op.calcular(numeros.get(0), numeros.get(1));
			}
			else if(numeros.size()==3) {
				op.calcular(numeros.get(0), numeros.get(1).numeros.get(2));
			}
			else if(numeros.size()==3) {
				op.calcular(numeros)
			}
					
		}
			
		
	}

}

