import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

public final class bgb
  extends j
{
  private bgg a;
  private RecyclerView b;
  
  public static bgb a(dbp paramdbp)
  {
    Bundle localBundle = new Bundle();
    localBundle.putByteArray("searchResponse", dbf.a(paramdbp));
    paramdbp = new bgb();
    paramdbp.f(localBundle);
    return paramdbp;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = new bgg(this.y);
    paramLayoutInflater = paramLayoutInflater.inflate(a.fF, paramViewGroup, false);
    paramLayoutInflater.findViewById(f.dX).setVisibility(8);
    this.b = ((RecyclerView)paramLayoutInflater.findViewById(f.ak));
    this.b.a(this.a);
    paramViewGroup = new xw(this.y);
    paramViewGroup.a(1);
    this.b.a(paramViewGroup);
    this.b.setLayoutAnimation(new LayoutAnimationController(AnimationUtils.loadAnimation(this.y, a.dg)));
    int i = e().getDimensionPixelSize(a.ee);
    this.b.a(new bgc(this, i));
    try
    {
      paramViewGroup = dbp.a(this.m.getByteArray("searchResponse"));
      this.a.a(paramViewGroup.a);
      return paramLayoutInflater;
    }
    catch (dev paramViewGroup)
    {
      for (;;)
      {
        Log.w("Error parsing search response proto", paramViewGroup);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bgb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */