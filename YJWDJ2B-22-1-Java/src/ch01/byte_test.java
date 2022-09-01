package ch01;

public class byte_test {
    public static void main(String[] args) {
        System.out.println("byte");
        System.out.printf("%d, %d, %d\n", (byte)0b0111_1111, (byte)0b1111_1111, (byte)0b1000_0000);
        System.out.printf("%d, %d, %d\n", (byte)0x7F, (byte)0xFF, (byte)0x80);
        System.out.println();
        System.out.println();
        System.out.println("short");
        System.out.printf("%d, %d, %d\n", (short)0x7FFF, (short)0xFFFF, (short)0x8000);
        System.out.println();
        System.out.println();
        System.out.println("int");
        System.out.printf("%d, %d, %d\n", 0x7FFF_FFFF, 0xFFFF_FFFF, 0x8000_0000);
        System.out.println();
        System.out.println();
        System.out.println("long");
        System.out.printf("%d, %d, %d\n", (long)0x7FFF_FFFF_FFFF_FFFFL, (long)0xFFFF_FFFF_FFFF_FFFFL, (long)0x8000_0000_0000_0000L);
    }
}
