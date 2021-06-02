/**
 * class Mahasiswa.
 *
 * @author syahli
 * @version 5.1
 */
public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private int nim;
    private String nama;
    private int umur;
    private String kelas;
    private String alamat;
    
    public Mahasiswa(int nim, int umur, String nama,String kelas, String alamat)
    {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.kelas = kelas;
        this.alamat = alamat;
                
    }
   
    public String getnamaMhs()
    {
         return this.nama;
    }
    
   public int getnimMhs()
    {
         return this.nim;
    }
    
    public int getumurMhs()
    {
         return this.umur;
    }
    
    public String getkelasMhs()
    {
         return this.kelas;
    }
     
    public String getalamatMhs()
    {
         return this.alamat;
    }
    
    public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    


    
}