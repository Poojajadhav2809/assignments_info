class P33{
    public static void main(String args[]){
        byte tlength=30,twidth=20,pwidth1=3,pwidth2=4;
        float lenof1part=(float)(tlength-pwidth1)/2;
        float widof1part=(float)(twidth-pwidth2)/2;
        float areaof1part=(lenof1part*widof1part);
        float totalusearea=(4*areaof1part);
        System.out.println("the total usable area of the garden is: "+totalusearea);
    }
}