import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

class no
  extends ni
  implements fs, qb
{
  private View A;
  private boolean B;
  private boolean C;
  private boolean D;
  private nw[] E;
  private nw F;
  private final Runnable G = new np(this);
  private boolean H;
  private Rect I;
  private Rect J;
  private ot K;
  private sd n;
  vr o;
  ActionBarContextView p;
  PopupWindow q;
  Runnable r;
  ViewGroup s;
  boolean t;
  int u;
  private nt v;
  private nx w;
  private boolean x;
  private ViewGroup y;
  private TextView z;
  
  no(Context paramContext, Window paramWindow, ng paramng)
  {
    super(paramContext, paramWindow, paramng);
  }
  
  private void a(nw paramnw, KeyEvent paramKeyEvent)
  {
    int k = -1;
    if ((paramnw.m) || (this.m)) {}
    Object localObject1;
    int i;
    label50:
    label113:
    label119:
    label123:
    label125:
    Object localObject2;
    label263:
    do
    {
      do
      {
        for (;;)
        {
          return;
          if (paramnw.a == 0)
          {
            localObject1 = this.a;
            if ((((Context)localObject1).getResources().getConfiguration().screenLayout & 0xF) != 4) {
              break label113;
            }
            i = 1;
            if (((Context)localObject1).getApplicationInfo().targetSdkVersion < 11) {
              break label119;
            }
          }
          for (int j = 1;; j = 0)
          {
            if ((i != 0) && (j != 0)) {
              break label123;
            }
            localObject1 = this.b.getCallback();
            if ((localObject1 == null) || (((Window.Callback)localObject1).onMenuOpened(paramnw.a, paramnw.h))) {
              break label125;
            }
            a(paramnw, true);
            break;
            i = 0;
            break label50;
          }
        }
        localObject1 = (WindowManager)this.a.getSystemService("window");
      } while ((localObject1 == null) || (!b(paramnw, paramKeyEvent)));
      if ((paramnw.e != null) && (!paramnw.o)) {
        break label761;
      }
      if (paramnw.e != null) {
        break label581;
      }
      Context localContext = k();
      localObject2 = new TypedValue();
      paramKeyEvent = localContext.getResources().newTheme();
      paramKeyEvent.setTo(localContext.getTheme());
      paramKeyEvent.resolveAttribute(a.g, (TypedValue)localObject2, true);
      if (((TypedValue)localObject2).resourceId != 0) {
        paramKeyEvent.applyStyle(((TypedValue)localObject2).resourceId, true);
      }
      paramKeyEvent.resolveAttribute(a.K, (TypedValue)localObject2, true);
      if (((TypedValue)localObject2).resourceId == 0) {
        break;
      }
      paramKeyEvent.applyStyle(((TypedValue)localObject2).resourceId, true);
      localObject2 = new pi(localContext, 0);
      ((Context)localObject2).getTheme().setTo(paramKeyEvent);
      paramnw.j = ((Context)localObject2);
      paramKeyEvent = ((Context)localObject2).obtainStyledAttributes(oq.bN);
      paramnw.b = paramKeyEvent.getResourceId(oq.bQ, 0);
      paramnw.d = paramKeyEvent.getResourceId(oq.bO, 0);
      paramKeyEvent.recycle();
      paramnw.e = new nv(this, paramnw.j);
      paramnw.c = 81;
    } while (paramnw.e == null);
    label356:
    if (paramnw.g != null)
    {
      paramnw.f = paramnw.g;
      i = 1;
      label374:
      if (i == 0) {
        break label732;
      }
      if (paramnw.f == null) {
        break label755;
      }
      if (paramnw.g == null) {
        break label734;
      }
      i = 1;
      label396:
      if (i == 0) {
        break label759;
      }
      paramKeyEvent = paramnw.f.getLayoutParams();
      if (paramKeyEvent != null) {
        break label799;
      }
      paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
    }
    label581:
    label728:
    label732:
    label734:
    label755:
    label759:
    label761:
    label799:
    for (;;)
    {
      i = paramnw.b;
      paramnw.e.setBackgroundResource(i);
      localObject2 = paramnw.f.getParent();
      if ((localObject2 != null) && ((localObject2 instanceof ViewGroup))) {
        ((ViewGroup)localObject2).removeView(paramnw.f);
      }
      paramnw.e.addView(paramnw.f, paramKeyEvent);
      if (!paramnw.f.hasFocus()) {
        paramnw.f.requestFocus();
      }
      i = -2;
      for (;;)
      {
        paramnw.l = false;
        paramKeyEvent = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        paramKeyEvent.gravity = paramnw.c;
        paramKeyEvent.windowAnimations = paramnw.d;
        ((WindowManager)localObject1).addView(paramnw.e, paramKeyEvent);
        paramnw.m = true;
        break;
        paramKeyEvent.applyStyle(a.bZ, true);
        break label263;
        if ((!paramnw.o) || (paramnw.e.getChildCount() <= 0)) {
          break label356;
        }
        paramnw.e.removeAllViews();
        break label356;
        if (paramnw.h != null)
        {
          if (this.w == null) {
            this.w = new nx(this);
          }
          paramKeyEvent = this.w;
          if (paramnw.h == null) {}
          for (paramKeyEvent = null;; paramKeyEvent = paramnw.i.a(paramnw.e))
          {
            paramnw.f = ((View)paramKeyEvent);
            if (paramnw.f == null) {
              break label728;
            }
            i = 1;
            break;
            if (paramnw.i == null)
            {
              paramnw.i = new py(paramnw.j, a.bL);
              paramnw.i.d = paramKeyEvent;
              paramnw.h.a(paramnw.i);
            }
          }
        }
        i = 0;
        break label374;
        break;
        if (paramnw.i.b().getCount() > 0)
        {
          i = 1;
          break label396;
        }
        i = 0;
        break label396;
        break;
        if (paramnw.g != null)
        {
          paramKeyEvent = paramnw.g.getLayoutParams();
          if (paramKeyEvent != null)
          {
            i = k;
            if (paramKeyEvent.width == -1) {
              continue;
            }
          }
        }
        i = -2;
      }
    }
  }
  
  private boolean a(nw paramnw, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramKeyEvent.isSystem()) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if (!paramnw.k)
      {
        bool1 = bool2;
        if (!b(paramnw, paramKeyEvent)) {}
      }
      else
      {
        bool1 = bool2;
        if (paramnw.h != null) {
          bool1 = paramnw.h.performShortcut(paramInt1, paramKeyEvent, 1);
        }
      }
    }
  }
  
  private boolean b(nw paramnw, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    if (this.m) {}
    for (boolean bool1 = bool2;; bool1 = true)
    {
      return bool1;
      if (!paramnw.k) {
        break;
      }
    }
    if ((this.F != null) && (this.F != paramnw)) {
      a(this.F, false);
    }
    Window.Callback localCallback = this.b.getCallback();
    if (localCallback != null) {
      paramnw.g = localCallback.onCreatePanelView(paramnw.a);
    }
    int i;
    label102:
    Context localContext;
    TypedValue localTypedValue;
    Resources.Theme localTheme;
    Object localObject1;
    if ((paramnw.a == 0) || (paramnw.a == 8))
    {
      i = 1;
      if ((i != 0) && (this.n != null)) {
        this.n.g();
      }
      if ((paramnw.g != null) || ((i != 0) && ((this.f instanceof ou)))) {
        break label653;
      }
      if ((paramnw.h != null) && (!paramnw.p)) {
        break label515;
      }
      if (paramnw.h == null)
      {
        localContext = this.a;
        if (((paramnw.a != 0) && (paramnw.a != 8)) || (this.n == null)) {
          break label686;
        }
        localTypedValue = new TypedValue();
        localTheme = localContext.getTheme();
        localTheme.resolveAttribute(a.l, localTypedValue, true);
        if (localTypedValue.resourceId == 0) {
          break label493;
        }
        localObject1 = localContext.getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
        ((Resources.Theme)localObject1).resolveAttribute(a.m, localTypedValue, true);
        label267:
        Object localObject2 = localObject1;
        if (localTypedValue.resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(localTypedValue.resourceId, true);
        }
        if (localObject2 == null) {
          break label686;
        }
        localObject1 = new pi(localContext, 0);
        ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new qa((Context)localObject1);
      ((qa)localObject1).a(this);
      paramnw.a((qa)localObject1);
      bool1 = bool2;
      if (paramnw.h == null) {
        break;
      }
      if ((i != 0) && (this.n != null))
      {
        if (this.v == null) {
          this.v = new nt(this);
        }
        this.n.a(paramnw.h, this.v);
      }
      paramnw.h.d();
      if (!localCallback.onCreatePanelMenu(paramnw.a, paramnw.h))
      {
        paramnw.a(null);
        bool1 = bool2;
        if (i == 0) {
          break;
        }
        bool1 = bool2;
        if (this.n == null) {
          break;
        }
        this.n.a(null, this.v);
        bool1 = bool2;
        break;
        i = 0;
        break label102;
        label493:
        localTheme.resolveAttribute(a.m, localTypedValue, true);
        localObject1 = null;
        break label267;
      }
      paramnw.p = false;
      label515:
      paramnw.h.d();
      if (paramnw.q != null)
      {
        paramnw.h.b(paramnw.q);
        paramnw.q = null;
      }
      if (!localCallback.onPreparePanel(0, paramnw.g, paramnw.h))
      {
        if ((i != 0) && (this.n != null)) {
          this.n.a(null, this.v);
        }
        paramnw.h.e();
        bool1 = bool2;
        break;
      }
      if (paramKeyEvent != null)
      {
        i = paramKeyEvent.getDeviceId();
        label614:
        if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
          break label680;
        }
      }
      label653:
      label680:
      for (bool1 = true;; bool1 = false)
      {
        paramnw.n = bool1;
        paramnw.h.setQwertyMode(paramnw.n);
        paramnw.h.e();
        paramnw.k = true;
        paramnw.l = false;
        this.F = paramnw;
        bool1 = true;
        break;
        i = -1;
        break label614;
      }
      label686:
      localObject1 = localContext;
    }
  }
  
  private void f(int paramInt)
  {
    this.u |= 1 << paramInt;
    if ((!this.t) && (this.y != null))
    {
      gt.a(this.y, this.G);
      this.t = true;
    }
  }
  
  private void l()
  {
    label306:
    ContentFrameLayout localContentFrameLayout;
    if (!this.x)
    {
      localObject = LayoutInflater.from(this.a);
      if (!this.k) {
        if (this.j)
        {
          this.s = ((ViewGroup)((LayoutInflater)localObject).inflate(a.bH, null));
          this.h = false;
          this.g = false;
        }
      }
      while (this.s == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features");
        if (this.g)
        {
          localObject = new TypedValue();
          this.a.getTheme().resolveAttribute(a.l, (TypedValue)localObject, true);
          if (((TypedValue)localObject).resourceId != 0) {}
          for (localObject = new pi(this.a, ((TypedValue)localObject).resourceId);; localObject = this.a)
          {
            this.s = ((ViewGroup)LayoutInflater.from((Context)localObject).inflate(a.bQ, null));
            this.n = ((sd)this.s.findViewById(a.bd));
            this.n.a(this.b.getCallback());
            if (this.h) {
              this.n.a(9);
            }
            if (this.B) {
              this.n.a(2);
            }
            if (!this.C) {
              break;
            }
            this.n.a(5);
            break;
          }
          if (this.i) {}
          for (this.s = ((ViewGroup)((LayoutInflater)localObject).inflate(a.bP, null));; this.s = ((ViewGroup)((LayoutInflater)localObject).inflate(a.bO, null)))
          {
            if (Build.VERSION.SDK_INT < 21) {
              break label306;
            }
            gt.a(this.s, new nq(this));
            break;
          }
          ((sg)this.s).a(new nr(this));
        }
      }
      if (this.n == null) {
        this.z = ((TextView)this.s.findViewById(a.bx));
      }
      tm.b(this.s);
      ViewGroup localViewGroup = (ViewGroup)this.b.findViewById(16908290);
      localContentFrameLayout = (ContentFrameLayout)this.s.findViewById(a.aQ);
      while (localViewGroup.getChildCount() > 0)
      {
        localObject = localViewGroup.getChildAt(0);
        localViewGroup.removeViewAt(0);
        localContentFrameLayout.addView((View)localObject);
      }
      this.b.setContentView(this.s);
      localViewGroup.setId(-1);
      localContentFrameLayout.setId(16908290);
      if ((localViewGroup instanceof FrameLayout)) {
        ((FrameLayout)localViewGroup).setForeground(null);
      }
      if (!(this.c instanceof Activity)) {
        break label846;
      }
    }
    label846:
    for (Object localObject = ((Activity)this.c).getTitle();; localObject = this.l)
    {
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        b((CharSequence)localObject);
      }
      int i = this.y.getPaddingLeft();
      int k = this.y.getPaddingTop();
      int m = this.y.getPaddingRight();
      int j = this.y.getPaddingBottom();
      localContentFrameLayout.g.set(i, k, m, j);
      if (gt.u(localContentFrameLayout)) {
        localContentFrameLayout.requestLayout();
      }
      localObject = this.a.obtainStyledAttributes(oq.bN);
      i = oq.bY;
      if (localContentFrameLayout.a == null) {
        localContentFrameLayout.a = new TypedValue();
      }
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.a);
      i = oq.bZ;
      if (localContentFrameLayout.b == null) {
        localContentFrameLayout.b = new TypedValue();
      }
      ((TypedArray)localObject).getValue(i, localContentFrameLayout.b);
      if (((TypedArray)localObject).hasValue(oq.bW))
      {
        i = oq.bW;
        if (localContentFrameLayout.c == null) {
          localContentFrameLayout.c = new TypedValue();
        }
        ((TypedArray)localObject).getValue(i, localContentFrameLayout.c);
      }
      if (((TypedArray)localObject).hasValue(oq.bX))
      {
        i = oq.bX;
        if (localContentFrameLayout.d == null) {
          localContentFrameLayout.d = new TypedValue();
        }
        ((TypedArray)localObject).getValue(i, localContentFrameLayout.d);
      }
      if (((TypedArray)localObject).hasValue(oq.bU))
      {
        i = oq.bU;
        if (localContentFrameLayout.e == null) {
          localContentFrameLayout.e = new TypedValue();
        }
        ((TypedArray)localObject).getValue(i, localContentFrameLayout.e);
      }
      if (((TypedArray)localObject).hasValue(oq.bV))
      {
        i = oq.bV;
        if (localContentFrameLayout.f == null) {
          localContentFrameLayout.f = new TypedValue();
        }
        ((TypedArray)localObject).getValue(i, localContentFrameLayout.f);
      }
      ((TypedArray)localObject).recycle();
      localContentFrameLayout.requestLayout();
      this.x = true;
      localObject = e(0);
      if ((!this.m) && ((localObject == null) || (((nw)localObject).h == null))) {
        f(8);
      }
      return;
    }
  }
  
  private void m()
  {
    if (this.x) {
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
  }
  
  public final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    int j = 0;
    Object localObject = b(paramView, paramString, paramContext, paramAttributeSet);
    if (localObject != null)
    {
      paramView = (View)localObject;
      label22:
      return paramView;
    }
    boolean bool;
    label35:
    int i;
    if (Build.VERSION.SDK_INT < 21)
    {
      bool = true;
      if (this.K == null) {
        this.K = new ot();
      }
      if ((!bool) || (!this.x) || (paramView == null) || (paramView.getId() == 16908290) || (gt.v(paramView))) {
        break label296;
      }
      i = 1;
      label89:
      localObject = this.K;
      if ((i == 0) || (paramView == null)) {
        break label612;
      }
    }
    label212:
    label296:
    label607:
    label612:
    for (paramView = paramView.getContext();; paramView = paramContext)
    {
      paramView = ot.a(paramView, paramAttributeSet, bool, true);
      switch (paramString.hashCode())
      {
      default: 
        i = -1;
      }
      for (;;)
      {
        switch (i)
        {
        default: 
          if (paramContext == paramView) {
            break label607;
          }
          paramView = ((ot)localObject).a(paramView, paramString, paramAttributeSet);
          break label22;
          bool = false;
          break label35;
          i = 0;
          break label89;
          if (!paramString.equals("EditText")) {
            break label212;
          }
          i = j;
          continue;
          if (!paramString.equals("Spinner")) {
            break label212;
          }
          i = 1;
          continue;
          if (!paramString.equals("CheckBox")) {
            break label212;
          }
          i = 2;
          continue;
          if (!paramString.equals("RadioButton")) {
            break label212;
          }
          i = 3;
          continue;
          if (!paramString.equals("CheckedTextView")) {
            break label212;
          }
          i = 4;
          continue;
          if (!paramString.equals("AutoCompleteTextView")) {
            break label212;
          }
          i = 5;
          continue;
          if (!paramString.equals("MultiAutoCompleteTextView")) {
            break label212;
          }
          i = 6;
          continue;
          if (!paramString.equals("RatingBar")) {
            break label212;
          }
          i = 7;
          continue;
          if (!paramString.equals("Button")) {
            break label212;
          }
          i = 8;
          continue;
          if (!paramString.equals("TextView")) {
            break label212;
          }
          i = 9;
        }
      }
      paramView = new wo(paramView, paramAttributeSet);
      break;
      paramView = new ws(paramView, paramAttributeSet);
      break;
      paramView = new wm(paramView, paramAttributeSet);
      break;
      paramView = new wq(paramView, paramAttributeSet);
      break;
      paramView = new wn(paramView, paramAttributeSet);
      break;
      paramView = new wk(paramView, paramAttributeSet);
      break;
      paramView = new wp(paramView, paramAttributeSet);
      break;
      paramView = new wr(paramView, paramAttributeSet);
      break;
      paramView = new wl(paramView, paramAttributeSet);
      break;
      paramView = new wt(paramView, paramAttributeSet);
      break;
      paramView = null;
      break;
    }
  }
  
  nw a(Menu paramMenu)
  {
    nw[] arrayOfnw = this.E;
    int i;
    int j;
    label16:
    nw localnw;
    if (arrayOfnw != null)
    {
      i = arrayOfnw.length;
      j = 0;
      if (j >= i) {
        break label56;
      }
      localnw = arrayOfnw[j];
      if ((localnw == null) || (localnw.h != paramMenu)) {
        break label50;
      }
    }
    label50:
    label56:
    for (paramMenu = localnw;; paramMenu = null)
    {
      return paramMenu;
      i = 0;
      break;
      j++;
      break label16;
    }
  }
  
  public final void a(int paramInt)
  {
    l();
    ViewGroup localViewGroup = (ViewGroup)this.s.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.a).inflate(paramInt, localViewGroup);
    this.c.onContentChanged();
  }
  
  void a(int paramInt, nw paramnw, Menu paramMenu)
  {
    Object localObject2 = paramnw;
    Object localObject1 = paramMenu;
    if (paramMenu == null)
    {
      nw localnw = paramnw;
      if (paramnw == null)
      {
        localnw = paramnw;
        if (paramInt >= 0)
        {
          localnw = paramnw;
          if (paramInt < this.E.length) {
            localnw = this.E[paramInt];
          }
        }
      }
      localObject2 = localnw;
      localObject1 = paramMenu;
      if (localnw != null)
      {
        localObject1 = localnw.h;
        localObject2 = localnw;
      }
    }
    if ((localObject2 != null) && (!((nw)localObject2).m)) {}
    for (;;)
    {
      return;
      paramnw = this.b.getCallback();
      if (paramnw != null) {
        paramnw.onPanelClosed(paramInt, (Menu)localObject1);
      }
    }
  }
  
  public final void a(Configuration paramConfiguration)
  {
    if ((this.g) && (this.x))
    {
      mj localmj = a();
      if (localmj != null) {
        localmj.a(paramConfiguration);
      }
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.y = ((ViewGroup)this.b.getDecorView());
    if (((this.c instanceof Activity)) && (at.b((Activity)this.c) != null))
    {
      paramBundle = this.f;
      if (paramBundle != null) {
        break label57;
      }
      this.H = true;
    }
    for (;;)
    {
      return;
      label57:
      paramBundle.c(true);
    }
  }
  
  public final void a(Toolbar paramToolbar)
  {
    if (!(this.c instanceof Activity)) {}
    for (;;)
    {
      return;
      if ((a() instanceof pb)) {
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
      }
      paramToolbar = new ou(paramToolbar, ((Activity)this.a).getTitle(), this.d);
      this.f = paramToolbar;
      this.b.setCallback(paramToolbar.c);
      paramToolbar.f();
    }
  }
  
  public final void a(View paramView)
  {
    l();
    ViewGroup localViewGroup = (ViewGroup)this.s.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.c.onContentChanged();
  }
  
  public final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    l();
    ViewGroup localViewGroup = (ViewGroup)this.s.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  void a(nw paramnw, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramnw.a == 0) && (this.n != null) && (this.n.c())) {
      b(paramnw.h);
    }
    for (;;)
    {
      return;
      boolean bool = paramnw.m;
      WindowManager localWindowManager = (WindowManager)this.a.getSystemService("window");
      if ((localWindowManager != null) && (bool) && (paramnw.e != null)) {
        localWindowManager.removeView(paramnw.e);
      }
      paramnw.k = false;
      paramnw.l = false;
      paramnw.m = false;
      if ((bool) && (paramBoolean)) {
        a(paramnw.a, paramnw, null);
      }
      paramnw.f = null;
      paramnw.o = true;
      if (this.F == paramnw) {
        this.F = null;
      }
    }
  }
  
  public final void a(qa paramqa)
  {
    Window.Callback localCallback;
    if ((this.n != null) && (this.n.b()) && ((!hf.b(ViewConfiguration.get(this.a))) || (this.n.d())))
    {
      localCallback = this.b.getCallback();
      if (!this.n.c()) {
        if ((localCallback != null) && (!this.m))
        {
          if ((this.t) && ((this.u & 0x1) != 0))
          {
            this.y.removeCallbacks(this.G);
            this.G.run();
          }
          paramqa = e(0);
          if ((paramqa.h != null) && (!paramqa.p) && (localCallback.onPreparePanel(0, paramqa.g, paramqa.h)))
          {
            localCallback.onMenuOpened(8, paramqa.h);
            this.n.e();
          }
        }
      }
    }
    for (;;)
    {
      return;
      this.n.f();
      if (!this.m)
      {
        localCallback.onPanelClosed(8, e(0).h);
        continue;
        paramqa = e(0);
        paramqa.o = true;
        a(paramqa, false);
        a(paramqa, null);
      }
    }
  }
  
  final boolean a(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = true;
    Object localObject = a();
    boolean bool1;
    if ((localObject != null) && (((mj)localObject).a(paramInt, paramKeyEvent))) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      if ((this.F != null) && (a(this.F, paramKeyEvent.getKeyCode(), paramKeyEvent, 1)))
      {
        bool1 = bool2;
        if (this.F != null)
        {
          this.F.l = true;
          bool1 = bool2;
        }
      }
      else if (this.F == null)
      {
        localObject = e(0);
        b((nw)localObject, paramKeyEvent);
        boolean bool3 = a((nw)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent, 1);
        ((nw)localObject).k = false;
        bool1 = bool2;
        if (bool3) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  final boolean a(KeyEvent paramKeyEvent)
  {
    boolean bool2 = true;
    int j = paramKeyEvent.getKeyCode();
    int i;
    if (paramKeyEvent.getAction() == 0)
    {
      i = 1;
      if (i == 0) {
        break label120;
      }
      switch (j)
      {
      default: 
        label44:
        if (Build.VERSION.SDK_INT < 11) {
          bool1 = a(j, paramKeyEvent);
        }
        break;
      }
    }
    for (;;)
    {
      return bool1;
      i = 0;
      break;
      if (paramKeyEvent.getRepeatCount() == 0)
      {
        localnw = e(0);
        if (localnw.m) {}
      }
      for (bool1 = b(localnw, paramKeyEvent);; bool1 = false)
      {
        if (!bool1) {
          break label112;
        }
        bool1 = true;
        break;
      }
      label112:
      break label44;
      bool1 = false;
      continue;
      switch (j)
      {
      default: 
      case 82: 
        label120:
        label148:
        do
        {
          bool1 = false;
          break;
          if (this.o == null) {
            break label176;
          }
          bool1 = false;
        } while (!bool1);
        bool1 = bool2;
      }
    }
    label176:
    nw localnw = e(0);
    if ((this.n != null) && (this.n.b()) && (!hf.b(ViewConfiguration.get(this.a)))) {
      if (!this.n.c())
      {
        if ((this.m) || (!b(localnw, paramKeyEvent))) {
          break label467;
        }
        bool1 = this.n.e();
      }
    }
    for (;;)
    {
      label253:
      if (bool1)
      {
        paramKeyEvent = (AudioManager)this.a.getSystemService("audio");
        if (paramKeyEvent == null) {
          break label371;
        }
        paramKeyEvent.playSoundEffect(0);
      }
      label281:
      break;
      bool1 = this.n.f();
      continue;
      if ((!localnw.m) && (!localnw.l)) {
        break label327;
      }
      bool1 = localnw.m;
      a(localnw, true);
    }
    label327:
    if (localnw.k)
    {
      if (!localnw.p) {
        break label473;
      }
      localnw.k = false;
    }
    label371:
    label465:
    label467:
    label473:
    for (boolean bool1 = b(localnw, paramKeyEvent);; bool1 = true)
    {
      if (bool1)
      {
        a(localnw, paramKeyEvent);
        bool1 = true;
        break label253;
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
        break label281;
        paramKeyEvent = e(0);
        if ((paramKeyEvent != null) && (paramKeyEvent.m))
        {
          a(paramKeyEvent, true);
          bool1 = bool2;
          break;
        }
        if (this.o != null)
        {
          this.o.c();
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            break label465;
          }
          bool1 = bool2;
          break;
          paramKeyEvent = a();
          if ((paramKeyEvent != null) && (paramKeyEvent.g())) {
            i = 1;
          } else {
            i = 0;
          }
        }
        break label148;
      }
      bool1 = false;
      break label253;
    }
  }
  
  public final boolean a(qa paramqa, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = this.b.getCallback();
    if ((localCallback != null) && (!this.m))
    {
      paramqa = a(paramqa.k());
      if (paramqa == null) {}
    }
    for (boolean bool = localCallback.onMenuItemSelected(paramqa.a, paramMenuItem);; bool = false) {
      return bool;
    }
  }
  
  View b(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((this.c instanceof LayoutInflater.Factory))
    {
      paramView = ((LayoutInflater.Factory)this.c).onCreateView(paramString, paramContext, paramAttributeSet);
      if (paramView == null) {}
    }
    for (;;)
    {
      return paramView;
      paramView = null;
    }
  }
  
  public final void b(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    l();
    ((ViewGroup)this.s.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.c.onContentChanged();
  }
  
  final void b(CharSequence paramCharSequence)
  {
    if (this.n != null) {
      this.n.a(paramCharSequence);
    }
    for (;;)
    {
      return;
      if (this.f != null) {
        this.f.c(paramCharSequence);
      } else if (this.z != null) {
        this.z.setText(paramCharSequence);
      }
    }
  }
  
  void b(qa paramqa)
  {
    if (this.D) {}
    for (;;)
    {
      return;
      this.D = true;
      this.n.h();
      Window.Callback localCallback = this.b.getCallback();
      if ((localCallback != null) && (!this.m)) {
        localCallback.onPanelClosed(8, paramqa);
      }
      this.D = false;
    }
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool = true;
    switch (paramInt)
    {
    case 3: 
    case 4: 
    case 6: 
    case 7: 
    default: 
      bool = this.b.requestFeature(paramInt);
    }
    for (;;)
    {
      return bool;
      m();
      this.g = true;
      continue;
      m();
      this.h = true;
      continue;
      m();
      this.i = true;
      continue;
      m();
      this.B = true;
      continue;
      m();
      this.C = true;
      continue;
      m();
      this.k = true;
    }
  }
  
  public final void c()
  {
    l();
  }
  
  final boolean c(int paramInt)
  {
    boolean bool2 = false;
    Object localObject;
    boolean bool1;
    if (paramInt == 8)
    {
      localObject = a();
      if (localObject != null) {
        ((mj)localObject).e(false);
      }
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = bool2;
      if (paramInt == 0)
      {
        localObject = e(paramInt);
        bool1 = bool2;
        if (((nw)localObject).m)
        {
          a((nw)localObject, false);
          bool1 = bool2;
        }
      }
    }
  }
  
  public final void d()
  {
    mj localmj = a();
    if (localmj != null) {
      localmj.d(false);
    }
  }
  
  final boolean d(int paramInt)
  {
    boolean bool2 = true;
    if (paramInt == 8)
    {
      mj localmj = a();
      bool1 = bool2;
      if (localmj != null) {
        localmj.e(true);
      }
    }
    for (boolean bool1 = bool2;; bool1 = false) {
      return bool1;
    }
  }
  
  nw e(int paramInt)
  {
    Object localObject2 = this.E;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > paramInt) {}
    }
    else
    {
      localObject1 = new nw[paramInt + 1];
      if (localObject2 != null) {
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
      }
      this.E = ((nw[])localObject1);
    }
    localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new nw(paramInt);
      localObject1[paramInt] = localObject2;
    }
    for (Object localObject1 = localObject2;; localObject1 = localObject2) {
      return (nw)localObject1;
    }
  }
  
  public final void e()
  {
    mj localmj = a();
    if (localmj != null) {
      localmj.d(true);
    }
  }
  
  public final void f()
  {
    mj localmj = a();
    if ((localmj != null) && (localmj.f())) {}
    for (;;)
    {
      return;
      f(0);
    }
  }
  
  public final void i()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.a);
    if (localLayoutInflater.getFactory() == null) {
      fm.a(localLayoutInflater, this);
    }
  }
  
  public final mj j()
  {
    l();
    pb localpb = null;
    if ((this.c instanceof Activity)) {
      localpb = new pb((Activity)this.c, this.h);
    }
    for (;;)
    {
      if (localpb != null) {
        localpb.c(this.H);
      }
      return localpb;
      if ((this.c instanceof Dialog)) {
        localpb = new pb((Dialog)this.c);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */