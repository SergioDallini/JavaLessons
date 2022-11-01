package Calculator;

public class RimNum {
    public static void main(String[] args) {
        System.out.println(Rim.IX.getDec());
        System.out.println(Rim.IX.getRim());
    }
}
    enum Rim {
        I(1, "I"), II(2, "II"), III(3, "III"), IV(4, "IV"), V(5, "V"),
        VI(6, "VI"), VII(7, "VII"), VIII(8, "VII"), IX(9, "IX"), X(10, "X");
        private int dec;
        private String rim;
        Rim(int dec, String rim){
            this.dec = dec;
            this.rim = rim;
        }

        public int getDec() {
            return dec;
        }
        public String getRim() {
            return rim;
        }
    }
