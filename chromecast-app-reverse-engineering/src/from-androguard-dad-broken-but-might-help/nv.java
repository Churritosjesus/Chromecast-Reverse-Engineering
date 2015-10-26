	private synthetic no a
	
	    public nv(no p1, android.content.Context p2)
	    {
	        this.a = p1;
	        this(p2);
	        return;
	    }
	
	
	    public final boolean dispatchKeyEvent(android.view.KeyEvent p2)
	    {
	        return this.a.a(p2);
	    }
	
	
	    public final boolean onInterceptTouchEvent(android.view.MotionEvent p6)
	    {
	        boolean v0 = 1;
	        if (p6.getAction() != 0) {
	            v0 = super.onInterceptTouchEvent(p6);
	        } else {
	            nw v1_5;
	            nw v1_2 = ((int) p6.getX());
	            int v3_1 = ((int) p6.getY());
	            if ((v1_2 >= -5) && ((v3_1 >= -5) && ((v1_2 <= (this.getWidth() + 5)) && (v3_1 <= (this.getHeight() + 5))))) {
	                v1_5 = 0;
	            } else {
	                v1_5 = 1;
	            }
	            if (v1_5 == null) {
	            } else {
	                nw v1_6 = this.a;
	                v1_6.a(v1_6.e(0), 1);
	            }
	        }
	        return v0;
	    }
	
	
	    public final void setBackgroundResource(int p2)
	    {
	        this.setBackgroundDrawable(tf.a(this.getContext(), p2));
	        return;
	    }
	
