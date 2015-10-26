	private synthetic lm a
	private synthetic li b
	
	    lj(li p1, lm p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void applyTransformation(float p10, android.view.animation.Transformation p11)
	    {
	        if (!this.b.b) {
	            float v0_3 = li.a(this.b, this.a);
	            li v1_2 = this.a.l;
	            float v2_1 = this.a.k;
	            int v3_1 = this.a.m;
	            li.b(this.b, p10, this.a);
	            if (p10 <= 1056964608) {
	                this.a.a((v2_1 + (li.a().getInterpolation((p10 / 1056964608)) * (1061997773 - v0_3))));
	            }
	            if (p10 > 1056964608) {
	                this.a.b((((1061997773 - v0_3) * li.a().getInterpolation(((p10 - 1056964608) / 1056964608))) + v1_2));
	            }
	            this.a.c(((1048576000 * p10) + v3_1));
	            this.b.b(((1129840640 * p10) + (1149698048 * (li.a(this.b) / 1084227584))));
	        } else {
	            li.a(this.b, p10, this.a);
	        }
	        return;
	    }
	
