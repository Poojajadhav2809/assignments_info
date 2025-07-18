class P34{
    public static void main(String args[]){
         byte base1=92,height=40,walkwidth=4;
         short base2=128;
         float areaoftr=(float)((0.5)*(base1+base2)*height);
         System.out.println(areaoftr);
         short areaofwl=(short)(walkwidth*height);
         float remarea=(float)(areaoftr-areaofwl);
         System.out.println("wodden area after making walkaway: "+remarea);

    }
}