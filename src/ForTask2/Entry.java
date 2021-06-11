package ForTask2;

public class Entry implements Comparable <Entry>{
    private String surname;
    private int phoneNumber;

    public Entry(String surname, int phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Entry o) {
        return this.surname.compareTo(o.surname);
    }
}
