//NOMOR 2
package prak_pbo;

public class Nilai {
	String nama,NPM;
	int nilaiAbsen,nilaiTugas,nilaiUTS,nilaiUAS;
    float nilaiAkhir;

    public void nilai (){
    	 nilaiAkhir = (nilaiAbsen * 0.1f) + (nilaiTugas * 0.2f) + (nilaiUTS * 0.3f) + (nilaiUAS * 0.4f);
    }
    public void cetakNilai() {
    	System.out.println("Nama : " + nama);
    	System.out.println("NPM : " + NPM);
        System.out.println("Nilai Absen[10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}