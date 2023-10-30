public class Main {
    public static void main(String[] args) throws Exception {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0]=new Employee("Ivanov ivan","engineer","ivanIV@mail.ru","375294525352",2230,35);
        employeeArr[1]=new Employee("Ivanov Anton","driver","AntonIV@mail.ru","375294525352",1000,50);
        employeeArr[2]=new Employee("Antonov ivan","engineer","ivanAnt@mail.ru","375243225352",2000,42);
        employeeArr[3]=new Employee("Gurok Denis","Junior","denisgurok633@mail.ru","375243525352",5,20);
        employeeArr[4]=new Employee("Ivanov Nikita","Firefighter","NikitaIV@mail.ru","375294523352",2020,35);
        for (Employee employee:employeeArr) {
            if(employee.getAge()>40){
                employee.showInfo();
            }
        }
        Park park = new Park("Парк 'Крутой'");
        park.addAttraction("Качели","11-16",5);
        park.addAttraction("Горки","11-18",10);
        park.showInfo();
    }
}
