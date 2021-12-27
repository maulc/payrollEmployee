import java.util.Date;

public class faculty extends employee {
  Level level;
  Education education;

  public faculty(){

  }

  public faculty(String firstName, String lastName, String idNumber, char sex, Date birthDate, Level level, Education education) {

    super(firstName, lastName, idNumber, sex, birthDate);

    this.level = level;
    this.education = education;

  }

    public Level getLevel() {

      return level;

  }

  public void setLevel(Level level) {

      this.level = level;

  }

  public Education getEducation() {

      return education;

  }

  public void setEducation(Education education) {

      this.education = education;

  }

  enum Level{
    AS,

    AO,

    FU
  }

  public String toString() {

    String role = "";

    if (level == Level.AS) {

        role = "Assistant Professor";

    } else if (level == Level.AO) {

        role = "Associate Professor";

    } else if (level == Level.FU) {

        role = "Full Professor";

    }

    String str = super.toString() + "\n" + role + "\nMonthly Salary: " + monthlyEarning();

    return str;

}

  @Override
  public double monthlyEarning(){
    if (level == Level.AS) {

      return payroll.FACULTY_MONTHLY_SALARY;/** return the salary of Assistant proff */

  } else if (level == Level.AO) {

      return (1.5 * payroll.FACULTY_MONTHLY_SALARY); /** return the salary of Assoc proff */

  } else if (level == Level.FU) {

      return (2 * payroll.FACULTY_MONTHLY_SALARY);/** return the salary of full time proff */

  }

  return 0;

  }


}
