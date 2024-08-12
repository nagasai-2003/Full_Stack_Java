class Bitwise_Operators{
    public static void main(String[] args) {
        System.out.println(7&13); // 7 = 0000 0111 & 13 = 0000 1101 = 5 Bitwise AND
        System.out.println(7|13); // 7 = 0000 0111 | 13 = 0000 1101 = 15 Bitwise OR
        System.out.println(7^13); // 7 = 0000 0111 ^ 13 = 0000 1101 = 10 Bitwise XOR
        System.out.println(~7); // ~7 = 1111 1000 = -8
        System.out.println(~(-13)); // ~(-13) = 0000 1101 = 13
        System.out.println(13>>1); // 13 = 0000 1101 >> 1 = 0000 0110 = 6
        System.out.println(13>>2); // 13 = 0000 1101 >> 2 = 0000 0011 = 3
        System.out.println(13<<1); // 13 = 0000 1101 << 1 = 0001 1001 = 26
        System.out.println(13<<2); // 13 = 0000 1101 << 2 = 0011 0010 = 52
    }
} 