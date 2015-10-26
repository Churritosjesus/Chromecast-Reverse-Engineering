	private android.graphics.RadialGradient a
	private android.graphics.Paint b
	private  c
	private synthetic kh d
	
	    public ki(kh p8, int p9, int p10)
	    {
	        this.d = p8;
	        this.b = new android.graphics.Paint();
	        kh.a(p8, p9);
	        this.c = p10;
	        int[] v4_1 = new int[2];
	        v4_1 = {1023410176, 0};
	        this.a = new android.graphics.RadialGradient(((float) (this.c / 2)), ((float) (this.c / 2)), ((float) kh.a(p8)), v4_1, 0, android.graphics.Shader$TileMode.CLAMP);
	        this.b.setShader(this.a);
	        return;
	    }
	
	
	    public final void draw(android.graphics.Canvas p7, android.graphics.Paint p8)
	    {
	        float v0_1 = this.d.getWidth();
	        float v1_1 = this.d.getHeight();
	        p7.drawCircle(((float) (v0_1 / 2)), ((float) (v1_1 / 2)), ((float) ((this.c / 2) + kh.a(this.d))), this.b);
	        p7.drawCircle(((float) (v0_1 / 2)), ((float) (v1_1 / 2)), ((float) (this.c / 2)), p8);
	        return;
	    }
	
