import android.graphics.drawable.Drawable;

class bq
  extends bp
{
  public final void a(Drawable paramDrawable)
  {
    paramDrawable.jumpToCurrentState();
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof bw)) {
      localObject = new bw(paramDrawable);
    }
    return (Drawable)localObject;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */