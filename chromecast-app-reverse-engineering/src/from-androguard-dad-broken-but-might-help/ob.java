	private static final I l
	private static final I m
	public final tz a
	public final oc b
	public tx c
	public  d
	public  e
	private op f
	private android.graphics.drawable.Drawable g
	private  h
	private  i
	private  j
	private  k
	
	    static ob()
	    {
	        int[] v0_0 = new int[1];
	        v0_0[0] = 16842912;
	        ob.l = v0_0;
	        int[] v0_1 = new int[1];
	        v0_1[0] = 16842911;
	        ob.m = v0_1;
	        return;
	    }
	
	
	    public ob(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private ob(android.content.Context p3, android.util.AttributeSet p4)
	    {
	        this(p3, 0, a.cg);
	        return;
	    }
	
	
	    private ob(android.content.Context p7, android.util.AttributeSet p8, int p9)
	    {
	        this(a.a(p7), p8, p9);
	        this.c = tx.c;
	        this.f = op.a();
	        int v0_3 = this.getContext();
	        this.a = tz.a(v0_3);
	        this.b = new oc(this);
	        android.content.res.TypedArray v3_4 = v0_3.obtainStyledAttributes(p8, vp.a, p9, 0);
	        android.graphics.drawable.Drawable v4 = v3_4.getDrawable(vp.d);
	        if (this.g != null) {
	            this.g.setCallback(0);
	            this.unscheduleDrawable(this.g);
	        }
	        this.g = v4;
	        if (v4 != null) {
	            int v0_10;
	            v4.setCallback(this);
	            v4.setState(this.getDrawableState());
	            if (this.getVisibility() != 0) {
	                v0_10 = 0;
	            } else {
	                v0_10 = 1;
	            }
	            v4.setVisible(v0_10, 0);
	        }
	        this.refreshDrawableState();
	        this.j = v3_4.getDimensionPixelSize(vp.c, 0);
	        this.k = v3_4.getDimensionPixelSize(vp.b, 0);
	        v3_4.recycle();
	        this.setClickable(1);
	        this.setLongClickable(1);
	        return;
	    }
	
	
	    static synthetic void a(ob p0)
	    {
	        p0.b();
	        return;
	    }
	
	
	    public final void a(op p3)
	    {
	        if (p3 != null) {
	            this.f = p3;
	            return;
	        } else {
	            throw new IllegalArgumentException("factory must not be null");
	        }
	    }
	
	
	    public final boolean a()
	    {
	        int v0_12;
	        String v1_0 = 0;
	        if (this.d) {
	            int v0_1 = this.getContext();
	            while ((v0_1 instanceof android.content.ContextWrapper)) {
	                if (!(v0_1 instanceof android.app.Activity)) {
	                    v0_1 = ((android.content.ContextWrapper) v0_1).getBaseContext();
	                } else {
	                    int v0_2 = ((android.app.Activity) v0_1);
	                }
	                if ((v0_2 instanceof m)) {
	                    v1_0 = ((m) v0_2).b;
	                }
	                if (v1_0 != null) {
	                    int v0_5 = tz.d();
	                    if ((!v0_5.b()) && (v0_5.a(this.c))) {
	                        if (v1_0.a("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
	                            this.f.c().a(v1_0, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
	                        } else {
	                            android.util.Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
	                            v0_12 = 0;
	                            return v0_12;
	                        }
	                    } else {
	                        if (v1_0.a("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") == null) {
	                            int v0_15 = op.b();
	                            v0_15.a(this.c);
	                            v0_15.a(v1_0, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
	                        } else {
	                            android.util.Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
	                            v0_12 = 0;
	                            return v0_12;
	                        }
	                    }
	                    v0_12 = 1;
	                } else {
	                    throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
	                }
	            }
	            v0_2 = 0;
	        } else {
	            v0_12 = 0;
	        }
	        return v0_12;
	    }
	
	
	    public void b()
	    {
	        int v2 = 0;
	        if (this.d) {
	            boolean v3_3;
	            boolean v0_1 = tz.d();
	            if ((v0_1.b()) || (!v0_1.a(this.c))) {
	                v3_3 = 0;
	            } else {
	                v3_3 = 1;
	            }
	            if ((!v3_3) || (!v0_1.f)) {
	                boolean v0_3 = 0;
	            } else {
	                v0_3 = 1;
	            }
	            if (this.h != v3_3) {
	                this.h = v3_3;
	                v2 = 1;
	            }
	            if (this.i != v0_3) {
	                this.i = v0_3;
	                v2 = 1;
	            }
	            if (v2 != 0) {
	                this.refreshDrawableState();
	            }
	            this.setEnabled(tz.a(this.c, 1));
	        }
	        return;
	    }
	
	
	    protected final void drawableStateChanged()
	    {
	        super.drawableStateChanged();
	        if (this.g != null) {
	            this.g.setState(this.getDrawableState());
	            this.invalidate();
	        }
	        return;
	    }
	
	
	    public final void jumpDrawablesToCurrentState()
	    {
	        if (this.getBackground() != null) {
	            bo.a(this.getBackground());
	        }
	        if (this.g != null) {
	            bo.a(this.g);
	        }
	        return;
	    }
	
	
	    public final void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        this.d = 1;
	        if (!this.c.c()) {
	            this.a.a(this.c, this.b, 0);
	        }
	        this.b();
	        return;
	    }
	
	
	    protected final int[] onCreateDrawableState(int p3)
	    {
	        int[] v0_1 = super.onCreateDrawableState((p3 + 1));
	        if (!this.i) {
	            if (this.h) {
	                ob.mergeDrawableStates(v0_1, ob.l);
	            }
	        } else {
	            ob.mergeDrawableStates(v0_1, ob.m);
	        }
	        return v0_1;
	    }
	
	
	    public final void onDetachedFromWindow()
	    {
	        this.d = 0;
	        if (!this.c.c()) {
	            this.a.a(this.b);
	        }
	        super.onDetachedFromWindow();
	        return;
	    }
	
	
	    protected final void onDraw(android.graphics.Canvas p7)
	    {
	        super.onDraw(p7);
	        if (this.g != null) {
	            android.graphics.drawable.Drawable v0_1 = this.getPaddingLeft();
	            int v1_1 = (this.getWidth() - this.getPaddingRight());
	            android.graphics.drawable.Drawable v2_1 = this.getPaddingTop();
	            int v3_1 = (this.getHeight() - this.getPaddingBottom());
	            int v4_2 = this.g.getIntrinsicWidth();
	            int v5_1 = this.g.getIntrinsicHeight();
	            android.graphics.drawable.Drawable v0_2 = (v0_1 + (((v1_1 - v0_1) - v4_2) / 2));
	            int v1_8 = ((((v3_1 - v2_1) - v5_1) / 2) + v2_1);
	            this.g.setBounds(v0_2, v1_8, (v0_2 + v4_2), (v1_8 + v5_1));
	            this.g.draw(p7);
	        }
	        return;
	    }
	
	
	    protected final void onMeasure(int p9, int p10)
	    {
	        int v0_1;
	        int v1_0 = 0;
	        int v3_0 = android.view.View$MeasureSpec.getSize(p9);
	        int v2_0 = android.view.View$MeasureSpec.getSize(p10);
	        int v4 = android.view.View$MeasureSpec.getMode(p9);
	        int v5 = android.view.View$MeasureSpec.getMode(p10);
	        int v6_0 = this.j;
	        if (this.g == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.g.getIntrinsicWidth();
	        }
	        int v0_3 = Math.max(v6_0, v0_1);
	        int v6_1 = this.k;
	        if (this.g != null) {
	            v1_0 = this.g.getIntrinsicHeight();
	        }
	        int v1_2;
	        int v6_2 = Math.max(v6_1, v1_0);
	        switch (v4) {
	            case -2147483648:
	                v1_2 = Math.min(v3_0, ((v0_3 + this.getPaddingLeft()) + this.getPaddingRight()));
	                break;
	            case 1073741824:
	                v1_2 = v3_0;
	                break;
	            default:
	                v1_2 = ((v0_3 + this.getPaddingLeft()) + this.getPaddingRight());
	        }
	        int v0_9;
	        switch (v5) {
	            case -2147483648:
	                v0_9 = Math.min(v2_0, ((this.getPaddingTop() + v6_2) + this.getPaddingBottom()));
	                break;
	            case 1073741824:
	                v0_9 = v2_0;
	                break;
	            default:
	                v0_9 = ((this.getPaddingTop() + v6_2) + this.getPaddingBottom());
	        }
	        this.setMeasuredDimension(v1_2, v0_9);
	        return;
	    }
	
	
	    public final boolean performClick()
	    {
	        int v0 = 0;
	        boolean v1 = super.performClick();
	        if (!v1) {
	            this.playSoundEffect(0);
	        }
	        if ((this.a()) || (v1)) {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final boolean performLongClick()
	    {
	        int v0 = 1;
	        if (!super.performLongClick()) {
	            if (this.e) {
	                android.widget.Toast v2_2 = this.getContentDescription();
	                if (!android.text.TextUtils.isEmpty(v2_2)) {
	                    int v3_2 = new int[2];
	                    int v4_1 = new android.graphics.Rect();
	                    this.getLocationOnScreen(v3_2);
	                    this.getWindowVisibleDisplayFrame(v4_1);
	                    int v5_0 = this.getContext();
	                    int v6 = this.getWidth();
	                    int v7 = this.getHeight();
	                    int v8_1 = (v3_2[1] + (v7 / 2));
	                    int v9_3 = v5_0.getResources().getDisplayMetrics().widthPixels;
	                    android.widget.Toast v2_3 = android.widget.Toast.makeText(v5_0, v2_2, 0);
	                    if (v8_1 >= v4_1.height()) {
	                        v2_3.setGravity(81, 0, v7);
	                    } else {
	                        v2_3.setGravity(8388661, ((v9_3 - v3_2[0]) - (v6 / 2)), v7);
	                    }
	                    v2_3.show();
	                    this.performHapticFeedback(0);
	                } else {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final void setVisibility(int p4)
	    {
	        super.setVisibility(p4);
	        if (this.g != null) {
	            int v0_2;
	            if (this.getVisibility() != 0) {
	                v0_2 = 0;
	            } else {
	                v0_2 = 1;
	            }
	            this.g.setVisible(v0_2, 0);
	        }
	        return;
	    }
	
	
	    protected final boolean verifyDrawable(android.graphics.drawable.Drawable p2)
	    {
	        if ((!super.verifyDrawable(p2)) && (p2 != this.g)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
