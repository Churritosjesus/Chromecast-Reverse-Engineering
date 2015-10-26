import com.google.android.gms.common.ConnectionResult;

public final class byv
  extends byp
{
  public byv(byo parambyo)
  {
    super(parambyo, 0, null);
  }
  
  protected final void a(ConnectionResult paramConnectionResult)
  {
    if (byo.a(this.a)) {
      byo.b(this.a).a(paramConnectionResult);
    }
    for (;;)
    {
      return;
      byo.c(this.a).a(paramConnectionResult);
    }
  }
  
  protected final boolean a()
  {
    boolean bool;
    if (byo.a(this.a)) {
      if (byo.b(this.a) != null)
      {
        bool = true;
        a.a(bool, "mConnectionProgressReportCallbacks should not be null if mReportProgress");
        byo.b(this.a).a(ConnectionResult.a);
      }
    }
    for (;;)
    {
      return true;
      bool = false;
      break;
      this.a.a(null, byo.e(this.a));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */