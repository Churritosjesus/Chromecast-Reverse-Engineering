	private static lp a
	
	    static ln()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 19) {
	            ln.a = new lp();
	        } else {
	            ln.a = new lo();
	        }
	        return;
	    }
	
	
	    public static void a(android.widget.PopupWindow p6, android.view.View p7, int p8, int p9, int p10)
	    {
	        ln.a.a(p6, p7, p8, p9, p10);
	        return;
	    }
	
