import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class qa
  implements cc
{
  private static final int[] k = { 1, 4, 5, 3, 2, 0 };
  final Context a;
  public qb b;
  ArrayList c;
  public ArrayList d;
  public int e = 0;
  CharSequence f;
  Drawable g;
  View h;
  qe i;
  public boolean j;
  private final Resources l;
  private boolean m;
  private boolean n;
  private ArrayList o;
  private boolean p;
  private ArrayList q;
  private boolean r;
  private boolean s = false;
  private boolean t = false;
  private boolean u = false;
  private boolean v = false;
  private ArrayList w = new ArrayList();
  private CopyOnWriteArrayList x = new CopyOnWriteArrayList();
  
  public qa(Context paramContext)
  {
    this.a = paramContext;
    this.l = paramContext.getResources();
    this.c = new ArrayList();
    this.o = new ArrayList();
    this.p = true;
    this.d = new ArrayList();
    this.q = new ArrayList();
    this.r = true;
    if ((this.l.getConfiguration().keyboard != 1) && (this.l.getBoolean(a.X))) {}
    for (;;)
    {
      this.n = bool;
      return;
      bool = false;
    }
  }
  
  private static int a(ArrayList paramArrayList, int paramInt)
  {
    int i1 = paramArrayList.size() - 1;
    if (i1 >= 0) {
      if (((qe)paramArrayList.get(i1)).a > paramInt) {}
    }
    for (paramInt = i1 + 1;; paramInt = 0)
    {
      return paramInt;
      i1--;
      break;
    }
  }
  
  private MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = paramInt3 >> 16;
    if ((i1 < 0) || (i1 >= k.length)) {
      throw new IllegalArgumentException("order does not contain a valid category.");
    }
    i1 = k[i1] << 16 | 0xFFFF & paramInt3;
    paramCharSequence = new qe(this, paramInt1, paramInt2, paramInt3, i1, paramCharSequence, this.e);
    this.c.add(a(this.c, i1), paramCharSequence);
    b(true);
    return paramCharSequence;
  }
  
  private qe a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.w;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty()) {
      paramKeyEvent = null;
    }
    for (;;)
    {
      return paramKeyEvent;
      int i3 = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
      paramKeyEvent.getKeyData(localKeyData);
      int i4 = localArrayList.size();
      if (i4 == 1)
      {
        paramKeyEvent = (qe)localArrayList.get(0);
      }
      else
      {
        boolean bool = b();
        int i1 = 0;
        label88:
        if (i1 < i4)
        {
          qe localqe = (qe)localArrayList.get(i1);
          if (bool) {}
          for (int i2 = localqe.getAlphabeticShortcut();; i2 = localqe.getNumericShortcut())
          {
            if (i2 == localKeyData.meta[0])
            {
              paramKeyEvent = localqe;
              if ((i3 & 0x2) == 0) {
                break;
              }
            }
            if (i2 == localKeyData.meta[2])
            {
              paramKeyEvent = localqe;
              if ((i3 & 0x2) != 0) {
                break;
              }
            }
            if ((bool) && (i2 == 8))
            {
              paramKeyEvent = localqe;
              if (paramInt == 67) {
                break;
              }
            }
            i1++;
            break label88;
          }
        }
        paramKeyEvent = null;
      }
    }
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.c.size())) {}
    for (;;)
    {
      return;
      this.c.remove(paramInt);
      if (paramBoolean) {
        b(true);
      }
    }
  }
  
  private void a(List paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = b();
    int i3 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67)) {
      return;
    }
    int i4 = this.c.size();
    int i1 = 0;
    label49:
    qe localqe;
    if (i1 < i4)
    {
      localqe = (qe)this.c.get(i1);
      if (localqe.hasSubMenu()) {
        ((qa)localqe.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      }
      if (!bool) {
        break label181;
      }
    }
    label181:
    for (int i2 = localqe.getAlphabeticShortcut();; i2 = localqe.getNumericShortcut())
    {
      if (((i3 & 0x5) == 0) && (i2 != 0) && ((i2 == localKeyData.meta[0]) || (i2 == localKeyData.meta[2]) || ((bool) && (i2 == 8) && (paramInt == 67))) && (localqe.isEnabled())) {
        paramList.add(localqe);
      }
      i1++;
      break label49;
      break;
    }
  }
  
  protected String a()
  {
    return "android:menu:actionviewstates";
  }
  
  protected final qa a(Drawable paramDrawable)
  {
    a(0, null, 0, paramDrawable, null);
    return this;
  }
  
  protected final qa a(CharSequence paramCharSequence)
  {
    a(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    if (paramView != null)
    {
      this.h = paramView;
      this.f = null;
      this.g = null;
    }
    for (;;)
    {
      b(false);
      return;
      if (paramCharSequence != null) {
        this.f = paramCharSequence;
      }
      if (paramDrawable != null) {
        this.g = paramDrawable;
      }
      this.h = null;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    int i2 = size();
    int i1 = 0;
    Object localObject3;
    for (Object localObject1 = null; i1 < i2; localObject1 = localObject3)
    {
      MenuItem localMenuItem = getItem(i1);
      View localView = fx.a(localMenuItem);
      localObject3 = localObject1;
      if (localView != null)
      {
        localObject3 = localObject1;
        if (localView.getId() != -1)
        {
          Object localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new SparseArray();
          }
          localView.saveHierarchyState((SparseArray)localObject2);
          localObject3 = localObject2;
          if (fx.c(localMenuItem))
          {
            paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
            localObject3 = localObject2;
          }
        }
      }
      if (localMenuItem.hasSubMenu()) {
        ((qu)localMenuItem.getSubMenu()).a(paramBundle);
      }
      i1++;
    }
    if (localObject1 != null) {
      paramBundle.putSparseParcelableArray(a(), (SparseArray)localObject1);
    }
  }
  
  public void a(qb paramqb)
  {
    this.b = paramqb;
  }
  
  public final void a(qp paramqp)
  {
    a(paramqp, this.a);
  }
  
  public final void a(qp paramqp, Context paramContext)
  {
    this.x.add(new WeakReference(paramqp));
    paramqp.a(paramContext, this);
    this.r = true;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.v) {}
    for (;;)
    {
      return;
      this.v = true;
      Iterator localIterator = this.x.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        qp localqp = (qp)localWeakReference.get();
        if (localqp == null) {
          this.x.remove(localWeakReference);
        } else {
          localqp.a(this, paramBoolean);
        }
      }
      this.v = false;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem, qp paramqp, int paramInt)
  {
    boolean bool3 = false;
    boolean bool1 = false;
    paramMenuItem = (qe)paramMenuItem;
    if ((paramMenuItem == null) || (!paramMenuItem.isEnabled())) {
      bool1 = false;
    }
    boolean bool2;
    Object localObject;
    for (;;)
    {
      return bool1;
      bool2 = paramMenuItem.b();
      localObject = paramMenuItem.d;
      if ((localObject != null) && (((fb)localObject).f())) {}
      for (int i1 = 1;; i1 = 0)
      {
        if (!paramMenuItem.i()) {
          break label99;
        }
        bool2 = paramMenuItem.expandActionView() | bool2;
        bool1 = bool2;
        if (!bool2) {
          break;
        }
        a(true);
        bool1 = bool2;
        break;
      }
      label99:
      if ((!paramMenuItem.hasSubMenu()) && (i1 == 0)) {
        break label291;
      }
      a(false);
      if (!paramMenuItem.hasSubMenu()) {
        paramMenuItem.a(new qu(this.a, this, paramMenuItem));
      }
      paramMenuItem = (qu)paramMenuItem.getSubMenu();
      if (i1 != 0) {
        ((fb)localObject).a(paramMenuItem);
      }
      if (!this.x.isEmpty()) {
        break;
      }
      label169:
      bool2 |= bool1;
      bool1 = bool2;
      if (!bool2)
      {
        a(true);
        bool1 = bool2;
      }
    }
    bool1 = bool3;
    if (paramqp != null) {
      bool1 = paramqp.a(paramMenuItem);
    }
    paramqp = this.x.iterator();
    label222:
    while (paramqp.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)paramqp.next();
      localObject = (qp)localWeakReference.get();
      if (localObject == null)
      {
        this.x.remove(localWeakReference);
      }
      else
      {
        if (bool1) {
          break label309;
        }
        bool1 = ((qp)localObject).a(paramMenuItem);
      }
    }
    label291:
    label309:
    for (;;)
    {
      break label222;
      break label169;
      if ((paramInt & 0x1) == 0) {
        a(true);
      }
      bool1 = bool2;
      break;
    }
  }
  
  boolean a(qa paramqa, MenuItem paramMenuItem)
  {
    if ((this.b != null) && (this.b.a(paramqa, paramMenuItem))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean a(qe paramqe)
  {
    boolean bool2 = false;
    if (this.x.isEmpty()) {}
    for (;;)
    {
      return bool2;
      d();
      Iterator localIterator = this.x.iterator();
      boolean bool1 = false;
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        qp localqp = (qp)localWeakReference.get();
        if (localqp == null)
        {
          this.x.remove(localWeakReference);
        }
        else
        {
          bool2 = localqp.b(paramqe);
          bool1 = bool2;
          if (bool2) {
            break;
          }
          bool1 = bool2;
        }
      }
      e();
      bool2 = bool1;
      if (bool1)
      {
        this.i = paramqe;
        bool2 = bool1;
      }
    }
  }
  
  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.l.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.l.getString(paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.a.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i1;
    label52:
    ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i1 = localList.size();
      if ((paramInt4 & 0x1) == 0) {
        removeGroup(paramInt1);
      }
      paramInt4 = 0;
      if (paramInt4 >= i1) {
        break label211;
      }
      localResolveInfo = (ResolveInfo)localList.get(paramInt4);
      if (localResolveInfo.specificIndex >= 0) {
        break label198;
      }
    }
    label198:
    for (paramComponentName = paramIntent;; paramComponentName = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      paramComponentName = new Intent(paramComponentName);
      paramComponentName.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      paramComponentName = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(paramComponentName);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0)) {
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = paramComponentName;
      }
      paramInt4++;
      break label52;
      i1 = 0;
      break;
    }
    label211:
    return i1;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.l.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.l.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    qe localqe = (qe)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    paramCharSequence = new qu(this.a, this, localqe);
    localqe.a(paramCharSequence);
    return paramCharSequence;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void b(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (;;)
    {
      return;
      SparseArray localSparseArray = paramBundle.getSparseParcelableArray(a());
      int i2 = size();
      for (int i1 = 0; i1 < i2; i1++)
      {
        MenuItem localMenuItem = getItem(i1);
        View localView = fx.a(localMenuItem);
        if ((localView != null) && (localView.getId() != -1)) {
          localView.restoreHierarchyState(localSparseArray);
        }
        if (localMenuItem.hasSubMenu()) {
          ((qu)localMenuItem.getSubMenu()).b(paramBundle);
        }
      }
      i1 = paramBundle.getInt("android:menu:expandedactionview");
      if (i1 > 0)
      {
        paramBundle = findItem(i1);
        if (paramBundle != null) {
          fx.b(paramBundle);
        }
      }
    }
  }
  
  public final void b(qp paramqp)
  {
    Iterator localIterator = this.x.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      qp localqp = (qp)localWeakReference.get();
      if ((localqp == null) || (localqp == paramqp)) {
        this.x.remove(localWeakReference);
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (!this.s)
    {
      if (paramBoolean)
      {
        this.p = true;
        this.r = true;
      }
      if (!this.x.isEmpty())
      {
        d();
        Iterator localIterator = this.x.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          qp localqp = (qp)localWeakReference.get();
          if (localqp == null) {
            this.x.remove(localWeakReference);
          } else {
            localqp.b(paramBoolean);
          }
        }
        e();
      }
    }
    for (;;)
    {
      return;
      this.t = true;
    }
  }
  
  boolean b()
  {
    return this.m;
  }
  
  public boolean b(qe paramqe)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!this.x.isEmpty())
    {
      if (this.i == paramqe) {
        break label32;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      label32:
      d();
      Iterator localIterator = this.x.iterator();
      bool1 = false;
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        qp localqp = (qp)localWeakReference.get();
        if (localqp == null)
        {
          this.x.remove(localWeakReference);
        }
        else
        {
          bool2 = localqp.c(paramqe);
          bool1 = bool2;
          if (bool2) {
            break;
          }
          bool1 = bool2;
        }
      }
      e();
      bool2 = bool1;
      if (bool1)
      {
        this.i = null;
        bool2 = bool1;
      }
    }
  }
  
  public boolean c()
  {
    return this.n;
  }
  
  public void clear()
  {
    if (this.i != null) {
      b(this.i);
    }
    this.c.clear();
    b(true);
  }
  
  public void clearHeader()
  {
    this.g = null;
    this.f = null;
    this.h = null;
    b(false);
  }
  
  public void close()
  {
    a(true);
  }
  
  public final void d()
  {
    if (!this.s)
    {
      this.s = true;
      this.t = false;
    }
  }
  
  public final void e()
  {
    this.s = false;
    if (this.t)
    {
      this.t = false;
      b(true);
    }
  }
  
  final void f()
  {
    this.p = true;
    b(true);
  }
  
  public MenuItem findItem(int paramInt)
  {
    int i2 = size();
    int i1 = 0;
    Object localObject;
    if (i1 < i2)
    {
      localObject = (qe)this.c.get(i1);
      if (((qe)localObject).getItemId() != paramInt) {}
    }
    for (;;)
    {
      return (MenuItem)localObject;
      if (((qe)localObject).hasSubMenu())
      {
        MenuItem localMenuItem = ((qe)localObject).getSubMenu().findItem(paramInt);
        localObject = localMenuItem;
        if (localMenuItem != null) {}
      }
      else
      {
        i1++;
        break;
        localObject = null;
      }
    }
  }
  
  final void g()
  {
    this.r = true;
    b(true);
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.c.get(paramInt);
  }
  
  public final ArrayList h()
  {
    if (!this.p) {}
    for (Object localObject = this.o;; localObject = this.o)
    {
      return (ArrayList)localObject;
      this.o.clear();
      int i2 = this.c.size();
      for (int i1 = 0; i1 < i2; i1++)
      {
        localObject = (qe)this.c.get(i1);
        if (((qe)localObject).isVisible()) {
          this.o.add(localObject);
        }
      }
      this.p = false;
      this.r = true;
    }
  }
  
  public boolean hasVisibleItems()
  {
    boolean bool;
    if (this.j) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      int i2 = size();
      for (int i1 = 0;; i1++)
      {
        if (i1 >= i2) {
          break label51;
        }
        if (((qe)this.c.get(i1)).isVisible())
        {
          bool = true;
          break;
        }
      }
      label51:
      bool = false;
    }
  }
  
  public final void i()
  {
    ArrayList localArrayList = h();
    if (!this.r) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.x.iterator();
      int i1 = 0;
      Object localObject;
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        localObject = (qp)localWeakReference.get();
        if (localObject == null) {
          this.x.remove(localWeakReference);
        } else {
          i1 = ((qp)localObject).a() | i1;
        }
      }
      if (i1 != 0)
      {
        this.d.clear();
        this.q.clear();
        int i2 = localArrayList.size();
        i1 = 0;
        if (i1 < i2)
        {
          localObject = (qe)localArrayList.get(i1);
          if (((qe)localObject).f()) {
            this.d.add(localObject);
          }
          for (;;)
          {
            i1++;
            break;
            this.q.add(localObject);
          }
        }
      }
      else
      {
        this.d.clear();
        this.q.clear();
        this.q.addAll(h());
      }
      this.r = false;
    }
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    if (a(paramInt, paramKeyEvent) != null) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final ArrayList j()
  {
    i();
    return this.q;
  }
  
  public qa k()
  {
    return this;
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), null, paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (paramKeyEvent != null) {
      bool = a(paramKeyEvent, null, paramInt2);
    }
    if ((paramInt2 & 0x2) != 0) {
      a(true);
    }
    return bool;
  }
  
  public void removeGroup(int paramInt)
  {
    int i2 = size();
    int i1 = 0;
    if (i1 < i2) {
      if (((qe)this.c.get(i1)).getGroupId() != paramInt) {}
    }
    for (;;)
    {
      label30:
      if (i1 >= 0)
      {
        int i3 = this.c.size();
        i2 = 0;
        for (;;)
        {
          if ((i2 < i3 - i1) && (((qe)this.c.get(i1)).getGroupId() == paramInt))
          {
            a(i1, false);
            i2++;
            continue;
            i1++;
            break;
            i1 = -1;
            break label30;
          }
        }
        b(true);
      }
    }
  }
  
  public void removeItem(int paramInt)
  {
    int i2 = size();
    int i1 = 0;
    if (i1 < i2) {
      if (((qe)this.c.get(i1)).getItemId() != paramInt) {}
    }
    for (paramInt = i1;; paramInt = -1)
    {
      a(paramInt, true);
      return;
      i1++;
      break;
    }
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i2 = this.c.size();
    for (int i1 = 0; i1 < i2; i1++)
    {
      qe localqe = (qe)this.c.get(i1);
      if (localqe.getGroupId() == paramInt)
      {
        localqe.a(paramBoolean2);
        localqe.setCheckable(paramBoolean1);
      }
    }
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i2 = this.c.size();
    for (int i1 = 0; i1 < i2; i1++)
    {
      qe localqe = (qe)this.c.get(i1);
      if (localqe.getGroupId() == paramInt) {
        localqe.setEnabled(paramBoolean);
      }
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i3 = this.c.size();
    int i2 = 0;
    int i1 = 0;
    if (i2 < i3)
    {
      qe localqe = (qe)this.c.get(i2);
      if ((localqe.getGroupId() != paramInt) || (!localqe.c(paramBoolean))) {
        break label71;
      }
      i1 = 1;
    }
    label71:
    for (;;)
    {
      i2++;
      break;
      if (i1 != 0) {
        b(true);
      }
      return;
    }
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    this.m = paramBoolean;
    b(false);
  }
  
  public int size()
  {
    return this.c.size();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */