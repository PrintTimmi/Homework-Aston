package Aston;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson {

    private final String name;
    private final int age;

    private final List<String> cities;

    public ImmutablePerson(String name, int age, List<String> cities) {
        this.name = name;
        this.age = age;

        this.cities = new ArrayList<>(cities);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getCities() {
        return new ArrayList<>(cities);
    }

    @Override
    public String toString() {
        return "ImmutablePerson name=" + name + ", age=" + age + ", cities=" + cities;
    }

        public static void main (String[]args){
            List<String> myCities = new ArrayList<>();
            myCities.add("Москва");
            myCities.add("Питер");
            myCities.add("Екатеринбург");

            ImmutablePerson person = new ImmutablePerson("Тимур", 28, myCities);
            System.out.println("Создали вот такие объекты: " + person);

            myCities.add("Нижний Новгород");
            System.out.println("Пытаемся изменить после создания объекта: " + person);


        }
    }

