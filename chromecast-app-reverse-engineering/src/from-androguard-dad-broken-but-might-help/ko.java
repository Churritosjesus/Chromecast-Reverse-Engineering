	private final android.graphics.Rect b
	private synthetic android.support.v4.widget.DrawerLayout c
	
	    public ko(android.support.v4.widget.DrawerLayout p2)
	    {
	        this.c = p2;
	        this.b = new android.graphics.Rect();
	        return;
	    }
	
	
	    public final void a(android.view.View p7, jd p8)
	    {
	        if (!android.support.v4.widget.DrawerLayout.b()) {
	            int v2_0 = jd.a(p8);
	            super.a(p7, v2_0);
	            jd.a.c(p8.b, p7);
	            int v0_2 = gt.h(p7);
	            if ((v0_2 instanceof android.view.View)) {
	                p8.a(((android.view.View) v0_2));
	            }
	            int v0_4 = this.b;
	            v2_0.a(v0_4);
	            jd.a.c(p8.b, v0_4);
	            v2_0.b(v0_4);
	            jd.a.d(p8.b, v0_4);
	            jd.a.h(p8.b, jd.a.r(v2_0.b));
	            jd.a.c(p8.b, v2_0.h());
	            p8.a(v2_0.i());
	            jd.a.b(p8.b, v2_0.j());
	            jd.a.b(p8.b, v2_0.g());
	            jd.a.a(p8.b, v2_0.e());
	            p8.a(v2_0.b());
	            p8.b(v2_0.c());
	            jd.a.i(p8.b, jd.a.s(v2_0.b));
	            jd.a.g(p8.b, v2_0.d());
	            jd.a.e(p8.b, v2_0.f());
	            p8.a(v2_0.a());
	            jd.a.q(v2_0.b);
	            int v2_2 = ((android.view.ViewGroup) p7).getChildCount();
	            int v0_20 = 0;
	            while (v0_20 < v2_2) {
	                android.view.View v3_14 = ((android.view.ViewGroup) p7).getChildAt(v0_20);
	                if (android.support.v4.widget.DrawerLayout.i(v3_14)) {
	                    jd.a.a(p8.b, v3_14);
	                }
	                v0_20++;
	            }
	        } else {
	            super.a(p7, p8);
	        }
	        p8.a(android.support.v4.widget.DrawerLayout.getName());
	        p8.a(0);
	        p8.b(0);
	        return;
	    }
	
	
	    public final boolean a(android.view.ViewGroup p2, android.view.View p3, android.view.accessibility.AccessibilityEvent p4)
	    {
	        if ((!android.support.v4.widget.DrawerLayout.b()) && (!android.support.v4.widget.DrawerLayout.i(p3))) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = super.a(p2, p3, p4);
	        }
	        return v0_2;
	    }
	
	
	    public final boolean b(android.view.View p4, android.view.accessibility.AccessibilityEvent p5)
	    {
	        int v0_1;
	        if (p5.getEventType() != 32) {
	            v0_1 = super.b(p4, p5);
	        } else {
	            int v0_2 = p5.getText();
	            int v1_2 = android.support.v4.widget.DrawerLayout.a(this.c);
	            if (v1_2 != 0) {
	                // Both branches of the condition point to the same code.
	                // if (fe.a(this.c.c(v1_2), gt.g(this.c)) == 3) {
	                    if (0 != 0) {
	                        v0_2.add(0);
	                    }
	                // }
	            }
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public final void d(android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
	    {
	        super.d(p2, p3);
	        p3.setClassName(android.support.v4.widget.DrawerLayout.getName());
	        return;
	    }
	
