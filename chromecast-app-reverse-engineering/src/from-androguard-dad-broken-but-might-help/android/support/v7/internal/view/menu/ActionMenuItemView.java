	public qc a
	public pu b
	private qe c
	private java.lang.CharSequence d
	private android.graphics.drawable.Drawable e
	private yg f
	private  g
	private  h
	private  i
	private  j
	
	    public ActionMenuItemView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public ActionMenuItemView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public ActionMenuItemView(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6, p7);
	        int v0_0 = p5.getResources();
	        this.g = v0_0.getBoolean(a.W);
	        int v1_3 = p5.obtainStyledAttributes(p6, oq.v, p7, 0);
	        this.h = v1_3.getDimensionPixelSize(oq.w, 0);
	        v1_3.recycle();
	        this.j = ((int) ((v0_0.getDisplayMetrics().density * 1107296256) + 1056964608));
	        this.setOnClickListener(this);
	        this.setOnLongClickListener(this);
	        this.i = -1;
	        return;
	    }
	
	
	    public static synthetic pu a(android.support.v7.internal.view.menu.ActionMenuItemView p1)
	    {
	        return p1.b;
	    }
	
	
	    public static synthetic qc b(android.support.v7.internal.view.menu.ActionMenuItemView p1)
	    {
	        return p1.a;
	    }
	
	
	    public static synthetic qe c(android.support.v7.internal.view.menu.ActionMenuItemView p1)
	    {
	        return p1.c;
	    }
	
	
	    private void f()
	    {
	        int v0_2;
	        int v2 = 0;
	        if (android.text.TextUtils.isEmpty(this.d)) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        if (this.e == null) {
	            v2 = 1;
	        } else {
	            boolean v3_4;
	            if ((this.c.c & 4) != 4) {
	                v3_4 = 0;
	            } else {
	                v3_4 = 1;
	            }
	            if ((v3_4) && (this.g)) {
	            }
	        }
	        int v0_4;
	        if ((v0_2 & v2) == 0) {
	            v0_4 = 0;
	        } else {
	            v0_4 = this.d;
	        }
	        this.setText(v0_4);
	        return;
	    }
	
	
	    public final qe a()
	    {
	        return this.c;
	    }
	
	
	    public final void a(qe p7, int p8)
	    {
	        this.c = p7;
	        android.graphics.drawable.Drawable v3 = p7.getIcon();
	        this.e = v3;
	        if (v3 != null) {
	            int v1_0 = v3.getIntrinsicWidth();
	            pt v0_0 = v3.getIntrinsicHeight();
	            if (v1_0 > this.j) {
	                float v4_3 = (((float) this.j) / ((float) v1_0));
	                v1_0 = this.j;
	                v0_0 = ((int) (((float) v0_0) * v4_3));
	            }
	            if (v0_0 > this.j) {
	                float v4_7 = (((float) this.j) / ((float) v0_0));
	                v0_0 = this.j;
	                v1_0 = ((int) (((float) v1_0) * v4_7));
	            }
	            v3.setBounds(0, 0, v1_0, v0_0);
	        }
	        pt v0_8;
	        this.setCompoundDrawables(v3, 0, 0, 0);
	        this.f();
	        this.d = p7.a(this);
	        this.setContentDescription(this.d);
	        this.f();
	        this.setId(p7.getItemId());
	        if (!p7.isVisible()) {
	            v0_8 = 8;
	        } else {
	            v0_8 = 0;
	        }
	        this.setVisibility(v0_8);
	        this.setEnabled(p7.isEnabled());
	        if ((p7.hasSubMenu()) && (this.f == null)) {
	            this.f = new pt(this);
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        return 1;
	    }
	
	
	    public final boolean c()
	    {
	        int v0_2;
	        if (android.text.TextUtils.isEmpty(this.getText())) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean d()
	    {
	        if ((!this.c()) || (this.c.getIcon() != null)) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final boolean e()
	    {
	        return this.c();
	    }
	
	
	    public void onClick(android.view.View p3)
	    {
	        if (this.a != null) {
	            this.a.a(this.c);
	        }
	        return;
	    }
	
	
	    public void onConfigurationChanged(android.content.res.Configuration p3)
	    {
	        if (android.os.Build$VERSION.SDK_INT >= 8) {
	            super.onConfigurationChanged(p3);
	        }
	        this.g = this.getContext().getResources().getBoolean(a.W);
	        this.f();
	        return;
	    }
	
	
	    public boolean onLongClick(android.view.View p10)
	    {
	        int v0_6;
	        if (!this.c()) {
	            int v0_2 = new int[2];
	            int v3_1 = new android.graphics.Rect();
	            this.getLocationOnScreen(v0_2);
	            this.getWindowVisibleDisplayFrame(v3_1);
	            android.widget.Toast v4_0 = this.getContext();
	            CharSequence v5_0 = this.getWidth();
	            int v6 = this.getHeight();
	            int v7_1 = (v0_2[1] + (v6 / 2));
	            int v0_4 = (v0_2[0] + (v5_0 / 2));
	            if (gt.g(p10) == 0) {
	                v0_4 = (v4_0.getResources().getDisplayMetrics().widthPixels - v0_4);
	            }
	            android.widget.Toast v4_1 = android.widget.Toast.makeText(v4_0, this.c.getTitle(), 0);
	            if (v7_1 >= v3_1.height()) {
	                v4_1.setGravity(81, 0, v6);
	            } else {
	                v4_1.setGravity(8388661, v0_4, v6);
	            }
	            v4_1.show();
	            v0_6 = 1;
	        } else {
	            v0_6 = 0;
	        }
	        return v0_6;
	    }
	
	
	    protected void onMeasure(int p7, int p8)
	    {
	        int v1_0 = this.c();
	        if ((v1_0 != 0) && (this.i >= 0)) {
	            super.setPadding(this.i, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
	        }
	        int v0_3;
	        super.onMeasure(p7, p8);
	        int v2_1 = android.view.View$MeasureSpec.getMode(p7);
	        int v0_2 = android.view.View$MeasureSpec.getSize(p7);
	        int v3_1 = this.getMeasuredWidth();
	        if (v2_1 != -2147483648) {
	            v0_3 = this.h;
	        } else {
	            v0_3 = Math.min(v0_2, this.h);
	        }
	        if ((v2_1 != 1073741824) && ((this.h > 0) && (v3_1 < v0_3))) {
	            super.onMeasure(android.view.View$MeasureSpec.makeMeasureSpec(v0_3, 1073741824), p8);
	        }
	        if ((v1_0 == 0) && (this.e != null)) {
	            super.setPadding(((this.getMeasuredWidth() - this.e.getBounds().width()) / 2), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
	        }
	        return;
	    }
	
	
	    public boolean onTouchEvent(android.view.MotionEvent p2)
	    {
	        if ((!this.c.hasSubMenu()) || ((this.f == null) || (!this.f.onTouch(this, p2)))) {
	            int v0_5 = super.onTouchEvent(p2);
	        } else {
	            v0_5 = 1;
	        }
	        return v0_5;
	    }
	
	
	    public void setPadding(int p1, int p2, int p3, int p4)
	    {
	        this.i = p1;
	        super.setPadding(p1, p2, p3, p4);
	        return;
	    }
	
