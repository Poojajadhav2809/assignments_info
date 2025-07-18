class p15{
    public static void main(String args[]){
        byte shlength=22,shbreadth=15;
        byte rside=21;
        short sharea=(short)(shlength*shbreadth);
        short rarea=(short)(rside*rside);
        if(sharea>rarea){
            System.out.println("shelly's  garden area is bigger by: "+(sharea-rarea));
        }else if(rarea>sharea){
            System.out.println("richel's garden area is bigger by: "+(rarea-sharea));

        }else{
            System.out.println("both garden are same");
        }
            
        }

    }
