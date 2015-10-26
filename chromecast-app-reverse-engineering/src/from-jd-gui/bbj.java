import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;

public final class bbj
  extends i
{
  public static bbj a(String paramString1, String paramString2, String paramString3)
  {
    bbj localbbj = new bbj();
    Bundle localBundle = new Bundle();
    localBundle.putString("message", paramString1);
    localBundle.putString("pattern", paramString2);
    localBundle.putString("link", paramString3);
    localbbj.f(localBundle);
    return localbbj;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    return new AlertDialog.Builder(this.y).setView(blx.a(this.y, this.m.getString("message"), new String[] { this.m.getString("pattern"), this.m.getString("link") })).setPositiveButton(b.I, null).create();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */