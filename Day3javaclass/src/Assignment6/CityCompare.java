package Assignment6;

import java.util.Comparator;

public abstract class CityCompare implements Comparator<Touristnew> {

	@Override
	public int compare(Touristnew o1, Touristnew o2) {
		
		return o1.getCity().compareToIgnoreCase(o2.getCity());
	}
	private static Comparator newCityCompare() {
		// TODO Auto-generated method stub
		return null;
	}
}
