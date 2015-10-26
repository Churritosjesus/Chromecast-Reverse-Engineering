import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.chromecast.app.SetupApplication;

final class bhb
  implements Runnable
{
  bhb(bha parambha, String paramString, Context paramContext) {}
  
  public final void run()
  {
    bha.a(this.a);
    bha.a(this.a, SetupApplication.a().l());
    bha.b(this.a).b();
    if (bha.b(this.a).a(this.b, new bhc(this), false)) {
      Toast.makeText(this.c, this.c.getString(b.df, new Object[] { this.b }), 0).show();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bhb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */