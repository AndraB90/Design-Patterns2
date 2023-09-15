package chain_of_responsibility.exercitiu1;

public abstract class Employee {

    //camp care reprezinta urmatorul element din lant

    protected Employee supervisor;

    //metoda care seteaza urmatorul element din lant

    public void setNextSupervisor(Employee supervisor){
        this.supervisor = supervisor;
    }

    public abstract void checkAuthority(String employeeName, int numberOfDays);

    public abstract void grantVacationDays(String employeeName, int numberOfDays);
}
