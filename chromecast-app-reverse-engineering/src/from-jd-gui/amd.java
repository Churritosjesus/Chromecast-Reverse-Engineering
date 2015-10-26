import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;

final class amd
  implements Runnable
{
  amd(ama paramama, aow paramaow) {}
  
  public final void run()
  {
    alm localalm = ama.a(this.b);
    aow localaow = this.a;
    String str = localaow.c.q;
    if (localalm.i.remove(str)) {
      localalm.b.edit().putString("hiddenDevices", TextUtils.join(",", localalm.i.toArray())).commit();
    }
    if (localalm.h.remove(localaow))
    {
      localalm.h.size();
      int i = localalm.e();
      localalm.a(i, localaow);
      if (localalm.d != null)
      {
        localalm.d.f(i);
        localalm.d.a(localalm.h.isEmpty());
      }
      localalm.g();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\amd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */