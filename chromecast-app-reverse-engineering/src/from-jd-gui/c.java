import android.os.Build.VERSION;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

final class c
  extends af
  implements Runnable
{
  private static boolean n;
  b a;
  int b;
  int c;
  int d;
  boolean e;
  String f;
  int g = -1;
  int h;
  CharSequence i;
  int j;
  CharSequence k;
  ArrayList l;
  ArrayList m;
  private t o;
  private b p;
  private boolean q = true;
  private boolean r;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (boolean bool = true;; bool = false)
    {
      n = bool;
      return;
    }
  }
  
  public c(t paramt)
  {
    this.o = paramt;
  }
  
  private int a(boolean paramBoolean)
  {
    if (this.r) {
      throw new IllegalStateException("commit already called");
    }
    boolean bool = t.a;
    this.r = true;
    if (this.e) {}
    for (this.g = this.o.a(this);; this.g = -1)
    {
      this.o.a(this, paramBoolean);
      return this.g;
    }
  }
  
  private ed a(f paramf, j paramj, boolean paramBoolean)
  {
    ed localed2 = new ed();
    ed localed1 = localed2;
    if (this.l != null)
    {
      a.a(localed2, paramj.N);
      if (paramBoolean)
      {
        ei.a(localed2, this.m);
        localed1 = localed2;
      }
    }
    else
    {
      if (!paramBoolean) {
        break label85;
      }
      paramj = paramj.X;
      a(paramf, localed1, false);
    }
    for (;;)
    {
      return localed1;
      localed1 = a(this.l, this.m, localed2);
      break;
      label85:
      paramj = paramj.Y;
      b(paramf, localed1, false);
    }
  }
  
  private static ed a(ArrayList paramArrayList1, ArrayList paramArrayList2, ed paramed)
  {
    if (paramed.isEmpty()) {}
    ed localed;
    for (paramArrayList1 = paramed;; paramArrayList1 = localed)
    {
      return paramArrayList1;
      localed = new ed();
      int i2 = paramArrayList1.size();
      for (int i1 = 0; i1 < i2; i1++)
      {
        View localView = (View)paramed.get(paramArrayList1.get(i1));
        if (localView != null) {
          localed.put(paramArrayList2.get(i1), localView);
        }
      }
    }
  }
  
  private f a(SparseArray paramSparseArray1, SparseArray paramSparseArray2, boolean paramBoolean)
  {
    int i5 = 0;
    f localf = new f(this);
    localf.d = new View(this.o.h);
    int i2 = 0;
    int i1 = 0;
    int i3 = i5;
    int i4 = i1;
    if (i2 < paramSparseArray1.size())
    {
      if (!a(paramSparseArray1.keyAt(i2), localf, paramBoolean, paramSparseArray1, paramSparseArray2)) {
        break label155;
      }
      i1 = 1;
    }
    label155:
    for (;;)
    {
      i2++;
      break;
      while (i3 < paramSparseArray2.size())
      {
        i2 = paramSparseArray2.keyAt(i3);
        i1 = i4;
        if (paramSparseArray1.get(i2) == null)
        {
          i1 = i4;
          if (a(i2, localf, paramBoolean, paramSparseArray1, paramSparseArray2)) {
            i1 = 1;
          }
        }
        i3++;
        i4 = i1;
      }
      paramSparseArray1 = localf;
      if (i4 == 0) {
        paramSparseArray1 = null;
      }
      return paramSparseArray1;
    }
  }
  
  private static Object a(Object paramObject, j paramj, ArrayList paramArrayList, ed paramed, View paramView)
  {
    Object localObject = paramObject;
    if (paramObject != null)
    {
      paramj = paramj.N;
      localObject = paramObject;
      if (paramObject != null)
      {
        a.a(paramArrayList, paramj);
        if (paramed != null) {
          paramArrayList.removeAll(paramed.values());
        }
        if (!paramArrayList.isEmpty()) {
          break label52;
        }
      }
    }
    for (localObject = null;; localObject = paramObject)
    {
      return localObject;
      label52:
      paramArrayList.add(paramView);
      a.b((Transition)paramObject, paramArrayList);
    }
  }
  
  private void a(int paramInt1, j paramj, String paramString, int paramInt2)
  {
    paramj.x = this.o;
    if (paramString != null)
    {
      if ((paramj.D != null) && (!paramString.equals(paramj.D))) {
        throw new IllegalStateException("Can't change tag of fragment " + paramj + ": was " + paramj.D + " now " + paramString);
      }
      paramj.D = paramString;
    }
    if (paramInt1 != 0)
    {
      if ((paramj.B != 0) && (paramj.B != paramInt1)) {
        throw new IllegalStateException("Can't change container ID of fragment " + paramj + ": was " + paramj.B + " now " + paramInt1);
      }
      paramj.B = paramInt1;
      paramj.C = paramInt1;
    }
    paramString = new b();
    paramString.c = paramInt2;
    paramString.d = paramj;
    a(paramString);
  }
  
  private static void a(SparseArray paramSparseArray, j paramj)
  {
    if (paramj != null)
    {
      int i1 = paramj.C;
      if ((i1 != 0) && (!paramj.E) && (paramj.f()) && (paramj.N != null) && (paramSparseArray.get(i1) == null)) {
        paramSparseArray.put(i1, paramj);
      }
    }
  }
  
  private static void a(ed paramed, String paramString1, String paramString2)
  {
    int i1;
    if ((paramString1 != null) && (paramString2 != null) && (!paramString1.equals(paramString2)))
    {
      i1 = 0;
      if (i1 >= paramed.size()) {
        break label52;
      }
      if (!paramString1.equals(paramed.c(i1))) {
        break label46;
      }
      paramed.a(i1, paramString2);
    }
    for (;;)
    {
      return;
      label46:
      i1++;
      break;
      label52:
      paramed.put(paramString1, paramString2);
    }
  }
  
  private void a(f paramf, int paramInt, Object paramObject)
  {
    if (this.o.c != null)
    {
      int i1 = 0;
      if (i1 < this.o.c.size())
      {
        j localj = (j)this.o.c.get(i1);
        if ((localj.N != null) && (localj.M != null) && (localj.C == paramInt))
        {
          if (!localj.E) {
            break label122;
          }
          if (!paramf.b.contains(localj.N))
          {
            a.a(paramObject, localj.N, true);
            paramf.b.add(localj.N);
          }
        }
        for (;;)
        {
          i1++;
          break;
          label122:
          a.a(paramObject, localj.N, false);
          paramf.b.remove(localj.N);
        }
      }
    }
  }
  
  private void a(f paramf, ed paramed, boolean paramBoolean)
  {
    int i1;
    int i2;
    label13:
    String str;
    Object localObject;
    if (this.m == null)
    {
      i1 = 0;
      i2 = 0;
      if (i2 >= i1) {
        return;
      }
      str = (String)this.l.get(i2);
      localObject = (View)paramed.get((String)this.m.get(i2));
      if (localObject != null)
      {
        localObject = ((View)localObject).getTransitionName();
        if (!paramBoolean) {
          break label100;
        }
        a(paramf.a, str, (String)localObject);
      }
    }
    for (;;)
    {
      i2++;
      break label13;
      i1 = this.m.size();
      break;
      label100:
      a(paramf.a, (String)localObject, str);
    }
  }
  
  private boolean a(int paramInt, f paramf, boolean paramBoolean, SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    ViewGroup localViewGroup = (ViewGroup)this.o.i.a(paramInt);
    if (localViewGroup == null) {
      paramBoolean = false;
    }
    for (;;)
    {
      return paramBoolean;
      Object localObject3 = (j)paramSparseArray2.get(paramInt);
      Object localObject4 = (j)paramSparseArray1.get(paramInt);
      Object localObject1;
      if (localObject3 == null)
      {
        paramSparseArray2 = null;
        if ((localObject3 == null) || (localObject4 == null))
        {
          localObject1 = null;
          if (localObject4 != null) {
            break label186;
          }
          paramSparseArray1 = null;
          if ((paramSparseArray2 != null) || (localObject1 != null) || (paramSparseArray1 != null)) {
            break label230;
          }
          paramBoolean = false;
        }
      }
      else
      {
        if (paramBoolean) {
          if (((j)localObject3).V == j.e) {
            paramSparseArray1 = null;
          }
        }
        for (;;)
        {
          paramSparseArray2 = a.a(paramSparseArray1);
          break;
          paramSparseArray1 = ((j)localObject3).V;
          continue;
          paramSparseArray1 = null;
        }
      }
      if (paramBoolean) {
        if (((j)localObject4).W == j.e) {
          paramSparseArray1 = null;
        }
      }
      for (;;)
      {
        localObject1 = a.a(paramSparseArray1);
        break;
        paramSparseArray1 = ((j)localObject4).W;
        continue;
        paramSparseArray1 = null;
      }
      label186:
      if (paramBoolean) {
        if (((j)localObject4).U == j.e) {
          paramSparseArray1 = null;
        }
      }
      for (;;)
      {
        paramSparseArray1 = a.a(paramSparseArray1);
        break;
        paramSparseArray1 = ((j)localObject4).U;
        continue;
        paramSparseArray1 = null;
      }
      label230:
      Object localObject2 = null;
      ArrayList localArrayList = new ArrayList();
      if (localObject1 != null)
      {
        localObject2 = a(paramf, (j)localObject4, paramBoolean);
        localArrayList.add(paramf.d);
        localArrayList.addAll(((ed)localObject2).values());
        if (!paramBoolean) {
          break label690;
        }
      }
      label690:
      for (Object localObject5 = ((j)localObject4).X;; localObject5 = ((j)localObject3).X)
      {
        localObject5 = new ArrayList();
        paramSparseArray1 = a(paramSparseArray1, (j)localObject4, (ArrayList)localObject5, (ed)localObject2, paramf.d);
        if ((this.m != null) && (localObject2 != null))
        {
          localObject2 = (View)((ed)localObject2).get(this.m.get(0));
          if (localObject2 != null)
          {
            if (paramSparseArray1 != null) {
              a.a(paramSparseArray1, (View)localObject2);
            }
            if (localObject1 != null) {
              a.a(localObject1, (View)localObject2);
            }
          }
        }
        Object localObject6 = new a(this, (j)localObject3);
        if (localObject1 != null) {
          localViewGroup.getViewTreeObserver().addOnPreDrawListener(new d(this, localViewGroup, localObject1, localArrayList, paramf, paramBoolean, (j)localObject3, (j)localObject4));
        }
        localObject2 = new ArrayList();
        localObject3 = new ed();
        Transition localTransition2 = (Transition)paramSparseArray2;
        Transition localTransition1 = (Transition)paramSparseArray1;
        Transition localTransition3 = (Transition)localObject1;
        if ((localTransition2 != null) && (localTransition1 != null)) {}
        localObject4 = new TransitionSet();
        if (localTransition2 != null) {
          ((TransitionSet)localObject4).addTransition(localTransition2);
        }
        if (localTransition1 != null) {
          ((TransitionSet)localObject4).addTransition(localTransition1);
        }
        if (localTransition3 != null) {
          ((TransitionSet)localObject4).addTransition(localTransition3);
        }
        if (localObject4 != null)
        {
          a.a(paramSparseArray2, localObject1, localViewGroup, (al)localObject6, paramf.d, paramf.c, paramf.a, (ArrayList)localObject2, (Map)localObject3, localArrayList);
          localViewGroup.getViewTreeObserver().addOnPreDrawListener(new e(this, localViewGroup, paramf, paramInt, localObject4));
          a.a(localObject4, paramf.d, true);
          a(paramf, paramInt, localObject4);
          TransitionManager.beginDelayedTransition(localViewGroup, (Transition)localObject4);
          localObject6 = paramf.d;
          paramf = paramf.b;
          paramSparseArray2 = (Transition)paramSparseArray2;
          paramSparseArray1 = (Transition)paramSparseArray1;
          localTransition1 = (Transition)localObject1;
          localObject1 = (Transition)localObject4;
          if (localObject1 != null) {
            localViewGroup.getViewTreeObserver().addOnPreDrawListener(new aj(localViewGroup, paramSparseArray2, (View)localObject6, (ArrayList)localObject2, paramSparseArray1, (ArrayList)localObject5, localTransition1, localArrayList, (Map)localObject3, paramf, (Transition)localObject1));
          }
        }
        if (localObject4 == null) {
          break label700;
        }
        paramBoolean = true;
        break;
      }
      label700:
      paramBoolean = false;
    }
  }
  
  private void b(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    if (!this.o.i.a()) {}
    b localb;
    do
    {
      return;
      localb = this.a;
    } while (localb == null);
    switch (localb.c)
    {
    }
    for (;;)
    {
      localb = localb.a;
      break;
      b(paramSparseArray2, localb.d);
      continue;
      Object localObject1 = localb.d;
      Object localObject2;
      if (this.o.c != null)
      {
        int i1 = 0;
        localObject2 = localObject1;
        if (i1 < this.o.c.size())
        {
          j localj = (j)this.o.c.get(i1);
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (localj.C != ((j)localObject1).C) {}
          }
          else
          {
            if (localj != localObject1) {
              break label189;
            }
          }
          for (localObject2 = null;; localObject2 = localObject1)
          {
            i1++;
            localObject1 = localObject2;
            break;
            label189:
            a(paramSparseArray1, localj);
          }
        }
      }
      else
      {
        localObject2 = localObject1;
      }
      b(paramSparseArray2, (j)localObject2);
      continue;
      a(paramSparseArray1, localb.d);
      continue;
      a(paramSparseArray1, localb.d);
      continue;
      b(paramSparseArray2, localb.d);
      continue;
      a(paramSparseArray1, localb.d);
      continue;
      b(paramSparseArray2, localb.d);
    }
  }
  
  private static void b(SparseArray paramSparseArray, j paramj)
  {
    if (paramj != null)
    {
      int i1 = paramj.C;
      if (i1 != 0) {
        paramSparseArray.put(i1, paramj);
      }
    }
  }
  
  private static void b(f paramf, ed paramed, boolean paramBoolean)
  {
    int i2 = paramed.size();
    int i1 = 0;
    if (i1 < i2)
    {
      String str2 = (String)paramed.b(i1);
      String str1 = ((View)paramed.c(i1)).getTransitionName();
      if (paramBoolean) {
        a(paramf.a, str2, str1);
      }
      for (;;)
      {
        i1++;
        break;
        a(paramf.a, str1, str2);
      }
    }
  }
  
  public final af a()
  {
    if (this.e) {
      throw new IllegalStateException("This transaction is already being added to the back stack");
    }
    this.q = false;
    return this;
  }
  
  public final af a(int paramInt)
  {
    this.c = 4097;
    return this;
  }
  
  public final af a(int paramInt, j paramj)
  {
    return b(paramInt, paramj, null);
  }
  
  public final af a(int paramInt, j paramj, String paramString)
  {
    a(paramInt, paramj, paramString, 1);
    return this;
  }
  
  public final af a(j paramj)
  {
    b localb = new b();
    localb.c = 3;
    localb.d = paramj;
    a(localb);
    return this;
  }
  
  public final af a(j paramj, String paramString)
  {
    a(0, paramj, paramString, 1);
    return this;
  }
  
  public final af a(String paramString)
  {
    if (!this.q) {
      throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }
    this.e = true;
    this.f = paramString;
    return this;
  }
  
  public final f a(boolean paramBoolean, f paramf, SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    boolean bool = t.a;
    Object localObject = paramf;
    if (n)
    {
      if (paramf != null) {
        break label168;
      }
      if (paramSparseArray1.size() == 0)
      {
        localObject = paramf;
        if (paramSparseArray2.size() == 0) {}
      }
      else
      {
        localObject = a(paramSparseArray1, paramSparseArray2, true);
      }
    }
    label46:
    b(-1);
    int i1;
    label59:
    int i2;
    label67:
    int i3;
    if (localObject != null)
    {
      i1 = 0;
      if (localObject == null) {
        break label257;
      }
      i2 = 0;
      paramf = this.p;
      if (paramf == null) {
        break label543;
      }
      if (localObject == null) {
        break label266;
      }
      i3 = 0;
      label84:
      if (localObject == null) {
        break label275;
      }
    }
    label168:
    label257:
    label266:
    label275:
    for (int i4 = 0;; i4 = paramf.h) {
      switch (paramf.c)
      {
      default: 
        throw new IllegalArgumentException("Unknown cmd: " + paramf.c);
        localObject = paramf;
        if (paramBoolean) {
          break label46;
        }
        paramSparseArray1 = this.m;
        paramSparseArray2 = this.l;
        localObject = paramf;
        if (paramSparseArray1 == null) {
          break label46;
        }
        for (i1 = 0;; i1++)
        {
          localObject = paramf;
          if (i1 >= paramSparseArray1.size()) {
            break;
          }
          localObject = (String)paramSparseArray1.get(i1);
          String str = (String)paramSparseArray2.get(i1);
          a(paramf.a, (String)localObject, str);
        }
        i1 = this.d;
        break label59;
        i2 = this.c;
        break label67;
        i3 = paramf.g;
        break label84;
      }
    }
    paramSparseArray1 = paramf.d;
    paramSparseArray1.L = i4;
    this.o.a(paramSparseArray1, t.b(i2), i1);
    for (;;)
    {
      paramf = paramf.b;
      break;
      paramSparseArray1 = paramf.d;
      if (paramSparseArray1 != null)
      {
        paramSparseArray1.L = i4;
        this.o.a(paramSparseArray1, t.b(i2), i1);
      }
      if (paramf.i != null)
      {
        for (i4 = 0; i4 < paramf.i.size(); i4++)
        {
          paramSparseArray1 = (j)paramf.i.get(i4);
          paramSparseArray1.L = i3;
          this.o.a(paramSparseArray1, false);
        }
        paramSparseArray1 = paramf.d;
        paramSparseArray1.L = i3;
        this.o.a(paramSparseArray1, false);
        continue;
        paramSparseArray1 = paramf.d;
        paramSparseArray1.L = i3;
        this.o.c(paramSparseArray1, t.b(i2), i1);
        continue;
        paramSparseArray1 = paramf.d;
        paramSparseArray1.L = i4;
        this.o.b(paramSparseArray1, t.b(i2), i1);
        continue;
        paramSparseArray1 = paramf.d;
        paramSparseArray1.L = i3;
        this.o.e(paramSparseArray1, t.b(i2), i1);
        continue;
        paramSparseArray1 = paramf.d;
        paramSparseArray1.L = i3;
        this.o.d(paramSparseArray1, t.b(i2), i1);
      }
    }
    label543:
    if (paramBoolean)
    {
      this.o.a(this.o.g, t.b(i2), i1, true);
      localObject = null;
    }
    if (this.g >= 0)
    {
      paramf = this.o;
      i1 = this.g;
    }
    try
    {
      paramf.e.set(i1, null);
      if (paramf.f == null)
      {
        paramSparseArray1 = new java/util/ArrayList;
        paramSparseArray1.<init>();
        paramf.f = paramSparseArray1;
      }
      paramf.f.add(Integer.valueOf(i1));
      this.g = -1;
      return (f)localObject;
    }
    finally {}
  }
  
  public final void a(SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    if (!this.o.i.a()) {}
    b localb;
    do
    {
      return;
      localb = this.a;
    } while (localb == null);
    switch (localb.c)
    {
    }
    for (;;)
    {
      localb = localb.a;
      break;
      a(paramSparseArray1, localb.d);
      continue;
      if (localb.i != null) {
        for (int i1 = localb.i.size() - 1; i1 >= 0; i1--) {
          b(paramSparseArray2, (j)localb.i.get(i1));
        }
      }
      a(paramSparseArray1, localb.d);
      continue;
      b(paramSparseArray2, localb.d);
      continue;
      b(paramSparseArray2, localb.d);
      continue;
      a(paramSparseArray1, localb.d);
      continue;
      b(paramSparseArray2, localb.d);
      continue;
      a(paramSparseArray1, localb.d);
    }
  }
  
  final void a(b paramb)
  {
    if (this.a == null)
    {
      this.p = paramb;
      this.a = paramb;
    }
    for (;;)
    {
      paramb.e = 0;
      paramb.f = 0;
      paramb.g = 0;
      paramb.h = 0;
      this.b += 1;
      return;
      paramb.b = this.p;
      this.p.a = paramb;
      this.p = paramb;
    }
  }
  
  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mName=");
    paramPrintWriter.print(this.f);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mCommitted=");
    paramPrintWriter.println(this.r);
    if (this.c != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTransition=#");
      paramPrintWriter.print(Integer.toHexString(this.c));
      paramPrintWriter.print(" mTransitionStyle=#");
      paramPrintWriter.println(Integer.toHexString(this.d));
    }
    if ((this.h != 0) || (this.i != null))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbTitleRes=#");
      paramPrintWriter.print(Integer.toHexString(this.h));
      paramPrintWriter.print(" mBreadCrumbTitleText=");
      paramPrintWriter.println(this.i);
    }
    if ((this.j != 0) || (this.k != null))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
      paramPrintWriter.print(Integer.toHexString(this.j));
      paramPrintWriter.print(" mBreadCrumbShortTitleText=");
      paramPrintWriter.println(this.k);
    }
    if (this.a != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      String str2 = paramString + "    ";
      b localb = this.a;
      for (int i1 = 0; localb != null; i1++)
      {
        String str1;
        int i2;
        switch (localb.c)
        {
        default: 
          str1 = "cmd=" + localb.c;
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str1);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(localb.d);
          if ((localb.e != 0) || (localb.f != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(localb.e));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(localb.f));
          }
          if ((localb.g != 0) || (localb.h != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(localb.g));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(localb.h));
          }
          if ((localb.i == null) || (localb.i.size() <= 0)) {
            break label671;
          }
          i2 = 0;
          label516:
          if (i2 >= localb.i.size()) {
            break label671;
          }
          paramPrintWriter.print(str2);
          if (localb.i.size() == 1) {
            paramPrintWriter.print("Removed: ");
          }
          break;
        }
        for (;;)
        {
          paramPrintWriter.println(localb.i.get(i2));
          i2++;
          break label516;
          str1 = "NULL";
          break;
          str1 = "ADD";
          break;
          str1 = "REPLACE";
          break;
          str1 = "REMOVE";
          break;
          str1 = "HIDE";
          break;
          str1 = "SHOW";
          break;
          str1 = "DETACH";
          break;
          str1 = "ATTACH";
          break;
          if (i2 == 0) {
            paramPrintWriter.println("Removed:");
          }
          paramPrintWriter.print(str2);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i2);
          paramPrintWriter.print(": ");
        }
        label671:
        localb = localb.a;
      }
    }
  }
  
  public final int b()
  {
    return a(false);
  }
  
  public final af b(int paramInt, j paramj, String paramString)
  {
    if (paramInt == 0) {
      throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
    a(paramInt, paramj, paramString, 2);
    return this;
  }
  
  public final af b(j paramj)
  {
    b localb = new b();
    localb.c = 6;
    localb.d = paramj;
    a(localb);
    return this;
  }
  
  final void b(int paramInt)
  {
    if (!this.e) {}
    for (;;)
    {
      return;
      boolean bool = t.a;
      for (b localb = this.a; localb != null; localb = localb.a)
      {
        j localj;
        if (localb.d != null)
        {
          localj = localb.d;
          localj.w += paramInt;
          bool = t.a;
        }
        if (localb.i != null) {
          for (int i1 = localb.i.size() - 1; i1 >= 0; i1--)
          {
            localj = (j)localb.i.get(i1);
            localj.w += paramInt;
            bool = t.a;
          }
        }
      }
    }
  }
  
  public final int c()
  {
    return a(true);
  }
  
  public final af c(j paramj)
  {
    b localb = new b();
    localb.c = 7;
    localb.d = paramj;
    a(localb);
    return this;
  }
  
  public final void run()
  {
    boolean bool = t.a;
    if ((this.e) && (this.g < 0)) {
      throw new IllegalStateException("addToBackStack() called after commit()");
    }
    b(1);
    Object localObject1;
    if (n)
    {
      localObject2 = new SparseArray();
      localObject1 = new SparseArray();
      b((SparseArray)localObject2, (SparseArray)localObject1);
    }
    for (Object localObject2 = a((SparseArray)localObject2, (SparseArray)localObject1, false);; localObject2 = null)
    {
      int i1;
      label78:
      int i2;
      label85:
      b localb;
      int i3;
      if (localObject2 != null)
      {
        i1 = 0;
        if (localObject2 == null) {
          break label193;
        }
        i2 = 0;
        localb = this.a;
        if (localb == null) {
          break label584;
        }
        if (localObject2 == null) {
          break label202;
        }
        i3 = 0;
        label101:
        if (localObject2 == null) {
          break label211;
        }
      }
      label193:
      label202:
      label211:
      for (int i4 = 0;; i4 = localb.f) {
        switch (localb.c)
        {
        default: 
          throw new IllegalArgumentException("Unknown cmd: " + localb.c);
          i1 = this.d;
          break label78;
          i2 = this.c;
          break label85;
          i3 = localb.e;
          break label101;
        }
      }
      localObject1 = localb.d;
      ((j)localObject1).L = i3;
      this.o.a((j)localObject1, false);
      for (;;)
      {
        localb = localb.a;
        break;
        localObject1 = localb.d;
        Object localObject3;
        if (this.o.c != null)
        {
          int i5 = 0;
          localObject3 = localObject1;
          if (i5 < this.o.c.size())
          {
            j localj = (j)this.o.c.get(i5);
            bool = t.a;
            if (localObject1 != null)
            {
              localObject3 = localObject1;
              if (localj.C != ((j)localObject1).C) {}
            }
            else
            {
              if (localj != localObject1) {
                break label348;
              }
              localb.d = null;
            }
            for (localObject3 = null;; localObject3 = localObject1)
            {
              i5++;
              localObject1 = localObject3;
              break;
              label348:
              if (localb.i == null) {
                localb.i = new ArrayList();
              }
              localb.i.add(localj);
              localj.L = i4;
              if (this.e)
              {
                localj.w += 1;
                bool = t.a;
              }
              this.o.a(localj, i2, i1);
            }
          }
        }
        else
        {
          localObject3 = localObject1;
        }
        if (localObject3 != null)
        {
          ((j)localObject3).L = i3;
          this.o.a((j)localObject3, false);
          continue;
          localObject1 = localb.d;
          ((j)localObject1).L = i4;
          this.o.a((j)localObject1, i2, i1);
          continue;
          localObject1 = localb.d;
          ((j)localObject1).L = i4;
          this.o.b((j)localObject1, i2, i1);
          continue;
          localObject1 = localb.d;
          ((j)localObject1).L = i3;
          this.o.c((j)localObject1, i2, i1);
          continue;
          localObject1 = localb.d;
          ((j)localObject1).L = i4;
          this.o.d((j)localObject1, i2, i1);
          continue;
          localObject1 = localb.d;
          ((j)localObject1).L = i3;
          this.o.e((j)localObject1, i2, i1);
        }
      }
      label584:
      this.o.a(this.o.g, i2, i1, true);
      if (this.e)
      {
        localObject1 = this.o;
        if (((t)localObject1).d == null) {
          ((t)localObject1).d = new ArrayList();
        }
        ((t)localObject1).d.add(this);
      }
      return;
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.g >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.g);
    }
    if (this.f != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.f);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */