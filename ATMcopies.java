public class ATMcopies extends ATM{
    public ATMcopies(int stk, double sodu) {
        super(stk, sodu);
    }

    public void napTien(double st){
        sodu += st;
        System.out.println("Số dư tài khoản hiện tại: "+getSodu());
    }
    public void rutTien(double st){
        if(st<=sodu-50){
            System.out.println("Rút tiền thành công.");
            sodu -=st;
            System.out.println("Số dư tài khoản hiện tại: "+getSodu());
        }
        else
            System.out.println("Rút tiền không thành công.");
    }
    public  void chuyenTien(double st){
        if (st<=sodu-50){
            System.out.println("Chuyển tiền thành công.");
            sodu-=st;
            System.out.println("Số dư tài khoản hiện tại: "+getSodu());
        }
        else
            System.out.println("Chuyển tiền không thành công.");
    }
}
