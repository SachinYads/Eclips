package sachinworld;

public class StringSearch extends AbstractSearch{
	public  boolean search (Object [] obj_list, Object obj) {
		for(int i=0;i<obj_list.length;i++) {
			if(obj_list[i].toString()==obj.toString()) {
				return true;
			}
	
		}
		return false;
	}


}
