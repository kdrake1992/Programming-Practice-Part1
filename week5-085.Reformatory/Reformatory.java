public class Reformatory {
    private int measure = 0;

    public int weight(Person person) {
        // return the weight of the person
        measure++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return measure;
    }

}
