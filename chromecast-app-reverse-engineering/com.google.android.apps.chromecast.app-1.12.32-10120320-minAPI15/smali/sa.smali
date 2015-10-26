.class final Lsa;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lrx;


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 857
    iget-object v0, p0, Lsa;->a:Lrx;

    iget-boolean v0, v0, Lrx;->m:Z

    if-eqz v0, :cond_1

    .line 861
    iget-object v0, p0, Lsa;->a:Lrx;

    invoke-virtual {v0}, Lrx;->c()Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 862
    iget-object v0, p0, Lsa;->a:Lrx;

    invoke-virtual {v0, p0}, Lrx;->post(Ljava/lang/Runnable;)Z

    .line 867
    :cond_0
    :goto_0
    return-void

    .line 865
    :cond_1
    iget-object v0, p0, Lsa;->a:Lrx;

    invoke-static {v0}, Lrx;->b(Lrx;)V

    goto :goto_0
.end method
