package com.BWash.myoasis_v1.sample;

import com.BWash.myoasis_v1.User_Profile_View;
import com.BWash.myoasis_v1.dataItems.User_PI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {
	// A list of Profiles
	public static List<User_PI> dataItemList;
	public static Map<String, User_PI> dataItemMap;

	static{
		dataItemList = new ArrayList<>();
		dataItemMap = new HashMap<>();

		addItem(new User_PI(null,"Brandon","Washington","BWash","105 Dreamland way",
				"Greenville","SC",29609,15,"bwashinsurance@gmail.com",864-559-1162,
				07-10-1981,"",true,true));

	}

	private static void addItem (User_PI user_pi){
		dataItemList.add(user_pi);
		dataItemMap.put(user_pi.getProfile_number(), user_pi);

	}

}
