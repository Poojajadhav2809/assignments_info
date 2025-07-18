class P29{
    public static void main (String args[]){
        short flength=800,fbreadth=900;
        byte tside=10;
        int farea=(flength*fbreadth);
        byte tarea=(byte)(tside*tside);
        short numoftiles=(short)(farea/tarea);
        System.out.println("number of tiles required: "+numoftiles);
        
    }
}