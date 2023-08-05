package springcollection;

import java.util.List;
import java.util.Map;

public class FilmDirectors {
private Map<Integer,String>direcotrMap;
private List<String>direcorList;
private String message;
/**
 * @return the direcotrMap
 */
public Map<Integer, String> getDirecotrMap() {
	return direcotrMap;
}
/**
 * @param direcotrMap the direcotrMap to set
 */
public void setDirecotrMap(Map<Integer, String> direcotrMap) {
	this.direcotrMap = direcotrMap;
}
/**
 * @return the direcorList
 */
public List<String> getDirecorList() {
	return direcorList;
}
/**
 * @param direcorList the direcorList to set
 */
public void setDirecorList(List<String> direcorList) {
	this.direcorList = direcorList;
}
/**
 * @return the message
 */
public String getMessage() {
	return message;
}
/**
 * @param message the message to set
 */
public void setMessage(String message) {
	this.message = message;
}

}
