package Ex1.BLL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WantVote {
	private String Nationnalite;
	private Calendar dateNaissance;
	
	public WantVote(String Nat, Calendar dateN ) {
		this.dateNaissance = dateN;
		this.Nationnalite = Nat;
	}
	
	
	
	public boolean CanVoteInFrance(){
		
		if (DiffBetweenBornNNow()>= 18 && ListEligibleFr().contains(Nationnalite) ) {
			return true;
		}
		
		return false;
	}
	
	public boolean CanVoteInEU(){
		if (DiffBetweenBornNNow()>= 18 && ListEligibleEU().contains(Nationnalite) ) {
			return true;
		}
		
		return false;
	}
	
	
private static List<String> ListEligibleFr(){
	List<String> list = new ArrayList<String>();
	for ( NationnaliteEligibleInFrance n : NationnaliteEligibleInFrance.values()) {
		list.add(n.name());
	}
	return list;
}

private static List<String> ListEligibleEU(){
	
	List<String> list = new ArrayList<String>();
	for ( NationnaliteEligibleInEu n : NationnaliteEligibleInEu.values()) {
		list.add(n.name());
	}
	return list;
}

private enum NationnaliteEligibleInFrance {
	française
}


private int DiffBetweenBornNNow() {
	 Calendar b = Calendar.getInstance();
	    Calendar a = this.dateNaissance;
	    int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
	    if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
	        (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DAY_OF_MONTH) > b.get(Calendar.DAY_OF_MONTH))) {
	        diff--;
	    }
	    return diff;
	
}

private enum NationnaliteEligibleInEu {
	autrichienne,
	belge, tchèque,
	chypriote, croate,
	danoise, néerlandaise,
	estonienne, finlandaise,
	française, allemande,
	grecque, hongroise,
	irlandaise, italienne,
	lettonne, lituanienne,
	luxembourgeoise, maltaise,
	polonaise, portugaise,
	slovaque, slovène,
	espagnole, suédoise,
	bulgare, roumaine
}
}
