	private static  a
	private final android.graphics.Matrix b
	private final android.graphics.RectF c
	private final android.graphics.RectF d
	private final android.graphics.Paint e
	private final android.graphics.Paint f
	
	    static CircularImageView()
	    {
	        com.android.ex.chips.CircularImageView.a = 1065353216;
	        return;
	    }
	
	
	    public CircularImageView(android.content.Context p3)
	    {
	        this(p3, 0, 0);
	        return;
	    }
	
	
	    public CircularImageView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public CircularImageView(android.content.Context p4, android.util.AttributeSet p5, int p6)
	    {
	        this(p4, p5, p6);
	        this.b = new android.graphics.Matrix();
	        this.c = new android.graphics.RectF();
	        this.d = new android.graphics.RectF();
	        this.e = new android.graphics.Paint();
	        this.e.setAntiAlias(1);
	        this.e.setFilterBitmap(1);
	        this.e.setDither(1);
	        this.f = new android.graphics.Paint();
	        this.f.setColor(0);
	        this.f.setStyle(android.graphics.Paint$Style.STROKE);
	        this.f.setStrokeWidth(com.android.ex.chips.CircularImageView.a);
	        this.f.setAntiAlias(1);
	        return;
	    }
	
	
	    protected void onDraw(android.graphics.Canvas p9)
	    {
	        float v0_1;
	        float v1_0 = this.getDrawable();
	        if (!(v1_0 instanceof android.graphics.drawable.StateListDrawable)) {
	            v0_1 = ((android.graphics.drawable.BitmapDrawable) v1_0);
	        } else {
	            if (((android.graphics.drawable.StateListDrawable) v1_0).getCurrent() == null) {
	                v0_1 = 0;
	            } else {
	                v0_1 = ((android.graphics.drawable.BitmapDrawable) v1_0.getCurrent());
	            }
	        }
	        if (v0_1 != 0) {
	            float v0_6 = v0_1.getBitmap();
	            if (v0_6 != 0) {
	                this.c.set(0, 0, ((float) v0_6.getWidth()), ((float) v0_6.getHeight()));
	                this.d.set(((float) this.getPaddingLeft()), ((float) this.getPaddingTop()), ((float) (this.getWidth() - this.getPaddingRight())), ((float) (this.getHeight() - this.getPaddingBottom())));
	                float v1_4 = this.c;
	                float v2_5 = this.d;
	                android.graphics.Paint v3_5 = new android.graphics.BitmapShader(v0_6, android.graphics.Shader$TileMode.CLAMP, android.graphics.Shader$TileMode.CLAMP);
	                this.b.reset();
	                this.b.setRectToRect(v1_4, v2_5, android.graphics.Matrix$ScaleToFit.FILL);
	                v3_5.setLocalMatrix(this.b);
	                this.e.setShader(v3_5);
	                p9.drawCircle(v2_5.centerX(), v2_5.centerY(), (v2_5.width() / 1073741824), this.e);
	                p9.drawCircle(v2_5.centerX(), v2_5.centerY(), ((v2_5.width() / 1073741824) - (com.android.ex.chips.CircularImageView.a / 1073741824)), this.f);
	            }
	        }
	        return;
	    }
	
