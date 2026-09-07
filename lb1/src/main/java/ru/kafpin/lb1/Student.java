package ru.kafpin.lb1;

public class Student {
    private long id;
    private String lastName;   // Фамилия
    private String name;       // Имя
    private String middleName; // Отчество
    private String email;      // E-mail
    private int admissionYear; // Год поступления

    private String groupName;  // Сгенерированная группа
    private String login;      // Сгенерированный логин

    // Пустой конструктор (обязателен для Spring)
    public Student() {
    }

    // Метод для вычисления группы и логина согласно заданию
    public void generateStudentInfo() {
        String yearSuffix = String.valueOf(admissionYear);
        if (yearSuffix.length() == 4) {
            yearSuffix = yearSuffix.substring(2);
        }

        this.groupName = "ПИН3-1" + yearSuffix;
        this.login = "student-pinz1" + yearSuffix + "-" + id;
    }

    // --- Getters и Setters ---

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAdmissionYear() { return admissionYear; }
    public void setAdmissionYear(int admissionYear) { this.admissionYear = admissionYear; }

    public String getGroupName() { return groupName; }
    public void setGroupName(String groupName) { this.groupName = groupName; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
}