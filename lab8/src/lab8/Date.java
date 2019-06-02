package lab8;

import java.io.Serializable;

public class Date implements Serializable{
	private static final long serialVersionUID = 1L;
	private String data;
    private String startTime;
    private int duration;


    public Date(){}

    public Date(String data, String startTime, int duration){
        this.data = data;
        this.startTime = startTime;
        this.duration = duration;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString(){
        String str = "Date of excurse: "+data +"\nStart time:"+startTime+"\nDuration: "+duration+" minutes";
        return str;
}
}
