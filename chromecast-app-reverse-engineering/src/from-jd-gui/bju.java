import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class bju
  extends j
  implements View.OnClickListener
{
  public static bju a(boolean paramBoolean)
  {
    bju localbju = new bju();
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("tvError", paramBoolean);
    localbju.f(localBundle);
    return localbju;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(a.gu, paramViewGroup, false);
    paramBundle = (TextView)localView.findViewById(f.aq);
    localView.findViewById(f.O).setOnClickListener(this);
    ImageView localImageView = (ImageView)localView.findViewById(f.bv);
    paramLayoutInflater = (Button)localView.findViewById(f.L);
    paramLayoutInflater.setOnClickListener(this);
    Button localButton = (Button)localView.findViewById(f.M);
    localButton.setOnClickListener(this);
    paramViewGroup = (Button)localView.findViewById(f.N);
    paramViewGroup.setOnClickListener(this);
    if (this.m.getBoolean("tvError"))
    {
      paramBundle.setText(b.cB);
      localImageView.setImageResource(a.ez);
      paramLayoutInflater.setText(b.cC);
      localButton.setText(b.cD);
      paramViewGroup.setVisibility(8);
    }
    for (;;)
    {
      return localView;
      paramBundle.setText(b.cj);
      localImageView.setImageResource(a.ey);
      paramLayoutInflater.setText(b.ck);
      localButton.setText(b.cl);
      paramViewGroup.setText(b.cm);
    }
  }
  
  public final void onClick(View paramView)
  {
    ((bjv)this.y).a(paramView.getId());
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */