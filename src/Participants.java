import java.util.Objects;

public class Participants {
    private String school;
    private String name;
    private String subject;

    public Participants(String school, String name, String subject) {
        this.school = school;
        this.name = name;
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Participants{" +
                "school='" + school + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participants that = (Participants) o;
        return school.equals(that.school) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(school, name);
    }
}
