package operacao;

import java.util.List;

public class Adicao extends Operacao{
	public void calcular(float num1, float num2) {
		System.out.println(num1+num2);
	}
	
	public void calcular(float num1, float num2, float num3) {
		System.out.println(num1+num2+num3);

    } 
	
	
	public void calcular(List<Float>numeros) {
		float soma = 0;
		for(float num : numeros) {
			soma += num;
		}
			
		
		System.out.println(soma);
}
		
	
}

