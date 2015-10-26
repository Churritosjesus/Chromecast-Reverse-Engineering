.class final Lavj;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private synthetic a:Lbdn;

.field private synthetic b:Lava;


# direct methods
.method constructor <init>(Lava;Landroid/os/Looper;Lbdn;)V
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lavj;->b:Lava;

    iput-object p3, p0, Lavj;->a:Lbdn;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 207
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 223
    :goto_0
    return-void

    .line 209
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 212
    :try_start_0
    invoke-static {v0}, Lbdr;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 213
    iget-object v1, p0, Lavj;->a:Lbdn;

    invoke-interface {v1, v0}, Lbdn;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 216
    :catch_0
    move-exception v0

    iget-object v0, p0, Lavj;->a:Lbdn;

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Lbdn;->b_(I)V

    goto :goto_0

    .line 220
    :pswitch_1
    iget-object v0, p0, Lavj;->a:Lbdn;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lbdn;->b_(I)V

    goto :goto_0

    .line 207
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
