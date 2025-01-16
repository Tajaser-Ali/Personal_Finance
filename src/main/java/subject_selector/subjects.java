package subject_selector;

public class subjects {
    //attributes
    private String group;
    private String level;
    private String subjectName;

    public subjects(String subjectName, String level, String group) {
        this.subjectName = subjectName;
        this.level = level;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return group + " " + subjectName + " " + level + "\n";
    }
}