public class Driver {
    public static void main(String[] args){

        Group group = new Group();
        group.addMemberToArray("Bob Jones",29);
        group.addMemberToArray("Susan Little",23);
        group.addMemberToArray("Kathy White",21);
        group.addMemberToArray("John Smith",27);
        group.addMemberToArray("Mike Ross",48);
        group.addMemberToArray("Jennifer Hunt",32);
        group.addMemberToArray("WalterBrown",55);
        group.addMemberToArray("Samantha Goings",47);
        group.addMemberToArray("Steve Barber",86);
        group.addMemberToArray("Terry Manson",37);

        System.out.println("The average age of the group is: "+group.findAverage());
        System.out.println("-------------------------------------");
        group.callQuickSort();
        group.printArray();


    }
}
