.class final Luy;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lut;)V
    .locals 1

    .prologue
    .line 611
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 612
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Luy;->a:Ljava/lang/ref/WeakReference;

    .line 613
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 621
    iget-object v0, p0, Luy;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lut;

    .line 622
    if-eqz v0, :cond_1

    .line 623
    iget v4, p1, Landroid/os/Message;->what:I

    .line 624
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 625
    iget v6, p1, Landroid/os/Message;->arg2:I

    .line 626
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 627
    invoke-virtual {p1}, Landroid/os/Message;->peekData()Landroid/os/Bundle;

    move-result-object v7

    .line 1638
    packed-switch v4, :pswitch_data_0

    :cond_0
    move v0, v3

    .line 628
    :goto_0
    if-nez v0, :cond_1

    .line 629
    invoke-static {}, Lus;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 630
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unhandled message from server: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 634
    :cond_1
    return-void

    .line 2444
    :pswitch_0
    iget v1, v0, Lut;->f:I

    if-ne v5, v1, :cond_2

    .line 2445
    iput v3, v0, Lut;->f:I

    .line 2446
    iget-object v1, v0, Lut;->h:Lus;

    const-string v3, "Registation failed"

    invoke-static {v1, v0, v3}, Lus;->a(Lus;Lut;Ljava/lang/String;)V

    .line 2448
    :cond_2
    iget-object v1, v0, Lut;->g:Landroid/util/SparseArray;

    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La;

    .line 2449
    if-eqz v1, :cond_3

    .line 2450
    iget-object v0, v0, Lut;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->remove(I)V

    :cond_3
    move v0, v2

    .line 1641
    goto :goto_0

    :pswitch_1
    move v0, v2

    .line 1645
    goto :goto_0

    .line 1648
    :pswitch_2
    if-eqz v1, :cond_4

    instance-of v4, v1, Landroid/os/Bundle;

    if-eqz v4, :cond_0

    .line 1649
    :cond_4
    check-cast v1, Landroid/os/Bundle;

    .line 2462
    iget v4, v0, Lut;->e:I

    if-nez v4, :cond_5

    iget v4, v0, Lut;->f:I

    if-ne v5, v4, :cond_5

    if-lez v6, :cond_5

    .line 2465
    iput v3, v0, Lut;->f:I

    .line 2466
    iput v6, v0, Lut;->e:I

    .line 2467
    iget-object v3, v0, Lut;->h:Lus;

    invoke-static {v1}, Ltv;->a(Landroid/os/Bundle;)Ltv;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lus;->a(Lus;Lut;Ltv;)V

    .line 2469
    iget-object v1, v0, Lut;->h:Lus;

    invoke-static {v1, v0}, Lus;->a(Lus;Lut;)V

    move v0, v2

    .line 2470
    goto :goto_0

    :cond_5
    move v0, v3

    .line 1649
    goto :goto_0

    .line 1654
    :pswitch_3
    if-eqz v1, :cond_6

    instance-of v4, v1, Landroid/os/Bundle;

    if-eqz v4, :cond_0

    .line 1655
    :cond_6
    check-cast v1, Landroid/os/Bundle;

    .line 2476
    iget v4, v0, Lut;->e:I

    if-eqz v4, :cond_7

    .line 2477
    iget-object v3, v0, Lut;->h:Lus;

    invoke-static {v1}, Ltv;->a(Landroid/os/Bundle;)Ltv;

    move-result-object v1

    invoke-static {v3, v0, v1}, Lus;->a(Lus;Lut;Ltv;)V

    move v0, v2

    .line 2479
    goto :goto_0

    :cond_7
    move v0, v3

    .line 1655
    goto :goto_0

    .line 1660
    :pswitch_4
    if-eqz v1, :cond_8

    instance-of v4, v1, Landroid/os/Bundle;

    if-eqz v4, :cond_0

    .line 1661
    :cond_8
    check-cast v1, Landroid/os/Bundle;

    .line 2485
    iget-object v1, v0, Lut;->g:Landroid/util/SparseArray;

    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La;

    .line 2486
    if-eqz v1, :cond_9

    .line 2487
    iget-object v0, v0, Lut;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->remove(I)V

    move v0, v2

    .line 2489
    goto/16 :goto_0

    :cond_9
    move v0, v3

    .line 1661
    goto/16 :goto_0

    .line 1667
    :pswitch_5
    if-eqz v1, :cond_a

    instance-of v4, v1, Landroid/os/Bundle;

    if-eqz v4, :cond_0

    .line 1668
    :cond_a
    if-nez v7, :cond_b

    .line 1670
    :goto_1
    check-cast v1, Landroid/os/Bundle;

    .line 2495
    iget-object v1, v0, Lut;->g:Landroid/util/SparseArray;

    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La;

    .line 2496
    if-eqz v1, :cond_c

    .line 2497
    iget-object v0, v0, Lut;->g:Landroid/util/SparseArray;

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->remove(I)V

    move v0, v2

    .line 2499
    goto/16 :goto_0

    .line 1668
    :cond_b
    const-string v4, "error"

    invoke-virtual {v7, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_c
    move v0, v3

    .line 1670
    goto/16 :goto_0

    .line 1638
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_3
    .end packed-switch
.end method
