import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class bjs
  extends j
  implements View.OnClickListener
{
  public static bjs a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    bjs localbjs = new bjs();
    Bundle localBundle = new Bundle();
    localBundle.putInt("headerText", paramInt1);
    localBundle.putInt("descriptionText", paramInt2);
    localBundle.putBoolean("showTroubleshoot", paramBoolean);
    localbjs.f(localBundle);
    return localbjs;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramViewGroup = paramLayoutInflater.inflate(a.gt, paramViewGroup, false);
    paramLayoutInflater = this.m;
    ((TextView)paramViewGroup.findViewById(f.bo)).setText(paramLayoutInflater.getInt("headerText"));
    paramBundle = (TextView)paramViewGroup.findViewById(f.aq);
    paramBundle.setText(paramLayoutInflater.getInt("descriptionText"));
    paramBundle.setMovementMethod(new ScrollingMovementMethod());
    paramBundle = (Button)paramViewGroup.findViewById(f.aR);
    paramBundle.setOnClickListener(this);
    if (paramLayoutInflater.getBoolean("showTroubleshoot")) {}
    for (int i = b.cA;; i = b.cr)
    {
      paramBundle.setText(i);
      blx.g(this.y);
      return paramViewGroup;
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.m.getBoolean("showTroubleshoot")) {
      ((bjt)this.y).m();
    }
    for (;;)
    {
      return;
      ((bjt)this.y).l();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bjs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */