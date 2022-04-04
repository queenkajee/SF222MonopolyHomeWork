package DomainLayer;

public class Board{
  private int boardValue;
  private int locationValue;
  private int locationPrice = 500;

  public Board(){

  }

  public int moveToLocation(int diceValue){
    this.locationValue = locationValue + diceValue;
    return this.locationValue;
  }
  public int getLocationPrice(){
    return locationPrice;
  }


}
