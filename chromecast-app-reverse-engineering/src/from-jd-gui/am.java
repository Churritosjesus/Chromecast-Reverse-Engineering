import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class am
  extends j
{
  private ListAdapter Z;
  ListView a;
  private View aa;
  private TextView ab;
  private View ac;
  private View ad;
  private boolean ae;
  private final Handler b = new Handler();
  private final Runnable c = new an(this);
  private final AdapterView.OnItemClickListener d = new ao(this);
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    p();
    if (this.ac == null) {
      throw new IllegalStateException("Can't be used with a custom content view");
    }
    if (this.ae == paramBoolean1) {
      return;
    }
    this.ae = paramBoolean1;
    if (paramBoolean1)
    {
      if (paramBoolean2)
      {
        this.ac.startAnimation(AnimationUtils.loadAnimation(this.y, 17432577));
        this.ad.startAnimation(AnimationUtils.loadAnimation(this.y, 17432576));
      }
      for (;;)
      {
        this.ac.setVisibility(8);
        this.ad.setVisibility(0);
        break;
        this.ac.clearAnimation();
        this.ad.clearAnimation();
      }
    }
    if (paramBoolean2)
    {
      this.ac.startAnimation(AnimationUtils.loadAnimation(this.y, 17432576));
      this.ad.startAnimation(AnimationUtils.loadAnimation(this.y, 17432577));
    }
    for (;;)
    {
      this.ac.setVisibility(0);
      this.ad.setVisibility(8);
      break;
      this.ac.clearAnimation();
      this.ad.clearAnimation();
    }
  }
  
  private void p()
  {
    boolean bool = false;
    if (this.a != null) {
      return;
    }
    Object localObject = this.N;
    if (localObject == null) {
      throw new IllegalStateException("Content view not yet created");
    }
    label44:
    int i;
    if ((localObject instanceof ListView))
    {
      this.a = ((ListView)localObject);
      this.ae = true;
      this.a.setOnItemClickListener(this.d);
      if (this.Z == null) {
        break label284;
      }
      localObject = this.Z;
      this.Z = null;
      if (this.Z == null) {
        break label279;
      }
      i = 1;
      label86:
      this.Z = ((ListAdapter)localObject);
      if (this.a != null)
      {
        this.a.setAdapter((ListAdapter)localObject);
        if ((!this.ae) && (i == 0))
        {
          if (this.N.getWindowToken() != null) {
            bool = true;
          }
          a(true, bool);
        }
      }
    }
    for (;;)
    {
      this.b.post(this.c);
      break;
      this.ab = ((TextView)((View)localObject).findViewById(16711681));
      if (this.ab == null) {
        this.aa = ((View)localObject).findViewById(16908292);
      }
      for (;;)
      {
        this.ac = ((View)localObject).findViewById(16711682);
        this.ad = ((View)localObject).findViewById(16711683);
        localObject = ((View)localObject).findViewById(16908298);
        if ((localObject instanceof ListView)) {
          break label250;
        }
        if (localObject != null) {
          break;
        }
        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
        this.ab.setVisibility(8);
      }
      throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
      label250:
      this.a = ((ListView)localObject);
      if (this.aa == null) {
        break label44;
      }
      this.a.setEmptyView(this.aa);
      break label44;
      label279:
      i = 0;
      break label86;
      label284:
      if (this.ac != null) {
        a(false, false);
      }
    }
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramBundle = this.y;
    paramLayoutInflater = new FrameLayout(paramBundle);
    paramViewGroup = new LinearLayout(paramBundle);
    paramViewGroup.setId(16711682);
    paramViewGroup.setOrientation(1);
    paramViewGroup.setVisibility(8);
    paramViewGroup.setGravity(17);
    paramViewGroup.addView(new ProgressBar(paramBundle, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
    paramLayoutInflater.addView(paramViewGroup, new FrameLayout.LayoutParams(-1, -1));
    paramViewGroup = new FrameLayout(paramBundle);
    paramViewGroup.setId(16711683);
    paramBundle = new TextView(this.y);
    paramBundle.setId(16711681);
    paramBundle.setGravity(17);
    paramViewGroup.addView(paramBundle, new FrameLayout.LayoutParams(-1, -1));
    paramBundle = new ListView(this.y);
    paramBundle.setId(16908298);
    paramBundle.setDrawSelectorOnTop(false);
    paramViewGroup.addView(paramBundle, new FrameLayout.LayoutParams(-1, -1));
    paramLayoutInflater.addView(paramViewGroup, new FrameLayout.LayoutParams(-1, -1));
    paramLayoutInflater.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    return paramLayoutInflater;
  }
  
  public void a(View paramView, int paramInt) {}
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    p();
  }
  
  public final void d()
  {
    this.b.removeCallbacks(this.c);
    this.a = null;
    this.ae = false;
    this.ad = null;
    this.ac = null;
    this.aa = null;
    this.ab = null;
    super.d();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */