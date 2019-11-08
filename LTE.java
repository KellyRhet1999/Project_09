/**
* Rhet Kelly
* 11/08/19
* Project_09
*
* Processes information on cellular networks.
*/

public class LTE extends WirelessNetwork
{
   public static final double COST_FACTOR = 4.0;

/**
 * @param nameIn is the name
 * @param bandwidthIn is the bandwidth
 * @param monthlyCostIn is the monthlyCost
 * @param timeIn is the time
 * @param dataLimitIn is the dataLimit
 * @param dataUsageIn is the dataUsage
 */
   public LTE(String nameIn, double bandwidthIn, double monthlyCostIn,
      double timeIn, double dataLimitIn)
   {
      super(nameIn, bandwidthIn, monthlyCostIn, timeIn, dataLimitIn);
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
            LTE.COST_FACTOR * 2);
      }
   }
}