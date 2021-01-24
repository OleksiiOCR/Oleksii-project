import java.util.Scanner;
public class Painting_cost {





        public static void main(String[] args) {





            double rate =0.7;
            Scanner scanner = new Scanner(System.in);
            int numberOfRooms  ;
            System.out.println("Input number of rooms -");
            numberOfRooms = scanner.nextInt();

            double sqft;
            System.out.println("Input totals size of rooms -");
            sqft =  scanner.nextDouble();

            double ceilingHeight ;
            System.out.println("Ceiling height - ");
            ceilingHeight = scanner.nextDouble();







            double roomSqft = roomsqft(sqft, numberOfRooms);
            double perimeter = perimeter(roomSqft);
            double wallsSqFt = wallsSqFt(perimeter, ceilingHeight);
            double totalWallsSqFt = totoalWallsSqFt(numberOfRooms, wallsSqFt);
            double total = paintingCost(rate, totalWallsSqFt);
            System.out.println("Total cost of painting job: " +total + " + cost of paint.");


            //double total = paintingCost();

        }
        public static double roomsqft(double sqft, int numberOfRooms) {
            return (sqft/numberOfRooms);

        }
        public static double perimeter( double roomsqft) {
            return  ((Math.sqrt(roomsqft) ) * 4.0);

        }
        public static double wallsSqFt (double perimeter, double ceilingHeight) {
            return (perimeter*ceilingHeight);
        }
        public static double totoalWallsSqFt (int numberOfRooms, double wallsSqFt ) {
            return (  numberOfRooms* wallsSqFt);
        }
        public static double paintingCost(double rate, double totalWallsSqFt) {
            return rate*totalWallsSqFt;
            //System.out.println("Total cost of painting job is: "+ total);

        }



    }



