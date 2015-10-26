	
	    gh()
	    {
	        return;
	    }
	
	
	    public int a(android.view.MotionEvent p2)
	    {
	        return 1;
	    }
	
	
	    public int a(android.view.MotionEvent p2, int p3)
	    {
	        int v0;
	        if (p3 != 0) {
	            v0 = -1;
	        } else {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public int b(android.view.MotionEvent p2)
	    {
	        return 0;
	    }
	
	
	    public int b(android.view.MotionEvent p3, int p4)
	    {
	        if (p4 != 0) {
	            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
	        } else {
	            return 0;
	        }
	    }
	
	
	    public float c(android.view.MotionEvent p3, int p4)
	    {
	        if (p4 != 0) {
	            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
	        } else {
	            return p3.getX();
	        }
	    }
	
	
	    public float d(android.view.MotionEvent p3, int p4)
	    {
	        if (p4 != 0) {
	            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
	        } else {
	            return p3.getY();
	        }
	    }
	
	
	    public float e(android.view.MotionEvent p2, int p3)
	    {
	        return 0;
	    }
	
