class Rectangle2{
    public static void main(String args[]){
         byte tlength=13,tbreadth=7;
         short rlength=520,rbreadth=140,numoftiles;
         numoftiles=(short)((rlength*rbreadth)/(tlength*tbreadth));
         System.out.println("number of tiles needed to cover a given rectangular region are "+numoftiles);


    }
}