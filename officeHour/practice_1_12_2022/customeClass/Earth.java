package practice_1_12_2022.customeClass;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies dogs = new AnimalSpecies();
        dogs.growthRate = 10;
        dogs.name = "dog";
        dogs.population=50;
        
        dogs.setInfo("dog",10,50);
        System.out.println(dogs.getGrowthRate());

        System.out.println("dog.getName()= " + dogs.getName());

        System.out.println("dogs.getPopulation() = " + dogs.getPopulation());

        System.out.println(dogs);

    }
}
