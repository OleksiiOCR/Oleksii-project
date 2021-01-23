public class Guest_Demo {


        public static void main(String[] args) {

            Guest Dustin = new Guest();

            Dustin.firstName = "Dustin";
            Dustin.lastName = "Fuentes";
            Dustin.address = " 118 Maryanne Ave SW Leesburd VA 20175";
            Dustin.phoneNumber = " 559-797-6951";
            Dustin.email = " dFuentes@gmail.com";
            Dustin.plus = 1;
            Dustin.tCount +=2;


            Guest Terry = new Guest();
            Terry.firstName = "Terry" ;
            Terry.lastName= "Sage";
            Terry. email = " tSage@gmail.com";
            Terry.plus = 1;
            Terry.tCount +=2;

            Guest Dima = new Guest ("Dima", "Yurchuk", "D@gmail.come",
                    "571-473-8575");
            Guest.tCount+=2;



            System.out.println(Dima.address);
            System.out.println(Terry.email);

            System.out.println(Guest.tCount);
            System.out.println(Dima);

        }

    }


