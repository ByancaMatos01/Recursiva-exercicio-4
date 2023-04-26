package Controller;

public class ControllerVetNegativo {
	public static int totalnegativo(int []vt, int n) {
		// Condição de parada: quando chegamos ao final do vetor (n == 0)
		if(n==0) {
			return 0;
			
		}else {
			// Caso contrário, contamos os negativos no resto do vetor e adicionamos 1 se o elemento atual for negativo
			 return totalnegativo(vt,n-1)+(vt[n-1]<0? 1:0);
		}
	}
}