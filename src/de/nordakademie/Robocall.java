package de.nordakademie;

import java.util.ArrayList;
import java.util.List;

public class Robocall {

	public static void main(String[] args) {
		List<Client> clients = new ArrayList<>() {{
			   add(new Client(20,Sex.MALE,new TelephoneNumber()));	
			   add(new Client(16,Sex.MALE, new TelephoneNumber()));	
			   add(new Client(21, Sex.FEMALE, new TelephoneNumber()));	
		}};
		
		new Robocall().call(clients);
	}
	
	
	
  private void call(List<Client> clients) {
		for(Client client: clients){
			if (client.getAge()>=17){
				TelephoneNumber number = client.getTel();
				robocall(number); 
			}
		}
		
	}



public static void robocall(TelephoneNumber t) {
	  System.out.println(t);
  }
}
