package student;


import java.util.Arrays;

public class Student {
    String name;
    String lastname;
    int studyYear;
    String group;
    float[] averages;

    public Student(String name, String lastname, int studyYear, String group) {
        this.name = name;
        this.lastname = lastname;
        this.studyYear = studyYear;
        this.group = group;
        this.averages = new float[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float[] getAverages() {
        return averages;
    }

    public void setAverages(float[] averages) {
        this.averages = averages;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", studyYear=" + studyYear +
                ", group='" + group + '\'' +
                ", averages=" + Arrays.toString(averages);
    }
}
