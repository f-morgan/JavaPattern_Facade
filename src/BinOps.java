public class BinOps {
    public String sum(String a, String b) {
        return String.format("%8s",
                Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2)))
                .replace(' ', '0');
    }

    public String mult(String a, String b) {
        return String.format("%8s",
                Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2)))
                .replace(' ', '0');
    }
}