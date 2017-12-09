package labwork.block2.theme13.number5;

public class Main {
    public static void main(String[] args) {
        TrainSchedule trainSchedule = new TrainSchedule(5);
        trainSchedule.addTrain(1, "A",
                "B", "11", "22", new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY});
        trainSchedule.addTrain(2, "B",
                "C", "11", "22", new DayOfWeek[]{DayOfWeek.FRIDAY});
        trainSchedule.addTrain(3, "C",
                "D", "11", "22", new DayOfWeek[]{DayOfWeek.THURSDAY});
        trainSchedule.addTrain(4, "A",
                "B", "11", "22", new DayOfWeek[]{DayOfWeek.SATURDAY});
        trainSchedule.addTrain(5, "D",
                "E", "11", "22", new DayOfWeek[]{DayOfWeek.THURSDAY});

        trainSchedule.printTrains();
        System.out.println("****************");
        trainSchedule.searchTrain("A", "B", DayOfWeek.SUNDAY);
    }
}

