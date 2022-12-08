import java.util.ArrayList;
import java.util.List;

public class Gym {
    public static void main(String[] args) {

        List<StandardMember> standardMembers = new ArrayList<>();
        //3 standard members
        for(int i = 0; i < 3; i++){
            //scan the member
            StandardMember currentMember = StandardMember.getStandardMember();

            currentMember.scanning();
            currentMember.workingOut("30 minutes");
            currentMember.buyingProducts(20.0);
            System.out.println(currentMember);
            System.out.println("----------------------------");
        }


        //3 premium members


    }


}
