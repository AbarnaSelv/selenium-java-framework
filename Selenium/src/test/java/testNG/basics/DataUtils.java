package testNG.basics;

public class DataUtils { // indices -> interview based 
	@org.testng.annotations.DataProvider(name = "login", indices = {0,1}, parallel = true)// here indices means executing only the given index 
	public String[][] getData() {
		String [][] data = new String[2][2];
		data[0][0] = "abarnaselvaganapathy@gmail.com";
		data[0][1] = "Abharnas$12"; 
		data[1][0] = "";
		data[1][1] =" ";
		return data;
	}

}
// to run multiple
//indices={1,2}
