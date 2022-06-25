package trabalhomatematica;
import java.util.ArrayList;

public class Matrix {
	int rows, cols;
	ArrayList<Double> elements = new ArrayList<Double>();

	// CONSTRUTOR 
	public Matrix(int r, int c, ArrayList<Double> value) {
		this.rows = r;
		this.cols = c;
		this.elements = value;
	}

	// GET
	public Double get(int l, int c) {
		int indice = (l * this.cols) - this.cols;
		indice = (indice + c) - 1;
		return elements.get(indice);
	}
	public ArrayList<Double> getElements() {
		return elements;
	}
	public int getCols() {
		return cols;
	}
	public int getRows() {
		return rows;
	}

	// SET
	public void setElements(ArrayList<Double> elements) {
		this.elements = elements;
	}
	public void set(int l, int c, Double value) {
		int indice = (l * this.cols) - this.cols;
		indice = (indice + c) - 1;
		elements.set(indice, value);
	}
	public void setCols(int cols) {
		this.cols = cols;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}

}
