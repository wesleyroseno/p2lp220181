package interfaceoo;

import java.util.ArrayList;
import java.util.List;

public class VitrinePetShop {

	List<AnimalEstimacao> pets;
	
	public VitrinePetShop(){
		pets = new ArrayList<>();
	}
	
	public void adicionaPets(AnimalEstimacao p){
		pets.add(p);
	}
	
	public String serAmigavel(int index){
		return pets.get(index).serAmigavel();
	}
	
	public String brincar(int index){
		return pets.get(index).brincar();
	}

	public static void main(String[] args) {
		VitrinePetShop vitrine = new VitrinePetShop();
		vitrine.adicionaPets(new Gato("luffy"));
		vitrine.adicionaPets(new RoboDog());
		
		System.out.println(vitrine.brincar(0));
		System.out.println(vitrine.brincar(1));
	}
}


