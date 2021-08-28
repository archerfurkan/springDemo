package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// add new fields for email and team
	private String email;
	private String team;

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach : inside setter method - setEmailAddress");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method - setTeam");
		this.team = team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
