import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
class Students {

    @JsonCreator
    public Students(@JsonProperty("name") String name, @JsonProperty("course") int course, @JsonProperty("age") int age ){
this.name = name;
this.course = course;
this.age = age;

    }
    private String name;
    private int course;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", age=" + age +
                '}';
    }
}
