class Rectangle4{
    public static void main(String args[]){
        short cost=1600;
        byte rate=25;
        byte perimeter=(byte)(cost/rate);
        byte length=20;
        byte breadth=(byte)((perimeter/2)-length);
        short area=(short)(length*breadth);
        System.out.println("perimeter of rectangular park "+perimeter);
        System.out.println("breadth of rectangular park "+breadth);
        System.out.println("area of rectangular park "+area);
    }
}