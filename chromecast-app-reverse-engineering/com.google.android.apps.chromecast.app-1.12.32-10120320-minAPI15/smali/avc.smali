.class final Lavc;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private synthetic a:Lbdn;


# direct methods
.method constructor <init>(Lava;Landroid/os/Looper;Lbdn;)V
    .locals 0

    .prologue
    .line 265
    iput-object p3, p0, Lavc;->a:Lbdn;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 269
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 277
    :goto_0
    return-void

    .line 271
    :pswitch_0
    iget-object v0, p0, Lavc;->a:Lbdn;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbdn;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 274
    :pswitch_1
    iget-object v0, p0, Lavc;->a:Lbdn;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lbdn;->b_(I)V

    goto :goto_0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
