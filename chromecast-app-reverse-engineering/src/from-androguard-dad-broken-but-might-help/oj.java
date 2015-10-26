	final synthetic oi a
	private final java.lang.Runnable b
	
	    oj(oi p2)
	    {
	        this.a = p2;
	        this.b = new ok(this);
	        return;
	    }
	
	
	    public final void onProgressChanged(android.widget.SeekBar p2, int p3, boolean p4)
	    {
	        if (p4) {
	            oi.d(this.a).a(p3);
	        }
	        return;
	    }
	
	
	    public final void onStartTrackingTouch(android.widget.SeekBar p3)
	    {
	        if (!oi.a(this.a)) {
	            oi.a(this.a, 1);
	        } else {
	            oi.c(this.a).removeCallbacks(this.b);
	        }
	        return;
	    }
	
	
	    public final void onStopTrackingTouch(android.widget.SeekBar p5)
	    {
	        oi.c(this.a).postDelayed(this.b, 250);
	        return;
	    }
	
