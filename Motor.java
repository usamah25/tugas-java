package latihan;

public class Motor {
    protected final String merk;
    protected int tahun;

    public Motor(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void tampilkaninfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
    
    public void setTahun(int tahun) {
        if(tahun >= 0) {
            this.tahun = tahun;
        } else {
            System.out.println("Tahun tidak valid");
        }
    }

public void periksaKondisi() {
    System.out.println("Mengecek kondisi motor...");
    if (cekMesin() && cekOli()) {
        System.out.println("Kondisi motor baik.");
    } else {
        System.out.println("Ada masalah pada motor");
    }
}

public void perikasKondisi(boolean printInfo) {
    periksaKondisi();
    if (printInfo) {
        tampilkaninfo();
    }
}

private boolean cekMesin() {
    System.out.println("Memeriksa mesin...");
    return true;
}

private boolean cekOli() {
    System.out.println("Memeriksa oli...");
    return true;
    }
}

