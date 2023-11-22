package latihan;

class MotorMatic extends Motor {
    private boolean hematBahanBakar;

    public MotorMatic(String merk, int tahun, boolean hematBahanBakar) {
            super(merk, tahun);
            this.hematBahanBakar = hematBahanBakar;
        }

        public void tampilkaninfo() {
            String hemat = hematBahanBakar ? "Hemat" : "Tidak hemat";
            System.out.println("Ini adalah motor matic " + merk + " yang " + hemat + " Bahan bakar");
            System.out.println("Tahun: " + tahun);
        }
}
