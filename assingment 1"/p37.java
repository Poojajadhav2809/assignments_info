class p37{
    public static void main(String args[]){
        short tsa=149;
        byte h=6;
        double a=(double)(2*3.14);
        double b=(double)(2*3.14*h);
        double c=(double)(tsa);
        double dis=Math.sqrt((b*b)-(4*a*(-c)));
        double r1=(-b+dis)/(2*a);
        double r2=(-b-dis)/(2*a);
        double d1=r1+r1;
        double d2=r2+r2;
        if(d1>d2){
            System.out.println("diameter of cylinder:"+d1);
        }else{
            System.out.println("diameter of cylinder:"+d2);
        }
        
    }
}