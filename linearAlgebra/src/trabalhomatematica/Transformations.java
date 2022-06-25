package trabalhomatematica;
import java.util.ArrayList;
import java.util.Arrays;

public class Transformations extends LinearAlgebra{
	
	//Translação
	public Vector translacao2D(Vector value, Vector transformation) {
		return sum(value, transformation);
	}
	public Vector translacao3D(Vector value, Vector transformation) {
		return sum(value, transformation);
		
	}
	
	
	
	
	
	//Rotação-----------------------------------------------------------------------------------------------
	public Vector rotacao2D(Vector value, double angle) {
		ArrayList<Double> aux = new ArrayList<Double>(Arrays.asList (new Double[]{
				
				Math.cos(Math.toRadians(angle)), (-1*Math.sin(Math.toRadians(angle))),
				Math.sin(Math.toRadians(angle)), Math.cos(Math.toRadians(angle)),
				
		}));
		
		Matrix transformation = new Matrix(2,2,aux);
		Vector result = times(transformation, value);
		return result;
		
	}
	public Vector rotacao3DX(Vector value, double angle) {
		ArrayList<Double> aux = new ArrayList<Double>(Arrays.asList (new Double[]{
				1.0, 0.0, 0.0, 0.0,
				0.0, Math.cos(Math.toRadians(angle)), (-1*Math.sin(Math.toRadians(angle))), 0.0,
				0.0, Math.sin(Math.toRadians(angle)), Math.cos(Math.toRadians(angle)), 0.0,
				0.0, 0.0, 0.0, 1.0
		}));
		
		Matrix transformation = new Matrix(4,4,aux);
		value.getElements().add(1.0);
		Vector result = times(transformation, value);
		result.getElements().remove(result.getElements().size() -1);
		return result;
	}
	
	
	
	public Vector rotacao3DY(Vector value, double angle) {
		ArrayList<Double> aux = new ArrayList<Double>(Arrays.asList (new Double[]{
				Math.cos(Math.toRadians(angle)), 0.0, Math.sin(Math.toRadians(angle)), 0.0,
				0.0, 1.0, 0.0, 0.0,
				(-1*Math.sin(Math.toRadians(angle))), 0.0, Math.cos(Math.toRadians(angle)), 0.0,
				0.0, 0.0, 0.0, 1.0
		}));
		
		Matrix transformation = new Matrix(4,4,aux);
		value.getElements().add(1.0);
		Vector result = times(transformation, value);
		result.getElements().remove(result.getElements().size() -1);
		return result;	
		
	}
	
	
	
	public Vector rotacao3DZ(Vector value, double angle) {
		ArrayList<Double> aux = new ArrayList<Double>(Arrays.asList (new Double[]{
				Math.cos(Math.toRadians(angle)), (-1*Math.sin(Math.toRadians(angle))), 0.0, 0.0,
				Math.sin(Math.toRadians(angle)), Math.cos(Math.toRadians(angle)), 0.0, 0.0,
				0.0, 0.0, 1.0, 0.0,
				0.0, 0.0, 0.0, 1.0
		}));
		Matrix transformation = new Matrix(4,4,aux);
		value.getElements().add(1.0);
		Vector result = times(transformation, value);
		result.getElements().remove(result.getElements().size() -1);
		return result;
		
	}
	
	
	
	
	
	
	
	
	//Reflexão-----------------------------------------------------------------
	public Vector reflection2DX(Vector value) {
		ArrayList<Double> aux = new ArrayList<Double>();
		aux.add(-1*value.get(0));
		aux.add(value.get(1));
		
		return new Vector(aux);
	}
	public Vector reflection2DY(Vector value) {
		ArrayList<Double> aux = new ArrayList<Double>();
		aux.add(value.get(0));
		aux.add(-1*value.get(1));
		
		return new Vector(aux);
	}
	public Vector reflection3DX(Vector value) {
		ArrayList<Double> aux = new ArrayList<Double>();
		aux.add(-1*value.get(0));
		aux.add(value.get(1));
		aux.add(value.get(2));
		
		return new Vector(aux);
	}
	public Vector reflection3DY(Vector value) {
		ArrayList<Double> aux = new ArrayList<Double>();
		aux.add(value.get(0));
		aux.add(-1*value.get(1));
		aux.add(value.get(2));
		
		return new Vector(aux);
		
	}
	public Vector reflection3DZ(Vector value) {
		ArrayList<Double> aux = new ArrayList<Double>();
		aux.add(value.get(0));
		aux.add(value.get(1));
		aux.add(-1*value.get(2));
		
		return new Vector(aux);
	}
	
	
	
	
	
	
	
	
	//Projeção--------------------------------------------------------------------------------
	public Vector projection2D(Vector value, Double Sx, Double Sy) {
		ArrayList<Double> aux = new ArrayList<Double>(Arrays.asList (new Double[]{
				Sx, 0.0,
				0.0, Sy,
		}));
		Matrix transformation = new Matrix(2,2,aux);
		Vector result = times(transformation, value);
		return result;
	}
	
	public Vector projection3D(Vector value, Double Sx, Double Sy, Double Sz) {
		ArrayList<Double> aux = new ArrayList<Double>(Arrays.asList (new Double[]{
				Sx, 0.0, 0.0, 0.0,
				0.0, Sy, 0.0, 0.0,
				0.0, 0.0, Sz, 0.0,
				0.0, 0.0, 0.0, 1.0
		}));
		Matrix transformation = new Matrix(4,4,aux);
		value.getElements().add(1.0);
		Vector result = times(transformation, value);
		result.getElements().remove(result.getElements().size() -1);
		return result;
		
	}

}
