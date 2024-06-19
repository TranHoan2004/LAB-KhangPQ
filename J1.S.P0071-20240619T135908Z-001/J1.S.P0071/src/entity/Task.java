package entity;

public class Task {

    private int id;
    private String name;
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;
    private TypeName getTypeName;
    public static final String FORMAT_DISPLAY = "%3s | %10s | %15s | %15s | %15s | %15s | %15s | %15s";
    public static final String TI_STRING = String.format(FORMAT_DISPLAY, "id", "Name", "Type Name", "Date", "From", "To", "Assignee", "Reviewer");

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public TypeName getGetTypeName() {
        return getTypeName;
    }

    public void setGetTypeName(TypeName getTypeName) {
        this.getTypeName = getTypeName;
    }

    @Override
    public String toString() {
        return String.format(FORMAT_DISPLAY, id, name, getTypeName, date, from, to, assignee, reviewer);
    }

}
