public class Wedding{

	public void main(StringArgs args[]){
		Person bride = new Person("Anna", "Bauer");
		Person groom = new Person("Lukas", "Siedel");

		if(marry()){
			bride.setName("Siedel");
		}
	}

	private boolean marry(Person bride, Person groom, List<Person> guests){
		long lastCommitmentTime = 1491004799000;
		long weddingDate = 1500728400000;
		GeoPosition church = new GeoPosition(51.028978, 13.04652);
		GeoPosition party = new GeoPosition(51.003411, 13.669035);
		boolean married = false;
		boolean allGuestsConfirmed = true;

		for(int i = 0; i < guests.size(); i++){
			Person guest = guests.get(i);
			if(!guest.hasConfirmed())
				allGuestsConfirmed = false;
			else if(guest.hasCanceled()){
				guests.remove(i);
				i--;
			}
		}

		if(System.currentTimeMillis()>weddingDate && bride != null && allGuestsConfirmed){
			married = true;
		}

		return married;
	}
}