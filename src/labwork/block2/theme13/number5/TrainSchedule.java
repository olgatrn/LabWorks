package labwork.block2.theme13.number5;

import java.util.Arrays;
import java.util.Scanner;

public class TrainSchedule {
    public class Train {
        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private DayOfWeek[] days;

        public Train(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDays() {
            return days;
        }

        public void setDays(DayOfWeek[] days) {
            this.days = days;
        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + Arrays.toString(days) +
                    '}';
        }
    }

    private Train[] trains;

    public TrainSchedule(int sizeOfShedule) {
        trains = new Train[sizeOfShedule];
    }

    public void addTrain() {
        System.out.println("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Enter a stationDispatch: ");
        String stationDispatch = new Scanner(System.in).nextLine();
        System.out.println("Enter a stationArrival: ");
        String stationArrival = new Scanner(System.in).nextLine();
        System.out.println("Enter a timeDispatch: ");
        String timeDispatch = new Scanner(System.in).nextLine();
        System.out.println("Enter a timeArrival: ");
        String timeArrival = new Scanner(System.in).nextLine();
        System.out.println("Enter the days (using capital letters without any commas): ");
        String daysInString = new Scanner(System.in).nextLine();

        Train train = new Train(number);
        train.setStationDispatch(stationDispatch);
        train.setStationArrival(stationArrival);
        train.setTimeDispatch(timeDispatch);
        train.setTimeArrival(timeArrival);
        String[] daysArray = daysInString.split(" ");
        train.days = new DayOfWeek[daysInString.split(" ").length];
        for (int i = 0; i < train.days.length; i++) {
            train.days[i] = DayOfWeek.valueOf(daysArray[i].trim());
        }
        for (int i = 0; i < trains.length; i++) {
            if (trains[i] == null) {
                trains[i] = train;
                break;
            }
        }
    }

    public void addTrain(int number, String stationDispatch, String stationArrival, String timeDispatch, String timeArrival, DayOfWeek[] days) {
        Train train = new Train(number);
        train.setStationDispatch(stationDispatch);
        train.setStationArrival(stationArrival);
        train.setTimeDispatch(timeDispatch);
        train.setTimeArrival(timeArrival);
        train.setDays(days);
        for (int i = 0; i < trains.length; i++) {
            if (trains[i] == null) {
                trains[i] = train;
                break;
            }
        }
    }

    public void printTrains() {
        for (Train train : trains) {
            System.out.println(train.toString());
        }
    }

    public void searchTrain(String stationDispatch, String stationArrival, DayOfWeek day) {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getStationDispatch().equals(stationDispatch) & trains[i].getStationArrival().equals(stationArrival)) {
                for (int i1 = 0; i1 < trains[i].days.length; i1++) {
                    if (trains[i].days[i1].ordinal() > day.ordinal()) {
                        System.out.println(trains[i]);
                        break;
                    }
                }
            }
        }
    }
}
