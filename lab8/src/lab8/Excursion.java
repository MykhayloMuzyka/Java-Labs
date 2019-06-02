package lab8;

import java.io.Serializable;

public class Excursion implements Serializable, Comparable<Excursion>{
	private static final long serialVersionUID = 1L;
	private Date date;
    private String place;
    private String discription;
    Date d = new Date();

    public Excursion(){}

    public Excursion(Date date, String place, String discription){
        this.date = date;
        this.place = place;
        this.discription = discription;
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
	@Override
	public int compareTo(Excursion o) {
		if(this.getPlace().charAt(0) > o.getPlace().charAt(0))
		{
			return 0;
		}
		else
			return -1;
	}

}
