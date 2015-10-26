	private static java.lang.reflect.Field b
	private static  c
	
	    static gy()
	    {
	        gy.c = 0;
	        return;
	    }
	
	
	    gy()
	    {
	        return;
	    }
	
	
	    public final void a(android.view.View p2, er p3)
	    {
	        android.view.View$AccessibilityDelegate v0_0;
	        if (p3 != null) {
	            v0_0 = p3.a;
	        } else {
	            v0_0 = 0;
	        }
	        p2.setAccessibilityDelegate(((android.view.View$AccessibilityDelegate) v0_0));
	        return;
	    }
	
	
	    public final boolean a(android.view.View p2, int p3)
	    {
	        return p2.canScrollHorizontally(p3);
	    }
	
	
	    public final boolean b(android.view.View p5)
	    {
	        int v0 = 0;
	        if (!gy.c) {
	            if (gy.b == null) {
	                try {
	                    Throwable v2_3 = android.view.View.getDeclaredField("mAccessibilityDelegate");
	                    gy.b = v2_3;
	                    v2_3.setAccessible(1);
	                } catch (Throwable v2) {
	                    gy.c = 1;
	                    return v0;
	                }
	                if (gy.b.get(p5) != null) {
	                    v0 = 1;
	                }
	                return v0;
	            }
	            try {
	            } catch (Throwable v2) {
	                gy.c = 1;
	            }
	        }
	        return v0;
	    }
	
	
	    public final boolean b(android.view.View p2, int p3)
	    {
	        return p2.canScrollVertically(p3);
	    }
	
	
	    public final ih o(android.view.View p3)
	    {
	        if (this.a == null) {
	            this.a = new java.util.WeakHashMap();
	        }
	        ih v0_5 = ((ih) this.a.get(p3));
	        if (v0_5 == null) {
	            v0_5 = new ih(p3);
	            this.a.put(p3, v0_5);
	        }
	        return v0_5;
	    }
	
