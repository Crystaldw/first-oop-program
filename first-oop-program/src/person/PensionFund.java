package person;

import java.util.Objects;

public class PensionFund {

    private String nameFund; //название пенсионного фонда
    private boolean nationalFund; //госсударственный или нет
    private String data; //дата создания
    private int participantsFund; //количество участников фонда

    public PensionFund(String nameFund, boolean nationalFund, String data, int participantsFund) {
        this.nameFund = nameFund;
        this.nationalFund = nationalFund;
        this.data = data;
        this.participantsFund = participantsFund;
    }

    public String getNameFund() {
        return nameFund;
    }

    public void setNameFund(String nameFund) {
        this.nameFund = nameFund;
    }

    public boolean getNationalFund() {
        return nationalFund;
    }

    public void setNationalFund(boolean nationalFund) {
        this.nationalFund = nationalFund;
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
        if (nationalFund == true) {
            System.out.println("Фонд используют " + participantsFund / 1000 + " тыс. человек");
        } else {
            System.out.println("Фонд используют " + participantsFund + " человек");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (nationalFund != that.nationalFund) return false;
        if (participantsFund != that.participantsFund) return false;
        if (!Objects.equals(nameFund, that.nameFund)) return false;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        int result = nameFund != null ? nameFund.hashCode() : 0;
        result = 31 * result + (nationalFund ? 1 : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + participantsFund;
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "nameFund='" + nameFund + '\'' +
                ", nationalFund=" + nationalFund +
                ", data='" + data + '\'' +
                ", participantsFund=" + participantsFund +
                '}';
    }
}
