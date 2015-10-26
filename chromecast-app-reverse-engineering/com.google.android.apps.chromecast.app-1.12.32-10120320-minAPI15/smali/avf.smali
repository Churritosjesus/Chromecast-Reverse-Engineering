.class final Lavf;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private synthetic a:Lbdn;

.field private synthetic b:Lava;


# direct methods
.method constructor <init>(Lava;Landroid/os/Looper;Lbdn;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lavf;->b:Lava;

    iput-object p3, p0, Lavf;->a:Lbdn;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 86
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 97
    :goto_0
    return-void

    .line 88
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lbdf;

    .line 89
    iget-object v1, p0, Lavf;->b:Lava;

    .line 1239
    iget v2, v0, Lbdf;->a:I

    .line 89
    invoke-virtual {v1, v2}, Lava;->a(I)V

    .line 90
    iget-object v1, p0, Lavf;->b:Lava;

    .line 2029
    iget-object v1, v1, Lava;->b:Lbdf;

    .line 3314
    iget-boolean v2, v1, Lbdf;->h:Z

    .line 3318
    iput-boolean v2, v0, Lbdf;->h:Z

    .line 3338
    iget-boolean v2, v1, Lbdf;->k:Z

    .line 3342
    iput-boolean v2, v0, Lbdf;->k:Z

    .line 4322
    iget-boolean v2, v1, Lbdf;->i:Z

    .line 4326
    iput-boolean v2, v0, Lbdf;->i:Z

    .line 4330
    iget-boolean v2, v1, Lbdf;->j:Z

    .line 4334
    iput-boolean v2, v0, Lbdf;->j:Z

    .line 4346
    iget-boolean v1, v1, Lbdf;->l:Z

    .line 4350
    iput-boolean v1, v0, Lbdf;->l:Z

    .line 91
    iget-object v1, p0, Lavf;->a:Lbdn;

    invoke-interface {v1, v0}, Lbdn;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 94
    :pswitch_1
    iget-object v0, p0, Lavf;->a:Lbdn;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lbdn;->b_(I)V

    goto :goto_0

    .line 86
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
