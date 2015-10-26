	private final android.content.Context b
	private final Ldbg c
	private final java.lang.String d
	private final  e
	private final  f
	private final  g
	
	    public axx(android.content.Context p2, dbf p3, int p4, int p5)
	    {
	        this.b = p2;
	        this.c = p3.g;
	        this.d = p3.e;
	        this.e = p4;
	        this.f = p5;
	        this.g = p3.f;
	        return;
	    }
	
	
	    public final int a()
	    {
	        return this.c.length;
	    }
	
	
	    public final synthetic zr a(android.view.ViewGroup p6, int p7)
	    {
	        android.view.View v0_1;
	        if (this.g != 2) {
	            v0_1 = a.fQ;
	        } else {
	            v0_1 = a.ge;
	        }
	        return new axo(this.b, android.view.LayoutInflater.from(this.b).inflate(v0_1, p6, 0), this.e, this.f);
	    }
	
	
	    public final synthetic void a(zr p11, int p12)
	    {
	        dbg v6 = this.c[p12];
	        String v7 = this.d;
	        if ((v6 != null) && ((v6.a != null) && (!android.text.TextUtils.isEmpty(v6.a.a)))) {
	            ((axo) p11).a.setVisibility(0);
	            blx.a(((axo) p11).m, v6.b);
	            blx.a(((axo) p11).n, v6.c);
	            blx.a(((axo) p11).p, v6.j);
	            blx.a(((axo) p11).q, v6.e);
	            if (!android.text.TextUtils.isEmpty(v6.e)) {
	                android.view.View v0_12 = ((axo) p11).q;
	                axp v1_5 = ((axo) p11).q.getContext();
	                int v4_0 = new Object[1];
	                v4_0[0] = v6.e;
	                v0_12.setContentDescription(v1_5.getString(b.C, v4_0));
	            }
	            if (((axo) p11).p != null) {
	                android.view.View v0_15 = ((axo) p11).a.getResources();
	                if ((v6.i != 2) && (v6.i != 3)) {
	                    ((axo) p11).p.setTextColor(v0_15.getColor(a.dm));
	                } else {
	                    ((axo) p11).p.setTextColor(v0_15.getColor(a.dt));
	                }
	            }
	            if ((!android.text.TextUtils.isEmpty(v6.j)) && (!android.text.TextUtils.isEmpty(v6.d))) {
	                axp v1_11 = ((axo) p11).o;
	                android.view.View v0_23 = String.valueOf(v6.d);
	                if (v0_23.length() == 0) {
	                    android.view.View v0_25 = new String(" \u00b7 ");
	                } else {
	                    v0_25 = " \u00b7 ".concat(v0_23);
	                }
	            } else {
	                v1_11 = ((axo) p11).o;
	                v0_25 = v6.d;
	            }
	            blx.a(v1_11, v0_25);
	            if ((!android.text.TextUtils.isEmpty(v6.c)) && (((axo) p11).n != null)) {
	                ((axo) p11).m.setLines(1);
	                ((axo) p11).n.setLines(1);
	            } else {
	                ((axo) p11).m.setLines(2);
	            }
	            if ((v6.a.b == null) || (v6.a.c == null)) {
	                int v4_2 = -2;
	            } else {
	                v4_2 = ((((axo) p11).r * v6.a.b.intValue()) / v6.a.c.intValue());
	            }
	            ((axo) p11).l.setImageDrawable(0);
	            android.view.View v0_39 = new Object[1];
	            v0_39[0] = v6.a.a;
	            ((axo) p11).l.a(atf.a(((axo) p11).k).m, v6.a.a, 1, v4_2, ((axo) p11).r);
	            ((axo) p11).a.setOnClickListener(new axp(((axo) p11), v6, v7));
	        } else {
	            ((axo) p11).a.setVisibility(8);
	        }
	        return;
	    }
	
