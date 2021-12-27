import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class employee{
      private String firstName, lastName, idNumber;
      private char sex;
      private Date birthDate;

          /* default contructor*/
        public employee(){

        }
        /* parameterized contructor*/
        public employee(String firstName, String lastName, String idNumber, char sex, Date birthDate){
          this.firstName = firstName;
          this.lastName = lastName;
          this.idNumber = idNumber;
          this.sex = sex;
          this.birthDate = birthDate;
    }

    public String toString(){

      SimpleDateFormat date = new SimpleDateFormat("mm/dd/yy");
      String str = "ID Employee Number: " + idNumber + "\nEmployee Name: " + firstName + " " + lastName + "\nBirth Date: " + date.format(birthDate);

      return str;
    }

    public String getFirstname(){
      return firstName;
    }

    public void setFirstname(String firstName){
      this.firstName = firstName;
    }

    public String getLastname(){
      return lastName;
    }

    public void setLastname(String lastName){
      this.lastName = lastName;
    }

    public String getIdnumber() {

      return idNumber;

  }

  public void setIdnumber(String idNumber) {

      this.idNumber = idNumber;

  }

  public char getSex() {

      return sex;

  }

  public void setSex(char sex) {

      this.sex = sex;

  }

  public Date getBirthdate() {

      return birthDate;

  }

  public void setBirthdate(Date birthDate) 
  {
      this.birthDate = birthDate;

  }

  public abstract double monthlyEarning();

}

