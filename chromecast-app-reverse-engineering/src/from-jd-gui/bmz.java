import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.chromecast.app.SetupApplication;

final class bmz
  implements View.OnClickListener
{
  bmz(bmu parambmu, Intent paramIntent) {}
  
  public final void onClick(View paramView)
  {
    this.a.addFlags(268435456);
    SetupApplication.a().startActivity(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bmz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */