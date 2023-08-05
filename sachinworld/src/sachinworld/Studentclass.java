package sachinworld;

public class Studentclass {
  private int studentid;
  private String name;
  private String city;
  public Studentclass(int a, String b,String c)
      {
       
      studentid = a;
       name=b;
       city=c;
    		   }

  /**
 * @return the studentid
 */
public int getStudentid() {
	return studentid;
}
/**
 * @param studentid the studentid to set
 */
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Studentclass [studentid=" + studentid + ", name=" + name + ", city=" + city + "]";
}

}
