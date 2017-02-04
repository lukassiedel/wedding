
private boolean marry(Person bride, Person groom, List<Person> guests){

	long lastCommitmentTime =1491004799000;
	long weddingDate = 1500728400000;
	double longitudeOfChurch = 13.04652;
	double latitudeOfChurch = 51.028978;
	double longitudeOfCastle = 13.669035;
	double latitudeOfCastle = 51.003411;
	boolean married = false;
	boolean allGuestsConfirmed = true;

	for(int i = 0; i < guests.size(); i++){
		Person guest = guests.get(i);
		if(!guest.hasConfirmed())
			allGuestsConfirmed = false;
	}

	if(System.currentTimeMillis()>weddingDate && bride != null && allGuestsConfirmed){
		married = true;
	}

	return married;
}