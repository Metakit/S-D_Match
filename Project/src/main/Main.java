package main;

import util.Match;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DataMaker dataMaker = new DataMaker();
		dataMaker.setData();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String input_data = gson.toJson(dataMaker.getInputBean());*/
		//System.out.println(input_data);
		Match match = new Match();
		String input_data = match.getInputString("input_data.txt");
		match.initData(input_data);
		match.sortDepartment(match.getDepartments(), 0, match.getDepartments().size()-1);
		match.countStudentScore();
		match.match_DtoS();
		match.getOutputTxt();
	}
	
}
