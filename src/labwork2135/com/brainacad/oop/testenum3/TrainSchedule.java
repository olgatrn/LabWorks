package labwork2135.com.brainacad.oop.testenum3;

import java.util.Arrays;

public class TrainSchedule {
    public class Train{
        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private DayOfWeek[] daysOfweek;

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

        public DayOfWeek[] getDaysOfweek() {
            return daysOfweek;
        }

        public void setDaysOfweek(DayOfWeek[] daysOfweek) {
            this.daysOfweek = daysOfweek;
        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", daysOfweek=" + Arrays.toString(daysOfweek) +
                    '}';
        }




    }

    private Train[] trains;

    public TrainSchedule(Train[] trains) {
        this.trains = trains;
    }

    public static void addTrain() {

    }
}
