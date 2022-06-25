package trabalhomatematica;
import java.util.Comparator;

public class ComparatorGeral implements Comparator<Site> {

	@Override
	public int compare(Site s1, Site s2) {
		
		
		if(s1.getAutoridade() > s2.getAutoridade()) {
			return -1;
		}
		else {
			return 1;
		}
	}


}
