	 android.support.v7.widget.SearchView a
	private  b
	
	    public SearchView$SearchAutoComplete(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public SearchView$SearchAutoComplete(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.w);
	        return;
	    }
	
	
	    public SearchView$SearchAutoComplete(android.content.Context p2, android.util.AttributeSet p3, int p4)
	    {
	        this(p2, p3, p4);
	        this.b = this.getThreshold();
	        return;
	    }
	
	
	    public static synthetic boolean a(android.support.v7.widget.SearchView$SearchAutoComplete p1)
	    {
	        int v0_2;
	        if (android.text.TextUtils.getTrimmedLength(p1.getText()) != 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public boolean enoughToFilter()
	    {
	        if ((this.b > 0) && (!super.enoughToFilter())) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    protected void onFocusChanged(boolean p2, int p3, android.graphics.Rect p4)
	    {
	        super.onFocusChanged(p2, p3, p4);
	        this.a.e();
	        return;
	    }
	
	
	    public boolean onKeyPreIme(int p4, android.view.KeyEvent p5)
	    {
	        boolean v0 = 1;
	        if (p4 != 4) {
	            v0 = super.onKeyPreIme(p4, p5);
	        } else {
	            if ((p5.getAction() != 0) || (p5.getRepeatCount() != 0)) {
	                if (p5.getAction() != 1) {
	                } else {
	                    android.support.v7.widget.SearchView v1_4 = this.getKeyDispatcherState();
	                    if (v1_4 != null) {
	                        v1_4.handleUpEvent(p5);
	                    }
	                    if ((!p5.isTracking()) || (p5.isCanceled())) {
	                    } else {
	                        this.a.clearFocus();
	                        android.support.v7.widget.SearchView.a(this.a, 0);
	                    }
	                }
	            } else {
	                android.support.v7.widget.SearchView v1_9 = this.getKeyDispatcherState();
	                if (v1_9 != null) {
	                    v1_9.startTracking(p5, this);
	                }
	            }
	        }
	        return v0;
	    }
	
	
	    public void onWindowFocusChanged(boolean p3)
	    {
	        super.onWindowFocusChanged(p3);
	        if ((p3) && ((this.a.hasFocus()) && (this.getVisibility() == 0))) {
	            ((android.view.inputmethod.InputMethodManager) this.getContext().getSystemService("input_method")).showSoftInput(this, 0);
	            if (android.support.v7.widget.SearchView.a(this.getContext())) {
	                android.support.v7.widget.SearchView.m.a(this, 1);
	            }
	        }
	        return;
	    }
	
	
	    public void performCompletion()
	    {
	        return;
	    }
	
	
	    protected void replaceText(CharSequence p1)
	    {
	        return;
	    }
	
	
	    public void setThreshold(int p1)
	    {
	        super.setThreshold(p1);
	        this.b = p1;
	        return;
	    }
	
