public class Bird {

    // Create a bird object

    String name;
    String latinName;
    int observations;

    //Constructor
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    //Return bird name
    public String getName(){
        return this.name;
    }

    //Return latin bird name
    public String getLatinName(){
        return this.latinName;
    }

    //Return observations
    public int getObservations(){
        return this.observations;
    }

    //Add observations
    public void incrementObservation(){
        this.observations++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observations + " observations";
    }
}