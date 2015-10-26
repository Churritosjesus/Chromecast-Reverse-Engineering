	 android.view.Menu a
	  b
	  c
	  d
	  e
	  f
	  g
	  h
	  i
	  j
	 java.lang.CharSequence k
	 java.lang.CharSequence l
	  m
	  n
	  o
	  p
	  q
	  r
	  s
	  t
	  u
	 java.lang.String v
	 java.lang.String w
	 java.lang.String x
	 fb y
	final synthetic pm z
	
	    public po(pm p1, android.view.Menu p2)
	    {
	        this.z = p1;
	        this.a = p2;
	        this.a();
	        return;
	    }
	
	
	    static char a(String p1)
	    {
	        char v0 = 0;
	        if (p1 != null) {
	            v0 = p1.charAt(0);
	        }
	        return v0;
	    }
	
	
	    Object a(String p5, Class[] p6, Object[] p7)
	    {
	        try {
	            int v0_5 = pm.a(this.z).getClassLoader().loadClass(p5).getConstructor(p6).newInstance(p7);
	        } catch (int v0_6) {
	            android.util.Log.w("SupportMenuInflater", new StringBuilder("Cannot instantiate class: ").append(p5).toString(), v0_6);
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    public final void a()
	    {
	        this.b = 0;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = 1;
	        this.g = 1;
	        return;
	    }
	
	
	    void a(android.view.MenuItem p9)
	    {
	        fb v0_4;
	        Object[] v2 = 1;
	        String v1_2 = p9.setChecked(this.q).setVisible(this.r).setEnabled(this.s);
	        if (this.p <= 0) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        v1_2.setCheckable(v0_4).setTitleCondensed(this.l).setIcon(this.m).setAlphabeticShortcut(this.n).setNumericShortcut(this.o);
	        if (this.t >= 0) {
	            fx.a(p9, this.t);
	        }
	        if (this.x != null) {
	            if (!pm.a(this.z).isRestricted()) {
	                p9.setOnMenuItemClickListener(new pn(pm.b(this.z), this.x));
	            } else {
	                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
	            }
	        }
	        if (this.p >= 2) {
	            if (!(p9 instanceof qe)) {
	                if ((p9 instanceof qg)) {
	                    try {
	                        if (((qg) p9).e == null) {
	                            String v1_13 = ((cd) ((qg) p9).d).getClass();
	                            int v5_1 = new Class[1];
	                            v5_1[0] = Boolean.TYPE;
	                            ((qg) p9).e = v1_13.getDeclaredMethod("setExclusiveCheckable", v5_1);
	                        }
	                    } catch (fb v0_22) {
	                        android.util.Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", v0_22);
	                    }
	                    String v1_16 = ((qg) p9).e;
	                    fb v0_23 = ((qg) p9).d;
	                    Object[] v4_4 = new Object[1];
	                    v4_4[0] = Boolean.valueOf(1);
	                    v1_16.invoke(v0_23, v4_4);
	                }
	            } else {
	                ((qe) p9).a(1);
	            }
	        }
	        if (this.v == null) {
	            v2 = 0;
	        } else {
	            fx.a(p9, ((android.view.View) this.a(this.v, pm.a(), pm.c(this.z))));
	        }
	        if (this.u > 0) {
	            if (v2 != null) {
	                android.util.Log.w("SupportMenuInflater", "Ignoring attribute \'itemActionViewLayout\'. Action view already specified.");
	            } else {
	                fx.b(p9, this.u);
	            }
	        }
	        if (this.y != null) {
	            fx.a(p9, this.y);
	        }
	        return;
	    }
	
	
	    public final android.view.SubMenu b()
	    {
	        this.h = 1;
	        android.view.SubMenu v0_2 = this.a.addSubMenu(this.b, this.i, this.j, this.k);
	        this.a(v0_2.getItem());
	        return v0_2;
	    }
	
