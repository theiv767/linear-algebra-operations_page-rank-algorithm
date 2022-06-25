package trabalhomatematica;

public class Site implements Comparable<Site> {
	private String nome;
	private Double autoridade;
	
	public Site(String nome, Double autoridade){
		this.nome = nome+": ";
		this.autoridade = autoridade;
	
	}

	public String getNome() {
		return nome;
	}
	
	public Double getAutoridade() {
		return autoridade;
	}

	@Override
	public int compareTo(Site p) {
		if(this.autoridade > p.getAutoridade()){
			return 1;
		}
		return -1;
	}
	
	
}
