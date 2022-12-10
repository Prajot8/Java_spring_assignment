package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.IPatient;
@Component
public class Medicine implements IPatient {

	@Override
	public String getMedicineAndBills() {
		
		return "Patient's medicines are :\n1.Azithromicine\n2.Cough syrup";
	}

}
