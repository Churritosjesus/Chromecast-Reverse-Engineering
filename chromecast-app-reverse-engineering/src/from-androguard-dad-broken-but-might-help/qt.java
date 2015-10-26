	
	    public qt(android.content.Context p1, cc p2)
	    {
	        this(p1, p2);
	        return;
	    }
	
	
	    public android.view.MenuItem add(int p2)
	    {
	        return this.a(((cc) this.d).add(p2));
	    }
	
	
	    public android.view.MenuItem add(int p2, int p3, int p4, int p5)
	    {
	        return this.a(((cc) this.d).add(p2, p3, p4, p5));
	    }
	
	
	    public android.view.MenuItem add(int p2, int p3, int p4, CharSequence p5)
	    {
	        return this.a(((cc) this.d).add(p2, p3, p4, p5));
	    }
	
	
	    public android.view.MenuItem add(CharSequence p2)
	    {
	        return this.a(((cc) this.d).add(p2));
	    }
	
	
	    public int addIntentOptions(int p11, int p12, int p13, android.content.ComponentName p14, android.content.Intent[] p15, android.content.Intent p16, int p17, android.view.MenuItem[] p18)
	    {
	        android.view.MenuItem[] v9 = 0;
	        if (p18 != null) {
	            v9 = new android.view.MenuItem[p18.length];
	        }
	        int v2_1 = ((cc) this.d).addIntentOptions(p11, p12, p13, p14, p15, p16, p17, v9);
	        if (v9 != null) {
	            int v1_3 = 0;
	            int v3_1 = v9.length;
	            while (v1_3 < v3_1) {
	                p18[v1_3] = this.a(v9[v1_3]);
	                v1_3++;
	            }
	        }
	        return v2_1;
	    }
	
	
	    public android.view.SubMenu addSubMenu(int p2)
	    {
	        return this.a(((cc) this.d).addSubMenu(p2));
	    }
	
	
	    public android.view.SubMenu addSubMenu(int p2, int p3, int p4, int p5)
	    {
	        return this.a(((cc) this.d).addSubMenu(p2, p3, p4, p5));
	    }
	
	
	    public android.view.SubMenu addSubMenu(int p2, int p3, int p4, CharSequence p5)
	    {
	        return this.a(((cc) this.d).addSubMenu(p2, p3, p4, p5));
	    }
	
	
	    public android.view.SubMenu addSubMenu(CharSequence p2)
	    {
	        return this.a(((cc) this.d).addSubMenu(p2));
	    }
	
	
	    public void clear()
	    {
	        if (this.b != null) {
	            this.b.clear();
	        }
	        if (this.c != null) {
	            this.c.clear();
	        }
	        ((cc) this.d).clear();
	        return;
	    }
	
	
	    public void close()
	    {
	        ((cc) this.d).close();
	        return;
	    }
	
	
	    public android.view.MenuItem findItem(int p2)
	    {
	        return this.a(((cc) this.d).findItem(p2));
	    }
	
	
	    public android.view.MenuItem getItem(int p2)
	    {
	        return this.a(((cc) this.d).getItem(p2));
	    }
	
	
	    public boolean hasVisibleItems()
	    {
	        return ((cc) this.d).hasVisibleItems();
	    }
	
	
	    public boolean isShortcutKey(int p2, android.view.KeyEvent p3)
	    {
	        return ((cc) this.d).isShortcutKey(p2, p3);
	    }
	
	
	    public boolean performIdentifierAction(int p2, int p3)
	    {
	        return ((cc) this.d).performIdentifierAction(p2, p3);
	    }
	
	
	    public boolean performShortcut(int p2, android.view.KeyEvent p3, int p4)
	    {
	        return ((cc) this.d).performShortcut(p2, p3, p4);
	    }
	
	
	    public void removeGroup(int p3)
	    {
	        if (this.b != null) {
	            java.util.Iterator v1 = this.b.keySet().iterator();
	            while (v1.hasNext()) {
	                if (p3 == ((android.view.MenuItem) v1.next()).getGroupId()) {
	                    v1.remove();
	                }
	            }
	        }
	        ((cc) this.d).removeGroup(p3);
	        return;
	    }
	
	
	    public void removeItem(int p3)
	    {
	        if (this.b != null) {
	            java.util.Iterator v1 = this.b.keySet().iterator();
	            while (v1.hasNext()) {
	                if (p3 == ((android.view.MenuItem) v1.next()).getItemId()) {
	                    v1.remove();
	                    break;
	                }
	            }
	        }
	        ((cc) this.d).removeItem(p3);
	        return;
	    }
	
	
	    public void setGroupCheckable(int p2, boolean p3, boolean p4)
	    {
	        ((cc) this.d).setGroupCheckable(p2, p3, p4);
	        return;
	    }
	
	
	    public void setGroupEnabled(int p2, boolean p3)
	    {
	        ((cc) this.d).setGroupEnabled(p2, p3);
	        return;
	    }
	
	
	    public void setGroupVisible(int p2, boolean p3)
	    {
	        ((cc) this.d).setGroupVisible(p2, p3);
	        return;
	    }
	
	
	    public void setQwertyMode(boolean p2)
	    {
	        ((cc) this.d).setQwertyMode(p2);
	        return;
	    }
	
	
	    public int size()
	    {
	        return ((cc) this.d).size();
	    }
	
