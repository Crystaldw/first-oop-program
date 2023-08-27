package person;

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
            System.out.println("Фонд используют " + participantsFund + " ТЫСЯЧ человек");
        } else {
            System.out.println("Фонд используют " + participantsFund + " человек");
        }
    }
}
