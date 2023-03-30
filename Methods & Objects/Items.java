public class Items {
    int itemNum;
    String itemDesc;
    double unitPrice;
    int quantity;
    
    public Items(int itemNum, String itemDesc, double unitPrice, int quantity){
        this.itemNum = itemNum;
        this.itemDesc = itemDesc;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
} 
    void DisplayItemInfo(){
    System.out.println("Item Number: " + itemNum);
    System.out.println("Item Description: " + itemDesc);
    System.out.println("Price: " + unitPrice);
    System.out.println("Quantity: " + quantity);
    }
    
  void ComputeInventory(int quantity, double unitPrice){
      double inv = quantity * unitPrice;   
      System.out.println("ÏNVENTORY: " + inv);
  }
   
 public static void main(String[] args){
     Items s = new Items(1, "Cellphone", 10000.00, 5);
     
     s.DisplayItemInfo();
     s.ComputeInventory(5, 10000.00);
 }
}
