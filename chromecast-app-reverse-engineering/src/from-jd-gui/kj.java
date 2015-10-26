import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class kj
  extends BaseAdapter
  implements Filterable, kn
{
  public boolean a;
  public boolean b;
  public Cursor c;
  public Context d;
  private int e;
  private kk f;
  private DataSetObserver g;
  private km h;
  
  public kj(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    int i;
    label33:
    label40:
    int j;
    if (paramBoolean)
    {
      i = 1;
      if ((i & 0x1) != 1) {
        break label152;
      }
      i |= 0x2;
      this.b = true;
      if (paramCursor == null) {
        break label160;
      }
      paramBoolean = bool;
      this.c = paramCursor;
      this.a = paramBoolean;
      this.d = paramContext;
      if (!paramBoolean) {
        break label165;
      }
      j = paramCursor.getColumnIndexOrThrow("_id");
      label69:
      this.e = j;
      if ((i & 0x2) != 2) {
        break label171;
      }
      this.f = new kk(this);
    }
    for (this.g = new kl(this);; this.g = null)
    {
      if (paramBoolean)
      {
        if (this.f != null) {
          paramCursor.registerContentObserver(this.f);
        }
        if (this.g != null) {
          paramCursor.registerDataSetObserver(this.g);
        }
      }
      return;
      i = 2;
      break;
      label152:
      this.b = false;
      break label33;
      label160:
      paramBoolean = false;
      break label40;
      label165:
      j = -1;
      break label69;
      label171:
      this.f = null;
    }
  }
  
  public final Cursor a()
  {
    return this.c;
  }
  
  public Cursor a(CharSequence paramCharSequence)
  {
    return this.c;
  }
  
  public abstract View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public void a(Cursor paramCursor)
  {
    if (paramCursor == this.c) {
      paramCursor = null;
    }
    for (;;)
    {
      if (paramCursor != null) {
        paramCursor.close();
      }
      return;
      Cursor localCursor = this.c;
      if (localCursor != null)
      {
        if (this.f != null) {
          localCursor.unregisterContentObserver(this.f);
        }
        if (this.g != null) {
          localCursor.unregisterDataSetObserver(this.g);
        }
      }
      this.c = paramCursor;
      if (paramCursor != null)
      {
        if (this.f != null) {
          paramCursor.registerContentObserver(this.f);
        }
        if (this.g != null) {
          paramCursor.registerDataSetObserver(this.g);
        }
        this.e = paramCursor.getColumnIndexOrThrow("_id");
        this.a = true;
        notifyDataSetChanged();
        paramCursor = localCursor;
      }
      else
      {
        this.e = -1;
        this.a = false;
        notifyDataSetInvalidated();
        paramCursor = localCursor;
      }
    }
  }
  
  public abstract void a(View paramView, Cursor paramCursor);
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return a(paramContext, paramCursor, paramViewGroup);
  }
  
  public CharSequence b(Cursor paramCursor)
  {
    if (paramCursor == null) {}
    for (paramCursor = "";; paramCursor = paramCursor.toString()) {
      return paramCursor;
    }
  }
  
  public int getCount()
  {
    if ((this.a) && (this.c != null)) {}
    for (int i = this.c.getCount();; i = 0) {
      return i;
    }
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (this.a)
    {
      this.c.moveToPosition(paramInt);
      localView = paramView;
      if (paramView == null) {
        localView = b(this.d, this.c, paramViewGroup);
      }
      a(localView, this.c);
    }
    for (;;)
    {
      return localView;
      localView = null;
    }
  }
  
  public Filter getFilter()
  {
    if (this.h == null) {
      this.h = new km(this);
    }
    return this.h;
  }
  
  public Object getItem(int paramInt)
  {
    if ((this.a) && (this.c != null)) {
      this.c.moveToPosition(paramInt);
    }
    for (Cursor localCursor = this.c;; localCursor = null) {
      return localCursor;
    }
  }
  
  public long getItemId(int paramInt)
  {
    long l2 = 0L;
    long l1 = l2;
    if (this.a)
    {
      l1 = l2;
      if (this.c != null)
      {
        l1 = l2;
        if (this.c.moveToPosition(paramInt)) {
          l1 = this.c.getLong(this.e);
        }
      }
    }
    return l1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.a) {
      throw new IllegalStateException("this should only be called when the cursor is valid");
    }
    if (!this.c.moveToPosition(paramInt)) {
      throw new IllegalStateException("couldn't move cursor to position " + paramInt);
    }
    View localView = paramView;
    if (paramView == null) {
      localView = a(this.d, this.c, paramViewGroup);
    }
    a(localView, this.c);
    return localView;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\kj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */