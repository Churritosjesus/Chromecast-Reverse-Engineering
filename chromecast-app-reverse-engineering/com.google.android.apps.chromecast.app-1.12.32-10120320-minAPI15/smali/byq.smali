.class final Lbyq;
.super Landroid/os/Handler;


# instance fields
.field private synthetic a:Lbyo;


# direct methods
.method public constructor <init>(Lbyo;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lbyq;->a:Lbyo;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    const/4 v6, 0x5

    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x4

    const/4 v2, 0x1

    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v2, :cond_0

    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v6, :cond_0

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lbyq;->a:Lbyo;

    invoke-virtual {v0}, Lbyo;->m()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lbyr;

    invoke-virtual {v0}, Lbyr;->c()V

    :goto_0
    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v1, v0, v4}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    iget-object v0, p0, Lbyq;->a:Lbyo;

    invoke-static {v0}, Lbyo;->a(Lbyo;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lbyq;->a:Lbyo;

    invoke-static {v0}, Lbyo;->b(Lbyo;)Lbwi;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbwi;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lbyq;->a:Lbyo;

    invoke-static {v0}, Lbyo;->c(Lbyo;)Lbyx;

    move-result-object v0

    invoke-virtual {v0, v1}, Lbyx;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lbyq;->a:Lbyo;

    invoke-static {v0, v3, v4}, Lbyo;->a(Lbyo;ILandroid/os/IInterface;)V

    iget-object v0, p0, Lbyq;->a:Lbyo;

    invoke-static {v0}, Lbyo;->c(Lbyo;)Lbyx;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lbyx;->a(I)V

    iget-object v0, p0, Lbyq;->a:Lbyo;

    invoke-static {v0, v3, v2, v4}, Lbyo;->a(Lbyo;IILandroid/os/IInterface;)Z

    goto :goto_0

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v5, :cond_5

    iget-object v0, p0, Lbyq;->a:Lbyo;

    invoke-virtual {v0}, Lbyo;->k()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lbyr;

    invoke-virtual {v0}, Lbyr;->c()V

    goto :goto_0

    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v5, :cond_6

    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v2, :cond_6

    iget v0, p1, Landroid/os/Message;->what:I

    if-eq v0, v6, :cond_6

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_7

    :cond_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lbyr;

    invoke-virtual {v0}, Lbyr;->b()V

    goto :goto_0

    :cond_7
    const-string v0, "GmsClient"

    const-string v1, "Don\'t know how to handle this message."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method
