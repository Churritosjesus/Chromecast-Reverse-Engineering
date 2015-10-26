	private synthetic yc a
	
	    ym(yc p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final boolean onTouch(android.view.View p5, android.view.MotionEvent p6)
	    {
	        android.os.Handler v0_0 = p6.getAction();
	        yn v1_1 = ((int) p6.getX());
	        long v2_1 = ((int) p6.getY());
	        if ((v0_0 != null) || ((yc.b(this.a) == null) || ((!yc.b(this.a).isShowing()) || ((v1_1 < null) || ((v1_1 >= yc.b(this.a).getWidth()) || ((v2_1 < 0) || (v2_1 >= yc.b(this.a).getHeight()))))))) {
	            if (v0_0 == 1) {
	                yc.d(this.a).removeCallbacks(yc.c(this.a));
	            }
	        } else {
	            yc.d(this.a).postDelayed(yc.c(this.a), 250);
	        }
	        return 0;
	    }
	
