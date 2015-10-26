	private synthetic lw a
	
	    mc(lw p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void applyTransformation(float p4, android.view.animation.Transformation p5)
	    {
	        li v0_4;
	        if (lw.h(this.a)) {
	            v0_4 = ((int) lw.i(this.a));
	        } else {
	            v0_4 = ((int) (lw.i(this.a) - ((float) Math.abs(this.a.d))));
	        }
	        lw.a(this.a, ((((int) (((float) (v0_4 - this.a.c)) * p4)) + this.a.c) - lw.e(this.a).getTop()), 0);
	        lw.b(this.a).a((1065353216 - p4));
	        return;
	    }
	
