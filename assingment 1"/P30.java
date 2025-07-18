class P30{
    public static void main (String args[]){
      byte tl=5,tb=8;
      short fl=200,fb=400;
      int areaf=fl*fb;
      byte areat=(byte)(tl*tb);
      int numoftiles=areaf/areat;
      System.out.println("number of tiles: "+numoftiles);

    }
}