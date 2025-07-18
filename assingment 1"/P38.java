class P38{
    public static void main(String args[]){
        short vol=1287;
        byte r=10;
        float height=(float)(vol/(r*r*3.14));
        float sarea=(float)(2*3.14*r*(r+height));
        System.out.println("surface area of the cylinder is:"+sarea);
        
    }
}