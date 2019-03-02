package jobClient.IndeedAPI;



import java.util.List;

import org.json.JSONObject;

import entity.Item;
import jobClient.IndeedAPI.IndeedAPI;


public class IndeedTest {
	
	public static void main(String[] args) {
		IndeedAPI ga = new IndeedAPI();
		List<Item> results = ga.search("San Jose", " Software  Engineer", "Facebook");
		for (int i = 0; i < results.size(); i++) {
			
			System.out.println(results.get(i).toJSONObject());
		}
		
		try {
			System.out.println("find " + results.size() + " job results!");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

