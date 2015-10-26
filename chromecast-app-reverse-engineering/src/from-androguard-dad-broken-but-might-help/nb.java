	private java.lang.ref.WeakReference a
	
	    public nb(android.content.DialogInterface p2)
	    {
	        this.a = new ref.WeakReference(p2);
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p4)
	    {
	        switch (p4.what) {
	            case -3:
	            case -2:
	            case -1:
	                ((android.content.DialogInterface$OnClickListener) p4.obj).onClick(((android.content.DialogInterface) this.a.get()), p4.what);
	                break;
	            case 0:
	            default:
	                break;
	            case 1:
	                ((android.content.DialogInterface) p4.obj).dismiss();
	                break;
	        }
	        return;
	    }
	
