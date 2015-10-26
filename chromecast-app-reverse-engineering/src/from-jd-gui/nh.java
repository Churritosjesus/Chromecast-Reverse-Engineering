import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class nh
{
  static nh a(Context paramContext, Window paramWindow, ng paramng)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14) {
      paramContext = new nm(paramContext, paramWindow, paramng);
    }
    for (;;)
    {
      return paramContext;
      if (i >= 11) {
        paramContext = new nl(paramContext, paramWindow, paramng);
      } else {
        paramContext = new no(paramContext, paramWindow, paramng);
      }
    }
  }
  
  public abstract mj a();
  
  public abstract void a(int paramInt);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(Bundle paramBundle);
  
  public abstract void a(Toolbar paramToolbar);
  
  public abstract void a(View paramView);
  
  public abstract void a(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract MenuInflater b();
  
  public abstract void b(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract boolean b(int paramInt);
  
  public abstract void c();
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public abstract void g();
  
  public abstract mo h();
  
  public abstract void i();
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */