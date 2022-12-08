public class GeneratorUtils {

    public static int getRandomNumber(int start, int end){
        return (int)(Math.random()*(end - start + 1)) + start;
    }

    public static String getMemberId(String membershipType){
        String memberId = membershipType.equalsIgnoreCase("Standard") ? "SD" : "PR";

        // adding rest of the 18 characters
        for (int i = 0; i < 18 ; i++) {
            // between 0 - 9 (both inclusive)
            memberId += getRandomNumber(0, 9);
        }
        return memberId;
    }

    public static void main(String[] args) {
        System.out.println(getMemberId("Standard"));
        System.out.println(getMemberId("Premium"));
    }

    public static int getAge(){
        return getRandomNumber(14, 100);
    }

    public static double getHeight(){
        // X.XX
        // first part 4-8
        // second part 0-9 -> 0.1 - 0.9
        double height = 0.0;
        height += getRandomNumber(4, 8);
        height += (double) getRandomNumber(0,9)/10;

        return height;
    }

    public static double getWeight(){
        // 9000 - 30000 then divide by 100
        return (double) getRandomNumber(9000, 30000)/100;
    }
}

