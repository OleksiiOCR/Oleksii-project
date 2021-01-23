public class Guest {



        public String firstName;
        public String lastName;
        public String phoneNumber;
        public String email;
        public String address;
        public int plus;
        public static int tCount;


        public Guest (String firstName,String lastName, String email, String phoneNumber ) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }
        public Guest() {
        }

        @Override
        public String toString() {
            return "Guest{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", email='" + email + '\'' +
                    ", address='" + address + '\'' +
                    ", plus=" + plus +
                    '}';
        }
    }


