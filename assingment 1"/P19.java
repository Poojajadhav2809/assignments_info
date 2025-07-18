class P19{
    public static void main (String args[]){
      byte cedge=7,cdlength=7,cdbreadth=4,cdheight=8;
      short cvolume=(short)(cedge*cedge*cedge);
      short cdvolume=(short)(cdlength*cdbreadth*cdheight);
      if(cdvolume>cvolume){
        System.out.println("cuboid has more volume ");
      }else{
        System.out.println("cube has more volume");
      }
    }
}