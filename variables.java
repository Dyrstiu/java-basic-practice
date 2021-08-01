class widening {
    public static void main(String []args){
        int i=4;
        long I=i;//implicit conversion
        float f=i;//implicit conversion
        double d =f;// IMPLICIT CONVERSION
        System.out.println("integer i+"+i);
        System.out.println("long L="+I);
        System.out.println("float f="+f);
        System.out.println("double d ="+d);
        double D = 3.54756;
        float F =(float)D;//explicit comversion
        long L =(long)F;//explicit conversion
        int E= (int)L;// explicit conversion
        System.out.println("Double D ="+D);
        System.out.println("float  F="+F);
        System.out.println("long L="+L);
        System.out.println("integer E="+E);

    }
}