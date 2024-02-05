package org.example;

public class Employee {
    private String id;
    private String name;

    private boolean isDead;
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDead() {
        return isDead;
    }


    @Override
    public String toString() {
        return "EmployeeBuilder{" +
                "id='" + this.id + '\'' +
                ", name='" + this.name + '\'' +
                ", isDead=" + this.isDead +
                '}';
    }
    private Employee(EmployeeBuilder builder){
        this.id= builder.id;
        this.name= builder.name;
        this.isDead= builder.isDead;
    }
    public static class EmployeeBuilder {
        private String id;
        private String name;

        private boolean isDead;

        public EmployeeBuilder (String id, String name){
            this.id=id;
            this.name=name;
        }

        public EmployeeBuilder setDead(boolean dead) {
            this.isDead = dead;
            return this;
        }
        public Employee build(){
            return new Employee(this);
        }
    }
}


