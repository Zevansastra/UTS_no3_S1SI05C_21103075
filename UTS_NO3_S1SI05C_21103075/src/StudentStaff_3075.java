public class StudentStaff_3071 extends Mahasiswa_3071 {
    int unitKerja, jamKerja;
    
    public double totalPendapatan_3071(){
        return (jamKerja * 30000);
    }
    public void tampilDataStudentStaff_3071(){
        super.tampilDataMhs_3071();
        System.out.println(" Unit Kerja : " + unitKerja);
        System.out.println(" Jam Kerja : " +jamKerja);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatan_3071());
    }
}