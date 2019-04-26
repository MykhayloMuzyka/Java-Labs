package lab5;

import java.io.Serializable;
import java.util.ArrayList;

public class Excursion implements Serializable {
    private String date;
    private String time;
    private int duration;
    private String place;
    private String description;
    private ArrayList<String> participants = new ArrayList<>();
    private int numOfParticipants;

    public String getDate() {
        return date;
    }
    public void setDate(String str) {
    	
    	if(RegularExpressions.matchesDate(str)) {
        	this.date = str;
        }    	
        else {
        	System.out.println("Помилка!!! Невірно введені дані!!!!");          
        }
    }
    public String getTime() {
        return time;
    }
    public void setTime(String str1) {
    	if(RegularExpressions.matchesDate(str1)) {
        	this.date = str1;
        }    	
        else {
        	System.out.println("Помилка!!! Невірно введені дані!!!!");          
        }
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public ArrayList<String> getParticipants() {
        return participants;
    }
    public void setParticipants(String participants) {
        this.participants.add(participants);
    }
    public int getNumOfParticipants() {
        return numOfParticipants;
    }
    public void setNumOfParticipants(int numOfParticipants) {
        this.numOfParticipants = numOfParticipants;
    }
}

