	private synthetic java.lang.String a
	private synthetic  b
	private synthetic android.widget.ImageView c
	private synthetic atf d
	
	    ati(atf p1, String p2, boolean p3, android.widget.ImageView p4)
	    {
	        this.d = p1;
	        this.a = p2;
	        this.b = p3;
	        this.c = p4;
	        return;
	    }
	
	
	    public final void a(aef p4)
	    {
	        String v0_2;
	        Object[] v1 = new Object[2];
	        v1[0] = this.a;
	        if (p4 != null) {
	            v0_2 = p4.getMessage();
	        } else {
	            v0_2 = "null";
	        }
	        v1[1] = v0_2;
	        return;
	    }
	
	
	    public final void a(aex p5, boolean p6)
	    {
	        android.widget.ImageView v0_1 = new Object[2];
	        v0_1[0] = this.a;
	        v0_1[1] = Boolean.valueOf(p6);
	        if (p5.a != null) {
	            if ((!p6) || (this.b)) {
	                this.c.setAlpha(0);
	                this.c.setImageBitmap(p5.a);
	                this.c.animate().alpha(1065353216).setDuration(600);
	            } else {
	                this.c.setImageBitmap(p5.a);
	            }
	        }
	        return;
	    }
	
