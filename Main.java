package latihan;
// hapus package

class MotorSport extends Motor {
    private String tipe;

    public MotorSport(String merk, int tahun, String tipe) {
        super(merk, tahun);
        this.tipe = tipe;
    }


    


    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Ini adalah motorSport " + merk + " " + tipe + " tipe");
        System.out.println("Tahun: " + tahun);
    }
}


public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Yamaha", 2022);
        System.out.println("Merk motor komeng: " + motor1.getMerk());
        System.out.println("Tahun motor komeng: " + motor1.getTahun());

        Motor motor2 = new Motor("Honda", 2000);
        motor2.setTahun(2000);

        motor1.perikasKondisi(true);

        Motor sport = new MotorSport("Kawasaki", 2019, "Ninja");
        Motor matic = new MotorMatic("Honda", 2019, true);

        Motor[] motors = {sport, matic} ;

        for (Motor motor : motors) {
            System.out.println("------------------------------------------");
            motor.tampilkaninfo();
        }
        System.out.println("--------------------------------------------");
    }
}