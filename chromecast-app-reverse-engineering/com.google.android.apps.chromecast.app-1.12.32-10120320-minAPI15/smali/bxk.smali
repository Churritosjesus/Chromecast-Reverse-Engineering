.class public final Lbxk;
.super Landroid/os/Handler;


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    const/4 v0, 0x1

    iget v1, p1, Landroid/os/Message;->what:I

    if-ne v1, v0, :cond_0

    :goto_0
    invoke-static {v0}, La;->b(Z)V

    const/4 v1, 0x0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lbxl;

    invoke-virtual {v1, v0}, Ldh;->b(Lbxl;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
