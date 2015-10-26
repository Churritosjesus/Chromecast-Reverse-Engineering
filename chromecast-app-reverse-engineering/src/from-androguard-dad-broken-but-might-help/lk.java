	private synthetic lm a
	private synthetic li b
	
	    lk(li p1, lm p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onAnimationEnd(android.view.animation.Animation p1)
	    {
	        return;
	    }
	
	
	    public final void onAnimationRepeat(android.view.animation.Animation p4)
	    {
	        this.a.b();
	        li v0_1 = this.a;
	        v0_1.a(v0_1.a());
	        this.a.a(this.a.e);
	        if (!this.b.b) {
	            li.a(this.b, ((li.a(this.b) + 1065353216) % 1084227584));
	        } else {
	            this.b.b = 0;
	            p4.setDuration(1332);
	            this.a.a(0);
	        }
	        return;
	    }
	
	
	    public final void onAnimationStart(android.view.animation.Animation p3)
	    {
	        li.a(this.b, 0);
	        return;
	    }
	
