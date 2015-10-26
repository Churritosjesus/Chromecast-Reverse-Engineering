.class final Lavi;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private synthetic a:Lbdn;

.field private synthetic b:Lava;


# direct methods
.method constructor <init>(Lava;Landroid/os/Looper;Lbdn;)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lavi;->b:Lava;

    iput-object p3, p0, Lavi;->a:Lbdn;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 181
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 189
    :goto_0
    return-void

    .line 183
    :pswitch_0
    iget-object v0, p0, Lavi;->b:Lava;

    iget-object v1, p0, Lavi;->a:Lbdn;

    .line 1029
    invoke-virtual {v0, v1}, Lava;->c(Lbdn;)V

    goto :goto_0

    .line 186
    :pswitch_1
    iget-object v0, p0, Lavi;->a:Lbdn;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lbdn;->b_(I)V

    goto :goto_0

    .line 181
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
