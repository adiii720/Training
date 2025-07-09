package Multiinheritance;

public class city {


	private String cityName;
	private float area;
	public String getCityName() {
		return cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "city [cityName=" + cityName + ", area=" + area + "]";
	}
	

}
