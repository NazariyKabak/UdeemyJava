package Udemy.Exception.task1;

import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;
    public MagazineLibrary () {
        magazines = new ArrayList<>();
    }

    public MagazineLibrary(ArrayList<Magazine> magazines) {
        this.magazines = magazines;
    }

    public Magazine getMagazines(int index) {
        return new Magazine(magazines.get(index));
    }
    public void setMagazines(int index, Magazine magazine) {
        this.magazines.set(index, magazine);
    }
    public void addMagazine(Magazine magazine) {
        this.magazines.add(new Magazine(magazine));
    }
}
