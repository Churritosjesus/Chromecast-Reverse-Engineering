	
	    la()
	    {
	        return;
	    }
	
	
	    public final android.view.WindowInsets onApplyWindowInsets(android.view.View p2, android.view.WindowInsets p3)
	    {
	        android.view.WindowInsets v0_1;
	        if (p3.getSystemWindowInsetTop() <= 0) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        ((lb) p2).a(p3, v0_1);
	        return p3.consumeSystemWindowInsets();
	    }
	
