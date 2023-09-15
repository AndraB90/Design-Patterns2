package chain_of_responsibility.exercitiu2;

public class SelfPayMachine {
    public static void main(String[] args) {
        Bancnota500 bancnota500 = new Bancnota500();
        Bancnota200 bancnota200 = new Bancnota200();
        Bancnota100 bancnota100 = new Bancnota100();
        Bancnota50 bancnota50 = new Bancnota50();
        Bancnota20 bancnota20 = new Bancnota20();
        Bancnota10 bancnota10 = new Bancnota10();
        Bancnota5 bancnota5 = new Bancnota5();
        Bancnota1 bancnota1 = new Bancnota1();

        bancnota1.setNextBancnote(bancnota5);
        bancnota5.setNextBancnote(bancnota10);
        bancnota10.setNextBancnote(bancnota20);
        bancnota20.setNextBancnote(bancnota50);
        bancnota50.setNextBancnote(bancnota100);
        bancnota100.setNextBancnote(bancnota200);
        bancnota200.setNextBancnote(bancnota500);

        bancnota500.checkAuthority("500", 2500);
        bancnota200.checkAuthority("200", 3500);
    }
}
