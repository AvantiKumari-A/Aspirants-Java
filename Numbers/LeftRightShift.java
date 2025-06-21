public class LeftRightShift {
    public static void main(String[] args) {
        int a=16;
        System.out.println("Left shift: " + (a<<1)); // Left shift = a * 2^shift value = 16 * 2^1 = 16*2 => 32
        System.out.println("Right shift: " + (a>>1)); // Right shift = a / 2^shift value = 16 / 2^1 = 16/2 => 8
    }
}