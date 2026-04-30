public class Employee implements Payable {
    private int RegistrationNumber;
    private String Name;
    private int SalaryPerMonth;
    private Invoice[] Invoices;

    public Employee(int RegistrationNumber, String Name, int Salary, Invoice[] Invoices){
        this.RegistrationNumber = RegistrationNumber;
        this.Name = Name;
        this.SalaryPerMonth = Salary;
        this.Invoices = Invoices;
    }

    public double GetTotalInvoice(){
        double total = 0;
        for(int i = 0; i < Invoices.length; i++){
            total += Invoices[i].GetPayableAmount();
        }
        return total;
    }

    public double GetPayableAmount(){
        return SalaryPerMonth - GetTotalInvoice();
    }

    public void TampilInvoice(){
        for(int i = 0; i < Invoices.length; i++){
            System.out.println(Invoices[i]);
            System.out.println();
        }
    }

    public String toString(){
        return "ID : " + RegistrationNumber +
               "\nNama : " + Name +
               "\nGaji Awal : " + SalaryPerMonth +
               "\nTotal Belanja : " + GetTotalInvoice() +
               "\nGaji Bersih : " + GetPayableAmount();
    }
}