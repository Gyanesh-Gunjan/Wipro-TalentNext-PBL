 /*
0 : Emp No
1 : Emp Name
2 : Join Date
3 : Designation Code
4 : Department
5 : Basic
6 : HRA
7 : IT
8 : Designation
9 : DA
 */

public class Project1{
    public static void main(String args[]){
        String Emp_Details[][] = {{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000","Engineer","20000"},
                                  {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000","Consultant","32000"},
                                  {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000","Clerk","12000"},
                                  {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000","Receptionnisht","15000"},
                                  {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000","Manager","40000"},
                                  {"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400","Engineer","20000"},
                                  {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000","Consultant","32000"}
                                };
        if(args.length != 0){
            int found = 0;
            for(int i=0;i<7;i++){
                if(Emp_Details[i][0].equals(args[0])){
                    int Basic = Integer.parseInt(Emp_Details[i][5]);
                    int HRA = Integer.parseInt(Emp_Details[i][6]);
                    int DA = Integer.parseInt(Emp_Details[i][9]);
                    int IT = Integer.parseInt(Emp_Details[i][7]);
                    int sal = Basic + HRA + DA  - IT;
                    System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                    System.out.println(Emp_Details[i][0]+"\t"+Emp_Details[i][1]+"\t\t"+Emp_Details[i][4]+"\t\t"+Emp_Details[i][8]+"\t\t"+sal);
                    found = 1;
                }
            }
            if(found == 0)
                System.out.println("There is not employee with empid : "+args[0]);
        }
        else System.out.println("No Input!");
    }
}