import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

final class bxf
  extends BroadcastReceiver
{
  private WeakReference a;
  
  bxf(bwz parambwz)
  {
    this.a = new WeakReference(parambwz);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getData();
    paramContext = null;
    if (paramIntent != null) {
      paramContext = paramIntent.getSchemeSpecificPart();
    }
    if ((paramContext == null) || (!paramContext.equals("com.google.android.gms"))) {}
    for (;;)
    {
      return;
      paramContext = (bwz)this.a.get();
      if (paramContext != null) {
        bwz.f(paramContext);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */