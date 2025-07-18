class P32{
    public static void main (String args[]){
      short gside=150,spside=25;
      int totalarea=gside*gside;
      short sparea=(short)(spside*spside);
      int garea=totalarea-sparea;
      System.out.println("area of garden: "+garea);

    }
}