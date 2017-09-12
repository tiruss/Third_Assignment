
class Soccer extends Sports{

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Soccer Class";
	}

	@Override
	void getNumberOfTeamMembers() {
		// TODO Auto-generated method stub
		System.out.println("Each team has 11 players in " + getName());
	}
}
