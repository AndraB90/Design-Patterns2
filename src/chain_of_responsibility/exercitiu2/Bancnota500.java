package chain_of_responsibility.exercitiu2;

public class Bancnota500 extends Bancnota{
    private final int MIN_VALUE = 500;
    @Override
    public void checkAuthority(String bancnotaName, int salar) {
        if (salar / MIN_VALUE > 0){
            grantPayment(bancnotaName, salar);
        }else{
            System.out.println("We are sorry, but the limit is 500");
        }
    }

    @Override
    public void grantPayment(String bancnotaName, int salar) {
        System.out.printf("Bancnota 500 approved payment for %d salar to pay with bancnote %s\n", salar, bancnotaName);
    }
}
