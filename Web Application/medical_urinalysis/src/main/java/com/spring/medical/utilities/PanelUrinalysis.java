package com.spring.medical.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.medical.model.Exam;

public class PanelUrinalysis {

	/**
	 * return initial parameters for panel
	 * 
	 * @param exam
	 * @return exam object
	 */
	public Exam getExam(Exam exam) {

		switch (exam.getCode()) {
		case "5767-9":
			exam.setDisplayCode("Appearance of Urine");
			exam.setCode("5767-9");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5767-9.html?sections=Comprehensive");
			break;
		case "5778-6":
			exam.setDisplayCode("Color of Urine");
			exam.setCode("5778-6");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5778-6.html?sections=Comprehensive");
			break;
		case "34533-0":
			exam.setDisplayCode("Odor of Urine");
			exam.setCode("34533-0");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/34533-0.html?sections=Comprehensive");
			break;
		case "32167-9":
			exam.setDisplayCode("Clarity of Urine");
			exam.setCode("32167-9");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/32167-9.html?sections=Comprehensive");
			break;
		case "5792-7":
			exam.setDisplayCode("Glucose [Mass/volume] in Urine by Test strip");
			exam.setCode("5792-7");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5792-7.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "25428-4":
			exam.setDisplayCode("Glucose [Presence] in Urine by Test strip");
			exam.setCode("25428-4");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/25428-4.html?sections=Comprehensive");
			break;
		case "20505-4":
			exam.setDisplayCode("Bilirubin.total [Mass/volume] in Urine by Test strip");
			exam.setCode("20505-4");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/20505-4.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "5770-3":
			exam.setDisplayCode("Bilirubin.total [Presence] in Urine by Test strip");
			exam.setCode("5770-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5770-3.html?sections=Comprehensive");
			break;
		case "5797-6":
			exam.setDisplayCode("Ketones [Mass/volume] in Urine by Test strip");
			exam.setCode("5797-6");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5797-6.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "2514-8":
			exam.setDisplayCode("Ketones [Presence] in Urine by Test strip");
			exam.setCode("2514-8");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2514-8.html?sections=Comprehensive");
			break;
		case "5811-5":
			exam.setDisplayCode("Specific gravity of Urine by Test strip");
			exam.setCode("5811-5");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5811-5.html?sections=Comprehensive");
			break;
		case "5803-2":
			exam.setDisplayCode("pH of Urine by Test strip");
			exam.setCode("5803-2");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5803-2.html?sections=Comprehensive");
			exam.setUnit("pH");
			break;
		case "5804-0":
			exam.setDisplayCode("Protein [Mass/volume] in Urine by Test strip");
			exam.setCode("5804-0");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5804-0.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "20454-5":
			exam.setDisplayCode("Protein [Presence] in Urine by Test strip");
			exam.setCode("20454-5");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/20454-5.html?sections=Comprehensive");
			break;
		case "20405-7":
			exam.setDisplayCode("Urobilinogen [Mass/volume] in Urine by Test strip");
			exam.setCode("20405-7");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/20405-7.html?sections=Comprehensive");
			exam.setUnit("mg/dL");
			break;
		case "5802-4":
			exam.setDisplayCode("Nitrite [Presence] in Urine by Test strip");
			exam.setCode("5802-4");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5802-4.html?sections=Comprehensive");
			break;
		case "5794-3":
			exam.setDisplayCode("Hemoglobin [Presence] in Urine by Test strip");
			exam.setCode("5794-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5794-3.html?sections=Comprehensive");
			break;
		case "5799-2":
			exam.setDisplayCode("Leukocyte esterase [Presence] in Urine by Test strip");
			exam.setCode("5799-2");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5799-2.html?sections=Comprehensive");
			break;
		case "5809-9":
			exam.setDisplayCode("Reducing substances [Presence] in Urine");
			exam.setCode("5809-9");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5809-9.html?sections=Comprehensive");
			break;
		case "58450-8":
			exam.setDisplayCode("Bilirubin [Presence] in Urine by Confirmatory method");
			exam.setCode("58450-8");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/58450-8.html?sections=Comprehensive");
			break;
		}

		return exam;

	}

	/**
	 * 
	 * @return exam name list
	 */
	public List<String> listExam() {

		List<String> listExam = new ArrayList<>();
		listExam.add("5767-9");
		listExam.add("5778-6");
		listExam.add("34533-0");
		listExam.add("32167-9");
		listExam.add("5792-7");
		listExam.add("25428-4");
		listExam.add("20505-4");
		listExam.add("5770-3");
		listExam.add("5797-6");
		listExam.add("2514-8");
		listExam.add("5811-5");
		listExam.add("5803-2");
		listExam.add("5804-0");
		listExam.add("20454-5");
		listExam.add("20405-7");
		listExam.add("5802-4");
		listExam.add("5794-3");
		listExam.add("5799-2");
		listExam.add("5809-9");
		listExam.add("58450-8");
		return listExam;
	}

}
