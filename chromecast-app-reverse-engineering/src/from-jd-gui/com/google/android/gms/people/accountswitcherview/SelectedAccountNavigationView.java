package com.google.android.gms.people.accountswitcherview;

import a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b;
import com.google.android.gms.common.api.GoogleApiClient;
import cqj;
import cqm;
import cqn;
import cqx;
import cqz;
import cra;
import crb;
import crc;
import crd;
import cre;
import crf;
import crg;
import crh;
import csq;
import gt;
import java.util.ArrayList;

public class SelectedAccountNavigationView
  extends FrameLayout
{
  private float A;
  private int B;
  private int C;
  private int D;
  private int E;
  private boolean F;
  private int G;
  private csq H;
  private Interpolator I;
  private int J;
  private csq K;
  crf a;
  int b = 0;
  public GoogleApiClient c;
  public cqm d;
  public cqj e;
  public ArrayList f = new ArrayList(2);
  crd g;
  crg h;
  boolean i = AccountSwitcherView.c();
  boolean j;
  int k;
  public AnimatorSet l;
  public csq m;
  public csq n;
  private crh o;
  private csq p;
  private int q = -1;
  private float r;
  private float s;
  private int t;
  private VelocityTracker u;
  private int v;
  private boolean w;
  private int x;
  private float y;
  private float z;
  
  public SelectedAccountNavigationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.t = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.u = VelocityTracker.obtain();
    this.v = ViewConfiguration.getMinimumFlingVelocity();
    paramAttributeSet = paramContext.getResources();
    this.y = paramAttributeSet.getDimensionPixelSize(a.hN);
    this.z = paramAttributeSet.getDimensionPixelSize(a.hM);
    int i1;
    if (Build.VERSION.SDK_INT >= 17)
    {
      if (getResources().getConfiguration().getLayoutDirection() == 1) {
        this.F = bool;
      }
    }
    else
    {
      if (!AccountSwitcherView.c()) {
        break label175;
      }
      i1 = 17563661;
      label129:
      if (i1 == -1) {
        break label180;
      }
    }
    label175:
    label180:
    for (paramContext = AnimationUtils.loadInterpolator(paramContext, 17563661);; paramContext = new DecelerateInterpolator())
    {
      this.I = paramContext;
      this.k = paramAttributeSet.getDimensionPixelSize(a.hO);
      this.J = paramAttributeSet.getDimensionPixelSize(a.hL);
      return;
      bool = false;
      break;
      i1 = -1;
      break label129;
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i1) == this.x) {
      if (i1 != 0) {
        break label33;
      }
    }
    label33:
    for (i1 = 1;; i1 = 0)
    {
      this.x = paramMotionEvent.getPointerId(i1);
      return;
    }
  }
  
  private static void a(View paramView)
  {
    if (paramView != null)
    {
      gt.a(paramView, 0.0F);
      gt.b(paramView, 0.0F);
      gt.d(paramView, 1.0F);
      gt.e(paramView, 1.0F);
      paramView.setAlpha(1.0F);
    }
  }
  
  private void a(ImageView paramImageView, csq paramcsq)
  {
    if ((paramImageView != null) && (this.e != null))
    {
      Context localContext = paramImageView.getContext();
      paramcsq.a();
      paramcsq.d();
      paramImageView.setImageBitmap(cqj.a(localContext));
      if (TextUtils.isEmpty(paramcsq.c())) {
        break label112;
      }
      this.e.a(paramImageView);
      this.e.a(paramImageView, paramcsq.a(), paramcsq.d(), 2);
    }
    for (;;)
    {
      paramImageView.setVisibility(0);
      paramImageView.setContentDescription(getContext().getString(b.eB, new Object[] { paramcsq.a() }));
      return;
      label112:
      this.e.a(paramImageView);
    }
  }
  
  private static void a(TextView paramTextView1, TextView paramTextView2, csq paramcsq)
  {
    int i1;
    if (paramTextView1 != null) {
      if (TextUtils.isEmpty(paramcsq.b()))
      {
        paramTextView1.setText(paramcsq.a());
        i1 = 0;
      }
    }
    for (;;)
    {
      if (paramTextView2 != null)
      {
        if (i1 == 0) {
          break label67;
        }
        paramTextView2.setVisibility(0);
        paramTextView2.setText(paramcsq.a());
      }
      for (;;)
      {
        return;
        i1 = 1;
        paramTextView1.setText(paramcsq.b());
        break;
        label67:
        paramTextView2.setVisibility(8);
      }
      i1 = 0;
    }
  }
  
  private void a(crg paramcrg, ImageView paramImageView, csq paramcsq)
  {
    if (paramImageView == null) {}
    for (;;)
    {
      return;
      if (!TextUtils.isEmpty(paramcsq.e()))
      {
        this.d.a(paramImageView);
        cqm localcqm = this.d;
        localcqm.a(new cqn(localcqm, paramImageView, paramcsq.a(), paramcsq.d(), paramcrg.j.getMeasuredWidth()));
      }
      else
      {
        this.d.a(paramImageView);
        paramImageView.setImageBitmap(cqm.a(getContext()));
      }
    }
  }
  
  private void a(csq paramcsq, AnimatorSet.Builder paramBuilder, int paramInt1, int paramInt2)
  {
    a(this.h.o, this.h.p, paramcsq);
    this.h.n.setVisibility(0);
    ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this.h.n, "alpha", new float[] { 1.0F });
    localObjectAnimator.setStartDelay(paramInt1);
    localObjectAnimator.setDuration(150L);
    paramcsq = ObjectAnimator.ofFloat(this.h.c, "alpha", new float[] { 0.0F });
    paramcsq.setStartDelay(0L);
    paramcsq.setDuration(150L);
    paramBuilder.with(localObjectAnimator).with(paramcsq);
  }
  
  private void c()
  {
    if (this.h == null) {
      a();
    }
    if (this.i)
    {
      a(this.h.e);
      a(this.h.h);
      a(this.h.i);
      a(this.h.c);
      a(this.h.j);
      a(this.h.r);
      a(this.h.q);
    }
    crg localcrg = this.h;
    csq localcsq = this.p;
    if (localcrg.b != null) {
      localcrg.b.setContentDescription(getContext().getResources().getString(b.eD, new Object[] { this.p.a() }));
    }
    if (localcrg.k != null)
    {
      ImageView localImageView = localcrg.k;
      Context localContext = getContext();
      localcsq.a();
      localcsq.d();
      localImageView.setImageBitmap(cqj.a(localContext));
      if (TextUtils.isEmpty(localcsq.c())) {
        break label447;
      }
      this.e.a(localcrg.k);
      this.e.a(localcrg.k, localcsq.a(), localcsq.d(), 2);
    }
    for (;;)
    {
      a(localcrg.f, localcrg.g, localcsq);
      a(localcrg, localcrg.j, localcsq);
      b();
      if (this.i)
      {
        if (this.h.q != null) {
          this.h.q.setVisibility(8);
        }
        if (this.h.r != null) {
          this.h.r.setVisibility(8);
        }
        if (this.h.n != null) {
          this.h.n.setVisibility(8);
        }
        if (this.h.s != null)
        {
          this.h.s.setAlpha(0.0F);
          this.h.s.setScaleX(0.8F);
          this.h.s.setScaleY(0.8F);
          this.h.s.setVisibility(8);
        }
        if (this.h.t != null)
        {
          this.h.t.setAlpha(0.0F);
          this.h.t.setScaleX(0.8F);
          this.h.t.setScaleY(0.8F);
          this.h.t.setVisibility(8);
        }
      }
      return;
      label447:
      this.e.a(localcrg.k);
    }
  }
  
  private void d()
  {
    boolean bool = true;
    int i1;
    ExpanderView localExpanderView;
    if (this.b == 1)
    {
      i1 = 0;
      a(i1);
      if (this.a != null) {
        this.a.a();
      }
      localExpanderView = this.h.d;
      if (this.b != 1) {
        break label60;
      }
    }
    for (;;)
    {
      localExpanderView.a(bool);
      return;
      i1 = 1;
      break;
      label60:
      bool = false;
    }
  }
  
  void a()
  {
    Context localContext = getContext();
    int i1;
    if (this.q == -1)
    {
      if (!this.j) {
        break label147;
      }
      i1 = a.it;
    }
    for (;;)
    {
      this.q = i1;
      if (this.o == null) {
        this.o = new cre(this);
      }
      LayoutInflater.from(localContext).inflate(this.q, this);
      this.h = this.o.a(this);
      if (this.i)
      {
        this.h.h.setOnClickListener(new cra(this));
        this.h.i.setOnClickListener(new crb(this));
      }
      if (this.h.d != null) {
        this.h.d.setOnClickListener(new crc(this));
      }
      return;
      label147:
      if (AccountSwitcherView.c()) {
        i1 = a.it;
      } else {
        i1 = a.iu;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    boolean bool = true;
    if (this.b != paramInt)
    {
      this.b = paramInt;
      if (this.h == null) {
        a();
      }
      if (this.b != 1) {
        break label46;
      }
    }
    for (;;)
    {
      this.h.d.a(bool);
      return;
      label46:
      bool = false;
    }
  }
  
  void a(View paramView, int paramInt)
  {
    if (paramView != null)
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
      localMarginLayoutParams.topMargin = (this.J + paramInt);
      paramView.setLayoutParams(localMarginLayoutParams);
    }
  }
  
  public final void a(csq paramcsq)
  {
    if (this.h == null) {
      a();
    }
    if (paramcsq == null) {
      this.p = null;
    }
    for (;;)
    {
      return;
      if ((this.l != null) && (this.l.isRunning()))
      {
        this.K = paramcsq;
      }
      else
      {
        if ((this.h.j == null) || (this.h.j.getMeasuredWidth() != 0)) {
          break;
        }
        this.H = paramcsq;
        forceLayout();
      }
    }
    csq localcsq;
    int i1;
    if ((this.p == null) || (!this.p.a().equals(paramcsq.a())))
    {
      localcsq = this.p;
      this.p = paramcsq;
      paramcsq = this.p.a();
      i1 = 0;
      if (i1 >= this.f.size()) {
        break label247;
      }
      if (!((csq)this.f.get(i1)).a().equals(paramcsq)) {}
    }
    for (;;)
    {
      if (i1 >= 0) {
        this.f.remove(i1);
      }
      if (localcsq != null)
      {
        this.f.add(0, localcsq);
        for (;;)
        {
          if (this.f.size() > 2)
          {
            this.f.remove(this.f.size() - 1);
            continue;
            i1++;
            break;
          }
        }
      }
      c();
      break;
      this.p = paramcsq;
      c();
      break;
      label247:
      i1 = -1;
    }
  }
  
  public void b()
  {
    if (!this.i) {}
    for (;;)
    {
      return;
      if (this.h == null) {
        a();
      }
      if ((this.h.j == null) || (this.h.j.getMeasuredWidth() != 0)) {
        break;
      }
      forceLayout();
    }
    if (this.f.size() > 0)
    {
      csq localcsq = (csq)this.f.get(0);
      crg localcrg = this.h;
      this.h.h.setVisibility(0);
      a(this.h.l, localcsq);
      a(localcrg, localcrg.r, localcsq);
      label109:
      if (this.f.size() <= 1) {
        break label178;
      }
      this.h.i.setVisibility(0);
      a(this.h.m, (csq)this.f.get(1));
    }
    for (;;)
    {
      this.A = -1.0F;
      break;
      this.h.h.setVisibility(8);
      break label109;
      label178:
      this.h.i.setVisibility(8);
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return this.w;
      this.w = false;
      this.x = paramMotionEvent.getPointerId(0);
      this.w = false;
      continue;
      a(paramMotionEvent);
      this.x = -1;
      this.w = false;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.h == null) {
      a();
    }
    if (this.h.j != null) {
      this.h.j.measure(paramInt1, paramInt2);
    }
    if (this.h.a != null) {
      this.h.a.measure(paramInt1, paramInt2);
    }
    if (this.H != null)
    {
      a(this.H);
      this.H = null;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    int i1 = paramMotionEvent.getAction();
    Object localObject1 = getParent();
    switch (i1)
    {
    }
    for (;;)
    {
      boolean bool1 = true;
      for (;;)
      {
        return bool1;
        this.r = paramMotionEvent.getX();
        this.s = paramMotionEvent.getY();
        break;
        i1 = paramMotionEvent.findPointerIndex(this.x);
        if (i1 < 0)
        {
          Log.e("SelectedAccountNavigationView", "Got ACTION_MOVE event but have an invalid active pointer id.");
          bool1 = bool2;
        }
        else
        {
          float f1 = paramMotionEvent.getX(i1);
          float f3 = paramMotionEvent.getY(i1);
          float f2 = f1 - this.r;
          f3 -= this.s;
          if ((this.i) && (this.f.size() > 0) && (!this.w) && (f2 * f2 + f3 * f3 > this.t * this.t) && (Math.abs(f2) > Math.abs(f3)))
          {
            this.w = true;
            if (localObject1 != null) {
              ((ViewParent)localObject1).requestDisallowInterceptTouchEvent(true);
            }
          }
          if (!this.w) {
            break;
          }
          f1 -= this.r;
          if (this.A == -1.0F)
          {
            this.A = this.h.h.getLeft();
            this.B = this.h.i.getLeft();
            this.D = (this.h.e.getLeft() + this.h.e.getPaddingLeft());
            this.E = this.h.e.getWidth();
          }
          label332:
          float f4;
          if (this.F)
          {
            f1 = Math.min(f1, 0.0F);
            f4 = this.z / this.y;
            float f5 = this.z;
            f3 = this.y;
            if (this.f.size() <= 1) {
              break label936;
            }
            f2 = this.B;
            label372:
            float f6 = f2 - this.D + (this.z - this.y) * 0.5F;
            f2 = Math.min(1.0F, f1 / f6);
            f1 = Math.abs((f5 - f3) * 0.5F);
            f3 = Math.max(0.0F, 1.0F - f2);
            this.h.e.setTranslationX(f6 * f2);
            this.h.e.setTranslationY(Math.abs(f1 * f2) * -1.0F);
            f1 = Math.min(1.0F, Math.max(f4, 1.0F - f2 * f4));
            this.h.e.setScaleX(f1);
            this.h.e.setScaleY(f1);
            if (this.h.q != null)
            {
              if (this.h.q.getVisibility() == 0) {
                break label959;
              }
              if (!this.F) {
                break label944;
              }
              i1 = getWidth() - this.D;
              label539:
              this.G = i1;
              this.h.q.setTranslationX(this.G);
              this.h.u.setImageDrawable(this.h.l.getDrawable());
              this.h.q.setVisibility(0);
            }
            label591:
            if (this.f.size() > 1)
            {
              f1 = this.A;
              f4 = this.B;
              this.h.i.setTranslationX((f1 - f4) * f2);
            }
            if (this.f.size() > 0)
            {
              if (this.h.r != null)
              {
                if (this.h.r.getVisibility() == 0) {
                  break label988;
                }
                this.h.r.setAlpha(0.0F);
                this.h.r.setVisibility(0);
              }
              label685:
              if (this.h.j != null) {
                this.h.j.setAlpha(1.0F - f2);
              }
              if (!this.F) {
                break label1002;
              }
              f1 = getLeft() - (this.h.h.getWidth() + this.A);
              label738:
              this.h.h.setTranslationX(f1 * f2);
              this.h.h.setAlpha(f3);
              if (this.h.n != null)
              {
                if (this.h.n.getVisibility() == 0) {
                  break label1016;
                }
                localObject1 = (csq)this.f.get(0);
                this.C = this.G;
                this.h.n.setTranslationX(this.C);
                a(this.h.o, this.h.p, (csq)localObject1);
                this.h.n.setAlpha(0.0F);
                this.h.n.setVisibility(0);
              }
            }
          }
          for (;;)
          {
            if (this.h.c != null)
            {
              this.h.c.setTranslationX(this.h.e.getTranslationX());
              f1 = Math.max(0.0F, 1.0F - 3.0F * f2);
              this.h.c.setAlpha(f1);
            }
            this.u.addMovement(paramMotionEvent);
            break;
            f1 = Math.max(f1, 0.0F);
            break label332;
            label936:
            f2 = this.A;
            break label372;
            label944:
            i1 = -this.E - this.D;
            break label539;
            label959:
            f1 = -this.G;
            this.h.q.setTranslationX(f1 * f2 + this.G);
            break label591;
            label988:
            this.h.r.setAlpha(f2);
            break label685;
            label1002:
            f1 = getWidth() - this.A;
            break label738;
            label1016:
            if (f2 > 0.33333334F)
            {
              f1 = Math.min(1.0F, (f2 - 0.33333334F) * 3.0F);
              this.h.n.setAlpha(f1);
            }
            this.h.n.setTranslationX(this.C + -this.C * f2);
          }
          if (this.x < 0)
          {
            Log.e("SelectedAccountNavigationView", "Got ACTION_UP event but have an invalid active pointer id.");
            bool1 = bool2;
          }
          else
          {
            label1124:
            label1165:
            int i2;
            label1232:
            label1290:
            Object localObject2;
            ObjectAnimator localObjectAnimator1;
            ObjectAnimator localObjectAnimator3;
            ObjectAnimator localObjectAnimator2;
            if (this.w) {
              if (this.f.size() > 1)
              {
                f1 = this.B;
                f3 = this.h.e.getTranslationX();
                f2 = f3;
                if (this.F) {
                  f2 = Math.abs(f3);
                }
                if (f2 < f1 * 0.5F) {
                  break label1797;
                }
                i1 = 1;
                i2 = i1;
                if (i1 == 0)
                {
                  i2 = i1;
                  if (paramMotionEvent.getX(this.x) - this.r > this.t)
                  {
                    this.u.computeCurrentVelocity(1000);
                    if (Math.abs(this.u.getXVelocity()) <= this.v) {
                      break label1803;
                    }
                    i2 = 1;
                  }
                }
                if (i2 == 0) {
                  break label1844;
                }
                paramMotionEvent = new AnimatorSet();
                f4 = this.z / this.y;
                f3 = this.z;
                f1 = this.y;
                if (this.f.size() <= 1) {
                  break label1809;
                }
                i1 = this.h.i.getLeft();
                f2 = i1 - this.h.e.getLeft();
                f2 = (this.z - this.y) * 0.5F + f2;
                localObject2 = ObjectAnimator.ofFloat(this.h.e, "translationX", new float[] { f2 });
                localObjectAnimator1 = ObjectAnimator.ofFloat(this.h.e, "translationY", new float[] { (f3 - f1) * 0.5F });
                localObjectAnimator3 = ObjectAnimator.ofFloat(this.h.e, "scaleY", new float[] { f4 });
                localObjectAnimator2 = ObjectAnimator.ofFloat(this.h.e, "scaleX", new float[] { f4 });
                localObject2 = paramMotionEvent.play((Animator)localObject2).with(localObjectAnimator1).with(localObjectAnimator2).with(localObjectAnimator3);
                if ((this.i) && (this.f.size() > 0))
                {
                  if (this.f.size() > 1)
                  {
                    f1 = this.h.h.getLeft() - this.h.i.getLeft();
                    ((AnimatorSet.Builder)localObject2).with(ObjectAnimator.ofFloat(this.h.i, "translationX", new float[] { f1 }));
                  }
                  if (!this.F) {
                    break label1824;
                  }
                  f1 = getLeft() - (this.h.h.getWidth() + this.A);
                  label1548:
                  localObjectAnimator1 = ObjectAnimator.ofFloat(this.h.h, "translationX", new float[] { f1 });
                  localObjectAnimator2 = ObjectAnimator.ofFloat(this.h.h, "alpha", new float[] { 0.0F });
                  ((AnimatorSet.Builder)localObject2).with(localObjectAnimator1).with(localObjectAnimator2);
                  if (this.h.q != null) {
                    ((AnimatorSet.Builder)localObject2).with(ObjectAnimator.ofFloat(this.h.q, "translationX", new float[] { 0.0F }));
                  }
                  if (this.h.n != null) {
                    a((csq)this.f.get(0), (AnimatorSet.Builder)localObject2, 0, 0);
                  }
                }
                paramMotionEvent.addListener(new cqz(this));
                localObject2 = this.p;
                this.p = ((csq)this.f.remove(0));
                this.f.add(localObject2);
                paramMotionEvent.setDuration(((1.0F - this.h.e.getTranslationX() / f2) * 450.0F));
                paramMotionEvent.setInterpolator(this.I);
                this.l = paramMotionEvent;
                this.l.start();
              }
            }
            for (;;)
            {
              this.w = false;
              if (localObject1 != null) {
                ((ViewParent)localObject1).requestDisallowInterceptTouchEvent(false);
              }
              this.u.clear();
              bool1 = bool2;
              break;
              f1 = this.A;
              break label1124;
              label1797:
              i1 = 0;
              break label1165;
              label1803:
              i2 = 0;
              break label1232;
              label1809:
              i1 = this.h.h.getLeft();
              break label1290;
              label1824:
              f1 = getWidth() - this.h.h.getLeft();
              break label1548;
              label1844:
              localObject2 = new AnimatorSet();
              paramMotionEvent = ((AnimatorSet)localObject2).play(ObjectAnimator.ofFloat(this.h.e, "alpha", new float[] { 1.0F }));
              ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(this.h.e, "translationX", new float[] { 0.0F });
              localObjectAnimator2 = ObjectAnimator.ofFloat(this.h.e, "translationY", new float[] { 0.0F });
              localObjectAnimator1 = ObjectAnimator.ofFloat(this.h.e, "scaleX", new float[] { 1.0F });
              localObjectAnimator3 = ObjectAnimator.ofFloat(this.h.e, "scaleY", new float[] { 1.0F });
              paramMotionEvent.with(localObjectAnimator4).with(localObjectAnimator2).with(localObjectAnimator1).with(localObjectAnimator3);
              paramMotionEvent.with(ObjectAnimator.ofFloat(this.h.q, "translationX", new float[] { this.G }));
              if (this.h.r != null) {
                paramMotionEvent.with(ObjectAnimator.ofFloat(this.h.r, "alpha", new float[] { 0.0F }));
              }
              if (this.h.j != null) {
                paramMotionEvent.with(ObjectAnimator.ofFloat(this.h.j, "alpha", new float[] { 1.0F }));
              }
              paramMotionEvent.with(ObjectAnimator.ofFloat(this.h.i, "translationX", new float[] { 0.0F }));
              localObjectAnimator4 = ObjectAnimator.ofFloat(this.h.h, "translationX", new float[] { 0.0F });
              localObjectAnimator1 = ObjectAnimator.ofFloat(this.h.n, "translationX", new float[] { -getWidth() });
              localObjectAnimator3 = ObjectAnimator.ofFloat(this.h.h, "alpha", new float[] { 1.0F });
              localObjectAnimator2 = ObjectAnimator.ofFloat(this.h.c, "translationX", new float[] { 0.0F });
              paramMotionEvent.with(localObjectAnimator4).with(localObjectAnimator3);
              localObjectAnimator3 = ObjectAnimator.ofFloat(this.h.n, "alpha", new float[] { 0.0F });
              localObjectAnimator4 = ObjectAnimator.ofFloat(this.h.c, "alpha", new float[] { 1.0F });
              paramMotionEvent.with(localObjectAnimator1).with(localObjectAnimator3).with(localObjectAnimator2).with(localObjectAnimator4);
              ((AnimatorSet)localObject2).setDuration(100L);
              ((AnimatorSet)localObject2).addListener(new cqx(this));
              ((AnimatorSet)localObject2).setInterpolator(this.I);
              this.l = ((AnimatorSet)localObject2);
              this.l.start();
              continue;
              d();
            }
            bool1 = bool2;
            if (localObject1 != null)
            {
              ((ViewParent)localObject1).requestDisallowInterceptTouchEvent(false);
              bool1 = bool2;
            }
          }
        }
      }
      this.x = paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex());
      continue;
      a(paramMotionEvent);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\people\accountswitcherview\SelectedAccountNavigationView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */