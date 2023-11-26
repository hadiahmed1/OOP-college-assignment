class Person{
    String name;
    String profession;
    String gender;
    int age;
    public Person(String name,String profession,String gender,int age){
        this.name=name;
        this.profession=profession;
        this.gender=gender;
        this.age=age;
    }
    public void dispalyBioData(){
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
        System.out.println("Profession :"+this.profession);
        System.out.println("Gender :"+this.gender);
    }
}