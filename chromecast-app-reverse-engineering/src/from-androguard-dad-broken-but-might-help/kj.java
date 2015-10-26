	public  a
	public  b
	public android.database.Cursor c
	public android.content.Context d
	private  e
	private kk f
	private android.database.DataSetObserver g
	private km h
	
	    public kj(android.content.Context p7, android.database.Cursor p8, boolean p9)
	    {
	        int v2;
	        android.database.DataSetObserver v0_0 = 1;
	        if (!p9) {
	            v2 = 2;
	        } else {
	            v2 = 1;
	        }
	        if ((v2 & 1) != 1) {
	            this.b = 0;
	        } else {
	            v2 |= 2;
	            this.b = 1;
	        }
	        if (p8 == null) {
	            v0_0 = 0;
	        }
	        kl v1_1;
	        this.c = p8;
	        this.a = v0_0;
	        this.d = p7;
	        if (v0_0 == null) {
	            v1_1 = -1;
	        } else {
	            v1_1 = p8.getColumnIndexOrThrow("_id");
	        }
	        this.e = v1_1;
	        if ((v2 & 2) != 2) {
	            this.f = 0;
	            this.g = 0;
	        } else {
	            this.f = new kk(this);
	            this.g = new kl(this);
	        }
	        if (v0_0 != null) {
	            if (this.f != null) {
	                p8.registerContentObserver(this.f);
	            }
	            if (this.g != null) {
	                p8.registerDataSetObserver(this.g);
	            }
	        }
	        return;
	    }
	
	
	    public final android.database.Cursor a()
	    {
	        return this.c;
	    }
	
	
	    public android.database.Cursor a(CharSequence p2)
	    {
	        return this.c;
	    }
	
	
	    public void a(android.database.Cursor p3)
	    {
	        android.database.Cursor v0_1;
	        if (p3 != this.c) {
	            v0_1 = this.c;
	            if (v0_1 != null) {
	                if (this.f != null) {
	                    v0_1.unregisterContentObserver(this.f);
	                }
	                if (this.g != null) {
	                    v0_1.unregisterDataSetObserver(this.g);
	                }
	            }
	            this.c = p3;
	            if (p3 == null) {
	                this.e = -1;
	                this.a = 0;
	                this.notifyDataSetInvalidated();
	            } else {
	                if (this.f != null) {
	                    p3.registerContentObserver(this.f);
	                }
	                if (this.g != null) {
	                    p3.registerDataSetObserver(this.g);
	                }
	                this.e = p3.getColumnIndexOrThrow("_id");
	                this.a = 1;
	                this.notifyDataSetChanged();
	            }
	        } else {
	            v0_1 = 0;
	        }
	        if (v0_1 != null) {
	            v0_1.close();
	        }
	        return;
	    }
	
	
	    public android.view.View b(android.content.Context p2, android.database.Cursor p3, android.view.ViewGroup p4)
	    {
	        return this.a(p2, p3, p4);
	    }
	
	
	    public CharSequence b(android.database.Cursor p2)
	    {
	        String v0;
	        if (p2 != null) {
	            v0 = p2.toString();
	        } else {
	            v0 = "";
	        }
	        return v0;
	    }
	
	
	    public int getCount()
	    {
	        if ((!this.a) || (this.c == null)) {
	            int v0_2 = 0;
	        } else {
	            v0_2 = this.c.getCount();
	        }
	        return v0_2;
	    }
	
	
	    public android.view.View getDropDownView(int p3, android.view.View p4, android.view.ViewGroup p5)
	    {
	        if (!this.a) {
	            p4 = 0;
	        } else {
	            this.c.moveToPosition(p3);
	            if (p4 == null) {
	                p4 = this.b(this.d, this.c, p5);
	            }
	            this.a(p4, this.c);
	        }
	        return p4;
	    }
	
	
	    public android.widget.Filter getFilter()
	    {
	        if (this.h == null) {
	            this.h = new km(this);
	        }
	        return this.h;
	    }
	
	
	    public Object getItem(int p2)
	    {
	        if ((!this.a) || (this.c == null)) {
	            android.database.Cursor v0_2 = 0;
	        } else {
	            this.c.moveToPosition(p2);
	            v0_2 = this.c;
	        }
	        return v0_2;
	    }
	
	
	    public long getItemId(int p4)
	    {
	        long v0_0 = 0;
	        if ((this.a) && ((this.c != null) && (this.c.moveToPosition(p4)))) {
	            v0_0 = this.c.getLong(this.e);
	        }
	        return v0_0;
	    }
	
	
	    public android.view.View getView(int p4, android.view.View p5, android.view.ViewGroup p6)
	    {
	        if (this.a) {
	            if (this.c.moveToPosition(p4)) {
	                if (p5 == null) {
	                    p5 = this.a(this.d, this.c, p6);
	                }
	                this.a(p5, this.c);
	                return p5;
	            } else {
	                throw new IllegalStateException(new StringBuilder("couldn\'t move cursor to position ").append(p4).toString());
	            }
	        } else {
	            throw new IllegalStateException("this should only be called when the cursor is valid");
	        }
	    }
	
	
	    public boolean hasStableIds()
	    {
	        return 1;
	    }
	
