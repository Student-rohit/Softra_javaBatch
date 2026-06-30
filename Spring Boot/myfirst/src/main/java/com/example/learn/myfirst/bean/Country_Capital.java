package com.example.learn.myfirst.bean;

public class Country_Capital {
	
	//properties
		private String ctry_name;
		private String ctry_cap;
		public Country_Capital() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Country_Capital(String ctry_name, String ctry_cap) {
			super();
			this.ctry_name = ctry_name;
			this.ctry_cap = ctry_cap;
		}
		public String getCtry_name() {
			return ctry_name;
		}
		public void setCtry_name(String ctry_name) {
			this.ctry_name = ctry_name;
		}
		public String getCtry_cap() {
			return ctry_cap;
		}
		public void setCtry_cap(String ctry_cap) {
			this.ctry_cap = ctry_cap;
		}
		@Override
		public String toString() {
			return "Country_Capital [ctry_name=" + ctry_name + ", ctry_cap=" + ctry_cap + "]";
		}
		
		
		

}
