public class ATM {
    public int stk;
    public double sodu;

    public ATM(int stk, double sodu) {
        this.stk = stk;
        this.sodu = sodu;
    }

    public int getStk() {
        return stk;
    }

    public double getSodu() {
        return sodu;
    }

    public void setStk(int stk) {
        this.stk = stk;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    @Override
    public String toString() {
        return  "stk=" + stk + ", sodu=" + sodu;
    }

}
