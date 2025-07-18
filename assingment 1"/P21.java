class P21{
    public static void main (String args[]){
      byte brl=15,brb=8,brh=5;
      short brv=(short)(brl*brb*brh);
      byte wlinmeter=15,wbinmeter=10,whinmeter=8;
      short wl=(short)(wlinmeter*100);
      short wb=(short)(wbinmeter*100);
      short wh=(short)(whinmeter*100);
      int wv=(wl*wb*wh);
      int brickreq=(wv/brv);
      System.out.println("number of bricks used to make a wall: "+brickreq);
       
    }
}