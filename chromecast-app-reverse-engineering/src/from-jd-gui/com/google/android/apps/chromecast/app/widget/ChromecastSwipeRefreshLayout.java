package com.google.android.apps.chromecast.app.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import gt;
import lw;

public class ChromecastSwipeRefreshLayout
  extends lw
{
  public ChromecastSwipeRefreshLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public ChromecastSwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final boolean b()
  {
    Object localObject = findViewById(16908298);
    boolean bool;
    if (localObject == null) {
      bool = super.b();
    }
    for (;;)
    {
      return bool;
      if (Build.VERSION.SDK_INT < 14)
      {
        if ((localObject instanceof AbsListView))
        {
          localObject = (AbsListView)localObject;
          if ((((AbsListView)localObject).getChildCount() > 0) && ((((AbsListView)localObject).getFirstVisiblePosition() > 0) || (((AbsListView)localObject).getChildAt(0).getTop() < ((AbsListView)localObject).getPaddingTop()))) {
            bool = true;
          } else {
            bool = false;
          }
        }
        else if (((View)localObject).getScrollY() > 0)
        {
          bool = true;
        }
        else
        {
          bool = false;
        }
      }
      else {
        bool = gt.b((View)localObject, -1);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\widget\ChromecastSwipeRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */