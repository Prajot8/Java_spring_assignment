package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.IPatient;
@Component
public class Bills implements IPatient {

	@Override
	public String getMedicineAndBills() {
		int a=133,b=68;
		return "Patient's bill is :\n1.Azithromicine\t"+a+"\n2.Cough syrup\t"+b+"\n"
				+ "==================================\n"
				+ "Total =\t"+(a+b);
	}

}
