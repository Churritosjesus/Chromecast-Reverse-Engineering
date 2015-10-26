	private synthetic android.support.v4.view.ViewPager b
	
	    public hw(android.support.v4.view.ViewPager p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    private boolean a()
	    {
	        int v0 = 1;
	        if ((android.support.v4.view.ViewPager.a(this.b) == null) || (android.support.v4.view.ViewPager.a(this.b).a() <= 1)) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public final void a(android.view.View p3, jd p4)
	    {
	        super.a(p3, p4);
	        p4.a(android.support.v4.view.ViewPager.getName());
	        p4.c(this.a());
	        if (this.b.canScrollHorizontally(1)) {
	            p4.a(4096);
	        }
	        if (this.b.canScrollHorizontally(-1)) {
	            p4.a(8192);
	        }
	        return;
	    }
	
	
	    public final boolean a(android.view.View p5, int p6, android.os.Bundle p7)
	    {
	        android.support.v4.view.ViewPager v0 = 1;
	        if (!super.a(p5, p6, p7)) {
	            switch (p6) {
	                case 4096:
	                    if (!this.b.canScrollHorizontally(1)) {
	                        v0 = 0;
	                    } else {
	                        this.b.a((android.support.v4.view.ViewPager.b(this.b) + 1));
	                    }
	                    break;
	                case 8192:
	                    if (!this.b.canScrollHorizontally(-1)) {
	                        v0 = 0;
	                    } else {
	                        this.b.a((android.support.v4.view.ViewPager.b(this.b) - 1));
	                    }
	                    break;
	                default:
	                    v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final void d(android.view.View p4, android.view.accessibility.AccessibilityEvent p5)
	    {
	        super.d(p4, p5);
	        p5.setClassName(android.support.v4.view.ViewPager.getName());
	        jx v0_2 = jx.a();
	        v0_2.a(this.a());
	        if ((p5.getEventType() == 4096) && (android.support.v4.view.ViewPager.a(this.b) != null)) {
	            v0_2.a(android.support.v4.view.ViewPager.a(this.b).a());
	            v0_2.b(android.support.v4.view.ViewPager.b(this.b));
	            v0_2.c(android.support.v4.view.ViewPager.b(this.b));
	        }
	        return;
	    }
	
