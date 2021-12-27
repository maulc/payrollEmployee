import java.util.Date;

public class staff extends employee {

  double hourlyRate;

    public staff(){

    }

    public staff(String firstName, String lastName, String idNumber, char sex, Date birthDate, double hourlyRate){

      super(firstName, lastName, idNumber, sex, birthDate);

      this.hourlyRate = hourlyRate;
  }
      public double getHourly_rate() {

        return hourlyRate;

    }

    public void setHourly_rate(double hourlyRate) {

        this.hourlyRate = hourlyRate;

    }
    public String toString() {

    String str = super.toString() + "\nMonthly Salary: " + monthlyEarning();

    return str;

    }

    @Override
    public double monthlyEarning(){
        return hourlyRate * payroll.STAFF_MONTHLY_HOURS_WORKED;
    }
}
