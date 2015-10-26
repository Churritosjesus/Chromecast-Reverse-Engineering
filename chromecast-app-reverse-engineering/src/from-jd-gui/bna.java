import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.chromecast.app.SetupApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

final class bna
  implements View.OnClickListener
{
  bna(bmu parambmu, Long paramLong) {}
  
  public final void onClick(View paramView)
  {
    paramView = bkh.a().g;
    long l = this.a.longValue();
    paramView.f.add(String.valueOf(l));
    PreferenceManager.getDefaultSharedPreferences(SetupApplication.a()).edit().putString("IGNORED_ANNOUNCEMENT_CARDS", TextUtils.join(",", paramView.f.toArray())).apply();
    paramView = paramView.d.iterator();
    while (paramView.hasNext()) {
      ((bkf)paramView.next()).a(l);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */