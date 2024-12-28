package Udemy.Exception.task1;

import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines = new ArrayList<>();

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        return new Magazine(magazines.get(index));
    }

    public void setMagazines(Magazine magazine, int index) {
        magazines.set(index, new Magazine(magazine));
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(new Magazine(magazine));
    }
}
