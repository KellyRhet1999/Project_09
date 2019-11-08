/**
* Rhet Kelly
* 11/08/19
* Project_09
*
* Processes information on cellular networks.
*/

public class Cellular extends WirelessNetwork
{
   protected double time;
   protected double dataLimit;
   /**
   */
   public static final double COST_FACTOR = 1.0;

/**
 * @param nameIn is the name
 * @param bandwidthIn is the bandwidth
 * @param monthlyCostIn is the monthlyCost
 * @param timeIn is the time
 * @param dataLimitIn is the dataLimit
 */
   public Cellular(String nameIn, double bandwidthIn, double monthlyCostIn,
      double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, monthlyCostIn);
      time = timeIn;
      dataLimit = dataLimitIn;
   }
   
   /**
   * @return time
   */
   public double getTime()
   {
      return time;
   }
   
   /**
   * @param timeIn is the time
   */
   public void setTime(double timeIn)
   {
      time = timeIn;
   }
   
   /**
   * @return dataLimit
   */
   public double getDataLimit()
   {
      return dataLimit;
   }
   
   /**
   * @param dataLimitIn is the dataLimit
   */
   public void setDataLimit(double dataLimitIn)
   {
      dataLimit = dataLimitIn;
   }
   
   /**
   * @return dataUsage
   */
   public double dataUsage()
   {
      return ((bandwidth / 8000) * time);
   }
   
   /**
   * @return monthlyCost
   */
   public double monthlyCost()
   {
      if (dataUsage() <= dataLimit)
      {
         return monthlyCost;
      }
      else
      {
         return ((monthlyCost + (dataUsage() - dataLimit)) * 
            Cellular.COST_FACTOR);
      }
   }
   
   /**
   * @return string
   */
   public String toString()
   {
      return "My Note (class Cellular)" + super.toString()
         + "\nTime: " + time + " seconds" + "\nData Limit: "
         + dataLimit + " GB" + "\nData Used: " + dataUsage()
         + " GB";
   }
}