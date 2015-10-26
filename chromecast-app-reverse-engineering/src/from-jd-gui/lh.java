import android.view.View;
import android.widget.ListView;

public final class lh
  extends ke
{
  private final ListView a;
  
  public lh(ListView paramListView)
  {
    super(paramListView);
    this.a = paramListView;
  }
  
  public final void a(int paramInt)
  {
    ListView localListView = this.a;
    int i = localListView.getFirstVisiblePosition();
    if (i == -1) {}
    for (;;)
    {
      return;
      View localView = localListView.getChildAt(0);
      if (localView != null) {
        localListView.setSelectionFromTop(i, localView.getTop() - paramInt);
      }
    }
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool2 = false;
    ListView localListView = this.a;
    int k = localListView.getCount();
    boolean bool1;
    if (k == 0) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      int j = localListView.getChildCount();
      int i = localListView.getFirstVisiblePosition();
      if (paramInt > 0) {
        if (i + j >= k)
        {
          bool1 = bool2;
          if (localListView.getChildAt(j - 1).getBottom() <= localListView.getHeight()) {
            continue;
          }
        }
      }
      do
      {
        bool1 = true;
        break;
        bool1 = bool2;
        if (paramInt >= 0) {
          break;
        }
      } while ((i > 0) || (localListView.getChildAt(0).getTop() < 0));
      bool1 = bool2;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\lh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */