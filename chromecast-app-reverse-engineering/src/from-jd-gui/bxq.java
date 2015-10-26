import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;

public final class bxq
  extends j
  implements DialogInterface.OnCancelListener, aq
{
  private final Handler Z = new Handler(Looper.getMainLooper());
  final SparseArray a = new SparseArray();
  private boolean b;
  private int c = -1;
  private ConnectionResult d;
  
  public static bxq a(m paramm)
  {
    a.g("Must be called from main thread of process");
    t localt = paramm.b;
    try
    {
      bxq localbxq = (bxq)localt.a("GmsSupportLoaderLifecycleFragment");
      if (localbxq != null)
      {
        paramm = localbxq;
        if (!localbxq.r) {}
      }
      else
      {
        paramm = new bxq();
        localt.a().a(paramm, "GmsSupportLoaderLifecycleFragment").b();
        localt.b();
      }
      return paramm;
    }
    catch (ClassCastException paramm)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", paramm);
    }
  }
  
  private void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
    Object localObject = (bxs)this.a.get(paramInt);
    if (localObject != null)
    {
      this.a.remove(paramInt);
      h().a(paramInt);
      localObject = ((bxs)localObject).b;
      if (localObject != null) {
        ((bwh)localObject).a(paramConnectionResult);
      }
    }
    p();
  }
  
  private void p()
  {
    int i = 0;
    this.b = false;
    this.c = -1;
    this.d = null;
    ap localap = h();
    while (i < this.a.size())
    {
      int j = this.a.keyAt(i);
      bxr localbxr = b(j);
      if ((localbxr != null) && (localbxr.f))
      {
        localap.a(j);
        localap.a(j, null, this);
      }
      i++;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      paramInt1 = 0;
      label30:
      if (paramInt1 != 0) {
        p();
      }
      break;
    }
    for (;;)
    {
      return;
      if (bvt.a(this.y) != 0) {
        break;
      }
      paramInt1 = i;
      break label30;
      if (paramInt2 != -1) {
        break;
      }
      paramInt1 = i;
      break label30;
      a(this.c, this.d);
    }
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    int i = 0;
    if (i < this.a.size())
    {
      int j = this.a.keyAt(i);
      paramActivity = b(j);
      if ((paramActivity != null) && (((bxs)this.a.valueAt(i)).a != paramActivity.e)) {
        h().b(j, null, this);
      }
      for (;;)
      {
        i++;
        break;
        h().a(j, null, this);
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("resolving_error", false);
      this.c = paramBundle.getInt("failed_client_id", -1);
      if (this.c >= 0) {
        this.d = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  final bxr b(int paramInt)
  {
    try
    {
      bxr localbxr = (bxr)h().b(paramInt);
      return localbxr;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", localClassCastException);
    }
  }
  
  public final bi c_(int paramInt)
  {
    return new bxr(this.y, ((bxs)this.a.get(paramInt)).a);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("resolving_error", this.b);
    if (this.c >= 0)
    {
      paramBundle.putInt("failed_client_id", this.c);
      paramBundle.putInt("failed_status", this.d.c);
      paramBundle.putParcelable("failed_resolution", this.d.d);
    }
  }
  
  public final void g_()
  {
    super.g_();
    if (!this.b) {
      for (int i = 0; i < this.a.size(); i++) {
        h().a(this.a.keyAt(i), null, this);
      }
    }
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    a(this.c, new ConnectionResult(13, null));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */