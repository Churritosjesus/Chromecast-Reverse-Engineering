import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;

public final class pi
  extends ContextWrapper
{
  public int a;
  private Resources.Theme b;
  private LayoutInflater c;
  
  public pi(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.a = paramInt;
  }
  
  private void a()
  {
    if (this.b == null) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.b = getResources().newTheme();
        Resources.Theme localTheme = getBaseContext().getTheme();
        if (localTheme != null) {
          this.b.setTo(localTheme);
        }
      }
      this.b.applyStyle(this.a, true);
      return;
    }
  }
  
  public final Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString)) {
      if (this.c == null) {
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      }
    }
    for (paramString = this.c;; paramString = getBaseContext().getSystemService(paramString)) {
      return paramString;
    }
  }
  
  public final Resources.Theme getTheme()
  {
    if (this.b != null) {}
    for (Resources.Theme localTheme = this.b;; localTheme = this.b)
    {
      return localTheme;
      if (this.a == 0) {
        this.a = a.ca;
      }
      a();
    }
  }
  
  public final void setTheme(int paramInt)
  {
    this.a = paramInt;
    a();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */