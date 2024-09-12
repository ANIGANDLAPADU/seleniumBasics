package com.selenium.ApachePOI;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFilereader {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader(".\\jsonproperties.json");
		Object object = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) object;
		String str = (String) jsonObject.get("firstName");
		System.out.println(str);
		JSONArray jsonArray = (JSONArray) jsonObject.get("address");
		for (int i = 0; i < jsonArray.size(); i++) {
              JSONObject object1=(JSONObject) jsonArray.get(i);
              String street=(String) object1.get("street");
              System.out.println(street);
		}
	}

}
