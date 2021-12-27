import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class testProgram {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yy"); /* this is used to parse a Date from String text */

        employee[] epl = new employee[9];/* an array of Employees (Staff,Faculty,Partime) */

        try {

            epl[0] = new staff("Ahmad", "Shihabudin", "331", 'M', sdf.parse("3/03/89"), 40.00);

            epl[1] = new staff("Maula", "Cahya", "567", 'F', sdf.parse("24/06/85"),60.00);

            epl[2] = new staff("Refandah", "Puspitasari", "112", 'F', sdf.parse("8/12/90"), 40.00);

            epl[3] = new faculty("Sultan", "Triabidin", "333", 'M', sdf.parse("7/08/74"), faculty.Level.FU, new Education("Ph.D", "Engineering", 3));

            epl[4] = new faculty("Ridhotul", "Maulidia", "988", 'F', sdf.parse("6/06/76"), faculty.Level.AO, new Education("Ph.D", "English", 1));

            epl[5] = new faculty("Kinasih", "Widi", "555", 'F', sdf.parse("08/09/79"), faculty.Level.AS,
                    new Education("MS", "Physical Education", 0));

            epl[6] = new partTime("Rendy", "Pratama", "173", 'M', sdf.parse("8/10/77"), 45.00, 20);

            epl[7] = new partTime("Bela", "Dwi", "890", 'F', sdf.parse("9/05/77"), 40.00, 20);

            epl[8] = new partTime("Mark", "Zurkerberg", "890", 'M', sdf.parse("11/24/88"), 20.00, 35);

            System.out.println("Employee Info in ascending order of employee id\n");

            Collections.sort(Arrays.asList(epl), new Comparator<employee>() {

                public int compare(employee o1, employee o2) {

                    return o1.getIdnumber().compareToIgnoreCase(o2.getIdnumber());

                }

            });

            for (employee emp : epl) {

                System.out.println(emp.toString());

                System.out.println("");

            }

            System.out.println("STAFF\n");

            for (employee emp : epl) {

                if (emp.getClass() == staff.class) { /* checking if its a Staff object */

                    System.out.println(emp.toString());

                    System.out.println("---");

                }

            }

            System.out.println();

            System.out.println("FACULTY\n");

            for (employee emp : epl) {

                if (emp.getClass() == faculty.class) { /* checking if its a Faculty object */

                    System.out.println(emp.toString());

                    System.out.println("---");

                }

            }

            System.out.println();

            System.out.println("PART TIME\n");

            for (employee emp : epl) {

                if (emp.getClass() == partTime.class) { /* checking if its a Partime object */

                    System.out.println(emp.toString());

                    System.out.println("---");

                }

            }

            float total_salary_all_employees = 0;

            float total_salary_partime_employees = 0;

            for (employee emp : epl) {

                if (emp.getClass() == partTime.class) { /* checking if its a Partime object */

                    total_salary_partime_employees += emp.monthlyEarning();

                }

                total_salary_all_employees += emp.monthlyEarning();

            }

            System.out.println("\nTotal salary of all part time employees: " + total_salary_partime_employees);

            System.out.println("Total Salary : " + total_salary_all_employees);

        } catch (ParseException e) {

            e.printStackTrace();

        }

    }

}
