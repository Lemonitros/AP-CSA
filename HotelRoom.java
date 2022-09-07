public class HotelRoom{
    Person guestOne; 
    Boolean guestOneCheckin;
    Person guestTwo;
    Boolean guestTwoCheckin;
    int roomNumber;
    int numberofguests;
    // Creates/Specifies all variables used in this program.

    HotelRoom(int roomNum){
        roomNumber = roomNum;
        guestOneCheckin = false;
        guestTwoCheckin = false;
    }
    //Check-In function (Checks in guests into an assigned room).
    void checkin(Person guest){
        if(guestOneCheckin == false){
        guestOne = guest;
        System.out.println(guest.name + " has checked in!");
        guestOneCheckin = true;
        numberofguests++;
    }
    //Will see if there is another guest already in the room.
        else if(guestTwoCheckin == false){
        guestTwo = guest;
        System.out.println(guest.name + " has checked in!");
        guestTwoCheckin = true;
        numberofguests++;
    }else{
        System.out.println("This room is full already.");
    }

    //Check-Out function (Checks out guests in an assigned room).
    }
    void checkout(Person guest){
        if(guest == guestOne){
            guestOne = null;
            System.out.println(guest.name + " has checked out!");
            guestOneCheckin = false;
            
        }
        else if(guest == guestTwo){
            guestTwo = null;
            System.out.println(guest.name + "has checked out!");
            guestTwoCheckin = false;
        }else{
            System.out.println("This person is not in this room. Perhaps another?");
        }
    }

    //Checks the guest capacity within the specified room.
    int checkCapacity(){
        System.out.println("The number of guests is: " + numberofguests);
        return numberofguests;
    }
    //Prints out the guest information of a specific room.
    void printGuestInfo(Person guest){
        System.out.println("Name: " + guest.name);
        System.out.println("Age: " + guest.age);
        System.out.println("Haircolor: "  + guest.haircolor);
        System.out.println("Height :" + guest.height);

    }
}