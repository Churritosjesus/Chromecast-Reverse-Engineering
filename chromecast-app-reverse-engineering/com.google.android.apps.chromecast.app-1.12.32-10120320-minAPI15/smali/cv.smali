.class final Lcv;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private synthetic a:Lcu;


# direct methods
.method public constructor <init>(Lcu;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 518
    iput-object p1, p0, Lcv;->a:Lcu;

    .line 519
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 520
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 556
    invoke-virtual {p0, p1, p2}, Lcv;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 557
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 524
    iget-object v0, p0, Lcv;->a:Lcu;

    invoke-static {v0}, Lcu;->b(Lcu;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 553
    :goto_0
    return-void

    .line 527
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 529
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    goto :goto_0

    .line 532
    :pswitch_1
    iget-object v1, p0, Lcv;->a:Lcu;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ldq;

    invoke-virtual {v1, v0}, Lcu;->a(Ldq;)V

    goto :goto_0

    .line 535
    :pswitch_2
    iget-object v1, p0, Lcv;->a:Lcu;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lci;

    invoke-virtual {v1, v0}, Lcu;->a(Lci;)V

    goto :goto_0

    .line 538
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    .line 541
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    .line 544
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    .line 547
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    .line 550
    :pswitch_7
    iget-object v0, p0, Lcv;->a:Lcu;

    invoke-virtual {v0}, Lcu;->a()V

    goto :goto_0

    .line 527
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_6
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_7
    .end packed-switch
.end method
