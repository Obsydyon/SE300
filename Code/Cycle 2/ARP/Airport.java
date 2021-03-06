import java.util.HashSet;

/*
 * This class is used as a basis for our Nodes in the graph.
 * Each object will have a name, as well as a list of closures. 
 */

public class Airport {

	private String name;
	private HashSet<Integer> closeBeginList= new HashSet<Integer>();

	private HashSet<Integer> closeEndList= new HashSet<Integer>(); 

	public Airport(String name,Integer closeBegin, Integer closeEnd){

		//this.open = open;
		this.name = name;

		closeBeginList.add(closeBegin);
		closeEndList.add(closeEnd);

	}
	public Airport(String name){
		
		this.name=name;
		
	}

	//getters and setters. Nothing unusual here. 
	
	public String toString(){

		return name;
	}

	public String getCode(){

		return name;
	}

	public HashSet<Integer> getCloseBegin() {
		return closeBeginList;
	}

	public void setCloseBegin(int closeBegin) {
		closeBeginList.add(closeBegin);
	}

	public HashSet<Integer> getCloseEnd() {
		return closeEndList;
	}

	public void setCloseEnd(int closeEnd) {
		closeEndList.add(closeEnd);
	}

	public void setOpenBegin(int openBegin){
		
		//closeEndList.remove(o)
	}
	
	public void setOpenEnd(int openEnd){
		
		
	}


}
