import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class apj
{
  public boolean a;
  public boolean b;
  public boolean c;
  
  public apj(Context paramContext)
  {
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext);
    this.a = paramContext.getBoolean("SHOW_BACKDROP_TIP", false);
    this.b = paramContext.getBoolean("SHOW_CAST_NEARBY_WARM_WELCOME", false);
    if (paramContext.getInt("CAST_SCREEN_CLING", 0) == 1) {}
    for (;;)
    {
      this.c = bool;
      return;
      bool = false;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\apj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */