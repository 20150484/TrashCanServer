package application;

import java.util.ArrayList;

public class TrashController {
	TrashDao dao = new TrashDao();
	
	public SInformation TrashSelect(int key) {
		SInformation trash =  dao.findByCode(key);
		return trash;
	}
	
	public ArrayList<SInformation> TrashSearch(String i, String j, String s) {
		ArrayList<SInformation> trashAll = new ArrayList<SInformation>();
		trashAll = dao.search(i,j,s);
		return trashAll;
	}
}
