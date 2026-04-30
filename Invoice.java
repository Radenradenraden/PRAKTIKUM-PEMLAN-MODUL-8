public class Invoice implements Payable {
    private String ProductName;
    private int Quantity;
    private int PricePerItem;

    public Invoice (String ProductName, int Quantity, int PricePerItem){
        this.ProductName = ProductName;
        this.Quantity = Quantity;
        this.PricePerItem = PricePerItem;
    }

    public double GetPayableAmount(){
        return Quantity*PricePerItem;
    }

    public String toString(){
        return "Produk : " + ProductName +
               "\nQty    : " + Quantity +
               "\nHarga  : " + PricePerItem +
               "\nTotal  : " + GetPayableAmount();
    }
}
