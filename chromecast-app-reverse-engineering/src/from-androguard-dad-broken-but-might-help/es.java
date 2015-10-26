	
	    es()
	    {
	        return;
	    }
	
	
	    public final Object a()
	    {
	        return new android.view.View$AccessibilityDelegate();
	    }
	
	
	    public Object a(er p3)
	    {
	        return new ex(new et(this, p3));
	    }
	
	
	    public final void a(Object p1, android.view.View p2, int p3)
	    {
	        ((android.view.View$AccessibilityDelegate) p1).sendAccessibilityEvent(p2, p3);
	        return;
	    }
	
	
	    public final void a(Object p2, android.view.View p3, jd p4)
	    {
	        ((android.view.View$AccessibilityDelegate) p2).onInitializeAccessibilityNodeInfo(p3, ((android.view.accessibility.AccessibilityNodeInfo) p4.b));
	        return;
	    }
	
	
	    public final boolean a(Object p2, android.view.View p3, android.view.accessibility.AccessibilityEvent p4)
	    {
	        return ((android.view.View$AccessibilityDelegate) p2).dispatchPopulateAccessibilityEvent(p3, p4);
	    }
	
	
	    public final boolean a(Object p2, android.view.ViewGroup p3, android.view.View p4, android.view.accessibility.AccessibilityEvent p5)
	    {
	        return ((android.view.View$AccessibilityDelegate) p2).onRequestSendAccessibilityEvent(p3, p4, p5);
	    }
	
	
	    public final void b(Object p1, android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
	    {
	        ((android.view.View$AccessibilityDelegate) p1).onInitializeAccessibilityEvent(p2, p3);
	        return;
	    }
	
	
	    public final void c(Object p1, android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
	    {
	        ((android.view.View$AccessibilityDelegate) p1).onPopulateAccessibilityEvent(p2, p3);
	        return;
	    }
	
	
	    public final void d(Object p1, android.view.View p2, android.view.accessibility.AccessibilityEvent p3)
	    {
	        ((android.view.View$AccessibilityDelegate) p1).sendAccessibilityEventUnchecked(p2, p3);
	        return;
	    }
	
