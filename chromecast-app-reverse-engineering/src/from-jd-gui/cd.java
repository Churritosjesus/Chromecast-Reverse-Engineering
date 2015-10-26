import android.view.MenuItem;
import android.view.View;

public abstract interface cd
  extends MenuItem
{
  public abstract cd a(fb paramfb);
  
  public abstract cd a(gc paramgc);
  
  public abstract fb a();
  
  public abstract boolean collapseActionView();
  
  public abstract boolean expandActionView();
  
  public abstract View getActionView();
  
  public abstract boolean isActionViewExpanded();
  
  public abstract MenuItem setActionView(int paramInt);
  
  public abstract MenuItem setActionView(View paramView);
  
  public abstract void setShowAsAction(int paramInt);
  
  public abstract MenuItem setShowAsActionFlags(int paramInt);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */