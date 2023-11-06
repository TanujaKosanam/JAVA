class Employee   //This is employee application
{
         public static void main(String agrs[])
         { 
             String emp_name="tanuja";
             int emp_id=101;
             String emp_designation="manager";
             String emp_phno="9014719755";
             String emp_mail="tanuja@gmail.com";
             System.out.println(emp_name);
             System.out.println(emp_id);
             System.out.println(emp_designation);
             System.out.println(emp_phno);
             System.out.println(emp_mail);
             int emp_salary=45000;
             double bonus;
             if(emp_salary>50000)
             {
                 bonus=(10/100.0)*emp_salary;
                 System.out.println(bonus);
                 System.out.println(bonus+emp_salary);
             }
             else if(emp_salary>40000)
             {
                 bonus=(8/100.0)*emp_salary;
                 System.out.println(bonus);
                 System.out.println(bonus+emp_salary);
             }
             else if(emp_salary>30000)
             {
                 bonus=(6/100.0)*emp_salary;
                 System.out.println(bonus);
                 System.out.println(bonus+emp_salary);
             }
             else if(emp_salary>20000)
             {
                 bonus=(5/100.0)*emp_salary;
                 System.out.println(bonus);
                 System.out.println(bonus+emp_salary);
             }
             else
             {
                  System.out.println("no bonus");
             }
         }
}
         

                        