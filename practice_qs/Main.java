public class WeatherForecast{
	int KashmirTemp = 15;
	int DelhiTemp = 25;
	int MumbaiTemp = 40;
	

class CheckTemp(int temp){
	
	
	if(temp > 30)
	{
		return "hot";
	}
	else if(temp <= 25)
	{
		return "moderate";
	}
	else
	{
		return "cold";
	}

public static void main(String[] args) {
	
	 System.out.println("City: Kashmir, Temperature: " + KashmirTemp + "°C, Forecast: " );
     System.out.println("City: Delhi, Temperature: " + DelhiTempTemp + "°C, Forecast: " );
     System.out.println("City: Mumbai, Temperature: " + MumbiaTemp + "°C, Forecast: " );
    
}
}
}
