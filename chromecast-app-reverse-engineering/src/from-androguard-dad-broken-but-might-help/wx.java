	private synthetic ww a
	
	    wx(ww p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void a(android.graphics.Canvas p12, android.graphics.RectF p13, float p14, android.graphics.Paint p15)
	    {
	        android.graphics.Canvas v0_1 = (1073741824 * p14);
	        float v6 = ((p13.width() - v0_1) - 1065353216);
	        float v7 = ((p13.height() - v0_1) - 1065353216);
	        if (p14 >= 1065353216) {
	            p14 += 1056964608;
	            this.a.a.set((- p14), (- p14), p14, p14);
	            int v8 = p12.save();
	            p12.translate((p13.left + p14), (p13.top + p14));
	            p12.drawArc(this.a.a, 1127481344, 1119092736, 1, p15);
	            p12.translate(v6, 0);
	            p12.rotate(1119092736);
	            p12.drawArc(this.a.a, 1127481344, 1119092736, 1, p15);
	            p12.translate(v7, 0);
	            p12.rotate(1119092736);
	            p12.drawArc(this.a.a, 1127481344, 1119092736, 1, p15);
	            p12.translate(v6, 0);
	            p12.rotate(1119092736);
	            p12.drawArc(this.a.a, 1127481344, 1119092736, 1, p15);
	            p12.restoreToCount(v8);
	            p12.drawRect(((p13.left + p14) - 1065353216), p13.top, ((p13.right - p14) + 1065353216), (p13.top + p14), p15);
	            p12.drawRect(((p13.left + p14) - 1065353216), ((p13.bottom - p14) + 1065353216), ((p13.right - p14) + 1065353216), p13.bottom, p15);
	        }
	        p12.drawRect(p13.left, (Math.max(0, (p14 - 1065353216)) + p13.top), p13.right, ((p13.bottom - p14) + 1065353216), p15);
	        return;
	    }
	
