package person;

import java.util.List;
import java.util.Objects;

public class PensionFund implements AbleToCalculatePension {

    private String nameFund; //название пенсионного фонда
    private boolean isState; //госсударственный или нет
    private String data; //дата создания
    private List<Worker> persons;

    public PensionFund(String nameFund, boolean isState, String data, List<Worker> persons) {
        this.nameFund = nameFund;
        this.isState = isState;
        this.data = data;
        this.persons = persons;
    }

    public List<Worker> getPersons() {
        return persons;
    }

    public void setPersons(List<Worker> persons) {
        this.persons = persons;
    }

    public PensionFund(boolean nationalFund) {
        this.isState = nationalFund;
    }


    public String getNameFund() {
        return nameFund;
    }

    public void setNameFund(String nameFund) {
        this.nameFund = nameFund;
    }

    public boolean getState() {
        return isState;
    }

    public void setState(boolean state) {
        this.isState = state;
    }

    public String getData() {
        return data;
    }

//    public void setData(String data) {
//        this.data = data;
//    }



    public void infoFund() {
        System.out.println("Имя фонда " +nameFund);
        if (isState == true) {
            System.out.println("Фонд используют " + persons.size() / 1000 + " тыс. человек");
        } else {
            System.out.println("Фонд используют " + persons.size() + " человек");
        }
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if(obj == null){
            return 0.0;
        }
        if (isState) {
            return obj.calculatePension();
        } else {
            System.out.println("Деньги из фонда украли");
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (isState != that.isState) return false;
        if (!Objects.equals(nameFund, that.nameFund)) return false;
        if (!Objects.equals(data, that.data)) return false;
        return Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        int result = nameFund != null ? nameFund.hashCode() : 0;
        result = 31 * result + (isState ? 1 : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (persons != null ? persons.hashCode() : 0);
        return result;
    }

    public double calculateMedianPension() {
        if (persons == null || persons.size() == 0) {
            return 0.0;
        }

        double sum = 0.0;
        for (Worker worker : persons) {
            sum += worker.calculatePension();
        }
        return sum/persons.size();

    }

    @Override
    public double calculatePension() {
        return 0;
    }


//    public double calculatePensionFor(AbleToCalculatePension object) {
//        if (isState) {
//            return object.calculatePension();
//        } else {
//            return 0.0;
//        }
    }

