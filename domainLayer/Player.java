package DomainLayer;

public class Player {
    private String name;
    private int location;
    private int round;
    private int money;

    public Player(String name){
        this.name = name;
        this.location = 0;
        this.round = 0;
        this.money = 1000;
    }

    public String getName() {
        return name;
    }
    public int rollDice(Die d1,Die d2){
        d1.RandomNumber();
        d2.RandomNumber();

        int value = d1.getFaceValue() + d2.getFaceValue();
        return value;
    }
    
    public int upDateLocation(diceValue){
      this.location = location + diceValue;
    }

    public int getLocationValue(board b1){
      b1.getLocationValue();
      return location;
    }
    public int checkRound(){
      return round;
    }

}
