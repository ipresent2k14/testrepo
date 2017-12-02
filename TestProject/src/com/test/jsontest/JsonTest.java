package com.test.jsontest;

import com.google.gson.Gson;

public class JsonTest {

	public static void main(String[] args) {
		Gson gson = new Gson();
		String json = "{"+
			"\"name\": \"John\","+
			"\"age\": 27,"+
			"\"interests\": [\"running\", \"guitar\", \"movies\"],"+
			"\"favorites\": [{"+
					"\"color\": \"blue\","+
					"\"book\": \"First: Bach: An Eternal Golden Braid\""+
				"},"+
				"{"+
					"\"color\": \"Yellow\","+
					"\"book\": \"Second: Bach: An Eternal Golden Braid\""+
				"},"+
				"{"+
					"\"color\": \"Green\","+
					"\"book\": \"Third: An Eternal Golden Braid\""+
				"}]"+
		"}";
		Details d = gson.fromJson(json, Details.class);
		System.out.println(d);
	}
}
