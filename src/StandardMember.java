public class StandardMember extends Member{

    public StandardMember(String firstName, String lastName, String memberID, int age, double height, double weight, String membershipType) {
        super(firstName, lastName, memberID, age, height, weight, membershipType);
    }

    public static final String membershipType = "Standard";

    @Override
    public void workingOut(String duration) {
        System.out.println("Standard member is working out for " + duration + ".");
    }

    @Override
    public void scanning() {
        System.out.println("Welcome " + firstName + " " + lastName + "!" +
                "\n membership type = " + membershipType);
    }

    @Override
    public void buyingProducts(double money) {
        System.out.println("Amount due = " + money +
                "\nYou don't have any discounts!");
    }

    public static StandardMember getStandardMember(){
        String firstName = Values.firstNames.get(
                GeneratorUtils.getRandomNumber(0, Values.firstNames.size() -1)
        );
        String lastName = Values.lastNames.get(
                GeneratorUtils.getRandomNumber(0, Values.lastNames.size() -1)
        );
        String memberId = GeneratorUtils.getMemberId(membershipType);
        int age = GeneratorUtils.getAge();
        double height = GeneratorUtils.getHeight();
        double weight = GeneratorUtils.getWeight();

        return new StandardMember(firstName, lastName, memberId, age, height, weight, membershipType);
    }

    public static void main(String[] args) {
        System.out.println(getStandardMember());
        System.out.println();
        System.out.println(getStandardMember());
        System.out.println();
        System.out.println(getStandardMember());
    }
}
