package Udemy.oop.Prac1;

public class TransactionManager {
    private Deals [] deals;

    public void addDeal(Deals deals){
        if(this.deals == null){
            this.deals = new Deals[1];
            this.deals[0] = deals;
        }else{
            Deals [] temp = new Deals[this.deals.length+1];
            System.arraycopy(this.deals, 0, temp, 0, this.deals.length);
            temp[temp.length-1] = deals;
            this.deals = temp;
        }
    }

    public void printDeals(){
        for (Deals deal : deals) {
            System.out.println("Deal Name: "+deal.getDealName() + " Sum Price: "+deal.getSumPrice());
        }
    }

}
