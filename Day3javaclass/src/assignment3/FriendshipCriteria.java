package assignment3;
public class FriendshipCriteria<T,S> implements Comparable<FriendshipCriteria<T, S>>{
	
	private T t;
	private S s;
	public FriendshipCriteria(T t, S s) {
		super();
		this.t = t;
		this.s = s;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public S getS() {
		return s;
	}
	public void setS(S s) {
		this.s = s;
	}
	@Override
	public int compareTo(FriendshipCriteria<T, S> o) {
		if(this.s.equals(o.s)) {
			return 1;
		}
		return 0;
	}
	
	
	
}