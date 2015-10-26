	private static final I a
	private android.graphics.Bitmap b
	
	    static wr()
	    {
	        int[] v0_1 = new int[2];
	        v0_1 = {16843067, 16843068};
	        wr.a = v0_1;
	        return;
	    }
	
	
	    public wr(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, a.N);
	        return;
	    }
	
	
	    private wr(android.content.Context p4, android.util.AttributeSet p5, int p6)
	    {
	        this(p4, p5, p6);
	        if (tf.a) {
	            android.content.res.TypedArray v0_2 = th.a(this.getContext(), p5, wr.a, p6, 0);
	            android.graphics.drawable.Drawable v1_1 = v0_2.b(0);
	            if (v1_1 != null) {
	                this.setIndeterminateDrawable(this.a(v1_1));
	            }
	            android.graphics.drawable.Drawable v1_4 = v0_2.b(1);
	            if (v1_4 != null) {
	                this.setProgressDrawable(this.a(v1_4, 0));
	            }
	            v0_2.a.recycle();
	        }
	        return;
	    }
	
	
	    private android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable p7)
	    {
	        if ((p7 instanceof android.graphics.drawable.AnimationDrawable)) {
	            int v2 = ((android.graphics.drawable.AnimationDrawable) p7).getNumberOfFrames();
	            android.graphics.drawable.AnimationDrawable v0_2 = new android.graphics.drawable.AnimationDrawable();
	            v0_2.setOneShot(((android.graphics.drawable.AnimationDrawable) p7).isOneShot());
	            int v1_1 = 0;
	            while (v1_1 < v2) {
	                android.graphics.drawable.Drawable v3_1 = this.a(((android.graphics.drawable.AnimationDrawable) p7).getFrame(v1_1), 1);
	                v3_1.setLevel(10000);
	                v0_2.addFrame(v3_1, ((android.graphics.drawable.AnimationDrawable) p7).getDuration(v1_1));
	                v1_1++;
	            }
	            v0_2.setLevel(10000);
	            p7 = v0_2;
	        }
	        return p7;
	    }
	
	
	    private android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable p9, boolean p10)
	    {
	        int v1_0 = 0;
	        if (!(p9 instanceof bu)) {
	            if (!(p9 instanceof android.graphics.drawable.LayerDrawable)) {
	                if ((p9 instanceof android.graphics.drawable.BitmapDrawable)) {
	                    int v1_1 = ((android.graphics.drawable.BitmapDrawable) p9).getBitmap();
	                    if (this.b == null) {
	                        this.b = v1_1;
	                    }
	                    int v3_1 = new float[8];
	                    v3_1 = {1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584};
	                    int v0_5 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(v3_1, 0, 0));
	                    v0_5.getPaint().setShader(new android.graphics.BitmapShader(v1_1, android.graphics.Shader$TileMode.REPEAT, android.graphics.Shader$TileMode.CLAMP));
	                    if (!p10) {
	                        p9 = v0_5;
	                    } else {
	                        p9 = new android.graphics.drawable.ClipDrawable(v0_5, 3, 1);
	                    }
	                }
	            } else {
	                android.graphics.Shader$TileMode v4_3 = ((android.graphics.drawable.LayerDrawable) p9).getNumberOfLayers();
	                android.graphics.Shader$TileMode v5_2 = new android.graphics.drawable.Drawable[v4_3];
	                int v3_4 = 0;
	                while (v3_4 < v4_3) {
	                    int v0_9;
	                    int v0_8 = ((android.graphics.drawable.LayerDrawable) p9).getId(v3_4);
	                    android.graphics.drawable.Drawable v6 = ((android.graphics.drawable.LayerDrawable) p9).getDrawable(v3_4);
	                    if ((v0_8 != 16908301) && (v0_8 != 16908303)) {
	                        v0_9 = 0;
	                    } else {
	                        v0_9 = 1;
	                    }
	                    v5_2[v3_4] = this.a(v6, v0_9);
	                    v3_4++;
	                }
	                int v0_7 = new android.graphics.drawable.LayerDrawable(v5_2);
	                while (v1_0 < v4_3) {
	                    v0_7.setId(v1_0, ((android.graphics.drawable.LayerDrawable) p9).getId(v1_0));
	                    v1_0++;
	                }
	                p9 = v0_7;
	            }
	        } else {
	            int v0_14 = ((bu) p9).a();
	            if (v0_14 != 0) {
	                ((bu) p9).a(this.a(v0_14, p10));
	            }
	        }
	        return p9;
	    }
	
	
	    protected final declared_synchronized void onMeasure(int p3, int p4)
	    {
	        try {
	            super.onMeasure(p3, p4);
	        } catch (int v0_5) {
	            throw v0_5;
	        }
	        if (this.b != null) {
	            this.setMeasuredDimension(gt.a((this.b.getWidth() * this.getNumStars()), p3, 0), this.getMeasuredHeight());
	        }
	        return;
	    }
	
