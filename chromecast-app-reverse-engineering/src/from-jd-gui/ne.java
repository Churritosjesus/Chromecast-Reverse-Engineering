import android.content.Context;
import android.view.ContextThemeWrapper;

public final class ne
{
  public final mz a;
  public int b;
  
  public ne(Context paramContext)
  {
    this(paramContext, nd.a(paramContext, 0));
  }
  
  private ne(Context paramContext, int paramInt)
  {
    this.a = new mz(new ContextThemeWrapper(paramContext, nd.a(paramContext, paramInt)));
    this.b = paramInt;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */