package ru.fedotova.java.basic.homeworks.homeworks4;

public class User {
        private String surname;
        private String firstname;
        private String middlename;
        private int yearbirth;
        private String email;

        public void setSurname (String surname) {
            this.surname = surname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public void setMiddlename(String middlename) {
            this.middlename = middlename;
        }

        public void setYearbirth() {
            this.yearbirth = yearbirth;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSurname(){
            return surname;
        }

        public String getFirstname(){
            return firstname;
        }

        public String getMiddlename(){
            return middlename;
        }

        public int getYearbirth(){
            return yearbirth;
        }

        public String getEmail(){
            return email;
        }

        public User(String surname, String firstname, String middlename, int yearbirth, String email){
            this.surname = surname;
            this.firstname = firstname;
            this.middlename = middlename;
            this.yearbirth = yearbirth;
            this.email = email;
        }
        public void name () {
            System.out.println("ФИО: " + surname + " " + firstname + " " + middlename);
        }
        public void year () {
            System.out.println("Год рождения: " + yearbirth);
        }
        public void mail () {
            System.out.println("e-mail: " + email);
        }

    // это переопределенный метод
    @Override
    public String toString(){
        return String.format("ФИО: %s \tГод рождения: %s \ne-mail: %s\n",
                surname + " " + firstname + " " + middlename, yearbirth, email);}

    // это метод вывода в консоль (как по заданию)
    public void info(){
        System.out.println(this);
    }
}
