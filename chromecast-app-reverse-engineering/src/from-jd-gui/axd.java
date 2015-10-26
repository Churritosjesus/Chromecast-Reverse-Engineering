import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;

public final class axd
{
  public final Context a;
  final atf b;
  public dat c;
  public dat d;
  public int[] e;
  public final blp f = new blp("ContentDiscoveryManager");
  axn g;
  public axn h;
  boolean i;
  aef j;
  public aef k;
  public long l;
  long m;
  public boolean n;
  public final Handler o = new Handler();
  public final Runnable p = new axe(this);
  
  public axd(Context paramContext, atf paramatf)
  {
    this.a = paramContext;
    this.b = paramatf;
    this.m = blf.w(paramContext);
    this.i = a(PreferenceManager.getDefaultSharedPreferences(this.a));
    PreferenceManager.getDefaultSharedPreferences(paramContext).registerOnSharedPreferenceChangeListener(new axf(this));
  }
  
  static boolean a(SharedPreferences paramSharedPreferences)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramSharedPreferences.contains("manualAudio")) {
      bool1 = paramSharedPreferences.getBoolean("manualAudio", false);
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (paramSharedPreferences.getBoolean("hendrixDiscovered", false))
      {
        bool1 = bool2;
        if (!paramSharedPreferences.getBoolean("nonhendrixDiscovered", false)) {
          bool1 = true;
        }
      }
    }
  }
  
  public final void a()
  {
    this.j = null;
    axg localaxg = new axg(this);
    this.b.a(new axh(this, localaxg), localaxg);
  }
  
  public final void b()
  {
    this.k = null;
    axj localaxj = new axj(this);
    this.b.a(new axk(this, localaxj), localaxj);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\axd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */