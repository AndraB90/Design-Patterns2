package chain_of_responsibility.exercitiu2;

public class Bancnota10 extends Bancnota{
    private final int MIN_VALUE = 10;
    @Override
    public void checkAuthority(String bancnotaName, int salar) {
        if (salar / MIN_VALUE > 0){
            grantPayment(bancnotaName, salar);
        }else{
            System.out.println("We are sorry, but the limit is 10");
        }
    }

    @Override
    public void grantPayment(String bancnotaName, int salar) {
        System.out.printf("Bancnota 10 approved payment for %d salar to pay with bancnote %s\n", salar, bancnotaName);
    }
}
