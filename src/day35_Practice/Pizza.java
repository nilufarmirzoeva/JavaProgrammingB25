package day35_Practice;

public class Pizza {
    private char size;
    private int numberOfCheese,numberOfTopping;

    public char getSize() {

        return size;
    }

    public void setSize(char size) {
        if(!(size=='S'|| size == 'M' || size=='L')) {
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheese() {
        return numberOfCheese;
    }

    public void setNumberOfCheese(int numberOfCheese) {
        if(size =='S' &&(numberOfCheese<0 || numberOfTopping>3)){
            return;
        }else if(size=='M'&&(numberOfTopping<0 || numberOfCheese>4)){
            return;

        }else if(size== 'L' && (numberOfTopping<0 || numberOfCheese >5)){
            return;

        }
        this.numberOfCheese = numberOfCheese;
    }

    public int getNumberOfTopping() {
        return numberOfTopping;
    }

    public void setNumberOfTopping(int numberOfTopping) {
        this.numberOfTopping = numberOfTopping;
    }
}
/*5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


 */