import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class bjl
  extends j
  implements View.OnClickListener
{
  private bjn a;
  
  public static bjl a(int paramInt, long paramLong)
  {
    bjl localbjl = new bjl();
    Bundle localBundle = new Bundle();
    localBundle.putInt("devicePosition", paramInt);
    localBundle.putLong("scanStart", paramLong);
    localbjl.f(localBundle);
    return localbjl;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.fJ, paramViewGroup, false);
    paramViewGroup = (ImageView)paramLayoutInflater.findViewById(f.ab);
    int j;
    long l;
    switch (bjm.a[(this.a.F().b() - 1)])
    {
    default: 
      paramViewGroup.setImageResource(a.el);
      paramLayoutInflater.findViewById(f.dZ).setOnClickListener(this);
      ((TextView)paramLayoutInflater.findViewById(f.bj)).setText(a(b.bx, new Object[] { this.a.F().b }));
      j = this.m.getInt("devicePosition", -1);
      l = this.m.getLong("scanStart", 0L);
      paramViewGroup = ape.a();
      if (!this.a.F().w) {
        break;
      }
    }
    for (int i = 106;; i = 16)
    {
      paramBundle = new apd(i, Integer.valueOf(j)).b(SystemClock.elapsedRealtime() - l);
      paramBundle.h = this.a.A();
      paramViewGroup.a(paramBundle);
      d(true);
      return paramLayoutInflater;
      paramViewGroup.setImageResource(a.en);
      break;
      paramViewGroup.setImageResource(a.em);
      break;
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
  
  public final void onClick(View paramView)
  {
    this.a.a(bjo.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */