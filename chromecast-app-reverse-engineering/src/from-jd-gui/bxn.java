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
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class bxn
  extends j
  implements DialogInterface.OnCancelListener
{
  private ConnectionResult Z;
  boolean a;
  private final Handler aa = new Handler(Looper.getMainLooper());
  boolean b;
  final SparseArray c = new SparseArray();
  private int d = -1;
  
  public static bxn a(m paramm)
  {
    a.g("Must be called from main thread of process");
    t localt = paramm.b;
    try
    {
      bxn localbxn = (bxn)localt.a("GmsSupportLifecycleFragment");
      if (localbxn != null)
      {
        paramm = localbxn;
        if (!localbxn.r) {}
      }
      else
      {
        paramm = new bxn();
        localt.a().a(paramm, "GmsSupportLifecycleFragment").b();
        localt.b();
      }
      return paramm;
    }
    catch (ClassCastException paramm)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", paramm);
    }
  }
  
  private void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
    Object localObject = (bxo)this.c.get(paramInt);
    if (localObject != null)
    {
      bxo localbxo = (bxo)this.c.get(paramInt);
      this.c.remove(paramInt);
      if (localbxo != null)
      {
        localbxo.b.b(localbxo);
        localbxo.b.c();
      }
      localObject = ((bxo)localObject).c;
      if (localObject != null) {
        ((bwh)localObject).a(paramConnectionResult);
      }
    }
    p();
  }
  
  private void p()
  {
    this.b = false;
    this.d = -1;
    this.Z = null;
    for (int i = 0; i < this.c.size(); i++) {
      ((bxo)this.c.valueAt(i)).b.b();
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
      a(this.d, this.Z);
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.b = paramBundle.getBoolean("resolving_error", false);
      this.d = paramBundle.getInt("failed_client_id", -1);
      if (this.d >= 0) {
        this.Z = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    for (int i = 0; i < this.c.size(); i++)
    {
      bxo localbxo = (bxo)this.c.valueAt(i);
      paramPrintWriter.append("#").print(localbxo.a);
      paramPrintWriter.append(" ");
      localbxo.b.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("resolving_error", this.b);
    if (this.d >= 0)
    {
      paramBundle.putInt("failed_client_id", this.d);
      paramBundle.putInt("failed_status", this.Z.c);
      paramBundle.putParcelable("failed_resolution", this.Z.d);
    }
  }
  
  public final void g_()
  {
    super.g_();
    this.a = true;
    if (!this.b) {
      for (int i = 0; i < this.c.size(); i++) {
        ((bxo)this.c.valueAt(i)).b.b();
      }
    }
  }
  
  public final void h_()
  {
    super.h_();
    this.a = false;
    for (int i = 0; i < this.c.size(); i++) {
      ((bxo)this.c.valueAt(i)).b.c();
    }
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    a(this.d, new ConnectionResult(13, null));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bxn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */