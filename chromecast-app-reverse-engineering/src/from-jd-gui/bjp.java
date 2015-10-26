import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

public final class bjp
  extends j
  implements View.OnClickListener
{
  private bjn a;
  private apd b;
  
  public static bjp a(long paramLong)
  {
    bjp localbjp = new bjp();
    Bundle localBundle = new Bundle();
    localBundle.putLong("uptimeMs", paramLong);
    localbjp.f(localBundle);
    return localbjp;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    long l = this.m.getLong("uptimeMs", 0L);
    paramBundle = new apd(33).a((int)TimeUnit.MILLISECONDS.toSeconds(l));
    paramBundle.h = this.a.A();
    this.b = paramBundle;
    paramViewGroup = paramLayoutInflater.inflate(a.gN, paramViewGroup, false);
    paramViewGroup.findViewById(f.aS).setOnClickListener(this);
    paramLayoutInflater = (TextView)paramViewGroup.findViewById(f.aT);
    if (this.a.F().h) {}
    for (int i = b.bm;; i = b.bl)
    {
      paramLayoutInflater.setText(i);
      return paramViewGroup;
    }
  }
  
  public final void a()
  {
    super.a();
    this.a = null;
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.a = ((bjn)paramActivity);
  }
  
  public final void h_()
  {
    ape.a().a(this.b);
    super.h_();
  }
  
  public final void onClick(View paramView)
  {
    this.a.a(bjo.i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */