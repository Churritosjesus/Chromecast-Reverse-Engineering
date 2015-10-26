	private static final I E
	private android.text.Layout A
	private android.text.method.TransformationMethod B
	private android.view.animation.Animation C
	private final android.graphics.Rect D
	private android.graphics.drawable.Drawable a
	private android.graphics.drawable.Drawable b
	private  c
	private  d
	private  e
	private  f
	private java.lang.CharSequence g
	private java.lang.CharSequence h
	private  i
	private  j
	private  k
	private  l
	private  m
	private android.view.VelocityTracker n
	private  o
	private  p
	private  q
	private  r
	private  s
	private  t
	private  u
	private  v
	private  w
	private android.text.TextPaint x
	private android.content.res.ColorStateList y
	private android.text.Layout z
	
	    static SwitchCompat()
	    {
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16842912;
	        android.support.v7.widget.SwitchCompat.E = v0_1;
	        return;
	    }
	
	
	    public SwitchCompat(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public SwitchCompat(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.Q);
	        return;
	    }
	
	
	    public SwitchCompat(android.content.Context p11, android.util.AttributeSet p12, int p13)
	    {
	        this(p11, p12, p13);
	        this.n = android.view.VelocityTracker.obtain();
	        this.D = new android.graphics.Rect();
	        this.x = new android.text.TextPaint(1);
	        this.x.density = this.getResources().getDisplayMetrics().density;
	        th v5_1 = th.a(p11, p12, oq.bw, p13, 0);
	        this.a = v5_1.a(oq.bz);
	        if (this.a != null) {
	            this.a.setCallback(this);
	        }
	        this.b = v5_1.a(oq.bG);
	        if (this.b != null) {
	            this.b.setCallback(this);
	        }
	        this.g = v5_1.c(oq.by);
	        this.h = v5_1.c(oq.bx);
	        this.i = v5_1.a(oq.bA, 1);
	        this.c = v5_1.c(oq.bF, 0);
	        this.d = v5_1.c(oq.bC, 0);
	        this.e = v5_1.c(oq.bD, 0);
	        this.f = v5_1.a(oq.bB, 0);
	        int v0_32 = v5_1.e(oq.bE, 0);
	        if (v0_32 != 0) {
	            android.content.res.TypedArray v6_1 = p11.obtainStyledAttributes(v0_32, oq.bH);
	            int v0_34 = v6_1.getColorStateList(oq.bI);
	            if (v0_34 == 0) {
	                this.y = this.getTextColors();
	            } else {
	                this.y = v0_34;
	            }
	            int v0_37 = v6_1.getDimensionPixelSize(oq.bJ, 0);
	            if ((v0_37 != 0) && (((float) v0_37) != this.x.getTextSize())) {
	                this.x.setTextSize(((float) v0_37));
	                this.requestLayout();
	            }
	            int v0_41;
	            int v0_40 = v6_1.getInt(oq.bL, -1);
	            int v7_4 = v6_1.getInt(oq.bK, -1);
	            switch (v0_40) {
	                case 1:
	                    v0_41 = android.graphics.Typeface.SANS_SERIF;
	                    break;
	                case 2:
	                    v0_41 = android.graphics.Typeface.SERIF;
	                    break;
	                case 3:
	                    v0_41 = android.graphics.Typeface.MONOSPACE;
	                    break;
	                default:
	                    v0_41 = 0;
	            }
	            if (v7_4 <= 0) {
	                this.x.setFakeBoldText(0);
	                this.x.setTextSkewX(0);
	                this.a(v0_41);
	            } else {
	                int v0_42;
	                if (v0_41 != 0) {
	                    v0_42 = android.graphics.Typeface.create(v0_41, v7_4);
	                } else {
	                    v0_42 = android.graphics.Typeface.defaultFromStyle(v7_4);
	                }
	                int v0_43;
	                this.a(v0_42);
	                if (v0_42 == 0) {
	                    v0_43 = 0;
	                } else {
	                    v0_43 = v0_42.getStyle();
	                }
	                int v0_46;
	                int v7_5 = (v7_4 & (v0_43 ^ -1));
	                if ((v7_5 & 1) == 0) {
	                    v0_46 = 0;
	                } else {
	                    v0_46 = 1;
	                }
	                int v0_48;
	                this.x.setFakeBoldText(v0_46);
	                if ((v7_5 & 2) == 0) {
	                    v0_48 = 0;
	                } else {
	                    v0_48 = -1098907648;
	                }
	                this.x.setTextSkewX(v0_48);
	            }
	            if (!v6_1.getBoolean(oq.bM, 0)) {
	                this.B = 0;
	            } else {
	                this.B = new pg(this.getContext());
	            }
	            v6_1.recycle();
	        }
	        v5_1.a();
	        v5_1.a.recycle();
	        int v0_54 = android.view.ViewConfiguration.get(p11);
	        this.k = v0_54.getScaledTouchSlop();
	        this.o = v0_54.getScaledMinimumFlingVelocity();
	        this.refreshDrawableState();
	        this.setChecked(this.isChecked());
	        return;
	    }
	
	
	    private android.text.Layout a(CharSequence p9)
	    {
	        CharSequence v1;
	        if (this.B == null) {
	            v1 = p9;
	        } else {
	            v1 = this.B.getTransformation(p9, this);
	        }
	        int v3_0;
	        if (v1 == null) {
	            v3_0 = 0;
	        } else {
	            v3_0 = ((int) Math.ceil(((double) android.text.Layout.getDesiredWidth(v1, this.x))));
	        }
	        return new android.text.StaticLayout(v1, this.x, v3_0, android.text.Layout$Alignment.ALIGN_NORMAL, 1065353216, 0, 1);
	    }
	
	
	    private void a(float p1)
	    {
	        this.p = p1;
	        this.invalidate();
	        return;
	    }
	
	
	    private void a(android.graphics.Typeface p2)
	    {
	        if (this.x.getTypeface() != p2) {
	            this.x.setTypeface(p2);
	            this.requestLayout();
	            this.invalidate();
	        }
	        return;
	    }
	
	
	    public static synthetic void a(android.support.v7.widget.SwitchCompat p0, float p1)
	    {
	        p0.a(p1);
	        return;
	    }
	
	
	    private boolean a()
	    {
	        int v0_2;
	        if (this.p <= 1056964608) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    private int b()
	    {
	        int v0_1;
	        if (!tm.a(this)) {
	            v0_1 = this.p;
	        } else {
	            v0_1 = (1065353216 - this.p);
	        }
	        return ((int) ((v0_1 * ((float) this.c())) + 1056964608));
	    }
	
	
	    private int c()
	    {
	        int v0_1;
	        if (this.b == null) {
	            v0_1 = 0;
	        } else {
	            int v0_4;
	            int v1_0 = this.D;
	            this.b.getPadding(v1_0);
	            if (this.a == null) {
	                v0_4 = sf.a;
	            } else {
	                v0_4 = sf.a(this.a);
	            }
	            v0_1 = (((((this.q - this.s) - v1_0.left) - v1_0.right) - v0_4.left) - v0_4.right);
	        }
	        return v0_1;
	    }
	
	
	    public void draw(android.graphics.Canvas p11)
	    {
	        int v0_2;
	        android.graphics.Rect v7 = this.D;
	        int v1_0 = this.t;
	        int v3 = this.u;
	        int v4 = this.v;
	        int v5 = this.w;
	        int v2_0 = (v1_0 + this.b());
	        if (this.a == null) {
	            v0_2 = sf.a;
	        } else {
	            v0_2 = sf.a(this.a);
	        }
	        int v0_4;
	        if (this.b == null) {
	            v0_4 = v2_0;
	        } else {
	            int v0_5;
	            int v2_2;
	            this.b.getPadding(v7);
	            int v6_3 = (v7.left + v2_0);
	            if ((v0_2 == 0) || (v0_2.isEmpty())) {
	                v0_5 = v5;
	                v2_2 = v3;
	            } else {
	                if (v0_2.left > v7.left) {
	                    v1_0 += (v0_2.left - v7.left);
	                }
	                if (v0_2.top <= v7.top) {
	                    v2_2 = v3;
	                } else {
	                    v2_2 = ((v0_2.top - v7.top) + v3);
	                }
	                if (v0_2.right > v7.right) {
	                    v4 -= (v0_2.right - v7.right);
	                }
	                if (v0_2.bottom <= v7.bottom) {
	                    v0_5 = v5;
	                } else {
	                    v0_5 = (v5 - (v0_2.bottom - v7.bottom));
	                }
	            }
	            this.b.setBounds(v1_0, v2_2, v4, v0_5);
	            v0_4 = v6_3;
	        }
	        if (this.a != null) {
	            this.a.getPadding(v7);
	            int v1_4 = (v0_4 - v7.left);
	            int v0_9 = ((v0_4 + this.s) + v7.right);
	            this.a.setBounds(v1_4, v3, v0_9, v5);
	            int v2_12 = this.getBackground();
	            if (v2_12 != 0) {
	                bo.a(v2_12, v1_4, v3, v0_9, v5);
	            }
	        }
	        super.draw(p11);
	        return;
	    }
	
	
	    public void drawableHotspotChanged(float p3, float p4)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 21) {
	            super.drawableHotspotChanged(p3, p4);
	        }
	        if (this.a != null) {
	            bo.a(this.a, p3, p4);
	        }
	        if (this.b != null) {
	            bo.a(this.b, p3, p4);
	        }
	        return;
	    }
	
	
	    protected void drawableStateChanged()
	    {
	        super.drawableStateChanged();
	        int[] v0 = this.getDrawableState();
	        if (this.a != null) {
	            this.a.setState(v0);
	        }
	        if (this.b != null) {
	            this.b.setState(v0);
	        }
	        this.invalidate();
	        return;
	    }
	
	
	    public int getCompoundPaddingLeft()
	    {
	        int v0_2;
	        if (tm.a(this)) {
	            v0_2 = (super.getCompoundPaddingLeft() + this.q);
	            if (!android.text.TextUtils.isEmpty(this.getText())) {
	                v0_2 += this.e;
	            }
	        } else {
	            v0_2 = super.getCompoundPaddingLeft();
	        }
	        return v0_2;
	    }
	
	
	    public int getCompoundPaddingRight()
	    {
	        int v0_2;
	        if (!tm.a(this)) {
	            v0_2 = (super.getCompoundPaddingRight() + this.q);
	            if (!android.text.TextUtils.isEmpty(this.getText())) {
	                v0_2 += this.e;
	            }
	        } else {
	            v0_2 = super.getCompoundPaddingRight();
	        }
	        return v0_2;
	    }
	
	
	    public void jumpDrawablesToCurrentState()
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 11) {
	            super.jumpDrawablesToCurrentState();
	            if (this.a != null) {
	                this.a.jumpToCurrentState();
	            }
	            if (this.b != null) {
	                this.b.jumpToCurrentState();
	            }
	            if ((this.C != null) && (!this.C.hasEnded())) {
	                this.clearAnimation();
	                this.C = 0;
	            }
	        }
	        return;
	    }
	
	
	    protected int[] onCreateDrawableState(int p3)
	    {
	        int[] v0_1 = super.onCreateDrawableState((p3 + 1));
	        if (this.isChecked()) {
	            android.support.v7.widget.SwitchCompat.mergeDrawableStates(v0_1, android.support.v7.widget.SwitchCompat.E);
	        }
	        return v0_1;
	    }
	
	
	    protected void onDraw(android.graphics.Canvas p10)
	    {
	        super.onDraw(p10);
	        float v0_0 = this.D;
	        android.text.Layout v1_0 = this.b;
	        if (v1_0 == null) {
	            v0_0.setEmpty();
	        } else {
	            v1_0.getPadding(v0_0);
	        }
	        float v2_1 = (this.u + v0_0.top);
	        int v3_1 = (this.w - v0_0.bottom);
	        int v4_2 = this.a;
	        if (v1_0 != null) {
	            if ((!this.f) || (v4_2 == 0)) {
	                v1_0.draw(p10);
	            } else {
	                int v5_1 = sf.a(v4_2);
	                v4_2.copyBounds(v0_0);
	                v0_0.left = (v0_0.left + v5_1.left);
	                v0_0.right = (v0_0.right - v5_1.right);
	                int v5_4 = p10.save();
	                p10.clipRect(v0_0, android.graphics.Region$Op.DIFFERENCE);
	                v1_0.draw(p10);
	                p10.restoreToCount(v5_4);
	            }
	        }
	        int v5_5 = p10.save();
	        if (v4_2 != 0) {
	            v4_2.draw(p10);
	        }
	        android.text.Layout v1_1;
	        if (!this.a()) {
	            v1_1 = this.A;
	        } else {
	            v1_1 = this.z;
	        }
	        if (v1_1 != null) {
	            float v0_4 = this.getDrawableState();
	            if (this.y != null) {
	                this.x.setColor(this.y.getColorForState(v0_4, 0));
	            }
	            float v0_5;
	            this.x.drawableState = v0_4;
	            if (v4_2 == 0) {
	                v0_5 = this.getWidth();
	            } else {
	                float v0_6 = v4_2.getBounds();
	                v0_5 = (v0_6.right + v0_6.left);
	            }
	            p10.translate(((float) ((v0_5 / 2) - (v1_1.getWidth() / 2))), ((float) (((v2_1 + v3_1) / 2) - (v1_1.getHeight() / 2))));
	            v1_1.draw(p10);
	        }
	        p10.restoreToCount(v5_5);
	        return;
	    }
	
	
	    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
	    {
	        super.onInitializeAccessibilityEvent(p2);
	        p2.setClassName("android.widget.Switch");
	        return;
	    }
	
	
	    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p5)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 14) {
	            CharSequence v0_3;
	            super.onInitializeAccessibilityNodeInfo(p5);
	            p5.setClassName("android.widget.Switch");
	            if (!this.isChecked()) {
	                v0_3 = this.h;
	            } else {
	                v0_3 = this.g;
	            }
	            if (!android.text.TextUtils.isEmpty(v0_3)) {
	                StringBuilder v1_2 = p5.getText();
	                if (!android.text.TextUtils.isEmpty(v1_2)) {
	                    StringBuilder v2_2 = new StringBuilder();
	                    v2_2.append(v1_2).append(32).append(v0_3);
	                    p5.setText(v2_2);
	                } else {
	                    p5.setText(v0_3);
	                }
	            }
	        }
	        return;
	    }
	
	
	    protected void onLayout(boolean p6, int p7, int p8, int p9, int p10)
	    {
	        int v1_1;
	        int v0_0 = 0;
	        this = super.onLayout(p6, p7, p8, p9, p10);
	        if (this.a == null) {
	            v1_1 = 0;
	        } else {
	            int v2_0 = this.D;
	            if (this.b == null) {
	                v2_0.setEmpty();
	            } else {
	                this.b.getPadding(v2_0);
	            }
	            int v3_0 = sf.a(this.a);
	            v1_1 = Math.max(0, (v3_0.left - v2_0.left));
	            v0_0 = Math.max(0, (v3_0.right - v2_0.right));
	        }
	        int v0_1;
	        int v1_8;
	        if (!tm.a(this)) {
	            int v2_6 = ((this.getWidth() - this.getPaddingRight()) - v0_0);
	            v0_1 = (v0_0 + (v1_1 + (v2_6 - this.q)));
	            v1_8 = v2_6;
	        } else {
	            int v2_8 = (this.getPaddingLeft() + v1_1);
	            v1_8 = (((this.q + v2_8) - v1_1) - v0_0);
	            v0_1 = v2_8;
	        }
	        int v2_12;
	        int v3_9;
	        switch ((this.getGravity() & 112)) {
	            case 16:
	                v3_9 = ((((this.getPaddingTop() + this.getHeight()) - this.getPaddingBottom()) / 2) - (this.r / 2));
	                v2_12 = (this.r + v3_9);
	                break;
	            case 80:
	                v2_12 = (this.getHeight() - this.getPaddingBottom());
	                v3_9 = (v2_12 - this.r);
	                break;
	            default:
	                v3_9 = this.getPaddingTop();
	                v2_12 = (this.r + v3_9);
	        }
	        this.t = v0_1;
	        this.u = v3_9;
	        this.w = v2_12;
	        this.v = v1_8;
	        return;
	    }
	
	
	    public void onMeasure(int p7, int p8)
	    {
	        int v1_0 = 0;
	        if (this.i) {
	            if (this.z == null) {
	                this.z = this.a(this.g);
	            }
	            if (this.A == null) {
	                this.A = this.a(this.h);
	            }
	        }
	        int v0_8;
	        int v2_0;
	        int v4_0 = this.D;
	        if (this.a == null) {
	            v0_8 = 0;
	            v2_0 = 0;
	        } else {
	            this.a.getPadding(v4_0);
	            v2_0 = ((this.a.getIntrinsicWidth() - v4_0.left) - v4_0.right);
	            v0_8 = this.a.getIntrinsicHeight();
	        }
	        int v3_1;
	        if (!this.i) {
	            v3_1 = 0;
	        } else {
	            v3_1 = (Math.max(this.z.getWidth(), this.A.getWidth()) + (this.c << 1));
	        }
	        this.s = Math.max(v3_1, v2_0);
	        if (this.b == null) {
	            v4_0.setEmpty();
	        } else {
	            this.b.getPadding(v4_0);
	            v1_0 = this.b.getIntrinsicHeight();
	        }
	        int v3_5 = v4_0.left;
	        int v2_5 = v4_0.right;
	        if (this.a != null) {
	            int v4_3 = sf.a(this.a);
	            v3_5 = Math.max(v3_5, v4_3.left);
	            v2_5 = Math.max(v2_5, v4_3.right);
	        }
	        int v2_7 = Math.max(this.d, (v2_5 + (v3_5 + (this.s * 2))));
	        int v0_14 = Math.max(v1_0, v0_8);
	        this.q = v2_7;
	        this.r = v0_14;
	        super.onMeasure(p7, p8);
	        if (this.getMeasuredHeight() < v0_14) {
	            this.setMeasuredDimension(gt.i(this), v0_14);
	        }
	        return;
	    }
	
	
	    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p3)
	    {
	        CharSequence v0_1;
	        super.onPopulateAccessibilityEvent(p3);
	        if (!this.isChecked()) {
	            v0_1 = this.h;
	        } else {
	            v0_1 = this.g;
	        }
	        if (v0_1 != null) {
	            p3.getText().add(v0_1);
	        }
	        return;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p10)
	    {
	        float v1_0 = 1065353216;
	        boolean v4_0 = 0;
	        boolean v3 = 1;
	        this.n.addMovement(p10);
	        switch (gd.a(p10)) {
	            case 0:
	                boolean v0_23 = p10.getX();
	                float v1_4 = p10.getY();
	                if (!this.isEnabled()) {
	                    v3 = super.onTouchEvent(p10);
	                } else {
	                    if (this.a != null) {
	                        float v2_13 = this.b();
	                        this.a.getPadding(this.D);
	                        float v2_15 = ((v2_13 + this.t) - this.k);
	                        if ((v0_23 > ((float) v2_15)) && ((v0_23 < ((float) ((((this.s + v2_15) + this.D.left) + this.D.right) + this.k))) && ((v1_4 > ((float) (this.u - this.k))) && (v1_4 < ((float) (this.w + this.k)))))) {
	                            v4_0 = 1;
	                        }
	                    }
	                    if (!v4_0) {
	                    } else {
	                        this.j = 1;
	                        this.l = v0_23;
	                        this.m = v1_4;
	                    }
	                }
	                break;
	            case 1:
	            case 3:
	                if (this.j != 2) {
	                    this.j = 0;
	                    this.n.clear();
	                } else {
	                    boolean v0_15;
	                    this.j = 0;
	                    if ((p10.getAction() != 1) || (!this.isEnabled())) {
	                        v0_15 = 0;
	                    } else {
	                        v0_15 = 1;
	                    }
	                    boolean v0_16;
	                    float v1_2 = this.isChecked();
	                    if (!v0_15) {
	                        v0_16 = v1_2;
	                    } else {
	                        this.n.computeCurrentVelocity(1000);
	                        boolean v0_19 = this.n.getXVelocity();
	                        if (Math.abs(v0_19) <= ((float) this.o)) {
	                            v0_16 = this.a();
	                        } else {
	                            if (!tm.a(this)) {
	                                if (v0_19 <= 0) {
	                                    v0_16 = 0;
	                                } else {
	                                    v0_16 = 1;
	                                }
	                            } else {
	                                if (v0_19 >= 0) {
	                                    v0_16 = 0;
	                                } else {
	                                    v0_16 = 1;
	                                }
	                            }
	                        }
	                    }
	                    if (v0_16 != v1_2) {
	                        this.playSoundEffect(0);
	                        this.setChecked(v0_16);
	                    }
	                    boolean v0_22 = android.view.MotionEvent.obtain(p10);
	                    v0_22.setAction(3);
	                    super.onTouchEvent(v0_22);
	                    v0_22.recycle();
	                    super.onTouchEvent(p10);
	                }
	                break;
	            case 2:
	                switch (this.j) {
	                    case 1:
	                        boolean v0_10 = p10.getX();
	                        float v1_1 = p10.getY();
	                        if ((Math.abs((v0_10 - this.l)) <= ((float) this.k)) && (Math.abs((v1_1 - this.m)) <= ((float) this.k))) {
	                        } else {
	                            this.j = 2;
	                            this.getParent().requestDisallowInterceptTouchEvent(1);
	                            this.l = v0_10;
	                            this.m = v1_1;
	                        }
	                        break;
	                    case 2:
	                        boolean v0_5;
	                        boolean v4_1 = p10.getX();
	                        boolean v0_3 = this.c();
	                        boolean v5_2 = (v4_1 - this.l);
	                        if (!v0_3) {
	                            if (v5_2 <= 0) {
	                                v0_5 = -1082130432;
	                            } else {
	                                v0_5 = 1065353216;
	                            }
	                        } else {
	                            v0_5 = (v5_2 / ((float) v0_3));
	                        }
	                        if (tm.a(this)) {
	                            v0_5 = (- v0_5);
	                        }
	                        boolean v0_7 = (v0_5 + this.p);
	                        if (v0_7 >= 0) {
	                            if (v0_7 <= 1065353216) {
	                                v1_0 = v0_7;
	                            }
	                        } else {
	                            v1_0 = 0;
	                        }
	                        if (v1_0 == this.p) {
	                        } else {
	                            this.l = v4_1;
	                            this.a(v1_0);
	                        }
	                        break;
	                    default:
	                }
	                break;
	            default:
	        }
	        return v3;
	    }
	
	
	    public void setChecked(boolean p5)
	    {
	        aan v0_0 = 1065353216;
	        super.setChecked(p5);
	        long v2_0 = this.isChecked();
	        if ((this.getWindowToken() == null) || (!gt.u(this))) {
	            if (this.C != null) {
	                this.clearAnimation();
	                this.C = 0;
	            }
	            if (v2_0 == 0) {
	                v0_0 = 0;
	            }
	            this.a(v0_0);
	        } else {
	            int v3_4 = this.p;
	            if (v2_0 == 0) {
	                v0_0 = 0;
	            }
	            this.C = new aan(this, v3_4, (v0_0 - v3_4));
	            this.C.setDuration(250);
	            this.startAnimation(this.C);
	        }
	        return;
	    }
	
	
	    public void toggle()
	    {
	        int v0_1;
	        if (this.isChecked()) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        this.setChecked(v0_1);
	        return;
	    }
	
	
	    protected boolean verifyDrawable(android.graphics.drawable.Drawable p2)
	    {
	        if ((!super.verifyDrawable(p2)) && ((p2 != this.a) && (p2 != this.b))) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
