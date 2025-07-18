class P43{
    public static void main (String args[]){
        byte height=4,sheight=5;
        byte radius=(byte)(Math.sqrt(sheight*sheight-height*height));
        float areaofbase=(float)(radius*radius*3.14);
        float cost=(float)(areaofbase*10);
        System.out.println("the cost of polishing the base of cone is: "+cost);
        
    }
}