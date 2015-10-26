import java.net.MulticastSocket;

final class azs
  implements Runnable
{
  private MulticastSocket a;
  
  public azs(azm paramazm, MulticastSocket paramMulticastSocket)
  {
    this.a = paramMulticastSocket;
  }
  
  public final void run()
  {
    azm.a(this.b, this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\azs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */