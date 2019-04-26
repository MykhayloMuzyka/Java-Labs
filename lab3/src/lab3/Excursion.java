package lab3;

public class Excursion {
    private Date date;
    private String place;
    private String discription;
    private String members;

    public Excursion(){}

    public Excursion(Date date, String place, String discription, String members ){
        this.date = date;
        this.place = place;
        this.discription = discription;
        this.members = members;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getDiscription() {
        return discription;
    }
    public void setDiscription(String discruption) {
        this.discription = discruption;
    }
    public String getMembers() {
        return members;
    }
    public void setMembers(String members) {
        this.members = members;
    }
}