class Rectangle3{
    public static void main(String args[]){
        short length=300,breadth=150;
        int area=(length*breadth);
        double rateper100msq=6;
        double ratepermsq=rateper100msq/100;
        double costoftiling=(area*ratepermsq);
        System.out.println("the cost of tiling a rectangular plot is: $"+costoftiling);
        


    }
}