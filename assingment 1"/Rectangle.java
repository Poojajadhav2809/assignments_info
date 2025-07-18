class Rectangle{
    public static void main(String args[]){
        short perimeter=230;
         byte length=70;
         byte breadth;
         breadth=(byte)((perimeter/2)-length);
         short area=(short)(length*breadth);
         System.out.println(" breadth of rectangle is "+breadth);
         System.out.print(" area of rectangle is: "+area);
         

    }
}