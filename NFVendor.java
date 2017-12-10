/**
 * This class implements a NFVendor that sells one kind
 * of items. A NFVendor carries out sales transactions.
 */
public class NFVendor
{
	
  private int price;
  private int changedue;
  private int availablestock;
  private int depositedamount;
  

  /**
   * Constructs a NFVendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  
  public NFVendor(int p, int as )
  {
    
	  price = p;
	  availablestock = as;
	  changedue = 0;
	  depositedamount=0;
	  
  }

  
  
  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int as) 
  {
    
	  availablestock = as;
	  
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock ()
  {
    
	  return availablestock;
	  
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int da)
  {
    
	  depositedamount += da;
	  
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit ()
  {
   
	  return depositedamount;
	  
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock
   * and calculates and sets change and returns true;
   * otherwise refunds the whole deposit (moves it into
   * change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale ()
  {
    
	  if(availablestock >0 && depositedamount >= price) 
	  {
		  
		  availablestock -= 1;
		  
		  changedue =  depositedamount - price;
		  
		  depositedamount -= price;
		  
		  return true;
		  
	  }
	  
	  
	  else
	  {
		  
		  changedue = depositedamount;
		  
		  return false;
		  
	  }
	  
	  
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  public int getChange ()
  {
	  
	  int c = changedue;
	  
	  changedue = 0;
	  depositedamount = 0;
	  
	  return c;
	  
	  
  }
}