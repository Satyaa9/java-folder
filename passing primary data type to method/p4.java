class Address {
    String city;

    Address(String city) {
        this.city = city;
    }

    void setCity(String city) {
        this.city = city;
        System.out.println(city);
    }

    void getCity() {
        System.out.println("City: " + city);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void setName(String name, Address obj) {
        this.name = name;
        System.out.println("Name: " + name);
        obj.getCity();
    }
}

class Demo {
    public static void main(String[] args) {
        Address add = new Address("Satara");
        Student std = new Student("Shubham");
	Address add1 = new Address("pune");

        std.setName("Shubham", add);
	std.setName("Shubham",add); // passing both parameters correctly
    }
}
