package trabalhomatematica;
import java.util.ArrayList;

public class Vector {
    private ArrayList<Double> elements = new ArrayList<Double>();
    
    //CONSTRUTOR
    public Vector(ArrayList<Double> value) {
    	ArrayList<Double> aux = new ArrayList<Double>(value.size());
		for(int i=0; i<value.size(); i++) {
			aux.add(value.get(i)*1.0);
		}
        this.elements = aux;
    }

    
    //GET
    public Double get(int i) {
        return this.elements.get(i);
    }
    
    public ArrayList<Double> getElements() {
    	return elements;
    }
    
    
    //GET TAMANHO
    public int getTamanho() {
        return elements.size();
    }
    

    //SET
    public void set(int index, Double value) {
        this.elements.set(index, value);
    }
	
}
