import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class td
  extends sk
{
  private final tf a;
  
  public td(Resources paramResources, tf paramtf)
  {
    super(paramResources);
    this.a = paramtf;
  }
  
  public final Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = super.getDrawable(paramInt);
    if (localDrawable != null) {
      this.a.a(paramInt, localDrawable);
    }
    return localDrawable;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */