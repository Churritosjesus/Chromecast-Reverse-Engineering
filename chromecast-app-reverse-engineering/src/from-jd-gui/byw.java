import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class byw
  extends byp
{
  public byw(byo parambyo, int paramInt, Bundle paramBundle)
  {
    super(parambyo, paramInt, paramBundle);
  }
  
  protected final void a(ConnectionResult paramConnectionResult)
  {
    if (byo.a(this.a)) {
      byo.b(this.a).b(paramConnectionResult);
    }
    for (;;)
    {
      return;
      byo.c(this.a).a(paramConnectionResult);
    }
  }
  
  protected final boolean a()
  {
    if ((byo.a(this.a)) && (byo.b(this.a) != null)) {}
    for (boolean bool = true;; bool = false)
    {
      a.a(bool, "PostValidationCallback should not happen when mReportProgress is false ormConnectionProgressReportCallbacks is null");
      byo.b(this.a).b(ConnectionResult.a);
      return true;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\byw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */