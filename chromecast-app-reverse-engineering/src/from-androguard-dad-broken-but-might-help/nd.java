	private mx a
	
	    public nd(android.content.Context p4, int p5)
	    {
	        this(p4, nd.a(p4, p5));
	        this.a = new mx(this.getContext(), this, this.getWindow());
	        return;
	    }
	
	
	    static int a(android.content.Context p4, int p5)
	    {
	        if (p5 < 16777216) {
	            android.util.TypedValue v0_2 = new android.util.TypedValue();
	            p4.getTheme().resolveAttribute(a.v, v0_2, 1);
	            p5 = v0_2.resourceId;
	        }
	        return p5;
	    }
	
	
	    public static synthetic mx a(nd p1)
	    {
	        return p1.a;
	    }
	
	
	    protected final void onCreate(android.os.Bundle p14)
	    {
	        int v2_0 = 0;
	        super.onCreate(p14);
	        mx v5 = this.a;
	        v5.b.a().b(1);
	        v5.b.setContentView(v5.F);
	        android.content.res.TypedArray v0_5 = ((android.view.ViewGroup) v5.c.findViewById(a.ba));
	        v5.w = ((android.widget.ScrollView) v5.c.findViewById(a.bk));
	        v5.w.setFocusable(0);
	        v5.B = ((android.widget.TextView) v5.c.findViewById(16908299));
	        if (v5.B != null) {
	            if (v5.e == null) {
	                v5.B.setVisibility(8);
	                v5.w.removeView(v5.B);
	                if (v5.f == null) {
	                    v0_5.setVisibility(8);
	                } else {
	                    android.content.res.TypedArray v0_8 = ((android.view.ViewGroup) v5.w.getParent());
	                    int v1_15 = v0_8.indexOfChild(v5.w);
	                    v0_8.removeViewAt(v1_15);
	                    v0_8.addView(v5.f, v1_15, new android.view.ViewGroup$LayoutParams(-1, -1));
	                }
	            } else {
	                v5.B.setText(v5.e);
	            }
	        }
	        int v1_20;
	        v5.n = ((android.widget.Button) v5.c.findViewById(16908313));
	        v5.n.setOnClickListener(v5.L);
	        if (!android.text.TextUtils.isEmpty(v5.o)) {
	            v5.n.setText(v5.o);
	            v5.n.setVisibility(0);
	            v1_20 = 1;
	        } else {
	            v5.n.setVisibility(8);
	            v1_20 = 0;
	        }
	        v5.q = ((android.widget.Button) v5.c.findViewById(16908314));
	        v5.q.setOnClickListener(v5.L);
	        if (!android.text.TextUtils.isEmpty(v5.r)) {
	            v5.q.setText(v5.r);
	            v5.q.setVisibility(0);
	            v1_20 |= 2;
	        } else {
	            v5.q.setVisibility(8);
	        }
	        v5.t = ((android.widget.Button) v5.c.findViewById(16908315));
	        v5.t.setOnClickListener(v5.L);
	        if (!android.text.TextUtils.isEmpty(v5.u)) {
	            v5.t.setText(v5.u);
	            v5.t.setVisibility(0);
	            v1_20 |= 4;
	        } else {
	            v5.t.setVisibility(8);
	        }
	        android.content.res.TypedArray v0_40;
	        android.content.res.TypedArray v0_37 = v5.a;
	        int v4_11 = new android.util.TypedValue();
	        v0_37.getTheme().resolveAttribute(a.t, v4_11, 1);
	        if (v4_11.data == 0) {
	            v0_40 = 0;
	        } else {
	            v0_40 = 1;
	        }
	        if (v0_40 != null) {
	            if (v1_20 != 1) {
	                if (v1_20 != 2) {
	                    if (v1_20 == 4) {
	                        mx.a(v5.t);
	                    }
	                } else {
	                    mx.a(v5.q);
	                }
	            } else {
	                mx.a(v5.n);
	            }
	        }
	        int v4_12;
	        if (v1_20 == 0) {
	            v4_12 = 0;
	        } else {
	            v4_12 = 1;
	        }
	        android.content.res.TypedArray v0_48 = ((android.view.ViewGroup) v5.c.findViewById(a.bz));
	        th v6_4 = th.a(v5.a, 0, oq.H, a.u, 0);
	        if (v5.C == null) {
	            int v1_29;
	            v5.z = ((android.widget.ImageView) v5.c.findViewById(16908294));
	            if (android.text.TextUtils.isEmpty(v5.d)) {
	                v1_29 = 0;
	            } else {
	                v1_29 = 1;
	            }
	            if (v1_29 == 0) {
	                v5.c.findViewById(a.by).setVisibility(8);
	                v5.z.setVisibility(8);
	                v0_48.setVisibility(8);
	            } else {
	                v5.A = ((android.widget.TextView) v5.c.findViewById(a.aY));
	                v5.A.setText(v5.d);
	                if (v5.x == 0) {
	                    if (v5.y == null) {
	                        v5.A.setPadding(v5.z.getPaddingLeft(), v5.z.getPaddingTop(), v5.z.getPaddingRight(), v5.z.getPaddingBottom());
	                        v5.z.setVisibility(8);
	                    } else {
	                        v5.z.setImageDrawable(v5.y);
	                    }
	                } else {
	                    v5.z.setImageResource(v5.x);
	                }
	            }
	        } else {
	            v0_48.addView(v5.C, 0, new android.view.ViewGroup$LayoutParams(-1, -2));
	            v5.c.findViewById(a.by).setVisibility(8);
	        }
	        android.content.res.TypedArray v0_62 = v5.c.findViewById(a.aZ);
	        if (v4_12 == 0) {
	            v0_62.setVisibility(8);
	            android.content.res.TypedArray v0_64 = v5.c.findViewById(a.bw);
	            if (v0_64 != null) {
	                v0_64.setVisibility(0);
	            }
	        }
	        int v4_13;
	        android.content.res.TypedArray v0_67 = ((android.widget.FrameLayout) v5.c.findViewById(a.bc));
	        if (v5.g == null) {
	            if (v5.h == 0) {
	                v4_13 = 0;
	            } else {
	                v4_13 = android.view.LayoutInflater.from(v5.a).inflate(v5.h, v0_67, 0);
	            }
	        } else {
	            v4_13 = v5.g;
	        }
	        if (v4_13 != 0) {
	            v2_0 = 1;
	        }
	        if ((v2_0 == 0) || (!mx.a(v4_13))) {
	            v5.c.setFlags(131072, 131072);
	        }
	        if (v2_0 == 0) {
	            v0_67.setVisibility(8);
	        } else {
	            int v1_56 = ((android.widget.FrameLayout) v5.c.findViewById(a.bb));
	            v1_56.addView(v4_13, new android.view.ViewGroup$LayoutParams(-1, -1));
	            if (v5.m) {
	                v1_56.setPadding(v5.i, v5.j, v5.k, v5.l);
	            }
	            if (v5.f != null) {
	                ((android.widget.LinearLayout$LayoutParams) v0_67.getLayoutParams()).weight = 0;
	            }
	        }
	        android.content.res.TypedArray v0_70 = v5.f;
	        if ((v0_70 != null) && (v5.D != null)) {
	            v0_70.setAdapter(v5.D);
	            int v1_61 = v5.E;
	            if (v1_61 >= 0) {
	                v0_70.setItemChecked(v1_61, 1);
	                v0_70.setSelection(v1_61);
	            }
	        }
	        v6_4.a.recycle();
	        return;
	    }
	
	
	    public final boolean onKeyDown(int p4, android.view.KeyEvent p5)
	    {
	        int v1_3;
	        boolean v0 = 1;
	        int v1_0 = this.a;
	        if ((v1_0.w == null) || (!v1_0.w.executeKeyEvent(p5))) {
	            v1_3 = 0;
	        } else {
	            v1_3 = 1;
	        }
	        if (v1_3 == 0) {
	            v0 = super.onKeyDown(p4, p5);
	        }
	        return v0;
	    }
	
	
	    public final boolean onKeyUp(int p4, android.view.KeyEvent p5)
	    {
	        int v1_3;
	        boolean v0 = 1;
	        int v1_0 = this.a;
	        if ((v1_0.w == null) || (!v1_0.w.executeKeyEvent(p5))) {
	            v1_3 = 0;
	        } else {
	            v1_3 = 1;
	        }
	        if (v1_3 == 0) {
	            v0 = super.onKeyUp(p4, p5);
	        }
	        return v0;
	    }
	
	
	    public final void setTitle(CharSequence p2)
	    {
	        super.setTitle(p2);
	        this.a.a(p2);
	        return;
	    }
	
