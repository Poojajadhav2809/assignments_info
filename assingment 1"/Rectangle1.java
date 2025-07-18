class Rectangle1{
    public static void main (String args[]){
        byte area=96;
        byte breath=8;
        byte length=(byte)(area/breath);
        short perimeter=(short)(2*(length+breath)); 
        System.out.println("length of rectangle "+length);
        System.out.println("perimeter of rectangle "+perimeter);
    }
}