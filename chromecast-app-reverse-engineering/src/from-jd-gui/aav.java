import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class aav
  extends BaseAdapter
  implements abs, Filterable
{
  final abw a;
  final int b;
  public final int c;
  abj d;
  LinkedHashMap e;
  List f;
  Set g;
  List h;
  int i;
  public CharSequence j;
  abr k;
  final aay l = new aay(this);
  abc m;
  private final Context n;
  private final ContentResolver o;
  private List p;
  
  public aav(Context paramContext)
  {
    this(paramContext, 10, 0);
  }
  
  private aav(Context paramContext, int paramInt1, int paramInt2)
  {
    this.n = paramContext;
    this.o = paramContext.getContentResolver();
    this.c = 10;
    this.k = new abg(this.o);
    this.b = 0;
    this.a = abt.b;
  }
  
  public static List a(Context paramContext, Cursor paramCursor, Account paramAccount)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    ArrayList localArrayList = new ArrayList();
    paramContext = null;
    while (paramCursor.moveToNext())
    {
      long l1 = paramCursor.getLong(0);
      if (l1 != 1L)
      {
        abb localabb = new abb();
        String str = paramCursor.getString(4);
        int i1 = paramCursor.getInt(5);
        localabb.a = l1;
        paramCursor.getString(3);
        localabb.c = paramCursor.getString(1);
        localabb.d = paramCursor.getString(2);
        if ((str != null) && (i1 != 0)) {}
        try
        {
          localabb.b = localPackageManager.getResourcesForApplication(str).getString(i1);
          if (localabb.b == null)
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(String.valueOf(str).length() + 43);
            Log.e("BaseRecipientAdapter", "Cannot resolve directory name: " + i1 + "@" + str);
          }
          if ((paramAccount != null) && (paramAccount.name.equals(localabb.c)) && (paramAccount.type.equals(localabb.d))) {
            paramContext = localabb;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          for (;;)
          {
            Log.e("BaseRecipientAdapter", String.valueOf(str).length() + 43 + "Cannot resolve directory name: " + i1 + "@" + str, localNameNotFoundException);
          }
          localArrayList.add(localabb);
        }
      }
    }
    if (paramContext != null) {
      localArrayList.add(1, paramContext);
    }
    return localArrayList;
  }
  
  private List a(LinkedHashMap paramLinkedHashMap, List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramLinkedHashMap = paramLinkedHashMap.entrySet().iterator();
    int i1 = 0;
    while (paramLinkedHashMap.hasNext())
    {
      List localList = (List)((Map.Entry)paramLinkedHashMap.next()).getValue();
      int i3 = localList.size();
      for (i2 = 0; i2 < i3; i2++)
      {
        acx localacx = (acx)localList.get(i2);
        localArrayList.add(localacx);
        this.k.a(localacx, this);
        i1++;
      }
      i2 = i1;
      if (i1 > this.c) {
        break label132;
      }
    }
    int i2 = i1;
    label132:
    if (i2 <= this.c)
    {
      paramLinkedHashMap = paramList.iterator();
      while (paramLinkedHashMap.hasNext())
      {
        paramList = (acx)paramLinkedHashMap.next();
        if (i2 > this.c) {
          break;
        }
        localArrayList.add(paramList);
        this.k.a(paramList, this);
        i2++;
      }
    }
    return localArrayList;
  }
  
  static void a(abd paramabd, boolean paramBoolean, LinkedHashMap paramLinkedHashMap, List paramList, Set paramSet)
  {
    if (paramSet.contains(paramabd.b)) {}
    for (;;)
    {
      return;
      paramSet.add(paramabd.b);
      if (!paramBoolean)
      {
        paramList.add(acx.a(paramabd.a, paramabd.i, paramabd.b, paramabd.c, paramabd.d, paramabd.e, paramabd.f, paramabd.g, paramabd.h, true, paramabd.j));
      }
      else if (paramLinkedHashMap.containsKey(Long.valueOf(paramabd.e)))
      {
        ((List)paramLinkedHashMap.get(Long.valueOf(paramabd.e))).add(acx.b(paramabd.a, paramabd.i, paramabd.b, paramabd.c, paramabd.d, paramabd.e, paramabd.f, paramabd.g, paramabd.h, true, paramabd.j));
      }
      else
      {
        paramList = new ArrayList();
        paramList.add(acx.a(paramabd.a, paramabd.i, paramabd.b, paramabd.c, paramabd.d, paramabd.e, paramabd.f, paramabd.g, paramabd.h, true, paramabd.j));
        paramLinkedHashMap.put(Long.valueOf(paramabd.e), paramList);
      }
    }
  }
  
  private List e()
  {
    if (this.h != null) {}
    for (List localList = this.h;; localList = this.p) {
      return localList;
    }
  }
  
  public final acx a(int paramInt)
  {
    return (acx)e().get(paramInt);
  }
  
  protected final List a()
  {
    return a(this.e, this.f);
  }
  
  protected final List a(Set paramSet)
  {
    List localList = null;
    if (!abe.a(this.n, null)) {}
    for (paramSet = null;; paramSet = null) {
      for (;;)
      {
        return paramSet;
        if (this.c - paramSet.size() > 0)
        {
          paramSet = localList;
          try
          {
            Cursor localCursor = this.o.query(aba.a, aba.b, null, null, null);
            paramSet = localCursor;
            localList = a(this.n, localCursor, null);
            paramSet = localList;
            if (localCursor != null)
            {
              localCursor.close();
              paramSet = localList;
            }
          }
          finally
          {
            if (paramSet != null) {
              paramSet.close();
            }
          }
        }
      }
    }
  }
  
  protected final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 > 1)) {
      this.h = this.p;
    }
  }
  
  public final void a(ArrayList paramArrayList, aca paramaca)
  {
    aby.a(this.n, this, paramArrayList, null, paramaca, null);
  }
  
  protected final void a(List paramList)
  {
    this.p = paramList;
    this.m.a(paramList);
    notifyDataSetChanged();
  }
  
  public final void b() {}
  
  public final void c()
  {
    notifyDataSetChanged();
  }
  
  public final void d() {}
  
  public final int getCount()
  {
    List localList = e();
    if (localList != null) {}
    for (int i1 = localList.size();; i1 = 0) {
      return i1;
    }
  }
  
  public final Filter getFilter()
  {
    return new aaw(this);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return ((acx)e().get(paramInt)).a;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    acx localacx = (acx)e().get(paramInt);
    if (this.j == null) {}
    for (String str = null;; str = this.j.toString()) {
      return this.d.a(paramView, paramViewGroup, localacx, paramInt, abn.a, str, null);
    }
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    acx localacx = (acx)e().get(paramInt);
    if ((localacx.a == 0) || (localacx.a == 1)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aav.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */