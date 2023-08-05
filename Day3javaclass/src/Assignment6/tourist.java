package Assignment6;
import java.util.ArrayList;
	import java.util.Collections;
import java.util.Comparator;
import java.util.List;
	import java.util.Scanner;

	public class tourist {

		public static void main(String[] args) {
			List<Touristnew> touristlist = new ArrayList<Touristnew>();
			touristlist.add(new Touristnew(111, "Sachin", "Aazamgarh"));
			touristlist.add(new Touristnew(211, "Ravi", " varansi"));
			touristlist.add(new Touristnew(325, "sagar", "jaunpur"));
			touristlist.add(new Touristnew(468, "shiv", "Gazipur "));
			touristlist.add(new Touristnew(598, "shanakr", "jaunpur "));
			for (Touristnew tour : touristlist) {
				System.out.println(tour);
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the City");
			String c = sc.nextLine();

			for (int i = 0; i < touristlist.size(); i++) {
				if (touristlist.get(i).getCity().equals(c)) {
					System.out.println(touristlist.get(i));
				}
			}
			System.out.println("sort by name");
			Collections.sort(touristlist, new NameCompare());
			System.out.println(touristlist);
			
			System.out.println("sort by city");
			Collections.sort(touristlist, new CityCompare());
			System.out.println(touristlist);
		}

		
	}

