public class Employee {
    private String fullName;
    private String job;
    private String email;
    private String phoneNumber;
    private Integer salary;
    private Integer age;

    public Employee(String fullName, String job, String email, String phoneNumber, Integer salary, Integer age) throws Exception {
        if(phoneNumber.matches("^[0-9]{12}$")&& email.matches("\\w+@\\w+.\\w+")){
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        }else {
            throw new Exception("Неверный формат телефона или почты");
        }
    }

    public Employee() {
    }
    public void showInfo(){
        System.out.println("Фио:"+fullName+
                            "\nРабота:"+job+
                            "\nEmail:"+email+
                            "\nТелефон:"+phoneNumber+
                            "\nЗарпалата:"+salary+
                            "\nВозраст:"+age+"\n");

    }

    public String getFullName() {
        return fullName;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
