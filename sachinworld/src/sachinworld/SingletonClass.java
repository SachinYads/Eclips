package sachinworld;

public class SingletonClass {
	//Static member hold only on intsance of the SingletonClass class.
	private  static SingletonClass singletonClass;
	//private constructor
	private SingletonClass() {
		
	}
	//NOw we are going to provide access
	public static SingletonClass getInstance()
	{
		if(singletonClass == null) {
			singletonClass = new SingletonClass();
;
			}
		return singletonClass;
	}

}
