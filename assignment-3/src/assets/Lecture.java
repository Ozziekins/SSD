package assets;

import java.time.LocalDateTime;
import java.util.Random;

public class Lecture extends Parameter {
    private String lectureID;
    private LocalDateTime dateTime;
    private int duration;
    private String parentID;
    private String tutorID;
    private boolean demo;

    public String getLectureID() {
        return this.lectureID;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getParentID() {
        return this.parentID;
    }

    public String getTutorID() {
        return this.tutorID;
    }

    public boolean isDemo() {
        return this.demo;
    }

    public String createLecture(String tutorID, String parentID, LocalDateTime dateTime, int duration, boolean demo) {
        this.lectureID = assignLectureID();
        this.dateTime = dateTime;
        this.duration = duration;
        this.parentID = parentID;
        this.tutorID = tutorID;
        this.demo = demo;

        return this.lectureID;
    }

    public String assignLectureID() {
        Random rand = new Random();
        double drandom = rand.nextDouble();
        return Double.toString(drandom);
    }

}
