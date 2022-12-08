public abstract class Member {

    public Member(String firstName, String lastName, String memberID, int age, double height, double weight, String membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.membershipType = membershipType;
        this.memberID = memberID;
    }

    public String firstName;
    public String lastName;
    public int age;
    public double height;
    public double weight;
    public String membershipType; // Standard or Premium
    public String memberID; // standard member starts with "SD", Premium member is going to start with "PR"
                            // rest of characters are going to be random digits (Total = 20 characters)

    public abstract void workingOut(String duration);
    public abstract void scanning();
    public abstract void buyingProducts(double money); // depending on the membership type there can be %50 discount

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", membershipType='" + membershipType + '\'' +
                ", memberID='" + memberID + '\'' +
                '}';
    }
}
