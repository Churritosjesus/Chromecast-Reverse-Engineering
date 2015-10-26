import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

public final class ain
  extends i
{
  public Dialog Z;
  
  private void a(Bundle paramBundle, afq paramafq)
  {
    m localm = this.y;
    paramBundle = aix.a(localm.getIntent(), paramBundle, paramafq);
    if (paramafq == null) {}
    for (int i = -1;; i = 0)
    {
      localm.setResult(i, paramBundle);
      localm.finish();
      return;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    Bundle localBundle;
    String str;
    if (this.Z == null)
    {
      paramBundle = this.y;
      localBundle = aix.a(paramBundle.getIntent());
      if (localBundle.getBoolean("is_fallback", false)) {
        break label104;
      }
      str = localBundle.getString("action");
      localBundle = localBundle.getBundle("params");
      if (aji.a(str))
      {
        aji.a("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
        paramBundle.finish();
      }
    }
    else
    {
      return;
    }
    paramBundle = new ajv(paramBundle, str, localBundle);
    paramBundle.d = new aio(this);
    paramBundle = paramBundle.a();
    for (;;)
    {
      this.Z = paramBundle;
      break;
      label104:
      str = localBundle.getString("url");
      if (aji.a(str))
      {
        aji.a("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
        paramBundle.finish();
        break;
      }
      paramBundle = new aiu(paramBundle, str, String.format("fb%s://bridge/", new Object[] { afv.h() }));
      paramBundle.b = new aip(this);
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    if (this.Z == null)
    {
      a(null, null);
      this.c = false;
    }
    return this.Z;
  }
  
  public final void d()
  {
    if ((this.d != null) && (this.G)) {
      this.d.setDismissMessage(null);
    }
    super.d();
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if ((this.Z instanceof ajq)) {
      ((ajq)this.Z).a();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ain.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */