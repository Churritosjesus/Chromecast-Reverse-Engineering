import android.os.AsyncTask;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

final class azt
  extends AsyncTask
{
  azt(azm paramazm) {}
  
  private List a()
  {
    localArrayList = new ArrayList();
    try
    {
      Enumeration localEnumeration = NetworkInterface.getNetworkInterfaces();
      if (localEnumeration != null) {
        while ((localEnumeration.hasMoreElements()) && (!isCancelled()))
        {
          NetworkInterface localNetworkInterface = (NetworkInterface)localEnumeration.nextElement();
          if ((localNetworkInterface.isUp()) && (!localNetworkInterface.isLoopback()) && (!localNetworkInterface.isPointToPoint()) && (localNetworkInterface.supportsMulticast()))
          {
            Iterator localIterator = localNetworkInterface.getInterfaceAddresses().iterator();
            while (localIterator.hasNext()) {
              if ((((InterfaceAddress)localIterator.next()).getAddress() instanceof Inet4Address)) {
                localArrayList.add(localNetworkInterface);
              }
            }
          }
        }
      }
      return localArrayList;
    }
    catch (IOException localIOException)
    {
      azm.b(this.a);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\azt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */