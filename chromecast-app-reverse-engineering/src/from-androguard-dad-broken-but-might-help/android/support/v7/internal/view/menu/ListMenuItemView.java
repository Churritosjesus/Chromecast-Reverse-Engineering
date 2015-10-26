	public  a
	public  b
	private qe c
	private android.widget.ImageView d
	private android.widget.RadioButton e
	private android.widget.TextView f
	private android.widget.CheckBox g
	private android.widget.TextView h
	private android.graphics.drawable.Drawable i
	private  j
	private android.content.Context k
	private android.content.Context l
	private android.view.LayoutInflater m
	
	    public ListMenuItemView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public ListMenuItemView(android.content.Context p5, android.util.AttributeSet p6, int p7)
	    {
	        this(p5, p6);
	        this.l = p5;
	        android.content.res.TypedArray v0_1 = p5.obtainStyledAttributes(p6, oq.aP, p7, 0);
	        this.i = v0_1.getDrawable(oq.aQ);
	        this.j = v0_1.getResourceId(oq.aR, -1);
	        this.a = v0_1.getBoolean(oq.aS, 0);
	        this.k = p5;
	        v0_1.recycle();
	        return;
	    }
	
	
	    private android.view.LayoutInflater c()
	    {
	        if (this.m == null) {
	            this.m = android.view.LayoutInflater.from(this.l);
	        }
	        return this.m;
	    }
	
	
	    public final qe a()
	    {
	        return this.c;
	    }
	
	
	    public final void a(qe p8, int p9)
	    {
	        android.widget.ImageView v0_1;
	        this.c = p8;
	        if (!p8.isVisible()) {
	            v0_1 = 8;
	        } else {
	            v0_1 = 0;
	        }
	        this.setVisibility(v0_1);
	        android.widget.ImageView v0_2 = p8.a(this);
	        if (v0_2 == null) {
	            if (this.f.getVisibility() != 8) {
	                this.f.setVisibility(8);
	            }
	        } else {
	            this.f.setText(v0_2);
	            if (this.f.getVisibility() != 0) {
	                this.f.setVisibility(0);
	            }
	        }
	        int v6_0 = p8.isCheckable();
	        if ((v6_0 != 0) || ((this.e != null) || (this.g != null))) {
	            int v5_0;
	            android.graphics.drawable.Drawable v3_3;
	            if (!this.c.e()) {
	                if (this.g == null) {
	                    this.g = ((android.widget.CheckBox) this.c().inflate(a.bJ, this, 0));
	                    this.addView(this.g);
	                }
	                v5_0 = this.g;
	                v3_3 = this.e;
	            } else {
	                if (this.e == null) {
	                    this.e = ((android.widget.RadioButton) this.c().inflate(a.bM, this, 0));
	                    this.addView(this.e);
	                }
	                v5_0 = this.e;
	                v3_3 = this.g;
	            }
	            if (v6_0 == 0) {
	                if (this.g != null) {
	                    this.g.setVisibility(8);
	                }
	                if (this.e != null) {
	                    this.e.setVisibility(8);
	                }
	            } else {
	                android.widget.ImageView v0_31;
	                v5_0.setChecked(this.c.isChecked());
	                if (v6_0 == 0) {
	                    v0_31 = 8;
	                } else {
	                    v0_31 = 0;
	                }
	                if (v5_0.getVisibility() != v0_31) {
	                    v5_0.setVisibility(v0_31);
	                }
	                if ((v3_3 != null) && (v3_3.getVisibility() != 8)) {
	                    v3_3.setVisibility(8);
	                }
	            }
	        }
	        android.graphics.drawable.Drawable v3_6;
	        android.widget.ImageView v0_33 = p8.d();
	        p8.c();
	        if ((v0_33 == null) || (!this.c.d())) {
	            v3_6 = 8;
	        } else {
	            v3_6 = 0;
	        }
	        if (v3_6 == null) {
	            android.widget.ImageView v0_38;
	            int v5_1 = this.h;
	            android.widget.ImageView v0_37 = this.c.c();
	            if (v0_37 != null) {
	                int v6_3 = new StringBuilder(0);
	                switch (v0_37) {
	                    case 8:
	                        v6_3.append(0);
	                        break;
	                    case 10:
	                        v6_3.append(0);
	                        break;
	                    case 32:
	                        v6_3.append(0);
	                        break;
	                    default:
	                        v6_3.append(v0_37);
	                }
	                v0_38 = v6_3.toString();
	            } else {
	                v0_38 = "";
	            }
	            v5_1.setText(v0_38);
	        }
	        if (this.h.getVisibility() != v3_6) {
	            this.h.setVisibility(v3_6);
	        }
	        int v5_2;
	        android.graphics.drawable.Drawable v3_7 = p8.getIcon();
	        if (!this.b) {
	            v5_2 = 0;
	        } else {
	            v5_2 = 1;
	        }
	        if (((v5_2 != 0) || (this.a)) && ((this.d != null) || ((v3_7 != null) || (this.a)))) {
	            if (this.d == null) {
	                this.d = ((android.widget.ImageView) this.c().inflate(a.bK, this, 0));
	                this.addView(this.d, 0);
	            }
	            if ((v3_7 == null) && (!this.a)) {
	                this.d.setVisibility(8);
	            } else {
	                android.widget.ImageView v0_55;
	                if (v5_2 == 0) {
	                    v0_55 = 0;
	                } else {
	                    v0_55 = v3_7;
	                }
	                this.d.setImageDrawable(v0_55);
	                if (this.d.getVisibility() != 0) {
	                    this.d.setVisibility(0);
	                }
	            }
	        }
	        this.setEnabled(p8.isEnabled());
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        return 0;
	    }
	
	
	    protected void onFinishInflate()
	    {
	        super.onFinishInflate();
	        this.setBackgroundDrawable(this.i);
	        this.f = ((android.widget.TextView) this.findViewById(a.bx));
	        if (this.j != -1) {
	            this.f.setTextAppearance(this.k, this.j);
	        }
	        this.h = ((android.widget.TextView) this.findViewById(a.bt));
	        return;
	    }
	
	
	    protected void onMeasure(int p4, int p5)
	    {
	        if ((this.d != null) && (this.a)) {
	            int v1_0 = this.getLayoutParams();
	            android.widget.LinearLayout$LayoutParams v0_4 = ((android.widget.LinearLayout$LayoutParams) this.d.getLayoutParams());
	            if ((v1_0.height > 0) && (v0_4.width <= 0)) {
	                v0_4.width = v1_0.height;
	            }
	        }
	        super.onMeasure(p4, p5);
	        return;
	    }
	
