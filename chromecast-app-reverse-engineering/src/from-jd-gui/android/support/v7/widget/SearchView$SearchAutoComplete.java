package android.support.v7.widget;

import a;
import aaj;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.InputMethodManager;
import wk;

public class SearchView$SearchAutoComplete
  extends wk
{
  SearchView a;
  private int b = getThreshold();
  
  public SearchView$SearchAutoComplete(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.w);
  }
  
  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean enoughToFilter()
  {
    if ((this.b <= 0) || (super.enoughToFilter())) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    this.a.e();
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = true;
    KeyEvent.DispatcherState localDispatcherState;
    boolean bool1;
    if (paramInt == 4) {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        localDispatcherState = getKeyDispatcherState();
        bool1 = bool2;
        if (localDispatcherState != null)
        {
          localDispatcherState.startTracking(paramKeyEvent, this);
          bool1 = bool2;
        }
      }
    }
    for (;;)
    {
      return bool1;
      if (paramKeyEvent.getAction() == 1)
      {
        localDispatcherState = getKeyDispatcherState();
        if (localDispatcherState != null) {
          localDispatcherState.handleUpEvent(paramKeyEvent);
        }
        if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
        {
          this.a.clearFocus();
          SearchView.a(this.a, false);
          bool1 = bool2;
          continue;
        }
      }
      bool1 = super.onKeyPreIme(paramInt, paramKeyEvent);
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if ((paramBoolean) && (this.a.hasFocus()) && (getVisibility() == 0))
    {
      ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
      if (SearchView.a(getContext())) {
        SearchView.m.a(this, true);
      }
    }
  }
  
  public void performCompletion() {}
  
  protected void replaceText(CharSequence paramCharSequence) {}
  
  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    this.b = paramInt;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\widget\SearchView$SearchAutoComplete.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */