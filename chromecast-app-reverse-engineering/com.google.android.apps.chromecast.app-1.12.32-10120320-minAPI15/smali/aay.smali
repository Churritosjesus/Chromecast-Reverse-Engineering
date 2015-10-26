.class final Laay;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private synthetic a:Laav;


# direct methods
.method constructor <init>(Laav;)V
    .locals 0

    .prologue
    .line 554
    iput-object p1, p0, Laay;->a:Laav;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 563
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v2, v1}, Laay;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-virtual {p0, v0, v2, v3}, Laay;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 565
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 557
    iget-object v0, p0, Laay;->a:Laav;

    invoke-static {v0}, Laav;->e(Laav;)I

    move-result v0

    if-lez v0, :cond_0

    .line 558
    iget-object v0, p0, Laay;->a:Laav;

    iget-object v1, p0, Laay;->a:Laav;

    invoke-virtual {v1}, Laav;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Laav;->a(Ljava/util/List;)V

    .line 560
    :cond_0
    return-void
.end method
