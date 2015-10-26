import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class t
  extends r
  implements fs
{
  static boolean a;
  private static boolean l;
  private static Interpolator y;
  private static Interpolator z;
  ArrayList b;
  ArrayList c;
  ArrayList d;
  ArrayList e;
  ArrayList f;
  int g = 0;
  m h;
  q i;
  boolean j;
  String k;
  private ArrayList m;
  private Runnable[] n;
  private boolean o;
  private ArrayList p;
  private ArrayList q;
  private j r;
  private boolean s;
  private boolean t;
  private boolean u;
  private Bundle v = null;
  private SparseArray w = null;
  private Runnable x = new u(this);
  
  static
  {
    boolean bool = false;
    a = false;
    if (Build.VERSION.SDK_INT >= 11) {
      bool = true;
    }
    l = bool;
    y = new DecelerateInterpolator(2.5F);
    z = new DecelerateInterpolator(1.5F);
    new AccelerateInterpolator(2.5F);
    new AccelerateInterpolator(1.5F);
  }
  
  private static Animation a(float paramFloat1, float paramFloat2)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat1, paramFloat2);
    localAlphaAnimation.setInterpolator(z);
    localAlphaAnimation.setDuration(220L);
    return localAlphaAnimation;
  }
  
  private static Animation a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AnimationSet localAnimationSet = new AnimationSet(false);
    Object localObject = new ScaleAnimation(paramFloat1, paramFloat2, paramFloat1, paramFloat2, 1, 0.5F, 1, 0.5F);
    ((ScaleAnimation)localObject).setInterpolator(y);
    ((ScaleAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    localObject = new AlphaAnimation(paramFloat3, paramFloat4);
    ((AlphaAnimation)localObject).setInterpolator(z);
    ((AlphaAnimation)localObject).setDuration(220L);
    localAnimationSet.addAnimation((Animation)localObject);
    return localAnimationSet;
  }
  
  private Animation a(j paramj, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i1 = paramj.L;
    j.i();
    if (paramj.L != 0)
    {
      paramj = AnimationUtils.loadAnimation(this.h, paramj.L);
      if (paramj == null) {}
    }
    for (;;)
    {
      return paramj;
      if (paramInt1 == 0)
      {
        paramj = null;
      }
      else
      {
        i1 = -1;
        switch (paramInt1)
        {
        default: 
          paramInt1 = i1;
        }
        for (;;)
        {
          if (paramInt1 >= 0) {
            break label139;
          }
          paramj = null;
          break;
          if (paramBoolean)
          {
            paramInt1 = 1;
          }
          else
          {
            paramInt1 = 2;
            continue;
            if (paramBoolean)
            {
              paramInt1 = 3;
            }
            else
            {
              paramInt1 = 4;
              continue;
              if (paramBoolean) {
                paramInt1 = 5;
              } else {
                paramInt1 = 6;
              }
            }
          }
        }
        switch (paramInt1)
        {
        default: 
          paramInt1 = paramInt2;
          if (paramInt2 == 0)
          {
            paramInt1 = paramInt2;
            if (this.h.getWindow() != null) {
              paramInt1 = this.h.getWindow().getAttributes().windowAnimations;
            }
          }
          if (paramInt1 == 0) {
            paramj = null;
          }
          break;
        case 1: 
          paramj = a(1.125F, 1.0F, 0.0F, 1.0F);
          break;
        case 2: 
          paramj = a(1.0F, 0.975F, 1.0F, 0.0F);
          break;
        case 3: 
          paramj = a(0.975F, 1.0F, 0.0F, 1.0F);
          break;
        case 4: 
          paramj = a(1.0F, 1.075F, 1.0F, 0.0F);
          break;
        case 5: 
          paramj = a(0.0F, 1.0F);
          break;
        case 6: 
          label139:
          paramj = a(1.0F, 0.0F);
          continue;
          paramj = null;
        }
      }
    }
  }
  
  private j a(Bundle paramBundle, String paramString)
  {
    int i1 = paramBundle.getInt(paramString, -1);
    if (i1 == -1) {
      paramBundle = null;
    }
    for (;;)
    {
      return paramBundle;
      if (i1 >= this.b.size()) {
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
      }
      j localj = (j)this.b.get(i1);
      paramBundle = localj;
      if (localj == null)
      {
        a(new IllegalStateException("Fragment no longer exists for key " + paramString + ": index " + i1));
        paramBundle = localj;
      }
    }
  }
  
  /* Error */
  private void a(int paramInt, c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 204	t:e	Ljava/util/ArrayList;
    //   6: ifnonnull +16 -> 22
    //   9: new 167	java/util/ArrayList
    //   12: astore_3
    //   13: aload_3
    //   14: invokespecial 205	java/util/ArrayList:<init>	()V
    //   17: aload_0
    //   18: aload_3
    //   19: putfield 204	t:e	Ljava/util/ArrayList;
    //   22: aload_0
    //   23: getfield 204	t:e	Ljava/util/ArrayList;
    //   26: invokevirtual 171	java/util/ArrayList:size	()I
    //   29: istore 5
    //   31: iload 5
    //   33: istore 4
    //   35: iload_1
    //   36: iload 5
    //   38: if_icmpge +16 -> 54
    //   41: aload_0
    //   42: getfield 204	t:e	Ljava/util/ArrayList;
    //   45: iload_1
    //   46: aload_2
    //   47: invokevirtual 209	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   50: pop
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: iload 4
    //   56: iload_1
    //   57: if_icmpge +51 -> 108
    //   60: aload_0
    //   61: getfield 204	t:e	Ljava/util/ArrayList;
    //   64: aconst_null
    //   65: invokevirtual 213	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   68: pop
    //   69: aload_0
    //   70: getfield 215	t:f	Ljava/util/ArrayList;
    //   73: ifnonnull +16 -> 89
    //   76: new 167	java/util/ArrayList
    //   79: astore_3
    //   80: aload_3
    //   81: invokespecial 205	java/util/ArrayList:<init>	()V
    //   84: aload_0
    //   85: aload_3
    //   86: putfield 215	t:f	Ljava/util/ArrayList;
    //   89: aload_0
    //   90: getfield 215	t:f	Ljava/util/ArrayList;
    //   93: iload 4
    //   95: invokestatic 221	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   98: invokevirtual 213	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   101: pop
    //   102: iinc 4 1
    //   105: goto -51 -> 54
    //   108: aload_0
    //   109: getfield 204	t:e	Ljava/util/ArrayList;
    //   112: aload_2
    //   113: invokevirtual 213	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   116: pop
    //   117: goto -66 -> 51
    //   120: astore_2
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_2
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	t
    //   0	125	1	paramInt	int
    //   0	125	2	paramc	c
    //   12	74	3	localArrayList	ArrayList
    //   33	70	4	i1	int
    //   29	10	5	i2	int
    // Exception table:
    //   from	to	target	type
    //   2	22	120	finally
    //   22	31	120	finally
    //   41	51	120	finally
    //   51	53	120	finally
    //   60	89	120	finally
    //   89	102	120	finally
    //   108	117	120	finally
    //   121	123	120	finally
  }
  
  private void a(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new eg("FragmentManager"));
    if (this.h != null) {}
    for (;;)
    {
      try
      {
        this.h.dump("  ", null, localPrintWriter, new String[0]);
        throw paramRuntimeException;
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
        continue;
      }
      try
      {
        a("  ", null, localException1, new String[0]);
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
      }
    }
  }
  
  public static int b(int paramInt)
  {
    int i1 = 0;
    switch (paramInt)
    {
    default: 
      paramInt = i1;
    }
    for (;;)
    {
      return paramInt;
      paramInt = 8194;
      continue;
      paramInt = 4097;
      continue;
      paramInt = 4099;
    }
  }
  
  private void b(j paramj)
  {
    a(paramj, this.g, 0, 0, false);
  }
  
  private void c(j paramj)
  {
    if (paramj.O == null) {
      return;
    }
    if (this.w == null) {
      this.w = new SparseArray();
    }
    for (;;)
    {
      paramj.O.saveHierarchyState(this.w);
      if (this.w.size() <= 0) {
        break;
      }
      paramj.j = this.w;
      this.w = null;
      break;
      this.w.clear();
    }
  }
  
  private void r()
  {
    if (this.j) {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
    if (this.k != null) {
      throw new IllegalStateException("Can not perform this action inside of " + this.k);
    }
  }
  
  /* Error */
  public final int a(c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 215	t:f	Ljava/util/ArrayList;
    //   6: ifnull +13 -> 19
    //   9: aload_0
    //   10: getfield 215	t:f	Ljava/util/ArrayList;
    //   13: invokevirtual 171	java/util/ArrayList:size	()I
    //   16: ifgt +44 -> 60
    //   19: aload_0
    //   20: getfield 204	t:e	Ljava/util/ArrayList;
    //   23: ifnonnull +16 -> 39
    //   26: new 167	java/util/ArrayList
    //   29: astore_2
    //   30: aload_2
    //   31: invokespecial 205	java/util/ArrayList:<init>	()V
    //   34: aload_0
    //   35: aload_2
    //   36: putfield 204	t:e	Ljava/util/ArrayList;
    //   39: aload_0
    //   40: getfield 204	t:e	Ljava/util/ArrayList;
    //   43: invokevirtual 171	java/util/ArrayList:size	()I
    //   46: istore_3
    //   47: aload_0
    //   48: getfield 204	t:e	Ljava/util/ArrayList;
    //   51: aload_1
    //   52: invokevirtual 213	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   55: pop
    //   56: aload_0
    //   57: monitorexit
    //   58: iload_3
    //   59: ireturn
    //   60: aload_0
    //   61: getfield 215	t:f	Ljava/util/ArrayList;
    //   64: aload_0
    //   65: getfield 215	t:f	Ljava/util/ArrayList;
    //   68: invokevirtual 171	java/util/ArrayList:size	()I
    //   71: iconst_1
    //   72: isub
    //   73: invokevirtual 296	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   76: checkcast 217	java/lang/Integer
    //   79: invokevirtual 299	java/lang/Integer:intValue	()I
    //   82: istore_3
    //   83: aload_0
    //   84: getfield 204	t:e	Ljava/util/ArrayList;
    //   87: iload_3
    //   88: aload_1
    //   89: invokevirtual 209	java/util/ArrayList:set	(ILjava/lang/Object;)Ljava/lang/Object;
    //   92: pop
    //   93: aload_0
    //   94: monitorexit
    //   95: goto -37 -> 58
    //   98: astore_1
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_1
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	this	t
    //   0	103	1	paramc	c
    //   29	7	2	localArrayList	ArrayList
    //   46	42	3	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	19	98	finally
    //   19	39	98	finally
    //   39	58	98	finally
    //   60	95	98	finally
    //   99	101	98	finally
  }
  
  public final af a()
  {
    return new c(this);
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if (!"fragment".equals(paramString))
    {
      paramView = null;
      return paramView;
    }
    String str1 = paramAttributeSet.getAttributeValue(null, "class");
    paramString = paramContext.obtainStyledAttributes(paramAttributeSet, z.a);
    if (str1 == null) {
      str1 = paramString.getString(0);
    }
    for (;;)
    {
      int i3 = paramString.getResourceId(1, -1);
      String str2 = paramString.getString(2);
      paramString.recycle();
      if (!j.b(this.h, str1))
      {
        paramView = null;
        break;
      }
      if (paramView != null) {}
      for (int i1 = paramView.getId(); (i1 == -1) && (i3 == -1) && (str2 == null); i1 = 0) {
        throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str1);
      }
      int i2;
      if (i3 != -1)
      {
        paramString = a(i3);
        paramView = paramString;
        if (paramString == null)
        {
          paramView = paramString;
          if (str2 != null) {
            paramView = a(str2);
          }
        }
        paramString = paramView;
        if (paramView == null)
        {
          paramString = paramView;
          if (i1 != -1) {
            paramString = a(i1);
          }
        }
        if (paramString != null) {
          break label354;
        }
        paramString = j.a(paramContext, str1);
        paramString.t = true;
        if (i3 == 0) {
          break label347;
        }
        i2 = i3;
        label236:
        paramString.B = i2;
        paramString.C = i1;
        paramString.D = str2;
        paramString.u = true;
        paramString.x = this;
        paramView = paramString.i;
        paramString.K = true;
        a(paramString, true);
        label280:
        if ((this.g > 0) || (!paramString.t)) {
          break label464;
        }
        a(paramString, 1, 0, 0, false);
      }
      for (;;)
      {
        if (paramString.N != null) {
          break label472;
        }
        throw new IllegalStateException("Fragment " + str1 + " did not create a view.");
        paramString = null;
        break;
        label347:
        i2 = i1;
        break label236;
        label354:
        if (paramString.u) {
          throw new IllegalArgumentException(paramAttributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(i3) + ", tag " + str2 + ", or parent id 0x" + Integer.toHexString(i1) + " with another fragment for " + str1);
        }
        paramString.u = true;
        if (!paramString.H)
        {
          paramView = paramString.i;
          paramString.K = true;
        }
        break label280;
        label464:
        b(paramString);
      }
      label472:
      if (i3 != 0) {
        paramString.N.setId(i3);
      }
      if (paramString.N.getTag() == null) {
        paramString.N.setTag(str2);
      }
      paramView = paramString.N;
      break;
    }
  }
  
  public final j a(int paramInt)
  {
    int i1;
    Object localObject;
    if (this.c != null)
    {
      i1 = this.c.size() - 1;
      if (i1 >= 0)
      {
        localObject = (j)this.c.get(i1);
        if ((localObject == null) || (((j)localObject).B != paramInt)) {}
      }
    }
    for (;;)
    {
      return (j)localObject;
      i1--;
      break;
      if (this.b != null) {
        for (i1 = this.b.size() - 1;; i1--)
        {
          if (i1 < 0) {
            break label112;
          }
          j localj = (j)this.b.get(i1);
          if (localj != null)
          {
            localObject = localj;
            if (localj.B == paramInt) {
              break;
            }
          }
        }
      }
      label112:
      localObject = null;
    }
  }
  
  public final j a(String paramString)
  {
    int i1;
    Object localObject;
    if ((this.c != null) && (paramString != null))
    {
      i1 = this.c.size() - 1;
      if (i1 >= 0)
      {
        localObject = (j)this.c.get(i1);
        if ((localObject == null) || (!paramString.equals(((j)localObject).D))) {}
      }
    }
    for (;;)
    {
      return (j)localObject;
      i1--;
      break;
      if ((this.b != null) && (paramString != null)) {
        for (i1 = this.b.size() - 1;; i1--)
        {
          if (i1 < 0) {
            break label126;
          }
          j localj = (j)this.b.get(i1);
          if (localj != null)
          {
            localObject = localj;
            if (paramString.equals(localj.D)) {
              break;
            }
          }
        }
      }
      label126:
      localObject = null;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Bad id: " + paramInt1);
    }
    a(new x(this, paramInt1, 1), false);
  }
  
  final void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if ((this.h == null) && (paramInt1 != 0)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (this.g == paramInt1)) {}
    do
    {
      return;
      this.g = paramInt1;
    } while (this.b == null);
    int i1 = 0;
    boolean bool = false;
    label54:
    if (i1 < this.b.size())
    {
      j localj = (j)this.b.get(i1);
      if (localj == null) {
        break label168;
      }
      a(localj, paramInt1, paramInt2, paramInt3, false);
      if (localj.R == null) {
        break label168;
      }
      bool |= localj.R.a();
    }
    label168:
    for (;;)
    {
      i1++;
      break label54;
      if (!bool) {
        g();
      }
      if ((!this.s) || (this.h == null) || (this.g != 5)) {
        break;
      }
      this.h.a_();
      this.s = false;
      break;
    }
  }
  
  final void a(int paramInt, boolean paramBoolean)
  {
    a(paramInt, 0, 0, false);
  }
  
  public final void a(Configuration paramConfiguration)
  {
    if (this.c != null) {
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        j localj = (j)this.c.get(i1);
        if (localj != null)
        {
          localj.onConfigurationChanged(paramConfiguration);
          if (localj.z != null) {
            localj.z.a(paramConfiguration);
          }
        }
      }
    }
  }
  
  final void a(Parcelable paramParcelable, ArrayList paramArrayList)
  {
    int i2 = 0;
    if (paramParcelable == null) {}
    for (;;)
    {
      return;
      aa localaa = (aa)paramParcelable;
      if (localaa.a != null)
      {
        Object localObject;
        if (paramArrayList != null) {
          for (i1 = 0; i1 < paramArrayList.size(); i1++)
          {
            localObject = (j)paramArrayList.get(i1);
            paramParcelable = localaa.a[localObject.k];
            paramParcelable.k = ((j)localObject);
            ((j)localObject).j = null;
            ((j)localObject).w = 0;
            ((j)localObject).u = false;
            ((j)localObject).q = false;
            ((j)localObject).n = null;
            if (paramParcelable.j != null)
            {
              paramParcelable.j.setClassLoader(this.h.getClassLoader());
              ((j)localObject).j = paramParcelable.j.getSparseParcelableArray("android:view_state");
              ((j)localObject).i = paramParcelable.j;
            }
          }
        }
        this.b = new ArrayList(localaa.a.length);
        if (this.p != null) {
          this.p.clear();
        }
        int i1 = 0;
        if (i1 < localaa.a.length)
        {
          localObject = localaa.a[i1];
          j localj;
          if (localObject != null)
          {
            paramParcelable = this.h;
            localj = this.r;
            if (((ad)localObject).k != null)
            {
              paramParcelable = ((ad)localObject).k;
              label227:
              this.b.add(paramParcelable);
              ((ad)localObject).k = null;
            }
          }
          for (;;)
          {
            i1++;
            break;
            if (((ad)localObject).i != null) {
              ((ad)localObject).i.setClassLoader(paramParcelable.getClassLoader());
            }
            ((ad)localObject).k = j.a(paramParcelable, ((ad)localObject).a, ((ad)localObject).i);
            if (((ad)localObject).j != null)
            {
              ((ad)localObject).j.setClassLoader(paramParcelable.getClassLoader());
              ((ad)localObject).k.i = ((ad)localObject).j;
            }
            ((ad)localObject).k.a(((ad)localObject).b, localj);
            ((ad)localObject).k.t = ((ad)localObject).c;
            ((ad)localObject).k.v = true;
            ((ad)localObject).k.B = ((ad)localObject).d;
            ((ad)localObject).k.C = ((ad)localObject).e;
            ((ad)localObject).k.D = ((ad)localObject).f;
            ((ad)localObject).k.G = ((ad)localObject).g;
            ((ad)localObject).k.F = ((ad)localObject).h;
            ((ad)localObject).k.x = paramParcelable.b;
            boolean bool = a;
            paramParcelable = ((ad)localObject).k;
            break label227;
            this.b.add(null);
            if (this.p == null) {
              this.p = new ArrayList();
            }
            this.p.add(Integer.valueOf(i1));
          }
        }
        if (paramArrayList != null)
        {
          i1 = 0;
          if (i1 < paramArrayList.size())
          {
            paramParcelable = (j)paramArrayList.get(i1);
            if (paramParcelable.o >= 0) {
              if (paramParcelable.o >= this.b.size()) {
                break label562;
              }
            }
            for (paramParcelable.n = ((j)this.b.get(paramParcelable.o));; paramParcelable.n = null)
            {
              i1++;
              break;
              label562:
              Log.w("FragmentManager", "Re-attaching retained fragment " + paramParcelable + " target no longer exists: " + paramParcelable.o);
            }
          }
        }
        if (localaa.b != null)
        {
          this.c = new ArrayList(localaa.b.length);
          for (i1 = 0; i1 < localaa.b.length; i1++)
          {
            paramParcelable = (j)this.b.get(localaa.b[i1]);
            if (paramParcelable == null) {
              a(new IllegalStateException("No instantiated fragment for index #" + localaa.b[i1]));
            }
            paramParcelable.q = true;
            if (this.c.contains(paramParcelable)) {
              throw new IllegalStateException("Already added!");
            }
            this.c.add(paramParcelable);
          }
        }
        this.c = null;
        if (localaa.c != null)
        {
          this.d = new ArrayList(localaa.c.length);
          for (i1 = i2; i1 < localaa.c.length; i1++)
          {
            paramParcelable = localaa.c[i1].a(this);
            this.d.add(paramParcelable);
            if (paramParcelable.g >= 0) {
              a(paramParcelable.g, paramParcelable);
            }
          }
        }
        else
        {
          this.d = null;
        }
      }
    }
  }
  
  public final void a(j paramj)
  {
    if (paramj.P)
    {
      if (!this.o) {
        break label20;
      }
      this.u = true;
    }
    for (;;)
    {
      return;
      label20:
      paramj.P = false;
      a(paramj, this.g, 0, 0, false);
    }
  }
  
  public final void a(j paramj, int paramInt1, int paramInt2)
  {
    if (paramj.w > 0)
    {
      i1 = 1;
      if (i1 != 0) {
        break label100;
      }
      i1 = 1;
      label18:
      if ((!paramj.F) || (i1 != 0))
      {
        if (this.c != null) {
          this.c.remove(paramj);
        }
        if ((paramj.I) && (paramj.J)) {
          this.s = true;
        }
        paramj.q = false;
        paramj.r = true;
        if (i1 == 0) {
          break label106;
        }
      }
    }
    label100:
    label106:
    for (int i1 = 0;; i1 = 1)
    {
      a(paramj, i1, paramInt1, paramInt2, false);
      return;
      i1 = 0;
      break;
      i1 = 0;
      break label18;
    }
  }
  
  final void a(j paramj, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1;
    if (paramj.q)
    {
      i1 = paramInt1;
      if (!paramj.F) {}
    }
    else
    {
      i1 = paramInt1;
      if (paramInt1 > 1) {
        i1 = 1;
      }
    }
    int i2 = i1;
    if (paramj.r)
    {
      i2 = i1;
      if (i1 > paramj.f) {
        i2 = paramj.f;
      }
    }
    paramInt1 = i2;
    if (paramj.P)
    {
      paramInt1 = i2;
      if (paramj.f < 4)
      {
        paramInt1 = i2;
        if (i2 > 3) {
          paramInt1 = 3;
        }
      }
    }
    int i3;
    label644:
    Object localObject2;
    if (paramj.f < paramInt1)
    {
      if ((paramj.t) && (!paramj.u)) {}
      for (;;)
      {
        return;
        if (paramj.g != null)
        {
          paramj.g = null;
          a(paramj, paramj.h, 0, 0, true);
        }
        i2 = paramInt1;
        i3 = paramInt1;
        i1 = paramInt1;
        switch (paramj.f)
        {
        default: 
          i2 = paramInt1;
          paramj.f = i2;
        }
      }
      i1 = paramInt1;
      if (paramj.i != null)
      {
        paramj.i.setClassLoader(this.h.getClassLoader());
        paramj.j = paramj.i.getSparseParcelableArray("android:view_state");
        paramj.n = a(paramj.i, "android:target_state");
        if (paramj.n != null) {
          paramj.p = paramj.i.getInt("android:target_req_state", 0);
        }
        paramj.Q = paramj.i.getBoolean("android:user_visible_hint", true);
        i1 = paramInt1;
        if (!paramj.Q)
        {
          paramj.P = true;
          i1 = paramInt1;
          if (paramInt1 > 3) {
            i1 = 3;
          }
        }
      }
      paramj.y = this.h;
      paramj.A = this.r;
      if (this.r != null) {}
      for (localObject1 = this.r.z;; localObject1 = this.h.b)
      {
        paramj.x = ((t)localObject1);
        paramj.K = false;
        paramj.a(this.h);
        if (paramj.K) {
          break;
        }
        throw new ay("Fragment " + paramj + " did not call through to super.onAttach()");
      }
      localObject1 = paramj.A;
      if (!paramj.H)
      {
        localObject1 = paramj.i;
        if (paramj.z != null) {
          paramj.z.j = false;
        }
        paramj.K = false;
        paramj.a((Bundle)localObject1);
        if (!paramj.K) {
          throw new ay("Fragment " + paramj + " did not call through to super.onCreate()");
        }
        if (localObject1 != null)
        {
          localObject1 = ((Bundle)localObject1).getParcelable("android:support:fragments");
          if (localObject1 != null)
          {
            if (paramj.z == null) {
              paramj.n();
            }
            paramj.z.a((Parcelable)localObject1, null);
            paramj.z.j();
          }
        }
      }
      paramj.H = false;
      i2 = i1;
      if (paramj.t)
      {
        paramj.N = paramj.b(paramj.b(paramj.i), null, paramj.i);
        if (paramj.N == null) {
          break label984;
        }
        paramj.O = paramj.N;
        if (Build.VERSION.SDK_INT >= 11)
        {
          gt.a(paramj.N, false);
          if (paramj.E) {
            paramj.N.setVisibility(8);
          }
          paramj.a(paramj.N, paramj.i);
          i2 = i1;
        }
      }
      else
      {
        i3 = i2;
        if (i2 <= 1) {
          break label1125;
        }
        if (!paramj.t)
        {
          if (paramj.C == 0) {
            break label2183;
          }
          localObject2 = (ViewGroup)this.i.a(paramj.C);
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = localObject2;
            if (!paramj.v) {
              a(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(paramj.C) + " (" + paramj.e().getResourceName(paramj.C) + ") for fragment " + paramj));
            }
          }
        }
      }
    }
    label833:
    label984:
    label1018:
    label1125:
    label1422:
    label1843:
    label2177:
    label2183:
    for (Object localObject1 = localObject2;; localObject1 = null)
    {
      paramj.M = ((ViewGroup)localObject1);
      paramj.N = paramj.b(paramj.b(paramj.i), (ViewGroup)localObject1, paramj.i);
      if (paramj.N != null)
      {
        paramj.O = paramj.N;
        if (Build.VERSION.SDK_INT >= 11)
        {
          gt.a(paramj.N, false);
          if (localObject1 != null)
          {
            localObject2 = a(paramj, paramInt2, true, paramInt3);
            if (localObject2 != null) {
              paramj.N.startAnimation((Animation)localObject2);
            }
            ((ViewGroup)localObject1).addView(paramj.N);
          }
          if (paramj.E) {
            paramj.N.setVisibility(8);
          }
          paramj.a(paramj.N, paramj.i);
        }
      }
      for (;;)
      {
        localObject1 = paramj.i;
        if (paramj.z != null) {
          paramj.z.j = false;
        }
        paramj.K = false;
        paramj.d((Bundle)localObject1);
        if (paramj.K) {
          break label1018;
        }
        throw new ay("Fragment " + paramj + " did not call through to super.onActivityCreated()");
        paramj.N = aw.a(paramj.N);
        break;
        paramj.O = null;
        i2 = i1;
        break label644;
        paramj.N = aw.a(paramj.N);
        break label833;
        paramj.O = null;
      }
      if (paramj.z != null) {
        paramj.z.k();
      }
      if (paramj.N != null)
      {
        localObject1 = paramj.i;
        if (paramj.j != null)
        {
          paramj.O.restoreHierarchyState(paramj.j);
          paramj.j = null;
        }
        paramj.K = false;
        paramj.K = true;
        if (!paramj.K) {
          throw new ay("Fragment " + paramj + " did not call through to super.onViewStateRestored()");
        }
      }
      paramj.i = null;
      i3 = i2;
      i1 = i3;
      if (i3 > 3)
      {
        if (paramj.z != null)
        {
          paramj.z.j = false;
          paramj.z.h();
        }
        paramj.K = false;
        paramj.g_();
        if (!paramj.K) {
          throw new ay("Fragment " + paramj + " did not call through to super.onStart()");
        }
        if (paramj.z != null) {
          paramj.z.l();
        }
        i1 = i3;
        if (paramj.R != null)
        {
          paramj.R.f();
          i1 = i3;
        }
      }
      i2 = i1;
      if (i1 <= 4) {
        break;
      }
      paramj.s = true;
      if (paramj.z != null)
      {
        paramj.z.j = false;
        paramj.z.h();
      }
      paramj.K = false;
      paramj.j();
      if (!paramj.K) {
        throw new ay("Fragment " + paramj + " did not call through to super.onResume()");
      }
      if (paramj.z != null)
      {
        paramj.z.m();
        paramj.z.h();
      }
      paramj.i = null;
      paramj.j = null;
      i2 = i1;
      break;
      i2 = paramInt1;
      if (paramj.f <= paramInt1) {
        break;
      }
      switch (paramj.f)
      {
      default: 
        i2 = paramInt1;
        break;
      case 1: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
        do
        {
          i2 = paramInt1;
          if (paramInt1 > 0) {
            break;
          }
          if ((this.t) && (paramj.g != null))
          {
            localObject1 = paramj.g;
            paramj.g = null;
            ((View)localObject1).clearAnimation();
          }
          if (paramj.g == null) {
            break label1843;
          }
          paramj.h = paramInt1;
          i2 = 1;
          break;
          if (paramInt1 < 5)
          {
            if (paramj.z != null) {
              paramj.z.n();
            }
            paramj.K = false;
            paramj.k();
            if (!paramj.K) {
              throw new ay("Fragment " + paramj + " did not call through to super.onPause()");
            }
            paramj.s = false;
          }
          if (paramInt1 < 4)
          {
            if (paramj.z != null) {
              paramj.z.o();
            }
            paramj.K = false;
            paramj.h_();
            if (!paramj.K) {
              throw new ay("Fragment " + paramj + " did not call through to super.onStop()");
            }
          }
          if (paramInt1 < 3) {
            paramj.o();
          }
        } while (paramInt1 >= 2);
        if ((paramj.N != null) && (!this.h.isFinishing()) && (paramj.j == null)) {
          c(paramj);
        }
        if (paramj.z != null) {
          paramj.z.a(1, false);
        }
        paramj.K = false;
        paramj.d();
        if (!paramj.K) {
          throw new ay("Fragment " + paramj + " did not call through to super.onDestroyView()");
        }
        if (paramj.R != null) {
          paramj.R.e();
        }
        if ((paramj.N != null) && (paramj.M != null)) {
          if ((this.g <= 0) || (this.t)) {
            break label2177;
          }
        }
        for (localObject1 = a(paramj, paramInt2, false, paramInt3);; localObject1 = null)
        {
          if (localObject1 != null)
          {
            paramj.g = paramj.N;
            paramj.h = paramInt1;
            ((Animation)localObject1).setAnimationListener(new y(this, paramj));
            paramj.N.startAnimation((Animation)localObject1);
          }
          paramj.M.removeView(paramj.N);
          paramj.M = null;
          paramj.N = null;
          paramj.O = null;
          break label1422;
          if (!paramj.H)
          {
            if (paramj.z != null) {
              paramj.z.p();
            }
            paramj.K = false;
            paramj.l();
            if (!paramj.K) {
              throw new ay("Fragment " + paramj + " did not call through to super.onDestroy()");
            }
          }
          paramj.K = false;
          paramj.a();
          if (!paramj.K) {
            throw new ay("Fragment " + paramj + " did not call through to super.onDetach()");
          }
          i2 = paramInt1;
          if (paramBoolean) {
            break;
          }
          if (!paramj.H)
          {
            i2 = paramInt1;
            if (paramj.k < 0) {
              break;
            }
            this.b.set(paramj.k, null);
            if (this.p == null) {
              this.p = new ArrayList();
            }
            this.p.add(Integer.valueOf(paramj.k));
            this.h.a(paramj.l);
            paramj.k = -1;
            paramj.l = null;
            paramj.q = false;
            paramj.r = false;
            paramj.s = false;
            paramj.t = false;
            paramj.u = false;
            paramj.v = false;
            paramj.w = 0;
            paramj.x = null;
            paramj.z = null;
            paramj.y = null;
            paramj.B = 0;
            paramj.C = 0;
            paramj.D = null;
            paramj.E = false;
            paramj.F = false;
            paramj.H = false;
            paramj.R = null;
            paramj.S = false;
            paramj.T = false;
            i2 = paramInt1;
            break;
          }
          paramj.y = null;
          paramj.A = null;
          paramj.x = null;
          paramj.z = null;
          i2 = paramInt1;
          break;
        }
      }
    }
  }
  
  public final void a(j paramj, boolean paramBoolean)
  {
    if (this.c == null) {
      this.c = new ArrayList();
    }
    if (paramj.k < 0)
    {
      if ((this.p != null) && (this.p.size() > 0)) {
        break label127;
      }
      if (this.b == null) {
        this.b = new ArrayList();
      }
      paramj.a(this.b.size(), this.r);
      this.b.add(paramj);
    }
    while (!paramj.F) {
      if (this.c.contains(paramj))
      {
        throw new IllegalStateException("Fragment already added: " + paramj);
        label127:
        paramj.a(((Integer)this.p.remove(this.p.size() - 1)).intValue(), this.r);
        this.b.set(paramj.k, paramj);
      }
      else
      {
        this.c.add(paramj);
        paramj.q = true;
        paramj.r = false;
        if ((paramj.I) && (paramj.J)) {
          this.s = true;
        }
        if (paramBoolean) {
          b(paramj);
        }
      }
    }
  }
  
  public final void a(Runnable paramRunnable, boolean paramBoolean)
  {
    if (!paramBoolean) {
      r();
    }
    try
    {
      if ((this.t) || (this.h == null))
      {
        paramRunnable = new java/lang/IllegalStateException;
        paramRunnable.<init>("Activity has been destroyed");
        throw paramRunnable;
      }
    }
    finally {}
    if (this.m == null)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.m = localArrayList;
    }
    this.m.add(paramRunnable);
    if (this.m.size() == 1)
    {
      this.h.a.removeCallbacks(this.x);
      this.h.a.post(this.x);
    }
  }
  
  public final void a(String paramString, int paramInt)
  {
    a(new w(this, paramString, 1), false);
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i2 = 0;
    String str = paramString + "    ";
    int i3;
    int i1;
    if (this.b != null)
    {
      i3 = this.b.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("Active Fragments in ");
        paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
        paramPrintWriter.println(":");
        for (i1 = 0; i1 < i3; i1++)
        {
          j localj = (j)this.b.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localj);
          if (localj != null) {
            localj.a(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
          }
        }
      }
    }
    if (this.c != null)
    {
      i3 = this.c.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Added Fragments:");
        for (i1 = 0; i1 < i3; i1++)
        {
          paramFileDescriptor = (j)this.c.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
        }
      }
    }
    if (this.q != null)
    {
      i3 = this.q.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (i1 = 0; i1 < i3; i1++)
        {
          paramFileDescriptor = (j)this.q.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
        }
      }
    }
    if (this.d != null)
    {
      i3 = this.d.size();
      if (i3 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (i1 = 0; i1 < i3; i1++)
        {
          paramFileDescriptor = (c)this.d.get(i1);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i1);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramFileDescriptor.toString());
          paramFileDescriptor.a(str, paramPrintWriter);
        }
      }
    }
    try
    {
      if (this.e != null)
      {
        i3 = this.e.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Back Stack Indices:");
          for (i1 = 0; i1 < i3; i1++)
          {
            paramFileDescriptor = (c)this.e.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
          }
        }
      }
      if ((this.f != null) && (this.f.size() > 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mAvailBackStackIndices: ");
        paramPrintWriter.println(Arrays.toString(this.f.toArray()));
      }
      if (this.m != null)
      {
        i3 = this.m.size();
        if (i3 > 0)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.println("Pending Actions:");
          for (i1 = i2; i1 < i3; i1++)
          {
            paramFileDescriptor = (Runnable)this.m.get(i1);
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(i1);
            paramPrintWriter.print(": ");
            paramPrintWriter.println(paramFileDescriptor);
          }
        }
      }
      paramPrintWriter.print(paramString);
    }
    finally {}
    paramPrintWriter.println("FragmentManager misc state:");
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mActivity=");
    paramPrintWriter.println(this.h);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mContainer=");
    paramPrintWriter.println(this.i);
    if (this.r != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mParent=");
      paramPrintWriter.println(this.r);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("  mCurState=");
    paramPrintWriter.print(this.g);
    paramPrintWriter.print(" mStateSaved=");
    paramPrintWriter.print(this.j);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.t);
    if (this.s)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNeedMenuInvalidate=");
      paramPrintWriter.println(this.s);
    }
    if (this.k != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mNoTransactionsBecause=");
      paramPrintWriter.println(this.k);
    }
    if ((this.p != null) && (this.p.size() > 0))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mAvailIndices: ");
      paramPrintWriter.println(Arrays.toString(this.p.toArray()));
    }
  }
  
  public final void a(m paramm, q paramq, j paramj)
  {
    if (this.h != null) {
      throw new IllegalStateException("Already attached");
    }
    this.h = paramm;
    this.i = paramq;
    this.r = paramj;
  }
  
  public final boolean a(Menu paramMenu)
  {
    int i1;
    boolean bool3;
    boolean bool4;
    j localj;
    boolean bool2;
    if (this.c != null)
    {
      i1 = 0;
      bool3 = false;
      bool4 = bool3;
      if (i1 >= this.c.size()) {
        break label125;
      }
      localj = (j)this.c.get(i1);
      bool4 = bool3;
      if (localj != null)
      {
        if (localj.E) {
          break label134;
        }
        if ((!localj.I) || (!localj.J)) {
          break label128;
        }
        localj.a(paramMenu);
        bool2 = true;
        label79:
        bool1 = bool2;
        if (localj.z == null) {}
      }
    }
    label125:
    label128:
    label134:
    for (boolean bool1 = bool2 | localj.z.a(paramMenu);; bool1 = false)
    {
      bool4 = bool3;
      if (bool1) {
        bool4 = true;
      }
      i1++;
      bool3 = bool4;
      break;
      bool4 = false;
      return bool4;
      bool2 = false;
      break label79;
    }
  }
  
  public final boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i5 = 0;
    Object localObject2 = null;
    Object localObject1 = null;
    int i4;
    boolean bool1;
    boolean bool2;
    j localj;
    int i3;
    if (this.c != null)
    {
      i4 = 0;
      bool1 = false;
      localObject2 = localObject1;
      bool2 = bool1;
      if (i4 >= this.c.size()) {
        break label164;
      }
      localj = (j)this.c.get(i4);
      if (localj == null) {
        break label232;
      }
      if (localj.E) {
        break label241;
      }
      if ((!localj.I) || (!localj.J)) {
        break label235;
      }
      localj.a(paramMenu, paramMenuInflater);
      i3 = 1;
      label93:
      i1 = i3;
      if (localj.z == null) {}
    }
    label164:
    label232:
    label235:
    label241:
    int i2;
    for (int i1 = i3 | localj.z.a(paramMenu, paramMenuInflater);; i2 = 0)
    {
      if (i1 != 0)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localj);
        bool1 = true;
        localObject1 = localObject2;
      }
      for (;;)
      {
        i4++;
        break;
        bool2 = false;
        if (this.q != null) {
          for (i1 = i5; i1 < this.q.size(); i1++)
          {
            paramMenu = (j)this.q.get(i1);
            if ((localObject2 == null) || (!((ArrayList)localObject2).contains(paramMenu))) {
              j.m();
            }
          }
        }
        this.q = ((ArrayList)localObject2);
        return bool2;
      }
      i3 = 0;
      break label93;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.c != null) {}
    for (int i2 = 0;; i2++)
    {
      bool1 = bool2;
      j localj;
      int i1;
      if (i2 < this.c.size())
      {
        localj = (j)this.c.get(i2);
        if (localj == null) {
          continue;
        }
        if (localj.E) {
          break label114;
        }
        if ((!localj.I) || (!localj.J) || (!localj.a(paramMenuItem))) {
          break label91;
        }
        i1 = 1;
      }
      while (i1 != 0)
      {
        bool1 = true;
        return bool1;
        label91:
        if ((localj.z != null) && (localj.z.a(paramMenuItem))) {
          i1 = 1;
        } else {
          label114:
          i1 = 0;
        }
      }
    }
  }
  
  final boolean a(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    if (this.d == null) {
      bool1 = bool2;
    }
    int i1;
    do
    {
      int i2;
      do
      {
        for (;;)
        {
          return bool1;
          if ((paramString != null) || (paramInt1 >= 0) || ((paramInt2 & 0x1) != 0)) {
            break;
          }
          paramInt1 = this.d.size() - 1;
          bool1 = bool2;
          if (paramInt1 >= 0)
          {
            paramString = (c)this.d.remove(paramInt1);
            localObject = new SparseArray();
            localSparseArray1 = new SparseArray();
            paramString.a((SparseArray)localObject, localSparseArray1);
            paramString.a(true, null, (SparseArray)localObject, localSparseArray1);
            bool1 = true;
          }
        }
        i1 = -1;
        if ((paramString == null) && (paramInt1 < 0)) {
          break;
        }
        for (i2 = this.d.size() - 1; i2 >= 0; i2--)
        {
          localObject = (c)this.d.get(i2);
          if (((paramString != null) && (paramString.equals(((c)localObject).f))) || ((paramInt1 >= 0) && (paramInt1 == ((c)localObject).g))) {
            break;
          }
        }
        bool1 = bool2;
      } while (i2 < 0);
      i1 = i2;
      if ((paramInt2 & 0x1) != 0) {
        for (paramInt2 = i2 - 1;; paramInt2--)
        {
          i1 = paramInt2;
          if (paramInt2 < 0) {
            break;
          }
          localObject = (c)this.d.get(paramInt2);
          if ((paramString == null) || (!paramString.equals(((c)localObject).f)))
          {
            i1 = paramInt2;
            if (paramInt1 < 0) {
              break;
            }
            i1 = paramInt2;
            if (paramInt1 != ((c)localObject).g) {
              break;
            }
          }
        }
      }
      bool1 = bool2;
    } while (i1 == this.d.size() - 1);
    Object localObject = new ArrayList();
    for (paramInt1 = this.d.size() - 1; paramInt1 > i1; paramInt1--) {
      ((ArrayList)localObject).add(this.d.remove(paramInt1));
    }
    paramInt2 = ((ArrayList)localObject).size() - 1;
    SparseArray localSparseArray1 = new SparseArray();
    SparseArray localSparseArray2 = new SparseArray();
    for (paramInt1 = 0; paramInt1 <= paramInt2; paramInt1++) {
      ((c)((ArrayList)localObject).get(paramInt1)).a(localSparseArray1, localSparseArray2);
    }
    paramString = null;
    paramInt1 = 0;
    label387:
    c localc;
    if (paramInt1 <= paramInt2)
    {
      localc = (c)((ArrayList)localObject).get(paramInt1);
      if (paramInt1 != paramInt2) {
        break label430;
      }
    }
    label430:
    for (boolean bool1 = true;; bool1 = false)
    {
      paramString = localc.a(bool1, paramString, localSparseArray1, localSparseArray2);
      paramInt1++;
      break label387;
      break;
    }
  }
  
  public final void b(Menu paramMenu)
  {
    if (this.c != null) {
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        j localj = (j)this.c.get(i1);
        if ((localj != null) && (!localj.E) && (localj.z != null)) {
          localj.z.b(paramMenu);
        }
      }
    }
  }
  
  public final void b(j paramj, int paramInt1, int paramInt2)
  {
    if (!paramj.E)
    {
      paramj.E = true;
      if (paramj.N != null)
      {
        Animation localAnimation = a(paramj, paramInt1, false, paramInt2);
        if (localAnimation != null) {
          paramj.N.startAnimation(localAnimation);
        }
        paramj.N.setVisibility(8);
      }
      if ((paramj.q) && (paramj.I) && (paramj.J)) {
        this.s = true;
      }
      j.g();
    }
  }
  
  public final boolean b()
  {
    return h();
  }
  
  public final boolean b(MenuItem paramMenuItem)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.c != null) {}
    for (int i1 = 0;; i1++)
    {
      bool1 = bool2;
      if (i1 < this.c.size())
      {
        j localj = (j)this.c.get(i1);
        if (localj == null) {
          continue;
        }
        if ((localj.E) || (localj.z == null) || (!localj.z.b(paramMenuItem))) {
          break label86;
        }
      }
      label86:
      for (int i2 = 1; i2 != 0; i2 = 0)
      {
        bool1 = true;
        return bool1;
      }
    }
  }
  
  public final boolean b(String paramString, int paramInt)
  {
    r();
    h();
    return a(paramString, -1, 1);
  }
  
  public final void c()
  {
    a(new v(this), false);
  }
  
  public final void c(j paramj, int paramInt1, int paramInt2)
  {
    if (paramj.E)
    {
      paramj.E = false;
      if (paramj.N != null)
      {
        Animation localAnimation = a(paramj, paramInt1, true, paramInt2);
        if (localAnimation != null) {
          paramj.N.startAnimation(localAnimation);
        }
        paramj.N.setVisibility(0);
      }
      if ((paramj.q) && (paramj.I) && (paramj.J)) {
        this.s = true;
      }
      j.g();
    }
  }
  
  public final void d(j paramj, int paramInt1, int paramInt2)
  {
    if (!paramj.F)
    {
      paramj.F = true;
      if (paramj.q)
      {
        if (this.c != null) {
          this.c.remove(paramj);
        }
        if ((paramj.I) && (paramj.J)) {
          this.s = true;
        }
        paramj.q = false;
        a(paramj, 1, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final boolean d()
  {
    r();
    h();
    return a(null, -1, 0);
  }
  
  public final int e()
  {
    if (this.d != null) {}
    for (int i1 = this.d.size();; i1 = 0) {
      return i1;
    }
  }
  
  public final void e(j paramj, int paramInt1, int paramInt2)
  {
    if (paramj.F)
    {
      paramj.F = false;
      if (!paramj.q)
      {
        if (this.c == null) {
          this.c = new ArrayList();
        }
        if (this.c.contains(paramj)) {
          throw new IllegalStateException("Fragment already added: " + paramj);
        }
        this.c.add(paramj);
        paramj.q = true;
        if ((paramj.I) && (paramj.J)) {
          this.s = true;
        }
        a(paramj, this.g, paramInt1, paramInt2, false);
      }
    }
  }
  
  public final List f()
  {
    return this.b;
  }
  
  final void g()
  {
    if (this.b == null) {}
    for (;;)
    {
      return;
      for (int i1 = 0; i1 < this.b.size(); i1++)
      {
        j localj = (j)this.b.get(i1);
        if (localj != null) {
          a(localj);
        }
      }
    }
  }
  
  public final boolean h()
  {
    if (this.o) {
      throw new IllegalStateException("Recursive entry to executePendingTransactions");
    }
    if (Looper.myLooper() != this.h.a.getLooper()) {
      throw new IllegalStateException("Must be called from main thread of process");
    }
    int i1;
    for (boolean bool = false;; bool = true) {
      try
      {
        if ((this.m == null) || (this.m.size() == 0))
        {
          if (!this.u) {
            break label271;
          }
          int i4 = 0;
          int i2;
          for (i1 = 0; i4 < this.b.size(); i1 = i2)
          {
            j localj = (j)this.b.get(i4);
            i2 = i1;
            if (localj != null)
            {
              i2 = i1;
              if (localj.R != null) {
                i2 = i1 | localj.R.a();
              }
            }
            i4++;
          }
        }
        int i3 = this.m.size();
        if ((this.n == null) || (this.n.length < i3)) {
          this.n = new Runnable[i3];
        }
        this.m.toArray(this.n);
        this.m.clear();
        this.h.a.removeCallbacks(this.x);
        this.o = true;
        for (i1 = 0; i1 < i3; i1++)
        {
          this.n[i1].run();
          this.n[i1] = null;
        }
        this.o = false;
      }
      finally {}
    }
    if (i1 == 0)
    {
      this.u = false;
      g();
    }
    label271:
    return bool;
  }
  
  final Parcelable i()
  {
    Object localObject3 = null;
    Object localObject4 = null;
    h();
    if (l) {
      this.j = true;
    }
    Object localObject1 = localObject4;
    if (this.b != null)
    {
      if (this.b.size() <= 0) {
        localObject1 = localObject4;
      }
    }
    else {
      return (Parcelable)localObject1;
    }
    int i3 = this.b.size();
    ad[] arrayOfad = new ad[i3];
    int i2 = 0;
    int i1 = 0;
    label68:
    j localj;
    ad localad;
    Object localObject2;
    if (i2 < i3)
    {
      localj = (j)this.b.get(i2);
      if (localj == null) {
        break label748;
      }
      if (localj.k < 0) {
        a(new IllegalStateException("Failure saving state: active " + localj + " has cleared index: " + localj.k));
      }
      localad = new ad(localj);
      arrayOfad[i2] = localad;
      if ((localj.f > 0) && (localad.j == null))
      {
        if (this.v == null) {
          this.v = new Bundle();
        }
        localj.g(this.v);
        if (this.v.isEmpty()) {
          break label743;
        }
        localObject2 = this.v;
        this.v = null;
        label226:
        if (localj.N != null) {
          c(localj);
        }
        localObject1 = localObject2;
        if (localj.j != null)
        {
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = new Bundle();
          }
          ((Bundle)localObject1).putSparseParcelableArray("android:view_state", localj.j);
        }
        localObject2 = localObject1;
        if (!localj.Q)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new Bundle();
          }
          ((Bundle)localObject2).putBoolean("android:user_visible_hint", localj.Q);
        }
        localad.j = ((Bundle)localObject2);
        if (localj.n == null) {
          break label507;
        }
        if (localj.n.k < 0) {
          a(new IllegalStateException("Failure saving state: " + localj + " has target not in fragment manager: " + localj.n));
        }
        if (localad.j == null) {
          localad.j = new Bundle();
        }
        localObject1 = localad.j;
        localObject2 = localj.n;
        if (((j)localObject2).k < 0) {
          a(new IllegalStateException("Fragment " + localObject2 + " is not currently in the FragmentManager"));
        }
        ((Bundle)localObject1).putInt("android:target_state", ((j)localObject2).k);
        if (localj.p == 0) {
          break label507;
        }
        localad.j.putInt("android:target_req_state", localj.p);
        i1 = 1;
      }
    }
    label507:
    label743:
    label748:
    for (;;)
    {
      i2++;
      break label68;
      localad.j = localj.i;
      i1 = 1;
      continue;
      localObject1 = localObject4;
      if (i1 == 0) {
        break;
      }
      if (this.c != null)
      {
        i2 = this.c.size();
        if (i2 > 0)
        {
          localObject2 = new int[i2];
          for (i1 = 0;; i1++)
          {
            localObject1 = localObject2;
            if (i1 >= i2) {
              break;
            }
            localObject2[i1] = ((j)this.c.get(i1)).k;
            if (localObject2[i1] < 0) {
              a(new IllegalStateException("Failure saving state: active " + this.c.get(i1) + " has cleared index: " + localObject2[i1]));
            }
          }
        }
      }
      localObject1 = null;
      localObject2 = localObject3;
      if (this.d != null)
      {
        i2 = this.d.size();
        localObject2 = localObject3;
        if (i2 > 0)
        {
          localObject3 = new g[i2];
          for (i1 = 0;; i1++)
          {
            localObject2 = localObject3;
            if (i1 >= i2) {
              break;
            }
            localObject3[i1] = new g((c)this.d.get(i1));
          }
        }
      }
      localObject3 = new aa();
      ((aa)localObject3).a = arrayOfad;
      ((aa)localObject3).b = ((int[])localObject1);
      ((aa)localObject3).c = ((g[])localObject2);
      localObject1 = localObject3;
      break;
      localObject2 = null;
      break label226;
    }
  }
  
  public final void j()
  {
    this.j = false;
    a(1, false);
  }
  
  public final void k()
  {
    this.j = false;
    a(2, false);
  }
  
  public final void l()
  {
    this.j = false;
    a(4, false);
  }
  
  public final void m()
  {
    this.j = false;
    a(5, false);
  }
  
  public final void n()
  {
    a(4, false);
  }
  
  public final void o()
  {
    this.j = true;
    a(3, false);
  }
  
  public final void p()
  {
    this.t = true;
    h();
    a(0, false);
    this.h = null;
    this.i = null;
    this.r = null;
  }
  
  public final void q()
  {
    if (this.c != null) {
      for (int i1 = 0; i1 < this.c.size(); i1++)
      {
        j localj = (j)this.c.get(i1);
        if (localj != null)
        {
          localj.onLowMemory();
          if (localj.z != null) {
            localj.z.q();
          }
        }
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    if (this.r != null) {
      a.a(this.r, localStringBuilder);
    }
    for (;;)
    {
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
      a.a(this.h, localStringBuilder);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */