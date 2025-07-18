class Triangle7{
    public static void main(String args[]){
        byte hypo=13,perpendicular=12;
        double base=(double)(Math.sqrt((hypo*hypo)-(perpendicular*perpendicular)));
        double area=((base*perpendicular)/2);
        System.out.println("length of the other side is: "+base);
        System.out.println("area of triangle is: "+area);

    }
}