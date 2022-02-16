import java.util.Scanner;
public class Main {

    int choose, choose2;
    public void re(){
        Scanner inp = new Scanner(System.in);
        choose2 = inp.nextInt();
        switch (choose2){
            case 1:
                nhap();
                break;
            case 2:
                break;
        }

    }
    public void nhap(){
        double st;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bạn vui lòng lựa chọn giao dịch:");
        choose = inp.nextInt();
        switch (choose){
            case 1:
                System.out.println("Số dư hiện tại của bạn là: ");
                System.out.println("Bạn có muốn tiếp tục giao dịch không \n" +
                        "1. Có\n" +
                        "2. Không");
                re();
                break;
            case 2:

                System.out.println("Bạn vui lòng nhập vào số tiền cần nạp:");
                st = inp.nextInt();
                System.out.println("số tiền được nạp vào tài khoản là:" );
                System.out.println("Bạn có muốn tiếp tục giao dịch không \n" +
                        "1. Có\n" +
                        "2. Không");
                re();
                break;
            case 3:
                System.out.println("Bạn vui lòng nhập vào số tiền cần rút:");
                st = inp.nextInt();
                System.out.println("Rút tiền");
                System.out.println("Bạn có muốn tiếp tục giao dịch không \n" +
                        "1. Có\n" +
                        "2. Không");
                re();
                break;
            case 4:
                System.out.println("Bạn vui lòng nhập vào số tiền cần chuyển:");
                st = inp.nextInt();
                System.out.println("Chuyển tiền");
                System.out.println("Bạn có muốn tiếp tục giao dịch không \n" +
                        "1. Có\n" +
                        "2. Không");
                re();
                break;
        }
    }

    public static void main (String args[]){
        System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI ATM NT");
        System.out.println("1. Kiểm tra số dư tài khoản\n" +
                "2. Nạp tiền vào tại khoản\n" +
                "3. Rút tiền từ tài khoản\n" +
                "4. Chuyển tiền từ tài khoản");
        Main t = new Main();
        t.nhap();
    }
}

