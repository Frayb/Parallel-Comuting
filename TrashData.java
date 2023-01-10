import java.text.SimpleDateFormat;
import java.util.Date;

public class TrashData {
	
	String URL;
	String name; 
	String address;
	float latitude;
	float longitude;
	
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	float distance;
	
	
    public String toString() {
        return String.format("URL=%s, name=%s, address=%s, latitude=%f, longitude=%f, distance=%f", 
                this.URL, this.name, this.address, this.latitude, this.longitude, this.distance);
        
    }
    
}
    
