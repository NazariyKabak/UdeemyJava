package Udemy.MapCollection.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Game {
    private String arena;
    private LocalDate date;

    public Game(String arena) {
        this.arena = arena;
        this.date=LocalDate.now();
    }
    public void begin() {
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("\n - This matchup takes place at the " + this.arena + " arena on " + formattedDate + ".");
    }
}
