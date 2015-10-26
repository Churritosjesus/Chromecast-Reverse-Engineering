import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

final class ajj
  implements Runnable
{
  ajj(String paramString1, Context paramContext, String paramString2) {}
  
  public final void run()
  {
    JSONObject localJSONObject = aji.e(this.a);
    if (localJSONObject != null)
    {
      aji.a(this.a, localJSONObject);
      this.b.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).edit().putString(this.c, localJSONObject.toString()).apply();
    }
    aji.a().set(false);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ajj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */