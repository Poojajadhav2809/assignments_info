class P24{
    public static void main (String args[]){
       byte brl=25,brh=10,wlinmeter=20,whinmeter=2;
       float brb=7.5f,wbinmeter=0.75f; 
       float brv=brl*brb*brh;
       short wl=(short)(wlinmeter*100);
       short wh=(short)(whinmeter*100);
       short wb=(short)(wbinmeter*100);
       int wv=(wl*wh*wb);
       float numofbrick=wv/brv;
       System.out.println("number of bricks needed: "+numofbrick);
       float cost=(numofbrick*900)/1000;
       System.out.println("total cost: $"+cost);
       
    }
}