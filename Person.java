
public class Person {
   String name;
   int age;
   String sex;
   Address personAddr;
  
  
Person(String name, int age, String sex, Address personAddr){
   this.name = name;
   this.age = age;
   this.sex = sex;
   this.personAddr = personAddr;
  }
}

class personAddr{
   String city;
   String state;
  
   personAddr(String city, String state){
     this.city = city;
     this.state = state;
  } 
}

class PersonExamples{
   PersonExamples() {};
 
    personAddr = new personAddr ();
   
 personAddr timAddr = new PersonAddr("Warwick","RI");
 personAddr patAddr = new PersonAddr("Boston","MA");
 personAddr kimAddr = new PersonAddr("Boston","MA");
 personAddr danAddr = new PersonAddr("Nashua","NH");
 personAddr ikerAddr = new PersonAddr("Philippines", "PH");
 peronAddr shayneAddr = new PersonAddr("Philippines", "PH");
 Person tim = new Person("Tim", 20, "M", this.timAddr);
 Person pat = new Person("Pat", 19, "F", this.patAddr);
 Person kim = new Person("Kim", 17, "F", this.kimAddr);
 Person dan = new Person("Dan", 22, "M", this.danAddr);
 Person iker = new Person("Iker", 4, "M", this.ikerAddr);
 Person shayne = new Person("Shayne", 19, "F", this.shayneAddr);
 
}