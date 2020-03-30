package org.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterandSetter {
private List<String> listtitles;

public List<String> getListtitles() {
	return new ArrayList<String>(this.listtitles);
}

public void setListtitles(List<String> listtitles) {
	this.listtitles = new ArrayList<String>(listtitles);
}
public static void main(String[] args) {
	CollectionGetterandSetter app= new CollectionGetterandSetter();
	List<String>listtitles1= new ArrayList<String>();
	listtitles1.add("siva");
	listtitles1.add("ganesh");
	listtitles1.add("sivaganesh");
	
	app.setListtitles(listtitles1);
	listtitles1.set(0, "ramesh");
	System.out.println("Listtitles1 : "+listtitles1);
    List<String>listtitles2=app.getListtitles();
	listtitles2.set(2, "sivaramesh");
    System.out.println("Listtitles2 : "+listtitles2);
	List<String>listtitles3=app.getListtitles();
	System.out.println("Listtitles3 : "+listtitles3);
	
}
}
