import java.io.IOException;

final class cuw
  implements cuy
{
  cuw(cuv paramcuv) {}
  
  public final bpb a()
  {
    Object localObject = null;
    try
    {
      bpb localbpb = bpa.a(cuv.a(this.a));
      localObject = localbpb;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        cuh.b("IllegalStateException getting Advertising Id Info");
      }
    }
    catch (bvs localbvs)
    {
      for (;;)
      {
        cuh.b("GooglePlayServicesRepairableException getting Advertising Id Info");
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        cuh.b("IOException getting Ad Id Info");
      }
    }
    catch (bvr localbvr)
    {
      for (;;)
      {
        cuh.b("GooglePlayServicesNotAvailableException getting Advertising Id Info");
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        cuh.b("Unknown exception. Could not get the Advertising Id Info.");
      }
    }
    return (bpb)localObject;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cuw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */