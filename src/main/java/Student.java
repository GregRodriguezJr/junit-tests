import java.util.ArrayList;

public class Student {
    public String name;
    public long id;
    public ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return  total / grades.size();
    }
}
