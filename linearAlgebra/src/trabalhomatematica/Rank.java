package trabalhomatematica;
import java.util.ArrayList;
import java.util.Collections;

public class Rank {
	ArrayList<Site> sites = new ArrayList<Site>();
	
	public void addElement(Site value) {
		sites.add(value);
	}
	
	public ArrayList<Site> getSites() {
		return sites;
	}
	
	public ArrayList<Site> sortSites(){
		Collections.sort(sites, new ComparatorGeral());
		return sites;
	}

}
