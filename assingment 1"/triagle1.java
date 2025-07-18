class triagle1{
    public static void main(String args[]){
        byte side1=10,side2=9,perimeter=36;
        byte side3=(byte)(perimeter-(side1+side2));
        byte semip=(byte)((side1+side2+side3)/2);
        float area=(float)(Math.sqrt(semip*(semip-side1)*(semip-side2)*(semip-side3)));
        System.out.println("area of triangle is "+area);
        
    }
}