import android.annotation.TargetApi;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

@TargetApi(11)
public final class pk
  extends ActionMode
{
  final vr a;
  private Context b;
  
  public pk(Context paramContext, vr paramvr)
  {
    this.b = paramContext;
    this.a = paramvr;
  }
  
  public final void finish()
  {
    this.a.c();
  }
  
  public final View getCustomView()
  {
    return this.a.i();
  }
  
  public final Menu getMenu()
  {
    return a.a(this.b, (cc)this.a.b());
  }
  
  public final MenuInflater getMenuInflater()
  {
    return this.a.a();
  }
  
  public final CharSequence getSubtitle()
  {
    return this.a.g();
  }
  
  public final Object getTag()
  {
    return this.a.a;
  }
  
  public final CharSequence getTitle()
  {
    return this.a.f();
  }
  
  public final boolean getTitleOptionalHint()
  {
    return this.a.b;
  }
  
  public final void invalidate()
  {
    this.a.d();
  }
  
  public final boolean isTitleOptional()
  {
    return this.a.h();
  }
  
  public final void setCustomView(View paramView)
  {
    this.a.a(paramView);
  }
  
  public final void setSubtitle(int paramInt)
  {
    this.a.b(paramInt);
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.a.a(paramCharSequence);
  }
  
  public final void setTag(Object paramObject)
  {
    this.a.a = paramObject;
  }
  
  public final void setTitle(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.a.b(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\pk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */