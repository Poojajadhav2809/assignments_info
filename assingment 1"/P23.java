class P23{
    public static void main (String args[]){
       byte crl=15,crb=9,crh=12;
       short crv=(short)(crl*crb*crh);
       byte cside=3,cv;
       cv=(byte)(cside*cside*cside);
       byte numofcube=(byte)(crv/cv);
       System.out.println("number of cubical boxes accommodated in carton is: "+numofcube); 
    }
}