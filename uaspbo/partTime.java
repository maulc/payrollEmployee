import java.util.Date;

public class partTime extends staff{
  int hours_worked_per_week;

  public partTime(){

  }

  public partTime(String firstName, String lastName, String idNumber, char sex, Date birthDate, double hourlyRate, int hours_worked_per_week){

    super(firstName, lastName, idNumber, sex, birthDate, hourlyRate);

    this.hours_worked_per_week = hours_worked_per_week;
  }

  public int getHours_worked_per_week() {

    return hours_worked_per_week;

    }

  public void setHours_worked_per_week(int hours_worked_per_week) {

        this.hours_worked_per_week = hours_worked_per_week;

    }

    public String toString(){

      return super.toString() + "\nHours worked per month: " + (hours_worked_per_week * 4);

    }

    @Override

    public double monthlyEarning() {

        return hourlyRate * hours_worked_per_week * 4;

    }
}