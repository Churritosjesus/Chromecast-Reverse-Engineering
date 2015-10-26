	private final F a
	private final  b
	
	    public kd(float[] p3)
	    {
	        this.a = p3;
	        this.b = (1065353216 / ((float) (this.a.length - 1)));
	        return;
	    }
	
	
	    public float getInterpolation(float p6)
	    {
	        float v0_0 = 1065353216;
	        if (p6 < 1065353216) {
	            if (p6 > 0) {
	                float v0_8 = Math.min(((int) (((float) (this.a.length - 1)) * p6)), (this.a.length - 2));
	                v0_0 = (((this.a[(v0_8 + 1)] - this.a[v0_8]) * ((p6 - (((float) v0_8) * this.b)) / this.b)) + this.a[v0_8]);
	            } else {
	                v0_0 = 0;
	            }
	        }
	        return v0_0;
	    }
	
