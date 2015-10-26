	private synthetic I a
	private synthetic  b
	private synthetic  c
	private synthetic czy d
	
	    dab(czy p1, com.google.android.libraries.view.pagingindicator.PagingIndicator p2, int[] p3, float p4, float p5)
	    {
	        this.d = p1;
	        this.a = p3;
	        this.b = p4;
	        this.c = p5;
	        return;
	    }
	
	
	    public final void onAnimationEnd(android.animation.Animator p3)
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.b(this.d.a, -1082130432);
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.c(this.d.a, -1082130432);
	        this.d.a.postInvalidateOnAnimation();
	        return;
	    }
	
	
	    public final void onAnimationStart(android.animation.Animator p7)
	    {
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.k(this.d.a);
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.l(this.d.a);
	        float v1_0 = this.a;
	        int v2 = v1_0.length;
	        com.google.android.libraries.view.pagingindicator.PagingIndicator v0_4 = 0;
	        while (v0_4 < v2) {
	            com.google.android.libraries.view.pagingindicator.PagingIndicator.b(this.d.a, v1_0[v0_4], 925353388);
	            v0_4++;
	        }
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.b(this.d.a, this.b);
	        com.google.android.libraries.view.pagingindicator.PagingIndicator.c(this.d.a, this.c);
	        this.d.a.postInvalidateOnAnimation();
	        return;
	    }
	
