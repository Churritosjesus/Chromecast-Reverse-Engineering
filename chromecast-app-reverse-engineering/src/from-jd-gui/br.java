import android.graphics.drawable.Drawable;

class br
  extends bq
{
  public final void a(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }
  
  public final boolean b(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }
  
  public Drawable c(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (!(paramDrawable instanceof bx)) {
      localObject = new bx(paramDrawable);
    }
    return (Drawable)localObject;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */