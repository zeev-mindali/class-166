package simple_jave.exam_oop.cls;

public class Grade {
    private String profession;
    private int score;

    public Grade(String profession, int score) {
        setProfession(profession);
        setScore(score);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score <40){
            score=40;
        }
        if (score>100){
            score=100;
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "profession='" + profession + '\'' +
                ", score=" + score +
                "}\n";
    }
}
