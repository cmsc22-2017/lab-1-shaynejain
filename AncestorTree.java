
interface IAT{

}

class Unknown implements IAT{
  Unknown() {}
}

class Citizen implements IAT{
  String baby;
  IAT mommy;
  IAT daddy;

  Citizen(String baby, IAT mommy, IAT daddy){
    this.baby = baby;
    this.mommy = mommy;
    this.daddy = daddy;
  }
}

class exampleFamIAT{
  exampleFamIAT() {};
  
  IAT unknown = new Unknown ();
 
  IAT tim = new Citizen("Tim",this.unknown,this.unknown);
  IAT pat = new Citizen("Pat",this.dan, this.kim);
  IAT kim = new Citizen("kim",this.unknown, this.unknown);
  IAT dan = new Citizen("Tim",this.unknown,this.unknown);                      
  }  
