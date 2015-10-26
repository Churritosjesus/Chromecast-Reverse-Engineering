import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class tf
{
  public static final boolean a;
  private static final PorterDuff.Mode b;
  private static final WeakHashMap c;
  private static final tg d;
  private static final int[] e;
  private static final int[] f;
  private static final int[] g;
  private static final int[] h;
  private static final int[] i;
  private static final int[] j;
  private final WeakReference k;
  private SparseArray l;
  private ColorStateList m;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      b = PorterDuff.Mode.SRC_IN;
      c = new WeakHashMap();
      d = new tg(6);
      e = new int[] { a.aN, a.aL, a.af };
      f = new int[] { a.ao, a.ar, a.ay, a.aq, a.ap, a.ax, a.as, a.at, a.aw, a.av, a.au, a.az };
      g = new int[] { a.aK, a.aM, a.am, a.aJ };
      h = new int[] { a.aC, a.ak, a.aB };
      i = new int[] { a.an, a.aI, a.aO, a.aE, a.aF, a.aD, a.aH, a.aG, a.ai, a.ag };
      j = new int[] { a.ah, a.aj };
      return;
    }
  }
  
  private tf(Context paramContext)
  {
    this.k = new WeakReference(paramContext);
  }
  
  public static Drawable a(Context paramContext, int paramInt)
  {
    int n;
    if ((a(f, paramInt)) || (a(e, paramInt)) || (a(g, paramInt)) || (a(i, paramInt)) || (a(h, paramInt)) || (a(j, paramInt)) || (paramInt == a.al))
    {
      n = 1;
      if (n == 0) {
        break label90;
      }
    }
    label90:
    for (paramContext = a(paramContext).a(paramInt, false);; paramContext = au.a(paramContext, paramInt))
    {
      return paramContext;
      n = 0;
      break;
    }
  }
  
  public static tf a(Context paramContext)
  {
    tf localtf2 = (tf)c.get(paramContext);
    tf localtf1 = localtf2;
    if (localtf2 == null)
    {
      localtf1 = new tf(paramContext);
      c.put(paramContext, localtf1);
    }
    return localtf1;
  }
  
  private static void a(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Object localObject = paramMode;
    if (paramMode == null) {
      localObject = b;
    }
    PorterDuffColorFilter localPorterDuffColorFilter = (PorterDuffColorFilter)d.a(Integer.valueOf(tg.a(paramInt, (PorterDuff.Mode)localObject)));
    paramMode = localPorterDuffColorFilter;
    if (localPorterDuffColorFilter == null)
    {
      paramMode = new PorterDuffColorFilter(paramInt, (PorterDuff.Mode)localObject);
      localObject = (PorterDuffColorFilter)d.a(Integer.valueOf(tg.a(paramInt, (PorterDuff.Mode)localObject)), paramMode);
    }
    paramDrawable.setColorFilter(paramMode);
  }
  
  public static void a(View paramView, te paramte)
  {
    Drawable localDrawable = paramView.getBackground();
    if (paramte.b) {
      a(localDrawable, paramte.a.getColorForState(paramView.getDrawableState(), paramte.a.getDefaultColor()), null);
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT <= 10) {
        paramView.invalidate();
      }
      return;
      localDrawable.clearColorFilter();
    }
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool2 = false;
    int i1 = paramArrayOfInt.length;
    for (int n = 0;; n++)
    {
      boolean bool1 = bool2;
      if (n < i1)
      {
        if (paramArrayOfInt[n] == paramInt) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
    }
  }
  
  public final ColorStateList a(int paramInt)
  {
    Object localObject2 = (Context)this.k.get();
    if (localObject2 == null) {
      localObject2 = null;
    }
    for (;;)
    {
      return (ColorStateList)localObject2;
      Object localObject1;
      label38:
      int[] arrayOfInt;
      int n;
      Object localObject3;
      int i2;
      int i1;
      if (this.l != null)
      {
        localObject1 = (ColorStateList)this.l.get(paramInt);
        if (localObject1 != null) {
          break label945;
        }
        if (paramInt != a.an) {
          break label177;
        }
        arrayOfInt = tb.a;
        n = tb.c((Context)localObject2, a.C);
        localObject3 = tb.g;
        i2 = tb.a((Context)localObject2, a.C);
        localObject1 = tb.h;
        i1 = tb.a((Context)localObject2, a.A);
        localObject1 = new ColorStateList(new int[][] { arrayOfInt, localObject3, localObject1 }, new int[] { n, i2, i1 });
      }
      for (;;)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          break;
        }
        if (this.l == null) {
          this.l = new SparseArray();
        }
        this.l.append(paramInt, localObject1);
        localObject2 = localObject1;
        break;
        localObject1 = null;
        break label38;
        label177:
        if (paramInt == a.aH)
        {
          arrayOfInt = tb.a;
          i2 = tb.a((Context)localObject2, 16842800, 0.1F);
          localObject1 = tb.e;
          n = tb.a((Context)localObject2, a.A, 0.3F);
          localObject3 = tb.h;
          i1 = tb.a((Context)localObject2, 16842800, 0.3F);
          localObject1 = new ColorStateList(new int[][] { arrayOfInt, localObject1, localObject3 }, new int[] { i2, n, i1 });
        }
        else
        {
          if (paramInt == a.aG)
          {
            localObject1 = new int[3][];
            arrayOfInt = new int[3];
            localObject3 = tb.b((Context)localObject2, a.D);
            if ((localObject3 != null) && (((ColorStateList)localObject3).isStateful()))
            {
              localObject1[0] = tb.a;
              arrayOfInt[0] = ((ColorStateList)localObject3).getColorForState(localObject1[0], 0);
              localObject1[1] = tb.e;
              arrayOfInt[1] = tb.a((Context)localObject2, a.A);
              localObject1[2] = tb.h;
              arrayOfInt[2] = ((ColorStateList)localObject3).getDefaultColor();
            }
            for (;;)
            {
              localObject1 = new ColorStateList((int[][])localObject1, arrayOfInt);
              break;
              localObject1[0] = tb.a;
              arrayOfInt[0] = tb.c((Context)localObject2, a.D);
              localObject1[1] = tb.e;
              arrayOfInt[1] = tb.a((Context)localObject2, a.A);
              localObject1[2] = tb.h;
              arrayOfInt[2] = tb.a((Context)localObject2, a.D);
            }
          }
          if ((paramInt == a.ai) || (paramInt == a.ag))
          {
            i2 = tb.a((Context)localObject2, a.z);
            int i3 = tb.a((Context)localObject2, a.B);
            localObject1 = tb.a;
            i1 = tb.c((Context)localObject2, a.z);
            localObject3 = tb.d;
            n = a.a(i3, i2);
            localObject2 = tb.b;
            i3 = a.a(i3, i2);
            localObject1 = new ColorStateList(new int[][] { localObject1, localObject3, localObject2, tb.h }, new int[] { i1, n, i3, i2 });
          }
          else if ((paramInt == a.aE) || (paramInt == a.aF))
          {
            localObject3 = tb.a;
            n = tb.c((Context)localObject2, a.C);
            arrayOfInt = tb.g;
            i1 = tb.a((Context)localObject2, a.C);
            localObject1 = tb.h;
            i2 = tb.a((Context)localObject2, a.A);
            localObject1 = new ColorStateList(new int[][] { localObject3, arrayOfInt, localObject1 }, new int[] { n, i1, i2 });
          }
          else if (a(f, paramInt))
          {
            localObject1 = tb.b((Context)localObject2, a.C);
          }
          else if (a(i, paramInt))
          {
            if (this.m == null)
            {
              i1 = tb.a((Context)localObject2, a.C);
              n = tb.a((Context)localObject2, a.A);
              localObject1 = tb.a;
              i2 = tb.c((Context)localObject2, a.C);
              this.m = new ColorStateList(new int[][] { localObject1, tb.b, tb.c, tb.d, tb.e, tb.f, tb.h }, new int[] { i2, n, n, n, n, n, i1 });
            }
            localObject1 = this.m;
          }
          else if (a(j, paramInt))
          {
            arrayOfInt = tb.a;
            i1 = tb.c((Context)localObject2, a.C);
            localObject3 = tb.e;
            i2 = tb.a((Context)localObject2, a.A);
            localObject1 = tb.h;
            n = tb.a((Context)localObject2, a.C);
            localObject1 = new ColorStateList(new int[][] { arrayOfInt, localObject3, localObject1 }, new int[] { i1, i2, n });
          }
        }
      }
      label945:
      localObject2 = localObject1;
    }
  }
  
  public final Drawable a(int paramInt, boolean paramBoolean)
  {
    Object localObject3 = null;
    Object localObject1 = null;
    Object localObject2 = (Context)this.k.get();
    if (localObject2 == null) {
      return (Drawable)localObject1;
    }
    Drawable localDrawable = au.a((Context)localObject2, paramInt);
    localObject1 = localDrawable;
    if (localDrawable != null)
    {
      localObject2 = localDrawable;
      if (Build.VERSION.SDK_INT >= 8) {
        localObject2 = localDrawable.mutate();
      }
      localObject1 = a(paramInt);
      if (localObject1 == null) {
        break label119;
      }
      localDrawable = bo.c((Drawable)localObject2);
      bo.a(localDrawable, (ColorStateList)localObject1);
      localObject2 = localObject3;
      if (paramInt == a.aG) {
        localObject2 = PorterDuff.Mode.MULTIPLY;
      }
      localObject1 = localDrawable;
      if (localObject2 != null)
      {
        bo.a(localDrawable, (PorterDuff.Mode)localObject2);
        localObject1 = localDrawable;
      }
    }
    for (;;)
    {
      break;
      label119:
      if (paramInt == a.al)
      {
        localObject1 = new LayerDrawable(new Drawable[] { a(a.ak, false), a(a.am, false) });
        break;
      }
      localObject1 = localObject2;
      if (!a(paramInt, (Drawable)localObject2))
      {
        localObject1 = localObject2;
        if (paramBoolean) {
          localObject1 = null;
        }
      }
    }
  }
  
  public final boolean a(int paramInt, Drawable paramDrawable)
  {
    Context localContext = (Context)this.k.get();
    boolean bool;
    if (localContext == null)
    {
      bool = false;
      return bool;
    }
    int n;
    PorterDuff.Mode localMode;
    int i1;
    if (a(e, paramInt))
    {
      n = a.C;
      localMode = null;
      i1 = 1;
      paramInt = -1;
    }
    for (;;)
    {
      if (i1 != 0)
      {
        a(paramDrawable, tb.a(localContext, n), localMode);
        if (paramInt != -1) {
          paramDrawable.setAlpha(paramInt);
        }
        bool = true;
        break;
        if (a(g, paramInt))
        {
          n = a.A;
          localMode = null;
          i1 = 1;
          paramInt = -1;
          continue;
        }
        if (a(h, paramInt))
        {
          localMode = PorterDuff.Mode.MULTIPLY;
          i1 = 1;
          n = 16842801;
          paramInt = -1;
          continue;
        }
        if (paramInt != a.aA) {
          break label163;
        }
        n = 16842800;
        paramInt = Math.round(40.8F);
        localMode = null;
        i1 = 1;
        continue;
      }
      bool = false;
      break;
      label163:
      paramInt = -1;
      n = 0;
      localMode = null;
      i1 = 0;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\tf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */