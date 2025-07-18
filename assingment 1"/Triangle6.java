class Triangle6{
    public static void main(String args[]){
         byte rbase=8,rheight=5;
         short area=360,commonmul;
         commonmul=(short)(Math.sqrt(area/(rbase*rheight)));
         System.out.println(commonmul);
         System.out.println("the base of triangle is: "+(rbase*commonmul));
         System.out.println("the height of triangle is: "+(rheight*commonmul));
         
    }
}