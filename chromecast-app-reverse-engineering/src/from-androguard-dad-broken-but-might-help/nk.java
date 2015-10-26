	private synthetic ni a
	
	    nk(ni p1, android.view.Window$Callback p2)
	    {
	        this.a = p1;
	        this(p2);
	        return;
	    }
	
	
	    public boolean dispatchKeyEvent(android.view.KeyEvent p2)
	    {
	        boolean v0_2;
	        if (!this.a.a(p2)) {
	            v0_2 = super.dispatchKeyEvent(p2);
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p3)
	    {
	        boolean v0_2;
	        if (!this.a.a(p3.getKeyCode(), p3)) {
	            v0_2 = super.dispatchKeyShortcutEvent(p3);
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void onContentChanged()
	    {
	        return;
	    }
	
	
	    public boolean onCreatePanelMenu(int p2, android.view.Menu p3)
	    {
	        if ((p2 != 0) || ((p3 instanceof qa))) {
	            int v0_1 = super.onCreatePanelMenu(p2, p3);
	        } else {
	            v0_1 = 0;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onMenuOpened(int p2, android.view.Menu p3)
	    {
	        boolean v0_2;
	        if (!this.a.d(p2)) {
	            v0_2 = super.onMenuOpened(p2, p3);
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public void onPanelClosed(int p2, android.view.Menu p3)
	    {
	        if (!this.a.c(p2)) {
	            super.onPanelClosed(p2, p3);
	        }
	        return;
	    }
	
	
	    public boolean onPreparePanel(int p4, android.view.View p5, android.view.Menu p6)
	    {
	        int v2;
	        if (!(p6 instanceof qa)) {
	            v2 = 0;
	        } else {
	            v2 = ((qa) p6);
	        }
	        if ((p4 != 0) || (v2 != 0)) {
	            if (v2 != 0) {
	                v2.j = 1;
	            }
	            boolean v0_5 = super.onPreparePanel(p4, p5, p6);
	            if (v2 != 0) {
	                v2.j = 0;
	            }
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
