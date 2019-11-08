/**
* Rhet Kelly
* 11/08/19
* Project_09
*
* Processes information on cellular networks.
*/

/**
*/
public class WiFi extends WirelessNetwork
{
   private double modemCost;
   
   
 /**
 * @param nameIn is the name
 * @param bandwidthIn is the bandwidth
 * @param monthlyCostIn is the monthlyCost
 * @param modemCostIn is the modem cost
 */
   public WiFi(String nameIn, double bandwidthIn, double monthlyCostIn,
      double modemCostIn)
   {
      super(nameIn, bandwidthIn, monthlyCostIn);
      modemCost = modemCostIn;
   }
   
   /**
   * @return modemCost
   */
   public double getModemCost()
   {
      return modemCost;
   }
   
   /**
   * @param modemCostIn is the modemCost
   */
   public void setModemCost(double modemCostIn)
   {
      modemCost = modemCostIn;
   }
   
   /**
   * @return total
   */
   public double monthlyCost()
   {
      double cost = modemCost + monthlyCost;
      return cost;
   }
   
   /**
   * @return String
   */
   public String toString()
   {
   return "My Wifi (class WiFi) " + super.toString();
   }

}