	private android.view.Window$Callback a
	
	    public pr(android.view.Window$Callback p3)
	    {
	        if (p3 != null) {
	            this.a = p3;
	            return;
	        } else {
	            throw new IllegalArgumentException("Window callback may not be null");
	        }
	    }
	
	
	    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p2)
	    {
	        return this.a.dispatchGenericMotionEvent(p2);
	    }
	
	
	    public boolean dispatchKeyEvent(android.view.KeyEvent p2)
	    {
	        return this.a.dispatchKeyEvent(p2);
	    }
	
	
	    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p2)
	    {
	        return this.a.dispatchKeyShortcutEvent(p2);
	    }
	
	
	    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
	    {
	        return this.a.dispatchPopulateAccessibilityEvent(p2);
	    }
	
	
	    public boolean dispatchTouchEvent(android.view.MotionEvent p2)
	    {
	        return this.a.dispatchTouchEvent(p2);
	    }
	
	
	    public boolean dispatchTrackballEvent(android.view.MotionEvent p2)
	    {
	        return this.a.dispatchTrackballEvent(p2);
	    }
	
	
	    public void onActionModeFinished(android.view.ActionMode p2)
	    {
	        this.a.onActionModeFinished(p2);
	        return;
	    }
	
	
	    public void onActionModeStarted(android.view.ActionMode p2)
	    {
	        this.a.onActionModeStarted(p2);
	        return;
	    }
	
	
	    public void onAttachedToWindow()
	    {
	        this.a.onAttachedToWindow();
	        return;
	    }
	
	
	    public void onContentChanged()
	    {
	        this.a.onContentChanged();
	        return;
	    }
	
	
	    public boolean onCreatePanelMenu(int p2, android.view.Menu p3)
	    {
	        return this.a.onCreatePanelMenu(p2, p3);
	    }
	
	
	    public android.view.View onCreatePanelView(int p2)
	    {
	        return this.a.onCreatePanelView(p2);
	    }
	
	
	    public void onDetachedFromWindow()
	    {
	        this.a.onDetachedFromWindow();
	        return;
	    }
	
	
	    public boolean onMenuItemSelected(int p2, android.view.MenuItem p3)
	    {
	        return this.a.onMenuItemSelected(p2, p3);
	    }
	
	
	    public boolean onMenuOpened(int p2, android.view.Menu p3)
	    {
	        return this.a.onMenuOpened(p2, p3);
	    }
	
	
	    public void onPanelClosed(int p2, android.view.Menu p3)
	    {
	        this.a.onPanelClosed(p2, p3);
	        return;
	    }
	
	
	    public boolean onPreparePanel(int p2, android.view.View p3, android.view.Menu p4)
	    {
	        return this.a.onPreparePanel(p2, p3, p4);
	    }
	
	
	    public boolean onSearchRequested()
	    {
	        return this.a.onSearchRequested();
	    }
	
	
	    public void onWindowAttributesChanged(android.view.WindowManager$LayoutParams p2)
	    {
	        this.a.onWindowAttributesChanged(p2);
	        return;
	    }
	
	
	    public void onWindowFocusChanged(boolean p2)
	    {
	        this.a.onWindowFocusChanged(p2);
	        return;
	    }
	
	
	    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode$Callback p2)
	    {
	        return this.a.onWindowStartingActionMode(p2);
	    }
	
