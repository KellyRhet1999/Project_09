/**
* Rhet Kelly
* 11/08/19
* Project_09
*
* Processes information on cellular networks.
*/

/**
*/
public abstract class WirelessNetwork
{
   protected String name;
   protected double bandwidth;
   protected double monthlyCost = 0.0;

   protected static int intCount = 0;

/**
* @param nameIn is the name
* @param bandwidthIn is the bandwidth
* @param monthlyCostIn is the cost
*/
   public WirelessNetwork(String nameIn, double bandwidthIn, 
      double monthlyCostIn)
   {
      name = nameIn;
      bandwidth = bandwidthIn;
      monthlyCost = monthlyCostIn;
   
      intCount = 0;
      intCount++;
   
   }

/**
* @return name
*/
   public String getName()
   {
      return name;
   }

/**
* @param nameIn is the name
*/
   public void setName(String nameIn)
   {
      name = nameIn;
   }

/**
* @return monthlyCost
*/
   public double getBandwidth()
   {
      return bandwidth;
   }

/**
* @param bandwidthIn is the bandwidth
*/
   public void setBandwidth(double bandwidthIn)
   {
      bandwidth = bandwidthIn;
   }

/**
* @return monthlyCost
*/
   public double getMonthlyFixedCost()
   {
      return monthlyCost;
   }

/**
* @param monthlyCostIn is the monthly cost
*/
   public void setMonthlyFixedCost(double monthlyCostIn)
   {
      monthlyCost = monthlyCostIn;
   }

/**
* @return intCount
*/
   public int getCount()
   {
      return intCount;
   }

/**
*/
   public static void resetCount()
   {
      intCount = 0;
   }
   
/**
* @return double
*/
   public abstract double monthlyCost();
   

/**
* @return String
*/
   public String toString()
   {
      return "Cost: $" + monthlyCost
         + "\nBandwidth: " + bandwidth + " Mbps";
   }


   
   
   

}