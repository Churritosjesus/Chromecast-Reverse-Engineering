import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

final class axf
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  axf(axd paramaxd) {}
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if ((paramString.equals("hendrixDiscovered")) || (paramString.equals("nonhendrixDiscovered")) || (paramString.equals("manualAudio")))
    {
      boolean bool = axd.a(paramSharedPreferences);
      if (this.a.i != bool)
      {
        this.a.i = bool;
        this.a.a();
        this.a.b();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\axf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */