public class Main {
    public static void main(String[] args) {
        
        Invoice[] Inv = new Invoice[3];
        Inv[0] = new Invoice("Beras", 2, 65000);
        Inv[1] = new Invoice("Minyak", 3, 25000);
        Inv[2] = new Invoice("Gula", 3, 20000);

        Employee Emp = new Employee(111, "Raden", 3000000, Inv);

        System.out.println(Emp);
        System.out.println();

        System.out.println("Detail Belanja : ");
        Emp.TampilInvoice();

        System.out.println("Contoh Polymorfisme : ");
        Payable P;

        P = Emp;
        System.out.println("Gaji Bersih : " + P.GetPayableAmount());

        for (int i = 0; i < Inv.length; i++){
            P = Inv[i];
            System.out.println("Invoice ke-" + (i+1) +  " : " + P.GetPayableAmount());
        }
    }
}
