.class final Lawk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lavv;


# instance fields
.field private synthetic a:Lawj;


# direct methods
.method constructor <init>(Lawj;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lawk;->a:Lawj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 32
    iget-object v0, p0, Lawk;->a:Lawj;

    .line 1012
    iget-object v0, v0, Lawj;->a:Landroid/os/Handler;

    .line 32
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 33
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 37
    iget-object v0, p0, Lawk;->a:Lawj;

    .line 2012
    iget-object v0, v0, Lawj;->a:Landroid/os/Handler;

    .line 37
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 38
    iget-object v1, p0, Lawk;->a:Lawj;

    .line 3012
    iget-object v1, v1, Lawj;->a:Landroid/os/Handler;

    .line 38
    iget-object v2, p0, Lawk;->a:Lawj;

    .line 4012
    iget-wide v2, v2, Lawj;->b:J

    .line 38
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 39
    return-void
.end method
