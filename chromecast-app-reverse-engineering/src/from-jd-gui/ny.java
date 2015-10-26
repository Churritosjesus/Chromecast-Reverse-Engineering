import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class ny
  extends Dialog
  implements ng
{
  private nh a;
  
  public ny(Context paramContext, int paramInt)
  {
    super(paramContext, i);
    a().a(null);
  }
  
  public final nh a()
  {
    if (this.a == null) {
      this.a = nh.a(getContext(), getWindow(), this);
    }
    return this.a;
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    a().b(paramView, paramLayoutParams);
  }
  
  public void invalidateOptionsMenu()
  {
    a().f();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    a().i();
    super.onCreate(paramBundle);
    a().a(paramBundle);
  }
  
  protected void onStop()
  {
    super.onStop();
    a().d();
  }
  
  public void setContentView(int paramInt)
  {
    a().a(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    a().a(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    a().a(paramView, paramLayoutParams);
  }
  
  public void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    a().a(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    a().a(paramCharSequence);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */