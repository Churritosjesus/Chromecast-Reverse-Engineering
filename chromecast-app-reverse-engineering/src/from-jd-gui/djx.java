final class djx
  extends Thread
{
  public djx()
  {
    super("Okio Watchdog");
    setDaemon(true);
  }
  
  public final void run()
  {
    try
    {
      for (;;)
      {
        dju localdju = dju.e();
        if (localdju != null) {
          localdju.a();
        }
      }
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\djx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */