package person;

import java.util.Objects;

public class PensionFund implements AbleToCalculatePension {

    private String nameFund; //название пенсионного фонда
    private boolean isState; //госсударственный или нет
    private String data; //дата создания
    private int participantsFund; //количество участников фонда

    public PensionFund(String nameFund, boolean nationalFund, String data, int participantsFund) {
        this.nameFund = nameFund;
        this.isState = nationalFund;
        this.data = data;
        this.participantsFund = participantsFund;
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

    public int getParticipantsFund() {
        return participantsFund;
    }

    public void setParticipantsFund(int participantsFund) {
        this.participantsFund = participantsFund;
    }

    public void infoFund() {
        if (isState == true) {
            System.out.println("Фонд используют " + participantsFund / 1000 + " тыс. человек");
        } else {
            System.out.println("Фонд используют " + participantsFund + " человек");
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
        if (participantsFund != that.participantsFund) return false;
        if (!Objects.equals(nameFund, that.nameFund)) return false;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        int result = nameFund != null ? nameFund.hashCode() : 0;
        result = 31 * result + (isState ? 1 : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + participantsFund;
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "nameFund='" + nameFund + '\'' +
                ", nationalFund=" + isState +
                ", data='" + data + '\'' +
                ", participantsFund=" + participantsFund +
                '}';
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

