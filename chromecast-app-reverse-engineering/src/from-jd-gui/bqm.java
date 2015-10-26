import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class bqm
  extends BroadcastReceiver
{
  static final String a = bqm.class.getName();
  final brb b;
  boolean c;
  boolean d;
  
  bqm(brb parambrb)
  {
    a.c(parambrb);
    this.b = parambrb;
  }
  
  private void d()
  {
    this.b.a();
    this.b.c();
  }
  
  private boolean e()
  {
    Object localObject = (ConnectivityManager)this.b.a.getSystemService("connectivity");
    for (;;)
    {
      try
      {
        localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
        if (localObject == null) {
          continue;
        }
        bool = ((NetworkInfo)localObject).isConnected();
        if (!bool) {
          continue;
        }
        bool = true;
      }
      catch (SecurityException localSecurityException)
      {
        boolean bool = false;
        continue;
      }
      return bool;
      bool = false;
    }
  }
  
  public final void a()
  {
    d();
    if (this.c) {}
    for (;;)
    {
      return;
      Context localContext = this.b.a;
      localContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
      IntentFilter localIntentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
      localIntentFilter.addCategory(localContext.getPackageName());
      localContext.registerReceiver(this, localIntentFilter);
      this.d = e();
      this.b.a().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
      this.c = true;
    }
  }
  
  public final void b()
  {
    if (!this.c) {}
    for (;;)
    {
      return;
      this.b.a().b("Unregistering connectivity change receiver");
      this.c = false;
      this.d = false;
      Context localContext = this.b.a;
      try
      {
        localContext.unregisterReceiver(this);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        this.b.a().e("Failed to unregister the network broadcast receiver", localIllegalArgumentException);
      }
    }
  }
  
  Context c()
  {
    return this.b.a;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    d();
    paramContext = paramIntent.getAction();
    this.b.a().a("NetworkBroadcastReceiver received action", paramContext);
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramContext))
    {
      boolean bool = e();
      if (this.d != bool)
      {
        this.d = bool;
        this.b.c().a(bool);
      }
    }
    for (;;)
    {
      return;
      if ("com.google.analytics.RADIO_POWERED".equals(paramContext))
      {
        if (!paramIntent.hasExtra(a))
        {
          paramContext = this.b.c();
          paramContext.b("Radio powered up");
          paramContext.b();
        }
      }
      else {
        this.b.a().d("NetworkBroadcastReceiver received unknown action", paramContext);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */