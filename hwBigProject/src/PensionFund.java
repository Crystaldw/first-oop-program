import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

//Protected
//Классы упаковщики

public class PensionFund {
    private String name;

    private boolean isState;

    private final String dateOfCreation;

    private List<Worker> persons;

    private static Map<DayOfWeek, Boolean> workDays = createWorkDays();

    public static Map<DayOfWeek, Boolean> createWorkDays(){
        Map<DayOfWeek, Boolean> workDays = new HashMap<>();
        workDays.put(DayOfWeek.MONDAY, true);
        workDays.put(DayOfWeek.THURSDAY, true);
        workDays.put(DayOfWeek.WEDNESDAY, true);
        workDays.put(DayOfWeek.TUESDAY, true);
        workDays.put(DayOfWeek.FRIDAY, true);
        workDays.put(DayOfWeek.SATURDAY, true);
        workDays.put(DayOfWeek.SUNDAY, true);
        return workDays;
    }

    public PensionFund(String name, boolean isState, String dateOfCreation, List<Worker> persons) {
        this.name = name;
        this.isState = isState;
        this.dateOfCreation = dateOfCreation;
        this.persons = persons;
        this.workDays = new HashMap<>();
    }
    public PensionFund(String name, boolean isState, String dateOfCreation) {
        this.name = name;
        this.isState = isState;
        this.dateOfCreation = dateOfCreation;
    }

    public PensionFund (String string){
        String[] arrayFunds = string.split(" ");
        this.name = arrayFunds[0] + " " + arrayFunds[1]+ " "+ arrayFunds[2]+" "+arrayFunds[3];
        this.dateOfCreation = arrayFunds[4];
        this.isState = arrayFunds[5].equals("true");
        this.persons = GeneratorWorkers.generateWorkers();

    }

    public Map<DayOfWeek, Boolean> getWorkDays() {
        return workDays;
    }

    public void setWorkDays(Map<DayOfWeek, Boolean> workDays) {
        this.workDays = workDays;
    }

    public List<Worker> getPersons() {
        return persons;
    }

    public void setPersons(List<Worker> persons) {
        this.persons = persons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return isState;
    }

    public void setState(boolean state) {
        isState = state;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return isState == that.isState && Objects.equals(name, that.name) && Objects.equals(dateOfCreation, that.dateOfCreation) && Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isState, dateOfCreation, persons);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", persons=" + persons.size() +
                ", workDays=" + workDays +
                '}';
    }

    public void fundInfo() {
        System.out.println("Имя фонда " + name);

        int count = (persons != null) ? persons.size() : 0;

        if (isState) {
            System.out.println("В фонд вложились человек: " + count / 1000 + " тыс.");
        }
        else {
            System.out.println("В фонд вложились человек: " + count);
        }
    }

    public double calculatePensionFor(AbleToCalculatePension object) {
        if (isState && isWorkDayToday()) {
            return object.calculatePension();
        }
        else {
            return 0.0;
        }
    }

    private boolean isWorkDayToday() {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeekNow = localDate.getDayOfWeek();

        if (workDays == null) {
            return false;
        }

        boolean isWorkDay = workDays.get(dayOfWeekNow);
        return isWorkDay;
    }

    public double calculateMedianPension() {
        if (persons == null || persons.size() == 0) {
            return 0.0;
        }

        double sum = 0.0;

        for (Worker worker : persons) {
            sum += calculatePensionFor(worker);
        }

        return sum / persons.size();
    }

}