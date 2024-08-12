class Type_Casting{
    public static void main(String[] args) {
        // Type Casting
        // Implicit Type Casting or Automatic Type Casting or Widening
        int inti = 100;
        System.out.println(inti);
        double doublei = inti;
        System.out.println(doublei);
        double doublei2 = 142.014;
        System.out.println(inti+doublei2);

        // Explicit Type Casting or Manual Type Casting or Narrowing 
        System.out.println(doublei2);
        int inti2 = (int)doublei2; // 142
        System.out.println(inti2);
    }
}