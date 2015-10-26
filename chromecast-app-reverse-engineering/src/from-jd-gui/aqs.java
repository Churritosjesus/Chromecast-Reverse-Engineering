final class aqs
  implements Runnable
{
  aqs(aqj paramaqj) {}
  
  public final void run()
  {
    try
    {
      aqj.b(this.a).a(bsr.b.c(this.a.a));
      aqj.h();
      aqj.b(this.a).g();
      aqj.b(this.a).o().a();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        aqj.h().a("Got unexpected error calling getVolume: %s", new Object[] { localIllegalStateException });
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */