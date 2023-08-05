package Assignment6;

import java.util.Comparator;

public abstract class NameCompare implements Comparator<Touristnew> {
	@Override
	public int compare(Touristnew o1, Touristnew o2) {

		return o1.getFname().compareToIgnoreCase(o2.getFname());
	}

private static Comparator newNameCompare() {
	// TODO Auto-generated method stub
	return null;
}
}
