package Personal_Finance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Expense {

    //attributes
    private String category;
    private String description;
    private double value;
    private LocalDateTime date;
    private static double totalExpenses = 0;

    //constructor
    public Expense(String c, String d, double v, LocalDate date) {
        this.category = c;
        this.description = d;
        this.value = v;
        //this.date = date;
    }

    public void addTotalExpenses() {
        totalExpenses += totalExpenses + value;
    }

    public static double getTotalExpenses() {
        return totalExpenses;
    }

    //toString
    @Override
    public String toString() {
        return date + "\t" + description + "\t $" + value + "\t" + category + "\n";
    }
}