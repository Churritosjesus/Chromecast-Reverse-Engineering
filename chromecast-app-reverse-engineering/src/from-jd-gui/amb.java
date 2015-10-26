import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;

final class amb
  implements bob
{
  amb(ama paramama) {}
  
  public final void a()
  {
    ama.e(this.a).a(ama.d(this.a).a() - 1);
  }
  
  public final void a(aow paramaow)
  {
    alm localalm;
    if (paramaow.q())
    {
      localalm = ama.a(this.a);
      localalm.i.add(paramaow.c.q);
      localalm.b.edit().putString("hiddenDevices", TextUtils.join(",", localalm.i.toArray())).commit();
      localalm.d(paramaow);
    }
    for (;;)
    {
      synchronized (localalm.g)
      {
        int i = localalm.g.indexOf(paramaow);
        if (i != -1)
        {
          localalm.a(i, localalm.g);
          if (localalm.d != null) {
            localalm.d.g(i);
          }
        }
        localalm.g();
        return;
      }
      ama.b(this.a).a("Tried to hide %s, but it's already set up.", new Object[] { paramaow.c.b });
    }
  }
  
  public final void a(aow paramaow, int paramInt)
  {
    ama.a(this.a, paramaow, paramInt);
  }
  
  public final void a(String paramString)
  {
    ash localash = ama.c(this.a);
    amc localamc = new amc(this);
    dbt localdbt = new dbt();
    localdbt.a = paramString;
    localash.a(2, localdbt, localamc);
  }
  
  public final void b(aow paramaow)
  {
    bmn.a(paramaow.f()).a(this.a.x, null);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\amb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */