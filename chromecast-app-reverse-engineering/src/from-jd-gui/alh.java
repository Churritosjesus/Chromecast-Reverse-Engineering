import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.google.android.apps.chromecast.app.DebugActivity;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.io.IOException;

public final class alh
  implements all
{
  private bli a = SetupApplication.a().c();
  
  public alh(DebugActivity paramDebugActivity) {}
  
  public final String a()
  {
    return bli.a(false);
  }
  
  public final void a(String paramString)
  {
    bli localbli = this.a;
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).edit();
    int i = bli.a(paramString, bli.a());
    if (!paramString.equals(bli.d[0])) {
      localEditor.putString("ACM_LEVEL", paramString).apply();
    }
    try
    {
      for (;;)
      {
        localbli.a(SetupApplication.a(), i);
        return;
        localEditor.remove("ACM_LEVEL").apply();
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        localbli.c.a("Failed to switch container maps", new Object[0]);
      }
    }
  }
  
  public final String b()
  {
    return bli.a(true);
  }
  
  public final String[] c()
  {
    return bli.c();
  }
  
  public final String[] d()
  {
    return bli.d();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\alh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */