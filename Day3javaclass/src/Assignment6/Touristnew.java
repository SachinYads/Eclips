package Assignment6;

	public class Touristnew{
		private int id;
		private String fname;
		private String city;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		public Touristnew(int id, String fname, String city) {
			super();
			this.id = id;
			this.fname = fname;
			this.city = city;
		}
	
		
		@Override
		public String toString() {
			return "Tourist [id=" + id + ", fname=" + fname + ", city=" + city + "]";
		}
		
	}
	
	
