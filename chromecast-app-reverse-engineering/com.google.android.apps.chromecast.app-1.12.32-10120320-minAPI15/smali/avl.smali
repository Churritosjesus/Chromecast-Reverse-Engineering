.class final Lavl;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private synthetic a:Lawj;

.field private synthetic b:Lbdn;

.field private synthetic c:Lava;


# direct methods
.method constructor <init>(Lava;Landroid/os/Looper;Lawj;Lbdn;)V
    .locals 0

    .prologue
    .line 240
    iput-object p1, p0, Lavl;->c:Lava;

    iput-object p3, p0, Lavl;->a:Lawj;

    iput-object p4, p0, Lavl;->b:Lbdn;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 244
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 252
    :goto_0
    return-void

    .line 246
    :pswitch_0
    iget-object v0, p0, Lavl;->a:Lawj;

    iget-object v1, p0, Lavl;->c:Lava;

    .line 1029
    iget-object v1, v1, Lava;->a:Lauv;

    .line 246
    invoke-virtual {v0, v1}, Lawj;->a(Lauv;)V

    goto :goto_0

    .line 249
    :pswitch_1
    iget-object v0, p0, Lavl;->b:Lbdn;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lbdn;->b_(I)V

    goto :goto_0

    .line 244
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
