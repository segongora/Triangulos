package com.mayab.calidad.triangulos;

public class Triangulo {
	

	private String tr;
	
	public Triangulo() {
		
	}
	
	public String tipoTriangulo(int A, int B, int C) {
		/*if(A == B && A == C) { this.tr = "Equilatero"; }
		
		if(A == B && A != C) { this.tr = "Isoceles"; }
		if(A == C && A != B) { this.tr = "Isoceles"; }
		if(B == C && B != A) { this.tr = "Isoceles"; }*/
		
		if(A != B && B != C) { this.tr = "Escaleno"; }
		
		return this.tr;
	}
}
