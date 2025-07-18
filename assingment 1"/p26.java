class p26{
    public static void main(String args[]){
        byte lofpathinmeter=120,lofbrick=24,bofbrick=15;
        double bofpathinmeter=2.4;
        float lofpathincm=(float)(lofpathinmeter*100);
        double bofpathincm=(double)(bofpathinmeter*100);
        double numofbricks=(double)(lofpathincm*bofpathincm)/(lofbrick*bofbrick);
        System.out.println("number of bricks required to lay a path: "+numofbricks);
        
    }
}