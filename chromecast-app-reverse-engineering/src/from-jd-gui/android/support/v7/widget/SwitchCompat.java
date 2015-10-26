package android.support.v7.widget;

import a;
import aan;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.widget.CompoundButton;
import bo;
import gd;
import gt;
import java.util.List;
import oq;
import pg;
import sf;
import th;
import tm;

public class SwitchCompat
  extends CompoundButton
{
  private static final int[] E = { 16842912 };
  private Layout A;
  private TransformationMethod B;
  private Animation C;
  private final Rect D = new Rect();
  private Drawable a;
  private Drawable b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private CharSequence g;
  private CharSequence h;
  private boolean i;
  private int j;
  private int k;
  private float l;
  private float m;
  private VelocityTracker n = VelocityTracker.obtain();
  private int o;
  private float p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private TextPaint x = new TextPaint(1);
  private ColorStateList y;
  private Layout z;
  
  public SwitchCompat(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.Q);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = getResources();
    this.x.density = ((Resources)localObject).getDisplayMetrics().density;
    th localth = th.a(paramContext, paramAttributeSet, oq.bw, paramInt, 0);
    this.a = localth.a(oq.bz);
    if (this.a != null) {
      this.a.setCallback(this);
    }
    this.b = localth.a(oq.bG);
    if (this.b != null) {
      this.b.setCallback(this);
    }
    this.g = localth.c(oq.by);
    this.h = localth.c(oq.bx);
    this.i = localth.a(oq.bA, true);
    this.c = localth.c(oq.bF, 0);
    this.d = localth.c(oq.bC, 0);
    this.e = localth.c(oq.bD, 0);
    this.f = localth.a(oq.bB, false);
    paramInt = localth.e(oq.bE, 0);
    int i1;
    label346:
    label361:
    label375:
    boolean bool;
    label396:
    float f1;
    if (paramInt != 0)
    {
      localObject = paramContext.obtainStyledAttributes(paramInt, oq.bH);
      paramAttributeSet = ((TypedArray)localObject).getColorStateList(oq.bI);
      if (paramAttributeSet == null) {
        break label503;
      }
      this.y = paramAttributeSet;
      paramInt = ((TypedArray)localObject).getDimensionPixelSize(oq.bJ, 0);
      if ((paramInt != 0) && (paramInt != this.x.getTextSize()))
      {
        this.x.setTextSize(paramInt);
        requestLayout();
      }
      paramInt = ((TypedArray)localObject).getInt(oq.bL, -1);
      i1 = ((TypedArray)localObject).getInt(oq.bK, -1);
      switch (paramInt)
      {
      default: 
        paramAttributeSet = null;
        if (i1 > 0) {
          if (paramAttributeSet == null)
          {
            paramAttributeSet = Typeface.defaultFromStyle(i1);
            a(paramAttributeSet);
            if (paramAttributeSet == null) {
              break label545;
            }
            paramInt = paramAttributeSet.getStyle();
            paramInt = i1 & (paramInt ^ 0xFFFFFFFF);
            paramAttributeSet = this.x;
            if ((paramInt & 0x1) == 0) {
              break label550;
            }
            bool = true;
            paramAttributeSet.setFakeBoldText(bool);
            paramAttributeSet = this.x;
            if ((paramInt & 0x2) == 0) {
              break label556;
            }
            f1 = -0.25F;
            label417:
            paramAttributeSet.setTextSkewX(f1);
            label423:
            if (!((TypedArray)localObject).getBoolean(oq.bM, false)) {
              break label586;
            }
          }
        }
        break;
      }
    }
    label503:
    label545:
    label550:
    label556:
    label586:
    for (this.B = new pg(getContext());; this.B = null)
    {
      ((TypedArray)localObject).recycle();
      localth.a();
      localth.a.recycle();
      paramContext = ViewConfiguration.get(paramContext);
      this.k = paramContext.getScaledTouchSlop();
      this.o = paramContext.getScaledMinimumFlingVelocity();
      refreshDrawableState();
      setChecked(isChecked());
      return;
      this.y = getTextColors();
      break;
      paramAttributeSet = Typeface.SANS_SERIF;
      break label346;
      paramAttributeSet = Typeface.SERIF;
      break label346;
      paramAttributeSet = Typeface.MONOSPACE;
      break label346;
      paramAttributeSet = Typeface.create(paramAttributeSet, i1);
      break label361;
      paramInt = 0;
      break label375;
      bool = false;
      break label396;
      f1 = 0.0F;
      break label417;
      this.x.setFakeBoldText(false);
      this.x.setTextSkewX(0.0F);
      a(paramAttributeSet);
      break label423;
    }
  }
  
  private Layout a(CharSequence paramCharSequence)
  {
    TextPaint localTextPaint;
    if (this.B != null)
    {
      paramCharSequence = this.B.getTransformation(paramCharSequence, this);
      localTextPaint = this.x;
      if (paramCharSequence == null) {
        break label62;
      }
    }
    label62:
    for (int i1 = (int)Math.ceil(Layout.getDesiredWidth(paramCharSequence, this.x));; i1 = 0)
    {
      return new StaticLayout(paramCharSequence, localTextPaint, i1, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
      break;
    }
  }
  
  private void a(float paramFloat)
  {
    this.p = paramFloat;
    invalidate();
  }
  
  private void a(Typeface paramTypeface)
  {
    if (this.x.getTypeface() != paramTypeface)
    {
      this.x.setTypeface(paramTypeface);
      requestLayout();
      invalidate();
    }
  }
  
  private boolean a()
  {
    if (this.p > 0.5F) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private int b()
  {
    if (tm.a(this)) {}
    for (float f1 = 1.0F - this.p;; f1 = this.p) {
      return (int)(f1 * c() + 0.5F);
    }
  }
  
  private int c()
  {
    Rect localRect2;
    Rect localRect1;
    if (this.b != null)
    {
      localRect2 = this.D;
      this.b.getPadding(localRect2);
      if (this.a != null) {
        localRect1 = sf.a(this.a);
      }
    }
    for (int i1 = this.q - this.s - localRect2.left - localRect2.right - localRect1.left - localRect1.right;; i1 = 0)
    {
      return i1;
      localRect1 = sf.a;
      break;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = this.D;
    int i3 = this.t;
    int i5 = this.u;
    int i7 = this.v;
    int i6 = this.w;
    int i8 = i3 + b();
    Object localObject;
    int i9;
    label140:
    int i4;
    int i2;
    if (this.a != null)
    {
      localObject = sf.a(this.a);
      if (this.b == null) {
        break label341;
      }
      this.b.getPadding(localRect);
      i9 = localRect.left;
      if ((localObject == null) || (((Rect)localObject).isEmpty())) {
        break label318;
      }
      i1 = i3;
      if (((Rect)localObject).left > localRect.left) {
        i1 = i3 + (((Rect)localObject).left - localRect.left);
      }
      if (((Rect)localObject).top <= localRect.top) {
        break label311;
      }
      i3 = ((Rect)localObject).top - localRect.top + i5;
      i4 = i7;
      if (((Rect)localObject).right > localRect.right) {
        i4 = i7 - (((Rect)localObject).right - localRect.right);
      }
      if (((Rect)localObject).bottom <= localRect.bottom) {
        break label304;
      }
      i2 = i6 - (((Rect)localObject).bottom - localRect.bottom);
      label194:
      this.b.setBounds(i1, i3, i4, i2);
    }
    label304:
    label311:
    label318:
    label341:
    for (int i1 = i9 + i8;; i1 = i8)
    {
      if (this.a != null)
      {
        this.a.getPadding(localRect);
        i2 = i1 - localRect.left;
        i1 = i1 + this.s + localRect.right;
        this.a.setBounds(i2, i5, i1, i6);
        localObject = getBackground();
        if (localObject != null) {
          bo.a((Drawable)localObject, i2, i5, i1, i6);
        }
      }
      super.draw(paramCanvas);
      return;
      localObject = sf.a;
      break;
      i2 = i6;
      break label194;
      i3 = i5;
      break label140;
      i2 = i6;
      i4 = i5;
      i1 = i3;
      i3 = i4;
      i4 = i7;
      break label194;
    }
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      super.drawableHotspotChanged(paramFloat1, paramFloat2);
    }
    if (this.a != null) {
      bo.a(this.a, paramFloat1, paramFloat2);
    }
    if (this.b != null) {
      bo.a(this.b, paramFloat1, paramFloat2);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    if (this.a != null) {
      this.a.setState(arrayOfInt);
    }
    if (this.b != null) {
      this.b.setState(arrayOfInt);
    }
    invalidate();
  }
  
  public int getCompoundPaddingLeft()
  {
    int i1;
    if (!tm.a(this)) {
      i1 = super.getCompoundPaddingLeft();
    }
    for (;;)
    {
      return i1;
      int i2 = super.getCompoundPaddingLeft() + this.q;
      i1 = i2;
      if (!TextUtils.isEmpty(getText())) {
        i1 = i2 + this.e;
      }
    }
  }
  
  public int getCompoundPaddingRight()
  {
    int i1;
    if (tm.a(this)) {
      i1 = super.getCompoundPaddingRight();
    }
    for (;;)
    {
      return i1;
      int i2 = super.getCompoundPaddingRight() + this.q;
      i1 = i2;
      if (!TextUtils.isEmpty(getText())) {
        i1 = i2 + this.e;
      }
    }
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.a != null) {
        this.a.jumpToCurrentState();
      }
      if (this.b != null) {
        this.b.jumpToCurrentState();
      }
      if ((this.C != null) && (!this.C.hasEnded()))
      {
        clearAnimation();
        this.C = null;
      }
    }
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if (isChecked()) {
      mergeDrawableStates(arrayOfInt, E);
    }
    return arrayOfInt;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Rect localRect = this.D;
    Object localObject1 = this.b;
    int i3;
    int i6;
    int i5;
    int i4;
    Object localObject2;
    label144:
    int i2;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).getPadding(localRect);
      i3 = this.u;
      i6 = this.w;
      i5 = localRect.top;
      i4 = localRect.bottom;
      localObject2 = this.a;
      Object localObject3;
      if (localObject1 != null)
      {
        if ((!this.f) || (localObject2 == null)) {
          break label311;
        }
        localObject3 = sf.a((Drawable)localObject2);
        ((Drawable)localObject2).copyBounds(localRect);
        localRect.left += ((Rect)localObject3).left;
        localRect.right -= ((Rect)localObject3).right;
        i1 = paramCanvas.save();
        paramCanvas.clipRect(localRect, Region.Op.DIFFERENCE);
        ((Drawable)localObject1).draw(paramCanvas);
        paramCanvas.restoreToCount(i1);
      }
      i2 = paramCanvas.save();
      if (localObject2 != null) {
        ((Drawable)localObject2).draw(paramCanvas);
      }
      if (!a()) {
        break label319;
      }
      localObject1 = this.z;
      label171:
      if (localObject1 != null)
      {
        localObject3 = getDrawableState();
        if (this.y != null) {
          this.x.setColor(this.y.getColorForState((int[])localObject3, 0));
        }
        this.x.drawableState = ((int[])localObject3);
        if (localObject2 == null) {
          break label327;
        }
        localObject2 = ((Drawable)localObject2).getBounds();
        i1 = ((Rect)localObject2).left;
      }
    }
    label311:
    label319:
    label327:
    for (int i1 = ((Rect)localObject2).right + i1;; i1 = getWidth())
    {
      i1 /= 2;
      int i7 = ((Layout)localObject1).getWidth() / 2;
      i3 = (i3 + i5 + (i6 - i4)) / 2;
      i4 = ((Layout)localObject1).getHeight() / 2;
      paramCanvas.translate(i1 - i7, i3 - i4);
      ((Layout)localObject1).draw(paramCanvas);
      paramCanvas.restoreToCount(i2);
      return;
      localRect.setEmpty();
      break;
      ((Drawable)localObject1).draw(paramCanvas);
      break label144;
      localObject1 = this.A;
      break label171;
    }
  }
  
  @TargetApi(14)
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    CharSequence localCharSequence1;
    CharSequence localCharSequence2;
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName("android.widget.Switch");
      if (!isChecked()) {
        break label59;
      }
      localCharSequence1 = this.g;
      if (!TextUtils.isEmpty(localCharSequence1))
      {
        localCharSequence2 = paramAccessibilityNodeInfo.getText();
        if (!TextUtils.isEmpty(localCharSequence2)) {
          break label67;
        }
        paramAccessibilityNodeInfo.setText(localCharSequence1);
      }
    }
    for (;;)
    {
      return;
      label59:
      localCharSequence1 = this.h;
      break;
      label67:
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(localCharSequence2).append(' ').append(localCharSequence1);
      paramAccessibilityNodeInfo.setText(localStringBuilder);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Rect localRect1;
    Rect localRect2;
    if (this.a != null)
    {
      localRect1 = this.D;
      if (this.b != null)
      {
        this.b.getPadding(localRect1);
        localRect2 = sf.a(this.a);
        paramInt2 = Math.max(0, localRect2.left - localRect1.left);
      }
    }
    for (paramInt1 = Math.max(0, localRect2.right - localRect1.right);; paramInt1 = i1)
    {
      if (tm.a(this))
      {
        paramInt4 = getPaddingLeft() + paramInt2;
        paramInt3 = this.q + paramInt4 - paramInt2 - paramInt1;
        label113:
        switch (getGravity() & 0x70)
        {
        default: 
          paramInt2 = getPaddingTop();
          paramInt1 = this.r + paramInt2;
        }
      }
      for (;;)
      {
        this.t = paramInt4;
        this.u = paramInt2;
        this.w = paramInt1;
        this.v = paramInt3;
        return;
        localRect1.setEmpty();
        break;
        paramInt3 = getWidth() - getPaddingRight() - paramInt1;
        paramInt4 = paramInt1 + (paramInt2 + (paramInt3 - this.q));
        break label113;
        paramInt2 = (getPaddingTop() + getHeight() - getPaddingBottom()) / 2 - this.r / 2;
        paramInt1 = this.r + paramInt2;
        continue;
        paramInt1 = getHeight() - getPaddingBottom();
        paramInt2 = paramInt1 - this.r;
      }
      paramInt2 = 0;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i4 = 0;
    if (this.i)
    {
      if (this.z == null) {
        this.z = a(this.g);
      }
      if (this.A == null) {
        this.A = a(this.h);
      }
    }
    Rect localRect = this.D;
    int i1;
    int i3;
    if (this.a != null)
    {
      this.a.getPadding(localRect);
      i2 = this.a.getIntrinsicWidth() - localRect.left - localRect.right;
      i1 = this.a.getIntrinsicHeight();
      if (!this.i) {
        break label300;
      }
      i3 = Math.max(this.z.getWidth(), this.A.getWidth()) + (this.c << 1);
      label130:
      this.s = Math.max(i3, i2);
      if (this.b == null) {
        break label306;
      }
      this.b.getPadding(localRect);
    }
    for (int i2 = this.b.getIntrinsicHeight();; i2 = i4)
    {
      int i6 = localRect.left;
      int i5 = localRect.right;
      i4 = i5;
      i3 = i6;
      if (this.a != null)
      {
        localRect = sf.a(this.a);
        i3 = Math.max(i6, localRect.left);
        i4 = Math.max(i5, localRect.right);
      }
      i3 = Math.max(this.d, i4 + (i3 + this.s * 2));
      i1 = Math.max(i2, i1);
      this.q = i3;
      this.r = i1;
      super.onMeasure(paramInt1, paramInt2);
      if (getMeasuredHeight() < i1) {
        setMeasuredDimension(gt.i(this), i1);
      }
      return;
      i1 = 0;
      i2 = 0;
      break;
      label300:
      i3 = 0;
      break label130;
      label306:
      localRect.setEmpty();
    }
  }
  
  @TargetApi(14)
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (isChecked()) {}
    for (CharSequence localCharSequence = this.g;; localCharSequence = this.h)
    {
      if (localCharSequence != null) {
        paramAccessibilityEvent.getText().add(localCharSequence);
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    float f3 = 1.0F;
    int i2 = 0;
    boolean bool2 = true;
    this.n.addMovement(paramMotionEvent);
    switch (gd.a(paramMotionEvent))
    {
    }
    for (;;)
    {
      float f2;
      for (boolean bool1 = super.onTouchEvent(paramMotionEvent);; bool1 = bool2)
      {
        return bool1;
        f2 = paramMotionEvent.getX();
        f1 = paramMotionEvent.getY();
        if (!isEnabled()) {
          break;
        }
        i1 = i2;
        if (this.a != null)
        {
          i1 = b();
          this.a.getPadding(this.D);
          int i3 = this.u;
          int i4 = this.k;
          int i6 = i1 + this.t - this.k;
          int i10 = this.s;
          int i7 = this.D.left;
          int i9 = this.D.right;
          int i11 = this.k;
          int i8 = this.w;
          int i5 = this.k;
          i1 = i2;
          if (f2 > i6)
          {
            i1 = i2;
            if (f2 < i10 + i6 + i7 + i9 + i11)
            {
              i1 = i2;
              if (f1 > i3 - i4)
              {
                i1 = i2;
                if (f1 < i8 + i5) {
                  i1 = 1;
                }
              }
            }
          }
        }
        if (i1 == 0) {
          break;
        }
        this.j = 1;
        this.l = f2;
        this.m = f1;
        break;
        switch (this.j)
        {
        case 0: 
        default: 
          break;
        case 1: 
          f2 = paramMotionEvent.getX();
          f1 = paramMotionEvent.getY();
          if ((Math.abs(f2 - this.l) <= this.k) && (Math.abs(f1 - this.m) <= this.k)) {
            break;
          }
          this.j = 2;
          getParent().requestDisallowInterceptTouchEvent(true);
          this.l = f2;
          this.m = f1;
        }
      }
      float f4 = paramMotionEvent.getX();
      int i1 = c();
      float f1 = f4 - this.l;
      if (i1 != 0)
      {
        f1 /= i1;
        label412:
        f2 = f1;
        if (tm.a(this)) {
          f2 = -f1;
        }
        f2 += this.p;
        if (f2 >= 0.0F) {
          break label488;
        }
        f1 = 0.0F;
      }
      for (;;)
      {
        bool1 = bool2;
        if (f1 == this.p) {
          break;
        }
        this.l = f4;
        a(f1);
        bool1 = bool2;
        break;
        if (f1 > 0.0F)
        {
          f1 = 1.0F;
          break label412;
        }
        f1 = -1.0F;
        break label412;
        label488:
        f1 = f3;
        if (f2 <= 1.0F) {
          f1 = f2;
        }
      }
      if (this.j == 2)
      {
        this.j = 0;
        label533:
        boolean bool3;
        if ((paramMotionEvent.getAction() == 1) && (isEnabled()))
        {
          i1 = 1;
          bool3 = isChecked();
          if (i1 == 0) {
            break label685;
          }
          this.n.computeCurrentVelocity(1000);
          f1 = this.n.getXVelocity();
          if (Math.abs(f1) <= this.o) {
            break label676;
          }
          if (!tm.a(this)) {
            break label658;
          }
          if (f1 >= 0.0F) {
            break label652;
          }
          bool1 = true;
        }
        for (;;)
        {
          if (bool1 != bool3)
          {
            playSoundEffect(0);
            setChecked(bool1);
          }
          MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
          localMotionEvent.setAction(3);
          super.onTouchEvent(localMotionEvent);
          localMotionEvent.recycle();
          super.onTouchEvent(paramMotionEvent);
          bool1 = bool2;
          break;
          i1 = 0;
          break label533;
          label652:
          bool1 = false;
          continue;
          label658:
          if (f1 > 0.0F)
          {
            bool1 = true;
          }
          else
          {
            bool1 = false;
            continue;
            label676:
            bool1 = a();
            continue;
            label685:
            bool1 = bool3;
          }
        }
      }
      this.j = 0;
      this.n.clear();
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    float f1 = 1.0F;
    super.setChecked(paramBoolean);
    paramBoolean = isChecked();
    if ((getWindowToken() != null) && (gt.u(this)))
    {
      float f2 = this.p;
      if (paramBoolean) {}
      for (;;)
      {
        this.C = new aan(this, f2, f1 - f2);
        this.C.setDuration(250L);
        startAnimation(this.C);
        return;
        f1 = 0.0F;
      }
    }
    if (this.C != null)
    {
      clearAnimation();
      this.C = null;
    }
    if (paramBoolean) {}
    for (;;)
    {
      a(f1);
      break;
      f1 = 0.0F;
    }
  }
  
  public void toggle()
  {
    if (!isChecked()) {}
    for (boolean bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    if ((super.verifyDrawable(paramDrawable)) || (paramDrawable == this.a) || (paramDrawable == this.b)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\android\support\v7\widget\SwitchCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */