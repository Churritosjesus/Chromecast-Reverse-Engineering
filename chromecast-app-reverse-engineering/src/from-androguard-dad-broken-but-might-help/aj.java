	private synthetic android.view.View a
	private synthetic android.transition.Transition b
	private synthetic android.view.View c
	private synthetic java.util.ArrayList d
	private synthetic android.transition.Transition e
	private synthetic java.util.ArrayList f
	private synthetic android.transition.Transition g
	private synthetic java.util.ArrayList h
	private synthetic java.util.Map i
	private synthetic java.util.ArrayList j
	private synthetic android.transition.Transition k
	
	    aj(android.view.View p1, android.transition.Transition p2, android.view.View p3, java.util.ArrayList p4, android.transition.Transition p5, java.util.ArrayList p6, android.transition.Transition p7, java.util.ArrayList p8, java.util.Map p9, java.util.ArrayList p10, android.transition.Transition p11)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        this.g = p7;
	        this.h = p8;
	        this.i = p9;
	        this.j = p10;
	        this.k = p11;
	        return;
	    }
	
	
	    public final boolean onPreDraw()
	    {
	        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
	        if (this.b != null) {
	            this.b.removeTarget(this.c);
	            a.a(this.b, this.d);
	        }
	        if (this.e != null) {
	            a.a(this.e, this.f);
	        }
	        if (this.g != null) {
	            a.a(this.g, this.h);
	        }
	        int v3_0 = this.i.entrySet().iterator();
	        while (v3_0.hasNext()) {
	            int v0_20 = ((java.util.Map$Entry) v3_0.next());
	            ((android.view.View) v0_20.getValue()).setTransitionName(((String) v0_20.getKey()));
	        }
	        int v3_1 = this.j.size();
	        android.view.View v1_4 = 0;
	        while (v1_4 < v3_1) {
	            this.k.excludeTarget(((android.view.View) this.j.get(v1_4)), 0);
	            v1_4++;
	        }
	        this.k.excludeTarget(this.c, 0);
	        return 1;
	    }
	
