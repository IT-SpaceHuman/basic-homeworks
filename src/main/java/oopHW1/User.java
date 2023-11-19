package oopHW1;

public class User {

    private String familyName;
    private String name;
    private String surname;

    private int yearOfBirth;
    private String e_mail;


    public String getFamilyName(){

        return familyName;
    }

    public String getSurname(){

        return surname;
    }

    public String getName(){

        return name;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public User(String familyName, String name, String surname, int yearOfBirth, String e_mail){
        this.familyName = familyName;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.e_mail = e_mail;
    }

    public void userInfo(){
        System.out.println("ФИО: " + familyName + " " + name + " " + surname + "\n" +
                "Год рождения: " + yearOfBirth + "\n" +
                "e-mail: " + e_mail);
    }
}