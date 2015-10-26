import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class biw
  extends j
  implements View.OnClickListener
{
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.gH, paramViewGroup, false);
    paramLayoutInflater.findViewById(f.dp).setOnClickListener(this);
    ((TextView)paramLayoutInflater.findViewById(f.dI)).setText(b.bY);
    ((TextView)paramLayoutInflater.findViewById(f.dJ)).setText(b.bZ);
    ((TextView)paramLayoutInflater.findViewById(f.dK)).setText(b.ca);
    ((TextView)paramLayoutInflater.findViewById(f.dL)).setText(b.cb);
    ((Button)paramLayoutInflater.findViewById(f.dp)).setText(b.cM);
    return paramLayoutInflater;
  }
  
  public final void onClick(View paramView)
  {
    ((bgu)this.y).a_(true);
    this.x.c();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\biw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */