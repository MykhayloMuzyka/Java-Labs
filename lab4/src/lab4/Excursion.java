package lab4;

import java.io.Serializable;
import java.util.ArrayList;

public class Excursion implements Serializable {

    private String date;
    private String time;
    private String duration;
    private String place;
    private String description;
    private ArrayList<String> participants = new ArrayList<>();

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
    	this.date = date;    	
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        	this.time = time;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
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
}
