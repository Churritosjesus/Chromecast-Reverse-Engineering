import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class amm
  extends j
{
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.gn, paramViewGroup, false);
    ((ImageView)paramLayoutInflater.findViewById(f.cn)).setImageResource(a.eY);
    ((TextView)paramLayoutInflater.findViewById(f.co)).setText(b.bS);
    ((TextView)paramLayoutInflater.findViewById(f.cp)).setText(b.bT);
    ((TextView)paramLayoutInflater.findViewById(f.cq)).setText(b.bU);
    ((TextView)paramLayoutInflater.findViewById(f.cr)).setText(b.bV);
    return paramLayoutInflater;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\amm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */