.class final Laut;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private synthetic a:Ljava/util/UUID;

.field private synthetic b:Laus;


# direct methods
.method constructor <init>(Laus;Landroid/os/Looper;Ljava/util/UUID;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Laut;->b:Laus;

    iput-object p3, p0, Laut;->a:Ljava/util/UUID;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 104
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 115
    :goto_0
    return-void

    .line 106
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 107
    iget-object v1, p0, Laut;->b:Laus;

    sget-object v2, Lblj;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iget-object v2, p0, Laut;->a:Ljava/util/UUID;

    invoke-virtual {v1, v0, v2}, Laus;->a([BLjava/util/UUID;)V

    goto :goto_0

    .line 111
    :pswitch_1
    iget-object v0, p0, Laut;->b:Laus;

    .line 1025
    iget-object v0, v0, Laus;->a:Landroid/os/Handler;

    .line 111
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 112
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 104
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
