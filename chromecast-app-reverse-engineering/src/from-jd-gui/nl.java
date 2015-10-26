import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.view.Window;

class nl
  extends no
{
  nl(Context paramContext, Window paramWindow, ng paramng)
  {
    super(paramContext, paramWindow, paramng);
  }
  
  final View b(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = super.b(paramView, paramString, paramContext, paramAttributeSet);
    if (localView != null) {
      paramView = localView;
    }
    for (;;)
    {
      return paramView;
      if ((this.c instanceof LayoutInflater.Factory2)) {
        paramView = ((LayoutInflater.Factory2)this.c).onCreateView(paramView, paramString, paramContext, paramAttributeSet);
      } else {
        paramView = null;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\nl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */