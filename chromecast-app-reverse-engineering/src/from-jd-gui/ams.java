import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.ImageView;
import com.google.android.apps.chromecast.app.MainActivity;

public final class ams
  implements View.OnFocusChangeListener
{
  public ams(MainActivity paramMainActivity, ImageView paramImageView, View paramView) {}
  
  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      MainActivity.d(this.b).a.a(1);
      this.c.setImageResource(a.eC);
      this.c.setOnClickListener(new amt(this));
      this.a.setVisibility(0);
    }
    for (;;)
    {
      return;
      MainActivity.d(this.b).a.a(0);
      this.c.setImageResource(a.eF);
      this.c.setOnClickListener(new amu(this));
      this.a.setVisibility(8);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */