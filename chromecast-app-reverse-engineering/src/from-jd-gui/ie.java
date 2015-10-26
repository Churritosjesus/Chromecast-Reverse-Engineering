import android.view.View;
import android.view.ViewParent;

class ie
{
  public void a(ViewParent paramViewParent, View paramView)
  {
    if ((paramViewParent instanceof gk)) {
      ((gk)paramViewParent).onStopNestedScroll(paramView);
    }
  }
  
  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramViewParent instanceof gk)) {
      ((gk)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if ((paramViewParent instanceof gk)) {
      ((gk)paramViewParent).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    if ((paramViewParent instanceof gk)) {}
    for (boolean bool = ((gk)paramViewParent).onNestedPreFling(paramView, paramFloat1, paramFloat2);; bool = false) {
      return bool;
    }
  }
  
  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((paramViewParent instanceof gk)) {}
    for (paramBoolean = ((gk)paramViewParent).onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);; paramBoolean = false) {
      return paramBoolean;
    }
  }
  
  public boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    if ((paramViewParent instanceof gk)) {}
    for (boolean bool = ((gk)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt);; bool = false) {
      return bool;
    }
  }
  
  public void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    if ((paramViewParent instanceof gk)) {
      ((gk)paramViewParent).onNestedScrollAccepted(paramView1, paramView2, paramInt);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */