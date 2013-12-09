package ss.week3.hotel;

import ss.week3.hotel.Format;

public class MakeItem implements Bill.Item {
        private String item;
        private double amount;
        
        public MakeItem(String item, double amount) {
                this.item = item;
                this.amount = amount;
        }
        
        public String toString() {
                return Format.printLine(item, getAmount());
        }

        public double getAmount() {
                return amount;
        }
}