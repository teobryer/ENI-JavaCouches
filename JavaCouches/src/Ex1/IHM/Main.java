package Ex1.IHM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

import Ex1.BLL.WantVote;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Bonjour");
		System.out.println("Veuillez indiquer votre jour de naissance :");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int day =Integer.parseInt(in.readLine());
		
	System.out.println("Veuillez indiquer votre mois de naissance :");
	int month = Integer.parseInt(in.readLine());
	
	System.out.println("Veuillez indiquer votre année de naissance :");
	int year =  Integer.parseInt(in.readLine());
	
	
	System.out.println("Veuillez indiquer votre nationalité :");
	String nat = in.readLine();
	
	Calendar dateN = Calendar.getInstance();
	dateN.set(year, month, day);
	WantVote personn = new WantVote(nat,dateN);
	
	System.out.println((personn.CanVoteInFrance()? "Peut " :"Ne peut ") +(personn.CanVoteInFrance()? "" :"pas ") +"voter en France");
	System.out.println((personn.CanVoteInEU()? "Peut " :"Ne peut ") +(personn.CanVoteInEU()? "" :"pas ") +"voter en UE");
	
	}

}
