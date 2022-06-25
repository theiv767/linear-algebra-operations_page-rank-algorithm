package trabalhomatematica;

import java.util.ArrayList;

public class LinearAlgebra {

	// MATRIX TRANSPOSE
	public Matrix transpose(Matrix m) {
		ArrayList<Double> elements = new ArrayList<Double>();

		for(int i=0; i<m.getCols();i++) {
			for(int j=i; j<m.getElements().size(); j+=m.getCols()) {
				//System.out.println(m.getElements().get(j));
				elements.add(m.getElements().get(j));
			}
		}

		Matrix transposta = new Matrix(m.cols, m.rows, elements);
		return transposta;
	}

	// VECTOR TRANSPOSE
	public Vector transpose(Vector m) {
		Vector transposta = m;
		return transposta;
	}

	// TIMES
	public Vector times(Matrix a, Vector b) {
		ArrayList<Double> resultado = new ArrayList<Double>();

		for (int i = 0; i < a.getRows() * a.getCols(); i += a.getCols()) {
			Double aux = 0.0;
			for (int j = 0; j < a.getCols(); j++) {
				aux += a.getElements().get(i + j) * b.get(j);
			}
			resultado.add(aux);
		}

		Vector result = new Vector(resultado);
		return result;
	}

	public Matrix times(Matrix a, Matrix b) {
		ArrayList<Double> resultado = new ArrayList<Double>();

		for (int k = 0; k < a.getCols(); k++) {
			for (int i = 0; i < a.getCols(); i++) {
				int cont = 0;
				Double num =0.0;
				for (int j = i; j < b.getElements().size(); j += a.getCols()) {
					num += a.getElements().get(j) * b.getElements().get((k*a.getRows()+cont));
					cont++;
				}
				resultado.add(num);
				
			}
		}

		Matrix result = new Matrix(a.getRows(), b.getCols(), resultado);
		return result;
	}
	
	public Matrix times(Matrix v, Double d) {
		ArrayList<Double> result = new ArrayList<Double>();
		for(Double i : v.getElements()) {
			result.add(i*d);
		}
		return new Matrix(v.getRows(), v.getCols(), result);
	}

	
	
	public Vector times(Vector v, Double d) {
		ArrayList<Double> result = new ArrayList<Double>();
		for(Double i : v.getElements()) {
			result.add(i*d);
		}
		return new Vector(result);
	}

	
	
	// SOMA 
	public Matrix sum(Matrix a, Matrix b) {
		ArrayList<Double> c = new ArrayList<Double>();

		for (int i = 0; i < a.getElements().size(); i++) {
			c.add(a.getElements().get(i) + b.getElements().get(i));
		}

		Matrix result = new Matrix(a.getRows(), b.getCols(), c);
		return result;
	}
	
	
	
	public Vector sum(Vector a, Vector b) {
		ArrayList<Double> c = new ArrayList<Double>();

		for (int i = 0; i < a.getElements().size(); i++) {
			c.add(a.get(i) + b.get(i));
		}

		Vector result = new Vector(c);
		return result;
	}

	public Vector a0(Matrix adj) {
		ArrayList<Double> elements = new ArrayList<>();

		for (int i = 0; i < adj.getCols(); i++) {
			Double aux = 0.0;
			for (int j = 0; j < adj.getElements().size(); j += adj.getCols()) {
				aux += adj.getElements().get(i + j);
			}
			elements.add(aux);
		}

		return new Vector(elements);
	}
	
	public Double normaVector(Vector v) {
		Double aux=0.0;
		for(Double i : v.getElements()) {
			aux += Math.pow(i, 2);
		}
		Double result = Math.sqrt(aux);
		
		return result;
	}
	

}
