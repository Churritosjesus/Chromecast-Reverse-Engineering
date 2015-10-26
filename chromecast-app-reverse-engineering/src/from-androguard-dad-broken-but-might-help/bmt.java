	private synthetic  a
	private synthetic android.graphics.Bitmap b
	private synthetic bms c
	
	    bmt(bms p1, boolean p2, android.graphics.Bitmap p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void run()
	    {
	        if ((!this.a) || (this.c.a)) {
	            this.c.b.setAlpha(0);
	            this.c.b.setImageBitmap(this.b);
	            this.c.b.animate().alpha(1065353216).setDuration(600);
	        } else {
	            this.c.b.setImageBitmap(this.b);
	        }
	        return;
	    }
	
