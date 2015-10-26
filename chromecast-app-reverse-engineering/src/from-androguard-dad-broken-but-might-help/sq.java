	 ml a
	private final I b
	private android.widget.TextView c
	private android.widget.ImageView d
	private android.view.View e
	private synthetic sm f
	
	    public sq(sm p5, android.content.Context p6, ml p7, boolean p8)
	    {
	        this.f = p5;
	        this(p6, 0, a.j);
	        int v0_2 = new int[1];
	        v0_2[0] = 16842964;
	        this.b = v0_2;
	        this.a = p7;
	        int v0_4 = th.a(p6, 0, this.b, a.j, 0);
	        if (v0_4.d(0)) {
	            this.setBackgroundDrawable(v0_4.a(0));
	        }
	        v0_4.a.recycle();
	        if (p8) {
	            this.b(8388627);
	        }
	        this.a();
	        return;
	    }
	
	
	    public final void a()
	    {
	        ml v2 = this.a;
	        android.widget.ImageView v3_0 = v2.c();
	        if (v3_0 == null) {
	            if (this.e != null) {
	                this.removeView(this.e);
	                this.e = 0;
	            }
	            boolean v0_2 = v2.a();
	            android.widget.ImageView v3_1 = v2.b();
	            if (!v0_2) {
	                if (this.d != null) {
	                    this.d.setVisibility(8);
	                    this.d.setImageDrawable(0);
	                }
	            } else {
	                if (this.d == null) {
	                    CharSequence v4_2 = new android.widget.ImageView(this.getContext());
	                    xv v5_2 = new xv(-2, -2);
	                    v5_2.h = 16;
	                    v4_2.setLayoutParams(v5_2);
	                    this.addView(v4_2, 0);
	                    this.d = v4_2;
	                }
	                this.d.setImageDrawable(v0_2);
	                this.d.setVisibility(0);
	            }
	            boolean v0_8;
	            if (android.text.TextUtils.isEmpty(v3_1)) {
	                v0_8 = 0;
	            } else {
	                v0_8 = 1;
	            }
	            if (!v0_8) {
	                if (this.c != null) {
	                    this.c.setVisibility(8);
	                    this.c.setText(0);
	                }
	            } else {
	                if (this.c == null) {
	                    CharSequence v4_6 = new wt(this.getContext(), 0, a.k);
	                    v4_6.setEllipsize(android.text.TextUtils$TruncateAt.END);
	                    xv v5_6 = new xv(-2, -2);
	                    v5_6.h = 16;
	                    v4_6.setLayoutParams(v5_6);
	                    this.addView(v4_6);
	                    this.c = v4_6;
	                }
	                this.c.setText(v3_1);
	                this.c.setVisibility(0);
	            }
	            if (this.d != null) {
	                this.d.setContentDescription(v2.d());
	            }
	            if ((v0_8) || (android.text.TextUtils.isEmpty(v2.d()))) {
	                this.setOnLongClickListener(0);
	                this.setLongClickable(0);
	            } else {
	                this.setOnLongClickListener(this);
	            }
	        } else {
	            boolean v0_11 = v3_0.getParent();
	            if (v0_11 != this) {
	                if (v0_11) {
	                    ((android.view.ViewGroup) v0_11).removeView(v3_0);
	                }
	                this.addView(v3_0);
	            }
	            this.e = v3_0;
	            if (this.c != null) {
	                this.c.setVisibility(8);
	            }
	            if (this.d != null) {
	                this.d.setVisibility(8);
	                this.d.setImageDrawable(0);
	            }
	        }
	        return;
	    }
	
	
	    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
	    {
	        super.onInitializeAccessibilityEvent(p2);
	        p2.setClassName(ml.getName());
	        return;
	    }
	
	
	    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p3)
	    {
	        super.onInitializeAccessibilityNodeInfo(p3);
	        if (android.os.Build$VERSION.SDK_INT >= 14) {
	            p3.setClassName(ml.getName());
	        }
	        return;
	    }
	
	
	    public final boolean onLongClick(android.view.View p8)
	    {
	        int v0_1 = new int[2];
	        this.getLocationOnScreen(v0_1);
	        android.widget.Toast v1_0 = this.getContext();
	        int v2_0 = this.getWidth();
	        int v3 = this.getHeight();
	        int v4_2 = v1_0.getResources().getDisplayMetrics().widthPixels;
	        android.widget.Toast v1_1 = android.widget.Toast.makeText(v1_0, this.a.d(), 0);
	        v1_1.setGravity(49, ((v0_1[0] + (v2_0 / 2)) - (v4_2 / 2)), v3);
	        v1_1.show();
	        return 1;
	    }
	
	
	    public final void onMeasure(int p3, int p4)
	    {
	        super.onMeasure(p3, p4);
	        if ((this.f.c > 0) && (this.getMeasuredWidth() > this.f.c)) {
	            super.onMeasure(android.view.View$MeasureSpec.makeMeasureSpec(this.f.c, 1073741824), p4);
	        }
	        return;
	    }
	
	
	    public final void setSelected(boolean p2)
	    {
	        int v0_1;
	        if (this.isSelected() == p2) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        super.setSelected(p2);
	        if ((v0_1 != 0) && (p2)) {
	            this.sendAccessibilityEvent(4);
	        }
	        return;
	    }
	
