import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class cqs
  extends BaseAdapter
{
  private static final int f = a.ip;
  public cqj a;
  public boolean b = true;
  public boolean c = true;
  public boolean d;
  public cqe e;
  private cqv g;
  private s h;
  private int i;
  private LayoutInflater j;
  private int k;
  private Context l;
  private ArrayList m = new ArrayList();
  
  public cqs(Context paramContext, int paramInt, cqv paramcqv, s params)
  {
    this.l = paramContext;
    if (paramInt != -1)
    {
      this.i = paramInt;
      this.j = LayoutInflater.from(paramContext);
      if (paramcqv == null) {
        break label132;
      }
    }
    for (;;)
    {
      this.g = paramcqv;
      this.h = params;
      paramInt = a.hI;
      paramcqv = paramContext.obtainStyledAttributes(new TypedValue().data, new int[] { paramInt });
      this.k = paramcqv.getColor(0, paramContext.getResources().getColor(a.hK));
      paramcqv.recycle();
      this.e = new cqe(paramContext);
      return;
      paramInt = f;
      break;
      label132:
      paramcqv = new cqt(this);
    }
  }
  
  public static List a(List paramList, csq paramcsq1, csq paramcsq2)
  {
    if (paramcsq2 != null)
    {
      paramcsq2 = paramcsq2.a();
      if (paramcsq1 == null) {
        break label136;
      }
    }
    int i2;
    int i3;
    label136:
    for (String str = paramcsq1.a();; str = null)
    {
      i2 = -1;
      i3 = -1;
      int n = 0;
      while (n < paramList.size())
      {
        csq localcsq = (csq)paramList.get(n);
        int i1 = i3;
        if (i3 < 0)
        {
          i1 = i3;
          if (localcsq.a().equals(paramcsq2)) {
            i1 = n;
          }
        }
        i3 = i2;
        if (i2 < 0)
        {
          i3 = i2;
          if (localcsq.a().equals(str)) {
            i3 = n;
          }
        }
        n++;
        i2 = i3;
        i3 = i1;
      }
      paramcsq2 = null;
      break;
    }
    if (i3 >= 0) {
      paramList.remove(i3);
    }
    if ((i2 < 0) && (str != null) && (!str.equals(paramcsq2))) {
      paramList.add(paramcsq1);
    }
    return paramList;
  }
  
  private boolean b(int paramInt)
  {
    int n;
    if (this.b)
    {
      n = -2;
      if ((!this.c) || (paramInt != n + getCount())) {
        break label36;
      }
    }
    label36:
    for (boolean bool = true;; bool = false)
    {
      return bool;
      n = -1;
      break;
    }
  }
  
  private boolean c(int paramInt)
  {
    if ((this.b) && (paramInt == getCount() - 1)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final csq a(int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (!b(paramInt))
    {
      if (!c(paramInt)) {
        break label24;
      }
      localObject1 = localObject2;
    }
    for (;;)
    {
      return (csq)localObject1;
      label24:
      localObject1 = localObject2;
      if (this.m != null) {
        localObject1 = (csq)this.m.get(paramInt);
      }
    }
  }
  
  public final void a(List paramList)
  {
    if (this.d)
    {
      this.m.clear();
      if (paramList != null)
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localObject = (csq)paramList.next();
          this.m.add(localObject);
        }
      }
      notifyDataSetChanged();
      notifyDataSetChanged();
      return;
    }
    Object localObject = this.e;
    if ((paramList == null) || (paramList.isEmpty())) {
      ((cqe)localObject).a();
    }
    for (;;)
    {
      this.m = ((cqe)localObject).b;
      break;
      if (((cqe)localObject).e == null) {
        ((cqe)localObject).e = AccountManager.get(((cqe)localObject).a);
      }
      ((cqe)localObject).c = ((cqe)localObject).e.getAccountsByType("com.google");
      ((cqe)localObject).d.clear();
      csq localcsq;
      if (paramList != null)
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localcsq = (csq)paramList.next();
          ((cqe)localObject).d.put(localcsq.a(), localcsq);
        }
      }
      if (((cqe)localObject).d.isEmpty())
      {
        ((cqe)localObject).a();
      }
      else
      {
        ((cqe)localObject).b.clear();
        for (localcsq : ((cqe)localObject).c)
        {
          localcsq = (csq)((cqe)localObject).d.get(localcsq.name);
          if (localcsq != null) {
            ((cqe)localObject).b.add(localcsq);
          }
        }
      }
    }
  }
  
  public final int getCount()
  {
    int i1 = 1;
    int i2 = 0;
    int n;
    if (this.b)
    {
      n = 1;
      if (!this.c) {
        break label46;
      }
    }
    for (;;)
    {
      if (this.m != null) {
        i2 = this.m.size();
      }
      return n + i1 + i2;
      n = 0;
      break;
      label46:
      i1 = 0;
    }
  }
  
  public final long getItemId(int paramInt)
  {
    long l2 = -1L;
    long l1;
    if (c(paramInt)) {
      l1 = -2L;
    }
    for (;;)
    {
      return l1;
      l1 = l2;
      if (!b(paramInt))
      {
        l1 = l2;
        if (this.m != null) {
          l1 = ((csq)this.m.get(paramInt)).a().hashCode();
        }
      }
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (c(paramInt)) {
      paramInt = 2;
    }
    for (;;)
    {
      return paramInt;
      if (b(paramInt)) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
    }
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (getItemViewType(paramInt) == 2)
    {
      paramViewGroup = paramView;
      if (paramView == null) {
        paramViewGroup = this.j.inflate(a.is, null);
      }
    }
    for (;;)
    {
      return paramViewGroup;
      if (getItemViewType(paramInt) != 1) {
        break;
      }
      paramViewGroup = paramView;
      if (paramView == null) {
        paramViewGroup = this.j.inflate(a.ir, null);
      }
    }
    View localView = paramView;
    if (paramView == null) {
      localView = this.j.inflate(this.i, null);
    }
    csq localcsq = a(paramInt);
    paramViewGroup = this.a;
    Object localObject = this.g;
    paramView = this.h;
    paramInt = this.k;
    if (localView.getTag() == null)
    {
      paramView = ((cqv)localObject).a(localView);
      localView.setTag(paramView);
      label132:
      if ((paramView.b != null) && (paramViewGroup != null))
      {
        paramView.b.setImageDrawable(null);
        if (TextUtils.isEmpty(localcsq.c())) {
          break label287;
        }
        paramViewGroup.a(paramView.b);
        paramViewGroup.a(paramView.b, localcsq.a(), localcsq.d(), 1);
      }
    }
    for (;;)
    {
      paramViewGroup = localView;
      if (paramView.a == null) {
        break;
      }
      paramView.a.setTextColor(paramInt);
      paramView.a.setVisibility(0);
      paramView.a.setText(localcsq.a());
      paramView.a.setContentDescription(this.l.getResources().getString(b.eB, new Object[] { localcsq.a() }));
      paramViewGroup = localView;
      break;
      paramView = (cqu)localView.getTag();
      break label132;
      label287:
      paramViewGroup.a(paramView.b);
      paramViewGroup = paramView.b;
      localObject = localView.getContext();
      localcsq.a();
      localcsq.d();
      paramViewGroup.setImageBitmap(cqj.a((Context)localObject));
    }
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cqs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */