/**
 * class Kalkulator
 *
 * @author raihan
 * @version 5.1
 */
public class Kalkulator{
    // op1
    private int op1=0,op2=0;

    
    /**
     * Constructor for objects of class Kalkulator
     * @param  int, int inisialisasi nilai dari op1 dan op2
    */
  
    public Kalkulator()
    {
     //
    
    }
    
    /**
     * Constructor for objects of class Kalkulator
     * @param  int, int inisialisasi nilai dari op1 dan op2
    */
  
    

    
    /**
     * jumlah tanpa parameter
     *
     * @param  
     * @return  int hasil penjumlahan op1 + op2
     */
    public int jumlah(int op1, int op2){
        return op1 + op2;
    }
    
    
    /*
     * kurang tanpa parameter
     *
     * @param  
     * @return  int hasil perkurangan op1 + op2
     *
     */
    
    public int kurang(int op1, int op2) 
    {
        return op1 - op2;
    }
    
    
    /**
     * kali tanpa parameter
     *
     * @param  
     * @return  int hasil Perkalian op1 * op2
     */
    public int kali(int op1, int op2) 
    {
        return op1 * op2;
    }
    
    /**
     * bagi tanpa parameter
     *
     * @param  
     * @return  int hasil Pembagian op1 / op2
     */
    public int bagi(int op1, int op2) 
    {
        return op1 / op2;
    }
    
    
}