import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListAdapter;

final class sw
  extends yc
  implements ta
{
  private ListAdapter i;
  
  public sw(sr paramsr, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.g = paramsr;
    a(true);
    this.f = 0;
    this.h = new sx(this, paramsr);
  }
  
  public final void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    this.i = paramListAdapter;
  }
  
  public final void a(CharSequence paramCharSequence) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\sw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */