package Operacao;

import java.util.List;

public class Multiplicacao extends Operacao{
	public void calcular(float num1, float num2) {
		System.out.println(num1*num2);
	}
	
	public void calcular(float num1, float num2, float num3) {
		System.out.println(num1*num2*num3);

    } 
	
	public void calcular(List<Float>numeros) {
		float resultado = numeros.get(0);
		numeros.remove(0);
		for(float num : numeros) {
			resultado *=num;
		}
		
		System.out.println(resultado);
	}
	
}
