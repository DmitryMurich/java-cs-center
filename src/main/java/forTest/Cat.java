package forTest;

public class Cat {
    private String name;
    private Integer age;

    public Cat() {
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Cat setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public boolean equals(Object cat) {
        return (cat instanceof Cat) ? (name.equals(((Cat) cat).getName()) && age.equals(((Cat) cat).getAge())) : (false);//TODO
    }
}
