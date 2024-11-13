public class Author {
    private String name;
    private String surname;

    //Создадим конструктор
    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    //Создадим геттеры и сеттеры для Name

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Создадим геттеры и сеттеры для Surname
    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

}
