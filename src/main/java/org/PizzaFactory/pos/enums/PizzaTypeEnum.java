package org.PizzaFactory.pos.enums;

public enum PizzaTypeEnum {
  
  DELUXE_VEGGIE("Deluxe Veggie", 
    new PizzaSizeEnum[] { PizzaSizeEnum.SMALL, PizzaSizeEnum.MEDIUM, PizzaSizeEnum.LARGE },
    new Double[] { 150.0, 200.0, 325.0 }),
  
  CHEESE_AND_CORN("Cheese and corn", 
    new PizzaSizeEnum[] { PizzaSizeEnum.SMALL, PizzaSizeEnum.MEDIUM, PizzaSizeEnum.LARGE },
    new Double[] { 175.0, 375.0, 475.0 }),
  
  PANEER_TIKKA("Paneer Tikka", 
    new PizzaSizeEnum[] { PizzaSizeEnum.SMALL, PizzaSizeEnum.MEDIUM, PizzaSizeEnum.LARGE },
    new Double[] { 160.0, 290.0, 340.0 }),
  
  NON_VEG_SUPREME("Non-Veg Supreme", 
    new PizzaSizeEnum[] { PizzaSizeEnum.SMALL, PizzaSizeEnum.MEDIUM, PizzaSizeEnum.LARGE },
    new Double[] { 190.0, 325.0, 425.0 }),
  
  CHICKEN_TIKKA("Chicken Tikka", 
    new PizzaSizeEnum[] { PizzaSizeEnum.SMALL, PizzaSizeEnum.MEDIUM, PizzaSizeEnum.LARGE },
    new Double[] { 210.0, 370.0, 500.0 }),
  
  PEPPER_BBQ_CHICKEN("Pepper Barbecue Chicken", 
    new PizzaSizeEnum[] { PizzaSizeEnum.SMALL, PizzaSizeEnum.MEDIUM, PizzaSizeEnum.LARGE },
    new Double[] { 220.0, 380.0, 525.0 });
  
  private String description;
  private PizzaSizeEnum[] sizes;
  private Double[] prices;
  
  private PizzaTypeEnum(String description, PizzaSizeEnum[] sizes, Double[] prices){
    this.description = description;
    this.sizes = sizes;
    this.prices = prices;
  }

  public String getDescription()
  {
    return description;
  }

  public PizzaSizeEnum[] getSizes()
  {
    return sizes;
  }

  public Double[] getPrices()
  {
    return prices;
  }
  
}