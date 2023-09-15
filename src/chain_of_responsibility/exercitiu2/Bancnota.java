package chain_of_responsibility.exercitiu2;

public abstract class Bancnota {

    protected Bancnota superioara;

    public void setNextBancnote(Bancnota superioara){
        this.superioara = superioara;
    }

    public abstract void checkAuthority(String bancnotaName, int salar);

    public abstract void grantPayment(String bancnotaName, int salar);
}
