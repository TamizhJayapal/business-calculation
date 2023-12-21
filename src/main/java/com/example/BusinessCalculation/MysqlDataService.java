package com.example.BusinessCalculation;

import org.springframework.stereotype.Repository;

@Repository
public class MysqlDataService implements DataService {

	@Override
	public int[] reteriveData() {
		return new int[] {1,2,3,4,5};
	}

}
